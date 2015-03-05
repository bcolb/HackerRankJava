// https://www.hackerrank.com/challenges/anagram
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int countAnagramChanges(String first, String second) {
        if(first.length() != second.length()) return -1;
        first = first.toLowerCase();
        second = second.toLowerCase();
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for(int i = 0; i < first.length(); i++) {
            count1[(first.charAt(i)-97)] += 1;
            count2[(second.charAt(i)-97)] += 1;
        }
        int totalChanges = 0;
        for(int i = 0; i < count1.length; i++) {
            int diff = Math.abs(count1[i] - count2[i]);
            if(diff != 0) totalChanges += diff;
        }
        totalChanges /= 2;
        return totalChanges;
    }

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < testCases; i++) {
            String line = scan.nextLine();
            if(line.length() % 2 != 0) {
                System.out.println("-1");
            } else {
                String first = line.substring(0, line.length()/2);
                String second = line.substring(line.length()/2, line.length());
                int changes = countAnagramChanges(first, second);
                System.out.println(changes);
            }
        }
    }
}
