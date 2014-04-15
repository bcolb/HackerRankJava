import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
     public static boolean isFib(long num) {
      if(num == 1 || num == 0) return true;
      long a = 0;
      long b = 1;
      long f = a + b;
      while(f <= num) {
        a = b;
        b = f;
        f = a + b;
        if (f == num) return true;
      }
      return false;
    }
  	

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int t = scan.nextInt();
      for (int i = 0; i < t; i++) {
        long n = scan.nextLong();
        if(isFib(n)) {
          System.out.println("IsFibo");
        } else {
          System.out.println("IsNotFibo");
        }
      }
    }
}