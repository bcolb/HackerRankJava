import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static void missingNumbers(int[] N, int[] M) {
      int adjustment = 100 - N[0];
      int[] countN = new int[201];
      int[] countM = new int[201];
      for (int i = 0; i < N.length; i++) {
        countN[N[i] + adjustment] += 1;
      }
      for (int i = 0; i < M.length; i++) {
        countM[M[i] + adjustment] += 1;
      }
      for (int i = 0; i < countN.length; i++) {
        if (countM[i] > countN[i]) {
          System.out.print((i - adjustment) + " ");
        }
      }
    }
  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int[] N = new int[n];
      for (int i = 0; i < n; i++) {
        N[i] = scan.nextInt();
      }
      int m = scan.nextInt();
      int[] M = new int[m];
      for (int i = 0; i < m; i++) {
        M[i] = scan.nextInt();
      }
      missingNumbers(N, M);
    }
  
}