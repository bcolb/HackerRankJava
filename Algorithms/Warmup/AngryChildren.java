import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void minimumUnfairness(int[] candies, int k) {
      Arrays.sort(candies);
      if (candies.length <= k) {
        int diff = candies[candies.length-1] - candies[0];
        System.out.println(diff);
      } else {
      	int diff = candies[k-1] - candies[0];
      	for (int i = 0; i < candies.length-k; i++) {
        	int d = candies[i+k-1] - candies[i];
        	diff = Math.min(diff, d);
      	}
      	// diff = Math.min(diff, (candies[candies.length-1] - candies[candies.length - k]));
      	System.out.println(diff);
      }
    }
  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int k = scan.nextInt();
      int[] candies = new int[n];
      for (int i = 0; i < n; i++) {
        candies[i] = scan.nextInt();
      }
      minimumUnfairness(candies, k);
    }
}