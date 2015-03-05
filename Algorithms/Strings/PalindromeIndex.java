// https://www.hackerrank.com/challenges/palindrome-index
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int palindromeIndex(String str) {
        int len = str.length();
        for(int i = 0; i < len; i++) {
            char l = str.charAt(i);
            char r = str.charAt(len-1-i);
            if(l!=r) {
                // must look ahead 2
                if(l == str.charAt(len-2-i) && (str.charAt(i + 1) == str.charAt(len-3-i))) {
                    return len-1-i;
                } else {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < testCases; i++) {
            String str = scan.nextLine();
            int result = palindromeIndex(str);
            System.out.println(result);
        }
    }
}
