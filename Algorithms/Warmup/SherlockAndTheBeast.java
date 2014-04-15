import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  	public static void largestK(int n) {
      int num5s = n;
      int num3s = 0;
      while (num5s >= 0) {
        if (num5s % 3 == 0) {
          break;
        }
        num3s += 5;
        num5s -= 5;
      }
      printSolution(num5s, num3s);
    }
  
  	public static void printSolution(int num5s, int num3s) {
      if(num5s >= 0) {
        for(int i = 0; i < num5s; i += 3) {
          System.out.print("555");
        }
        for(int i = 0; i < num3s; i += 5) {
          System.out.print("33333");
        }
        System.out.println();
      } else {
        System.out.println("-1");
      }
    }
  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int t = scan.nextInt();
      for(int i = 0; i < t; i++) {
        largestK(scan.nextInt());
      }
    }
}