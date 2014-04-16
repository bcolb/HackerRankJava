import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static void main(String[] args) {
      try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 100;
        StringBuilder[] stringBuilders = new StringBuilder[max];
        for (int i = 0; i < max; i++) {
          stringBuilders[i] = new StringBuilder();
        }
        int count = 0;
        int half = n / 2;
        while (count < half) {
          String[] s = br.readLine().split("\\s+");
          stringBuilders[Integer.parseInt(s[0])].append("- ");
          count++;
        }
        while (count < n) {
          String[] s = br.readLine().split("\\s+");
          stringBuilders[Integer.parseInt(s[0])].append(s[1] + " ");
          count++;        
        }
        for (StringBuilder sb: stringBuilders) {
          System.out.print(new String(sb));
        }
      } catch (Exception ex) {
        System.out.println(ex.getMessage());
      }
    }
}