import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
  public static void closestNumbers(int[] nums) {
    Arrays.sort(nums);
    int difference = 0;
    if (nums.length >= 2) {
      difference = nums[1] - nums[0];
    }
    for (int i = 1; i < nums.length; i++) {
      int tempDiff = nums[i] - nums[i-1];
      if (tempDiff < difference) {
        difference = tempDiff;
      }
    }
    for (int i = 1; i < nums.length; i++) {
      int tempDiff = nums[i] - nums[i-1];
      if (tempDiff == difference) {
        System.out.print(nums[i-1] + " " + nums[i] + " ");
      }
    }
  }
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = scan.nextInt();
    }
    closestNumbers(nums);
  }
}