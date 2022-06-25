import java.io.*;
import java.util.*;

class Solution {
  
  // [8,10, 2]
 // left_tracker = [1,8, 80 ]
  // right_tracker = [ 20 ,2,1]
  // Time complexity = O(N)
  // Space complexity = O(2n) = O(N)
  
  static int[] arrayOfArrayProducts(int[] arr) {
    if(arr.length == 0 ){
      return arr;
    }
    if(arr.length == 1 ){
      return new int[]{};
    }
    
    int[] left_tracker = new int[arr.length];
    int[] right_tracker = new int[arr.length];
    
    left_tracker[0]=1; //base case
    for(int i = 1 ; i < arr.length; i++){
       left_tracker[i] = left_tracker[i-1]*arr[i-1];
      
    }
     
    right_tracker[right_tracker.length -1] = 1;
    
    for(int i = right_tracker.length-2; i >=0; i--){
      right_tracker[i] = right_tracker[i+1]* arr[i+1];
    }
    
    for(int i = 0; i< arr.length; i++){
      arr[i] = left_tracker[i]* right_tracker[i];
    }
    
    return arr;   
 }
  

  public static void main(String[] args) {

  }
  
 /* 
 Feed
 
 
  [8,0, 2]
 first step: find the whole product = 160
 second for loop : [160 - 8]
 
  left = [0,8, 0]
  right = [0,2,0]     
  
  ^
 [2, 3, 4, 5]
 left = [1 2 6 ]
 right = 
 
 3*4*5     2*4*5     2*3*5       2*3*4
 [60        40        30         24]
 
 
 
 */

}