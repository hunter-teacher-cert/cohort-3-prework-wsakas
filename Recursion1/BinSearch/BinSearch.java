class Main {
  static int binHelper (int target, int a[], int lowerIdx, int upperIdx){
    if (lowerIdx > upperIdx) return -1;
    else  {
      int i = (lowerIdx +upperIdx) / 2;
      if (target == a[i]) return i;
      else if (target > a[i]) 
        return binHelper(target, a, i+1, upperIdx) ;
      else
        return binHelper(target, a, lowerIdx, i-1);
      }
  }
  static int binHelper2 (int target, int a[], int lowerIdx, int upperIdx){
    if (lowerIdx > upperIdx) return -1;
    else  {
      int i = (lowerIdx +upperIdx) / 2;
      if (target == a[i]) return i;
      else if (target > a[i]) 
        return binHelper(target, a, i+1, upperIdx) ;
      else
        return binHelper(target, a, lowerIdx, i-1);
      }
  }    
  static int binSearch (int target, int a[]){
       return binHelper(target, a, 0, a.length-1);
  }
  
  static double compound(double p, double i, int t){
    if (t == 0) return p;
    else return compound(p, i, t-1)*(1+i);
  }
  
  static int fact(int n){
    if (n == 1) return 1;
    else return fact(n-1)*n;
  }
 // iterative fibonacci function 
 static int fib1(int n){
    int curr = 1;  
    int prev = 0;
    int next = -1; //meaningless but for compiler
    for (int i = 0; i < n-1; i++ ){
      next = curr+prev; 
      prev= curr; 
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
        
    x = fact(5);
    System.out.println(x);
    double amt = compound(100, .05, 5);
    System.out.println(amt);
    int anArray[] = new int[] {10,20,30,40,50,60,71,80,90,91} ; 
    for (int i=0; i<anArray.length; i++)
      {
        int idx = binSearch(anArray[i], anArray);
        System.out.println(anArray[i]+" is in position "+idx);
          
      }
    
  }
}  