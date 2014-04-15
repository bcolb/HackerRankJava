import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Solution for the Utopian Tree problem.
 */ 
public class Solution {

    /**
     * Prints out the height of an array of utopian trees.
     */ 
  	public Solution(int[] cases, int numCases) {
      for(int c: cases){
        System.out.println(findHeight(c));
      }
    }
  
    /**
     * Does the actual calculations for a single utopian tree. Solution
     * complexity is O(N) where N is the number of seasons. 
     */ 
    public int findHeight(int numSeasons) {
      int height = 1;
      for(int i = 0; i < numSeasons; i++) {
        if(i % 2 == 0){
          height = height*2;
        } else {
          height += 1;
        }
      }
      return height;
    }
  
    /**
     * Main method is used for reading input from stdin and for 
     * creating the solution.
     */
    public static void main(String[] args) {
      try {
      	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	int numCases = Integer.parseInt(br.readLine());
      	int[] cases = new int[numCases];
      	for(int i = 0; i < numCases; i++){
        	cases[i] = Integer.parseInt(br.readLine());
      	}
        Solution solution = new Solution(cases, numCases);
      } catch (Exception ex) {
        System.out.println(ex.getMessage());
      }
    }
}