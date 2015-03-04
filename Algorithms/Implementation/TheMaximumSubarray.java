// https://www.hackerrank.com/challenges/maxsubarray
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void solve(int[] arr) {
        // Need to find largest contiguous and non-contiguous
        int currentMax = 0;
        int maxAtThisPoint = 0;
        int nonContiguousMax = 0;
        int biggestNum = arr[0];
        for(int n: arr) {
            if(n > 0) nonContiguousMax += n;
            biggestNum = Math.max(biggestNum, n);
            maxAtThisPoint = Math.max(n, maxAtThisPoint+n);
            currentMax = Math.max(currentMax, maxAtThisPoint);
        }
        if(biggestNum <= 0) {
            nonContiguousMax = biggestNum;
            currentMax = biggestNum;
        }
        System.out.println(currentMax + " " + nonContiguousMax);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for(int t = 0; t < testCases; t++) {
            int n = Integer.parseInt(scan.nextLine());
            String[] parts = scan.nextLine().split(" ");
            int[] arr = new int[parts.length];
            for(int p = 0; p < parts.length; p++) {
                arr[p] = Integer.parseInt(parts[p]);
            }
            solve(arr);
        }
    }
}
