import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     public static void serviceLane(int[] lane, int start, int end) {
      int max = 3;
      for (int i = start; i <= end && max != 1; i++) {
        max = Math.min(max, lane[i]);
      }
      System.out.println(max);
    }
  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int t = scan.nextInt();
      int[] lane = new int[n];
      for(int i = 0; i < n; i++) {
        lane[i] = scan.nextInt();
      }
      for(int i = 0; i < t; i++) {
        int start = scan.nextInt();
        int end = scan.nextInt();
        serviceLane(lane, start, end);
      }
    }
}