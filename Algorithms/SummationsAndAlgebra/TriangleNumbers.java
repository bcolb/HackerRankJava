// https://www.hackerrank.com/challenges/triangle-numbers
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // Solves the problem given the pattern from the triangle
    public static int solve(int row) {
        if(row <= 2) return -1;
        if(row % 2 == 1) {
            return 2;
        } else if (row % 4 == 0) {
            return 3;
        } else {
            return 4;
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < testCases; i++) {
            int row = Integer.parseInt(scan.nextLine());
            System.out.println(solve(row));
        }
    }
}
