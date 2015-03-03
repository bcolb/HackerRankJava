// https://www.hackerrank.com/challenges/maximizing-xor
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static long maxXor(int l, int r) {
        int max = 0;
        for(int i = l; i <= r; i++) {
            for(int j = l; j <= r; j++) {
                int res = i ^ j;
                if(res > max) max = res;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        System.out.println(maxXor(l, r));
    }
}
