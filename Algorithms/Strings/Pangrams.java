// https://www.hackerrank.com/challenges/pangrams
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        int[] counts = new int[26];
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                int c = (int) str.charAt(i) - 97;
                counts[c] += 1;
            }
        }
        for(int i = 0; i < counts.length; i++) {
            if(counts[i] == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if(isPangram(str.toLowerCase())) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }
}
