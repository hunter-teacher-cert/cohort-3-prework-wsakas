class Beer {
  public static void main(String[] args) {
    b(4);

}
public static String pluralOrNot(int numBottles)  {
     return ( numberBottles==1 )  ? "bottle" : "bottles";
}
public static void b(int n) { 
    if (n == 0){
        System.out.println();
        System.out.println("No bottles of beer on the wall,\nno bottles of beer,\nya’ can’t take one down,\nya’ can’t pass it around,\n’cause there are no more bottles of beer on the wall!");
    } 
    else{                    

        String bot1 = ( n==1 )  ?"bottle" :"bottles" ;
        String bot2 = ( n-1==0 )?"bottles":"bottle" ;
        
        System.out.println(
           n + " "+pluralOrNot(n) + " of beer on the wall,\n" + 
          (n) +" "+pluralOrNot(n) + " of beer,\n Ya' take one down, ya' pass it around,\n" + 
        (n-1) +" "+pluralOrNot(n) +" of beer on the wall");
         
      
        String bot1 = ( n==1 )  ?"bottle" :"bottles" ;
        String bot2 = ( n-1==0 )?"bottles":"bottle" ;
        
        System.out.println(
           n + " "+bot1 + " of beer on the wall,\n" + 
          (n) +" "+bot1 + " of beer,\nYa' take one down, ya' pass it around,\n" + 
        (n-1) +" "+bot2 +" of beer on the wall");
        
      
      System.out.println();

        b(n - 1);

    }
} 
}
