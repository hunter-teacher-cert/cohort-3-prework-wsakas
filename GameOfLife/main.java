import java.util.Scanner;
class Board {
  private int width;
  private int height;
  private char[][] grid;
  private char backgroundCh;
  
  public Board(int x, int y, char ch){
    width = x; height = y;
    backgroundCh = ch;
    grid = new char[width][height];
    for (int i=0; i<height; i++){
      for (int j=0; j<width; j++){
        grid[j][i] = backgroundCh;
      }
    }
  } 
  public int getWidth(){return width;}
  public int getHeight(){return height;}
  public char getBackgroundCh(){return backgroundCh;}

  public char get(int x, int y){
    return grid[x][y];
  }
  public void put(int x, int y, char ch){
    grid[x][y] = ch;
  }
  public void clear(int x, int y){
    grid[x][y] = backgroundCh;
  }
  public boolean isEmpty(int x, int y){
    if (grid[x][y] == backgroundCh)
      return true;
    else
      return false;
  }
  public boolean isOccupied(int x, int y){
    return !isEmpty(x,y);
  }

  public void clearBoard(){
    for (int i=0; i<height; i++){
      for (int j=0; j<width; j++){
        grid[j][i] = backgroundCh;
      }
    }
  }
      
  public void displayBoard(){
    for (int i=0; i<height; i++){
      for (int j=0; j<width; j++){
        System.out.print(grid[j][i]);
      }
      System.out.println();
    }
  }
}

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
        //System.out.println(i+", "+j);
        //anint =input.nextInt();
        if (i<0 || i>=b.getWidth() || j<0 || j>=b.getHeight()){
          //do nothing
        } 
        else { //System.out.println(" Char:"+b.get(i,j)); anint = input.nextInt();
               if (b.get(i,j)==occupiedCh || 
                   b.get(i,j) == toDieCh) count++;}
      }
      if (b.get(x,y) == occupiedCh || b.get(x,y) == toDieCh) count-- ;
    
      return count;
  } 

  public static void main(String[] args) {
    Board theBoard = new Board(15,11, emptyCh);
    theBoard.put(6,5,occupiedCh);
    theBoard.put(7,5,occupiedCh);
    theBoard.put(8,5,occupiedCh);
     
    for (int iteration=0; iteration<5; iteration++){    
      
      for (int y = 0; y < theBoard.getHeight(); y++)
        for (int x =0; x < theBoard.getWidth(); x++) {
          int c = countNeighbors(x, y, theBoard);
          //theBoard.displayBoard();            
          //System.out.println(x+", "+y+" count:"+c);
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
    }
  }   
}