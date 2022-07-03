import java.util.Scanner;

class Main {
  
 
  public static void main(String[] args) {
    // play with strings a little before recursion
    String xString = "Hello"; 
    String s; s = "world!";
    s = s+'s';
    String t = new String("there");
    System.out.println(xString+" "+t+" "+s+" "+xString.charAt(3));
    
    //String inString;
    //Scanner input = new Scanner(System.in);

    
    String fName ;
    fName = "William "; 
    String lName = "Sakas";
    String mName = new String("Gregory ");
    System.out.println(fName+mName+lName);

    //System.out.print("Enter:");
    //inString = input.nextLine();
    //System.out.println("You entered: "+inString);

    String aString = "heels" ;
    // int theIndex = aString . length() - 1 ;
    //while ( theIndex >= 0 ){	 
     // System.out.print( aString.charAt( theIndex ) );	
      //theIndex-- ;
    //}
    System.out.println("");
    
    for (int theIndex = aString . length() - 1 ;
         theIndex >= 0 ; 
         theIndex-- )
    {	
      System.out.print( aString.charAt(theIndex) );
    }
    System.out.println("");
    
    for (char c = 'a'; c<='z'; c++) System.out.println( (int) c);
    System.out.println(" ");
    for (int i = 97; i<=122; i++) System.out.print( (char) i);
    System.out.println(" ");

    //String someString = "feline";
    //for (int i=0; i<someString . length(); i++){
    //  System.out.print( (int) someString.charAt( i ) + "  " ) ;
   //
   //  }
    String someString = "Edited Jul 10 at Twenty-Two hundred hours"; 

// Go through the first word character by character without displaying anything
// Precondition: someString does not begin with spaces. Words are separated by spaces.
// Thus, someString[ 0 ] is not a space. 
    int i = 0;
    while ( someString.charAt(i) != ' ')
    {
      i++ ; //System.out.println(i);
    }
    System.out.println("");
    // Postcondition: someString[ i ] IS a space. 
    // Go through all the spaces after the first word
    // Precondition: someString[ i ] is a space
    while (someString.charAt(i) == ' ')
    { 
      i++ ; //System.out.println(i);
    }  
    System.out.println("");
    
    // Postcondition: someString[ i ] IS NOT a space. 
    // Go through the second word character by character and display each character.
    // Precondition: someString[ i ] is the first letter of the second word
    while (someString.charAt(i) != ' ') // This only works for sentences of three words or more. Try to fix it!
    { 
         System.out.print( someString.charAt(i)  );
         i++ ; 
     }
    System.out.println("");
    //System.out.println("Pause ... ");
    //String inString;
    //Scanner input = new Scanner(System.in);
    //inString = input.nextLine();
  
    String food = "Ice";
    food = food +" cream." ;
    System.out.println(food);
    food = food + 's' ;
    System.out.println(food);
    food = 'L' +food  ;
    System.out.println(food);
    //food = 'L' + 's' ;
    //System.out.println(food);
   
   
  }  
}