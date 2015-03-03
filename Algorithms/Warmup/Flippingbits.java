// https://www.hackerrank.com/challenges/flipping-bits
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static long flipBits(long n) {
        return ~n & 0x00000000ffffffffL;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numLines = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < numLines; i++) {
            // Must use long - Java ints are 32-bit two's complement
            long n = Long.parseLong(scan.nextLine());
            System.out.println(flipBits(n));
        }
    }
}
