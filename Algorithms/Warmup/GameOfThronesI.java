// https://www.hackerrank.com/challenges/game-of-thrones
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static boolean canPermutePalindrome(String str) {
        // String str is already lowercase - need character count
        int[] counts = new int[26];
        for(int i = 0; i < str.length(); i++) {
            int n = (int) str.charAt(i) - 97;
            counts[n] += 1;
        }
        // Get number of odd counts
        int oddCount = 0;
        for(int i = 0; i < counts.length; i++) {
            if(counts[i] % 2 == 1) oddCount++;
        }
        if((str.length() % 2 == 0) && (oddCount == 0)) return true;
        if((str.length() % 2 == 1) && (oddCount == 1)) return true;
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if(canPermutePalindrome(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
