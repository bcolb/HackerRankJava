import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void count(int[] ar, int start, int end) {
      int[] counts = new int[end - start + 1];
      for (int i = 0; i < ar.length; i++) {
        counts[ar[i]]++;
      }
      printArray(counts);
    }
  
  	public static void printArray(int[] ar) {
      for (int i = 0; i < ar.length; i++) {
        System.out.print((ar[i] + " "));
      }
    }
  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int[] ar = new int[n];
      for (int i = 0; i < n; i++) {
        ar[i] = scan.nextInt();
      }
      count(ar, 0, 99);
    }
}