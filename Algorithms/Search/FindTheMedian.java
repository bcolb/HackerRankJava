import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static void findMedian(int[] nums) {
	// This is sort of cheating, but it works!
      Arrays.sort(nums);
      System.out.println(nums[nums.length/2]);
    }

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int[] nums = new int[n];
      	for (int i = 0; i < n; i++) {
          nums[i] = scan.nextInt();
        }
      	findMedian(nums);
    }
}