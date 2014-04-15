import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void cutBar(int k) {
      long firstCut = k / 2;
      long secondCut = firstCut;
      if((k % 2) != 0){
        secondCut++;
      }
      System.out.println((firstCut * secondCut));
    }
  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int t = scan.nextInt();
      for (int i = 0; i < t; i++) {
        int k = scan.nextInt();
        cutBar(k);
      }
    }
}