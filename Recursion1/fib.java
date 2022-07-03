import java.util.Scanner;

class Main {
  
 // iterative fibonacci function 
 static int fib1(int n){
    int curr = 1;  
    int prev = 0;
    int next = -1; //meaningless but for compiler
    for (int i = 0; i < n-1; i++ ){
      next = curr+prev; 
      prev = curr; 
      curr = next;
    }
    return curr;
 }
  static int fib2(int n){
    if (n==0 || n==1){
      return n;
    }
    else {
      return fib2(n-1) + fib2(n-2);
    }
  }
  public static void main(String[] args) {
    int x = 0;
    x = fib1(40);
    System.out.println("fib1: " + x); 
  
    x = fib2(40);
    System.out.println("fib2: " + x); 
  }
}  