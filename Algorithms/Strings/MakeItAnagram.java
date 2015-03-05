// https://www.hackerrank.com/challenges/make-it-anagram
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int makeItAnagram(String one, String two) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int len1 = one.length();
        int len2 = two.length();
        int longest = Math.max(len1, len2);
        for(int i = 0; i < longest; i++) {
            if(i < len1) {
                int c1 = (int) one.charAt(i) - 97;
                arr1[c1] += 1;
            }
            if(i < len2) {
                int c2 = (int) two.charAt(i) - 97;
                arr2[c2] += 1;
            }
        }
        int sum = 0;
        for(int j = 0; j < arr1.length; j++) {
            sum += Math.abs(arr1[j]-arr2[j]);
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String one = scan.nextLine();
        String two = scan.nextLine();
        int result = makeItAnagram(one, two);
        System.out.println(result);
    }
}
