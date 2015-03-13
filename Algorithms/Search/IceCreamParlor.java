// https://www.hackerrank.com/challenges/icecream-parlor
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static String solve(int[] flavors, int m, int n) {
        // O(N^2) solution - can be done in O(logN) and possibly O(N)
        for(int i = 0; i < flavors.length; i++) {
            for(int j = 0; j < flavors.length; j++) {
                if(j != i) {
                    if(flavors[j] + flavors[i] == m) {
                        return (i + 1) + " " + (j + 1);
                    }
                }
            }
        }
        return "";
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < testCases; i++) {
            int m = Integer.parseInt(scan.nextLine());
            int n = Integer.parseInt(scan.nextLine());
            int[] flavors = new int[n];
            String[] parts = scan.nextLine().split(" ");
            for(int j = 0; j < flavors.length; j++) {
                flavors[j] = Integer.parseInt(parts[j]);
            }
            System.out.println(solve(flavors, m, n));
        }
    }
}
