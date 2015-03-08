// https://www.hackerrank.com/challenges/taum-and-bday 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Use of longs is necessary due to size of input 
 * (i.e. 10^9 x 10^9 exceeds the size of an int)
 */
public class Solution {
    
    public static long solve(long b, long w, long x, long y, long z) {
        long bcost = Math.min(x, y+z);
        long wcost = Math.min(y, x+z);
        return bcost * b + wcost * w;
    }
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < testCases; i++) {
            String[] ele1 = scan.nextLine().split(" ");
            String[] ele2 = scan.nextLine().split(" ");
            // B, W
            long b = Long.parseLong(ele1[0]);
            long w = Long.parseLong(ele1[1]);
            // X, Y, Z
            long x = Long.parseLong(ele2[0]);
            long y = Long.parseLong(ele2[1]);
            long z = Long.parseLong(ele2[2]);
            System.out.println("" + solve(b, w, x, y, z));
        }
    }
}
