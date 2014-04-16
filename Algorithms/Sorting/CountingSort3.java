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
      printTotals(counts);
    }
  
  	public static void printTotals(int[] ar) {
      int total = 0;
      for (int i = 0; i < ar.length; i++) {
		total += ar[i];
        System.out.print(total + " ");
      }
    }
  
    public static void main(String[] args) {
      try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
          String s = br.readLine();
          String[] strings = s.split("\\s+");
          ar[i] = Integer.parseInt(strings[0]);
        }
        count(ar, 0, 99);
      } catch (Exception ex) {
        System.out.println(ex.getMessage());
      }
    }
}