import java.util.*; 
import java.io.*;
class FirstReverse{
//https://www.coderbyte.com/editor/First%20Reverse:Java
    public static String FirstReverse(String str) {
    // code goes here 
    int len = str.length();
    String reverse = "";
    for(int i=len-1; i>=0; i--){
      reverse += str.charAt(i);
    } 
    return reverse;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }
}
