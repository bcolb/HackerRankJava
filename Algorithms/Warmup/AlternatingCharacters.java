// https://www.hackerrank.com/challenges/alternating-characters
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int alternatingCharacters(String str) {
        int deletions = 0;
        for(int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) deletions++;
        }
        return deletions;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < n; i++) {
            String str = scan.nextLine();
            int min = alternatingCharacters(str);
            System.out.println(min);
        }
    }
}
