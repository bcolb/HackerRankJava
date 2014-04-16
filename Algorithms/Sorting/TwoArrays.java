import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static boolean twoArrays(int[] a, int[] b, int k) {
      Arrays.sort(a);
      Arrays.sort(b);
      int j = b.length-1;
      for (int i = 0; i < a.length && j >= 0; i++) {
        if(a[i] + b[j] < k) return false;
        j--;
      }
      return true;
    }

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int t = scan.nextInt();
      for (int i = 0; i < t; i++) {
        String answer = "";
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int j = 0; j < n; j++) {
          a[j] = scan.nextInt();
        }
        for (int j = 0; j < n; j++) {
          b[j] = scan.nextInt();
        }
        if(twoArrays(a, b, k)) {
        	System.out.println("YES");
      	} else {
        	System.out.println("NO");
      	}
      }
    }
}