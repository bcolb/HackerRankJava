import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      	int value = scan.nextInt();
      	int n = scan.nextInt();
        for(int i = 0; i < n; i++) {
          int num = scan.nextInt();
          if(num == value) {
            System.out.println(i);
            break;
          }
        }
    }

}