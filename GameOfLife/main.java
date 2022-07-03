import java.util.Scanner;

class Main {
  static char emptyCh = '-';
  static char occupiedCh ='O';
  static char toDieCh ='!';
  static char tobeBornCh = '*';
  
  public static int countNeighbors(int x, int y, Board b) {
    Scanner input = new Scanner(System.in);
    
    int count =0;
    for (int j=y-1; j<=y+1; j++)
      for (int i=x-1; i<=x+1; i++) {
        int anint;
        if (i<0 || i>=b.getWidth() || j<0 || j>=b.getHeight()){
          //do nothing
        } 
        else if (b.get(i,j)==occupiedCh || 
                   b.get(i,j) == toDieCh) count++;
      }
      if (b.get(x,y) == occupiedCh || b.get(x,y) == toDieCh) count-- ;
      return count;
  } 
  public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
  }
  
  public static void main(String[] args) {
    Board theBoard = new Board(30,30, emptyCh);
    theBoard.put(2,1,occupiedCh);
    theBoard.put(3,2,occupiedCh);
    theBoard.put(1,3,occupiedCh);
    theBoard.put(2,3,occupiedCh);
    theBoard.put(3,3,occupiedCh);
    theBoard.displayBoard();
    
    for (int iteration=0; iteration<50; iteration++){    
      
      for (int y = 0; y < theBoard.getHeight(); y++)
        for (int x =0; x < theBoard.getWidth(); x++) {
          int c = countNeighbors(x, y, theBoard);
          if ( (c < 2 || c > 3) && theBoard.get(x,y) == occupiedCh)
               theBoard.put(x,y,toDieCh);
          
          if (c == 3 && theBoard.get(x,y) == emptyCh) theBoard.put(x,y,tobeBornCh);
        }  
        for (int y = 0; y < theBoard.getHeight(); y++)
          for (int x =0; x < theBoard.getWidth(); x++) {
            if (theBoard.get(x,y) == tobeBornCh) theBoard.put(x,y,occupiedCh);
            if (theBoard.get(x,y) == toDieCh) theBoard.clear(x,y);
        }
        theBoard.displayBoard();  
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {e.printStackTrace();}
        
        clearScreen();
    }
   Scanner myChar = new Scanner(System.in); 
  }   
}