// Bethany Yachuw
// This method will take in an array and return it in descending order
// testPlan.txt
/* input:5 3 2 6 3 4 
2 3 3 4 5 6 
input: 7 6 4 7 2 1
1 2 4 6 7 7 
input: 9 3 6 4 7 2 
2 3 4 6 7 9 
input: 1 4 5 2 3 6
1 2 3 4 5 6 
input: 4 8 6 9 7 5
4 5 6 7 8 9 
*/

import java.util.*;
import java.io.*;
import java.lang.*;

public class Lab4 {
  public static void main (String[] args) {
    // test 1 : expected output is 6,5,4,5,5,2
    int [] testArr1 = {5,3,2,6,3,4};
    System.out.println("Input: " + Arrays.toString(testArr1));
    System.out.println("Output: " + Arrays.toString(sortDescending(testArr1)));
    
    // test 2 : expected output is 59,37,17,12
    int[] testArr2 = {37,12,17,59};
    System.out.println("Input: " + Arrays.toString(testArr2));
    System.out.println("Output: " + Arrays.toString(sortDescending(testArr2)));
    
    // test 3 : expected output is 100, 50, 17, 12, 4, 1
    int[] testArr3 = {100,12,50,1,17,4};
    System.out.println("Input: " + Arrays.toString(testArr3));
    System.out.println("Output: " + Arrays.toString(sortDescending(testArr3)));
    
    //test 4 : expected output is 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
     int[] testArr4 = {1,2,3,4,5,6,7,8,9,10};
    System.out.println("Input: " + Arrays.toString(testArr4));
    System.out.println("Output: " + Arrays.toString(sortDescending(testArr4))); 
    
    //test 5 : expected output is 503, 65, 59, 39, 20, 10, 8, 6, 3, 2, 1
    int[] testArr5 = {6,20,59,10,1,2,503,3,65,8,39};
    System.out.println("Input: " + Arrays.toString(testArr5));
    System.out.println("Output: " + Arrays.toString(sortDescending(testArr5)));
    
    
  }
  public static int[] sortDescending(int[] arr) { // class to sort array
    for(int i =0; i< arr.length; i++){ // multiply all by neg 1
      if (arr == null){
        throw new IllegalArgumentException("Can't have null");
      } else {
        arr[i] = arr[i] * -1;
      }
    }
    Arrays.sort(arr); // sort array 
    int [] returnArr = arr; // add old array to a new array
    
    for(int i = 0; i < returnArr.length; i++){ // multiply all by neg 1 again to get descending order
      returnArr[i] = returnArr[i]*-1;
    }
    return returnArr; // return newly sorted array
  }
//  public static void printArr(int[] arr){
//    for ( int i = 0; i < arr.length-1; i++){
//      System.out.println(arr[i]);
//    }
//  }
}