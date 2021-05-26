import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class RepeatedString {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */
    
    //https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
    //try -1 possible lossy conversion, small number
    public static long repeatedString1(String s, long n) {
        // Write your code here
        int strLength =s.length(); 
        int  count = 0;
        for(int i = 0; i < n; i++){
            int  j = (int)i%strLength;
            if(s.charAt(j) == 'a'){
                count++;
            }
                
        }
        return count;            

    }

    //try-2 
    public static long repeatedString(String s, long n) {
        // Write your code here
        int strLength =s.length(); 
        long repeatsOfString = n/strLength;
        long leftOutChar = n%strLength;
        
        int countInString = 0;
        int countInLeftOut = 0;
        for(int i = 0; i < strLength; i++){
            if(i == leftOutChar){
                countInLeftOut = countInString;
            }
            if(s.charAt(i) == 'a'){
                countInString++;
            }
                
        }
        
        return (repeatsOfString*countInString + countInLeftOut);            

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = RepeatedString.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
