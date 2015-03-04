// https://www.hackerrank.com/challenges/sherlock-and-squares
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static long countPerfectSquares(int lower, int upper) {
        if(lower == upper) {
            int d = (int) Math.sqrt(upper);
            if(d*d == upper) return 1;
            return 0;
        }
        double diff = Math.floor(Math.sqrt(upper)) - Math.floor(Math.sqrt(lower));
        long count = Math.round(diff);
        int d = (int) Math.sqrt(lower);
        if(d * d == lower) count++;
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < n; i++) {
            String[] nums = scan.nextLine().split(" ");
            int lower = Integer.parseInt(nums[0]);
            int upper = Integer.parseInt(nums[1]);
            System.out.println(countPerfectSquares(lower, upper));
        }
    }
}
