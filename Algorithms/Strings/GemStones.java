// https://www.hackerrank.com/challenges/gem-stones
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);   
        int testCases = Integer.parseInt(scan.nextLine());
        // intialize gem array
        int[] gems = new int[26];
        for(int i = 0; i < gems.length; i++) {
            gems[i] = 1;
        }
        // loop through all test cases
        for(int i = 0; i < testCases; i++) {
            String rock = scan.nextLine();
            int[] rockCount = new int[26];
            // count characters in current rock
            for(int k = 0; k < rock.length(); k++) {
                int c = (int) rock.charAt(k) - 97;
                rockCount[c] += 1;
            }
            // check rock count against current gem count
            for(int j = 0; j < gems.length; j++) {
                if(rockCount[j] == 0) {
                    gems[j] = 0;
                }
            }
        }
        
        int count = 0;
        // get a total for gems in all rocks
        for(int i = 0; i < gems.length; i++) {
            if(gems[i] > 0) count++;
        }
        // print out result
        System.out.println(count);
    }
}
