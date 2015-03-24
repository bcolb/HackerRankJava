/**
 * AngryProfessor.java
 *
 * https://www.hackerrank.com/challenges/angry-professor
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < testCases; i++) {
            String[] nandk = scan.nextLine().split(" ");
            int n = Integer.parseInt(nandk[0]);
            int k = Integer.parseInt(nandk[1]);
            String[] arrivals = scan.nextLine().split(" ");
            int count = 0;
            for(int j = 0; j < arrivals.length; j++) {
                int t = Integer.parseInt(arrivals[j]);
                if(t <= 0) count++;
            }
            if(count >= k) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
