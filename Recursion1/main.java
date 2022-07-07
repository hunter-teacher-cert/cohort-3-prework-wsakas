import java.util.Scanner;

class Main {
      
  static double compound(double p, double i, int t){
    if (t == 0) {
      return p;
    }  
    else {
      return compound(p, i, t-1)*(1+i);
    }
  }

  static int fact(int n){
    if (n == 1) {
      return 1;
    }  
    else {
      return fact(n-1)*n;
    }  
  }
  public static void main(String[] args) {
    int x = 0;
        
    x = fact(5);
    System.out.println(x);
 
    double amt = compound(100, .05, 5);
    System.out.println(amt);
     
  }
}  