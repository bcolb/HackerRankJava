import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int m = scan.nextInt();
      long total = 0;
      long a = 0;
      long b = 0;
      long k = 0;
      for (int i = 0; i < m; i++) {
        a = scan.nextInt();
        b = scan.nextInt();
        k = scan.nextInt();
        total += ((b - a + 1) * k);
      }
      long avg = total / n;
      System.out.println(avg);
    }
}