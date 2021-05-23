import java.util.*; 
import java.io.*;

class FirstFactorial {
  //https://www.coderbyte.com/editor/First%20Factorial:Java
  public static long FirstFactorial(int num) {
    // code goes here 
    if(num==1) return num;
    return num *FirstFactorial(num-1); 
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextLine())); 
  }

}
