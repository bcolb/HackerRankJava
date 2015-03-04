// https://www.hackerrank.com/challenges/cavity-map
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void mapCavities(int[][] m) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[0].length; j++) {
                // check for edges
                if(i == 0 || i == m.length-1 || j == 0 || j == m[0].length-1) {
                    sb.append(m[i][j]);
                } else {
                    int n = m[i][j];
                    // Check for cavity
                    if(n > m[i-1][j] && n > m[i+1][j] && n > m[i][j-1] && n > m[i][j+1]) {
                        // is cavity, append 'X'
                        sb.append('X');
                    } else {
                        // is not cavity, append n
                        sb.append(n);
                    }
                }
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
        
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[][] m = new int[n][n];
        for(int i = 0; i < n; i++) {
            String str = scan.nextLine();
            for(int j = 0; j < n; j++) {
                m[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }
        mapCavities(m);
    }
}
