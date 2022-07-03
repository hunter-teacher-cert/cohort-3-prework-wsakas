import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    // int anArray[] = new int[] {10,20,30,40,50,60,71,80,90,91} ; 
    // for (int i=0; i<anArray.length; i++)
    //   {
    //        System.out.println(anArray[i]+" is in position "+i);
          
    //   }
    
    Scanner input = new Scanner(System.in);
    
    // System.out.print ("How many close friends do you have?") ;
    // int n = input.nextInt();
    // input.nextLine();
    
    // String anArray[] = new String[n] ; //{10,20,30,40,50,60,71,80,90,91} ; 
    // for (int i=0; i<anArray.length; i++){
    //     System.out.println(i);
    //     System.out.print("Enter a string:");
    //     anArray[i] = input.nextLine();
    // }  
    String myFriends[] = new String[1000];    
    int numOfFriends = 0;
    String aFriend = "" ;
    while ( ! aFriend.equals("Stop")){
         System.out.println("Entered: "+aFriend);
         System.out.print
           ("Enter the name of one of your friends.Type Stop to end:");
         aFriend = input.nextLine();
         myFriends[numOfFriends] = aFriend;
         numOfFriends++;
    }
    System.out.println("You have "+numOfFriends+" friends!");
    for (int i=0; i<numOfFriends; i++)
    {
           System.out.println(myFriends[i]);
    }
 //   String stringArray[] = new String[ ] {"Joel", "Juli", "Jorge"};
    // stringArray = new String[4];
    // stringArray[3] = "Joel" ;
    // stringArray[1] = "Juli" ;
    // stringArray[2] = "Jorge";
    // for (int i=0; i<stringArray.length; i++){
    //   if (stringArray[i] == "") System.out.println("Null");
    //   else System.out.println(stringArray[i]);
    // }

    
  }  
}  