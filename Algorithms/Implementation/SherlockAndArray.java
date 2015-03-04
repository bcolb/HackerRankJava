// https://www.hackerrank.com/challenges/sherlock-and-array
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean solve(int[] nums, int sum) {
        if(nums.length <= 1) return true;
        int left = 0;
        int current = 0;
        int right = sum;
        for(int i = 0; i < nums.length; i++) {
            left += current;
            current = nums[i];
            right = right - nums[i];
            if(left == right) return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < testCases; i++) {
            int n = Integer.parseInt(scan.nextLine());
            String[] line = scan.nextLine().split(" "); 
            int[] nums = new int[n];
            int sum = 0;
            for(int j = 0; j < line.length; j++) {
                nums[j] = Integer.parseInt(line[j]);
                sum += nums[j];
            }
            boolean found = solve(nums, sum);
            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
}
