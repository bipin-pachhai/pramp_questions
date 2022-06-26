public class Solution {
  static double root(double x, int n) {
         // your code goes here
         double upper_l ;
         double lower_l = 0;
          if(x < 1){
            upper_l = 1;
          }
          
         else{
           upper_l = x;   
         }
         
         while(lower_l <= upper_l){
             double nth_root = lower_l +(upper_l - lower_l)/2.0;
              
             double guess = Math.pow(nth_root, n);
              
             if(Math.abs(guess- x) < 0.001){
               return nth_root;
             }
            
             if(guess < x ){
               lower_l = nth_root;
               
             }
           else{
             upper_l  = nth_root;
             
           }
           
         }
         
         return lower_l;         
         
       }

       /*
  static double root(double x, int n) {
    double lo = 0.0, hi = x, md = (lo+hi)/2.0;
    while ((hi-lo)>=0.002) {
      if (Math.pow(md,n)>x) {
        hi = md;
      } else if (Math.pow(md,n)<x) {
        lo = md;
      } else {
        break;
      }
      md = (lo+hi)/2.0;
    }
    return md;
  }
   */

  public static void main(String[] args) {
    double x = 7;
    int n = 3;
    // Expected output: 1.913
    System.out.println(root(x, n));

    x = 9;
    n = 2;
    // Expected output: 3
    System.out.println(root(x, n));
  }
}
