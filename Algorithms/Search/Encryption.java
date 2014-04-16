import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      // System.out.println(str);
      int len = str.length();
      // System.out.println("len: " + len);
      double d1 = Math.ceil(Math.sqrt(len));
      double d2 = Math.ceil(Math.sqrt(len));
      // System.out.println(d1);
      // System.out.println(d2);
      int width = (int) d1;
      int height = (int) d2;
      // System.out.println("W: " + width);
      // System.out.println("H: " + height);
      String result = "";
      
      for (int i = 0; i < height; i++) {
        for (int j = 0; j < width && ((j*height + i) < len); j++) {
          int num = j*height + i;
          // System.out.println("i: " + i + " j: " + j + " num: " + num);
          result += str.charAt(num);
        }
        result += " ";
      }
      System.out.println(result);
    }
}