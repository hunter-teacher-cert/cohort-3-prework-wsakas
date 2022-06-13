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
  public static void main(String[] args) {
    Board theBoard = new Board(15,10, '-');
    theBoard.put(4,2,'0');
    theBoard.put(4,4,'0');
    theBoard.put(6,3,'0');
    theBoard.put(7,2,'0');
    theBoard.put(7,3,'0');
    
    theBoard.displayBoard();
    if (theBoard.isOccupied(4,2)) System.out.println("Occupied");
      else System.out.println("Not Occupied");
    if (theBoard.isOccupied(4,3)) System.out.println("Occupied");
      else System.out.println("Not Occupied");
 
      
    
  }
}