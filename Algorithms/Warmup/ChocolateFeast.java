import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  	public static void chocolate(int money, int cost, int bonus) {
      // $N bill, $C for each chocolate, every M wrappers get one free
      int numChoc = 0;
      int numWrap = 0;
      while (money >= cost) {
        numChoc++;
        numWrap++;
        money = money - cost;
        if(numWrap == bonus) {
          numChoc++;
          numWrap = 1;
        }
      }
      if(numWrap == bonus) numChoc++;
      System.out.println(numChoc);
    }
  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int t = scan.nextInt();
      for (int i = 0; i < t; i++) {
        // N, C, M
        int n = scan.nextInt();
        int c = scan.nextInt();
        int m = scan.nextInt();
        chocolate(n, c, m);
      }
    }
}