import java.util.*; 
import java.io.*;

class LongestWord {

  //https://coderbyte.com/editor/Longest%20Word:Java?
  public static String longestWord(String sen) {
    // code goes here 
    int len = sen.length();
    String longestWord = "";
    String currWord = "";
    for(int i=0; i<=len; i++){

      //condition for word end
      if( (i == len) || (sen.charAt(i) == ' ')){
        if(currWord.length() > longestWord.length()) {
          longestWord = currWord;
        }
        currWord = "";
        continue;
      }

      //skip special character
      if(isSpecialChar(sen.charAt(i))){
        continue;
      }

      //append characters and numbers
      currWord += sen.charAt(i);
    }
    return longestWord;
  }

  private static boolean isSpecialChar(char currChar){
    if(currChar >= 65 && currChar <= 90){
      return false;
    }
    if (currChar >= 97 && currChar <= 122){
      return false;
    } 
    if (currChar >= 48 && currChar <= 57) {
      return false;
    }
    return true; 
  }
    
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(longestWord(s.nextLine())); 
  }

}
