import java.util.*; 
import java.io.*;

class FindIntersection {

  
  //https://www.coderbyte.com/editor/Find%20Intersection:Java
  
  public static String FindIntersectionMethod(String[] strArr) {

    //tokenize
    String[] arr = strArr[0].split(", ");
    String[] arr1 = strArr[1].split(", ");
    
    //min of length of 2 arr
    int strLength = (arr.length >= arr1.length)? arr1.length:arr.length;
    String result = null;
      
    //mapped to arr
    int index = 0;

    //mapped to arr1
    int index1 = 0;

    while (index<strLength && index1<strLength ){
      
      int arrVal = Integer.parseInt(arr[index]);
      int arr1Val = Integer.parseInt(arr1[index1]);

      if(arrVal == arr1Val){
        result = (Optional.ofNullable(result).isPresent())?String.join(",", result, arr[index]): arr[index];
        index++;index1++;
      }

      if(arrVal > arr1Val){
        index1++;
      }

      if(arrVal < arr1Val){
        index++;
      }

    }
    return result;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FindIntersectionMethod(s.nextLine())); 
  }

}
