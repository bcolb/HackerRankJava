// https://www.hackerrank.com/challenges/manasa-and-stones
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void manasaAndStones(int stones, int a, int b) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        int start = stones-1;
        for(int acount = start; acount >= 0; acount--) {
            int bcount = start-acount;
            int total = a*acount + b*bcount;
            ts.add(total);
        }
        String result = "";
        for(Integer n: ts) {
            result += n + " ";
        }
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < testCases; i++) {
            int stones = Integer.parseInt(scan.nextLine());
            int a = Integer.parseInt(scan.nextLine());
            int b = Integer.parseInt(scan.nextLine());
            manasaAndStones(stones, a, b);
        }
    }
}
