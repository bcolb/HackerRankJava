// https://www.hackerrank.com/challenges/sherlock-and-anagrams
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isAnagram(String one, String two) {
        if(one.length() != two.length()) return false;
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for(int i = 0; i < one.length(); i++) {
            int c1 = (int) one.charAt(i) - 97;
            count1[c1]++;
            int c2 = (int) two.charAt(i) - 97;
            count2[c2]++;
        }
        for(int i = 0; i < count1.length; i++) {
            if(count1[i] != count2[i]) return false;
        }
        return true;
    }
    
    public static int countAnagramPairs(String str) {
        int maxlen = str.length() / 2;
        int count = 0;
        // first two loops enumerate all possibilities
        for(int start = 0; start < str.length(); start++) {
            for(int end = start; end < str.length(); end++) {
                String subs = str.substring(start, end+1);
                // innermost two loops enumerate all alter possibilities
                for(int start2 = start+1; start2 < str.length(); start2++) {
                    for(int end2 = start2; end2 < str.length(); end2++) {
                        String subs2 = str.substring(start2, end2+1);
                        if(isAnagram(subs, subs2)) count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        while(scan.hasNextLine()) {
            String s = scan.nextLine();
            System.out.println(countAnagramPairs(s));
        }
    }
}
