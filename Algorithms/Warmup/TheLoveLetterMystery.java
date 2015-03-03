// https://www.hackerrank.com/challenges/the-love-letter-mystery
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int minimumReductions(String str) {
        int reductions = 0;
        for(int i = 0; i < str.length()/2; i++) {
            char l = str.charAt(i);
            char r = str.charAt(str.length()-1-i);
            if (l > r) reductions += l - r;
            if (r > l) reductions += r - l;
        }
        return reductions;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < n; i++) {
            String str = scan.nextLine();
            int count = minimumReductions(str);
            System.out.println(count);
        }
    }
}
