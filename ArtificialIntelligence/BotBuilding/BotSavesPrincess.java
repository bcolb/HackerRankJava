import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  static void displayPathToPrincess(int n, int pPos, int bPos){
    int len = n;
    int dToEdge = (len - 1) / 2;
    // First move the bot up or down as needed
    if (pPos > bPos) {
      for (int i = 0; i < dToEdge; i++) {
        System.out.println("DOWN");
      }
    } else {
      for (int i = 0; i < dToEdge; i++) {
        System.out.println("UP");
      }
    }
    // Now move the bot left or right as needed
    if ((pPos % len) == 0) {
      for (int i = 0; i < dToEdge; i++) {
        System.out.println("LEFT");
      }
    } else {
      for (int i = 0; i < dToEdge; i++) {
        System.out.println("RIGHT");
      }
    }
  }
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = Integer.parseInt(scan.nextLine()); 
    int pPos = 0; 
    int bPos = 0;
  	char[][] matrix = new char[n][n];
    for (int i = 0; i < n; i++) {
      String line = scan.nextLine();
      for (int j = 0; j < n; j++) {
        char c = line.charAt(j);
        if (c == 'p') {
          pPos = (i * n) + j;
        } else if (c == 'm') {
          bPos = (i * n) + j;
        }
      }
    }
    displayPathToPrincess(n, pPos, bPos);
  }
}