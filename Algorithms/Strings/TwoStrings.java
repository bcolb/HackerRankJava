// https://www.hackerrank.com/challenges/two-strings
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static boolean matchingSubstrings(String one, String two) {
        // Runs in O(N)
        Hashtable<String, String> ht = new Hashtable<String, String>();
        for(int i = 0; i < two.length(); i++) {
            String s = two.charAt(i) + "";
            ht.put(s, s);
        }
        for(int i = 0; i < one.length(); i++) {
            String s = "" + one.charAt(i);
            if(ht.contains(s)) return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < testCases; i++) {
            String one = scan.nextLine();
            String two = scan.nextLine();
            if(matchingSubstrings(one, two)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
