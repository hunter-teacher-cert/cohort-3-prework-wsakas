import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int i=0;  
    for ( ;i<10; ){
        System.out.println(i);
        i++;
    }
       
    
    
     Scanner input = new Scanner(System.in) ;
      
      System.out.print( "Enter a number:"); int x = input.nextInt();
      input.nextLine();
      
      String someString = ( x > 10000) ? "a big number!" : 
                 "a relatively small number" ;
      
      System.out.println( "The computer thinks that you entered " + someString); 


  }  

} 