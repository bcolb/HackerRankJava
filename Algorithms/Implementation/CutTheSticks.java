// https://www.hackerrank.com/challenges/cut-the-sticks
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void makeCuts(Stack<Integer> st, int smallest) {
        // use two stacks, keep track of smallest number for next cut
        while(!st.empty()) {
            // print size - indicates the number of cuts we're about to make
            System.out.println(st.size());
            Stack<Integer> st2 = new Stack<Integer>();
            boolean done = false;
            int newSmallest = 1000; // max number
            while(!done) {
                int n = st.pop();
                n = n - smallest;
                if(n > 0) {
                    if(n < newSmallest) newSmallest = n;
                    st2.push(n);
                }
                if(st.empty()) {
                    done=true;
                    st=st2;
                    smallest=newSmallest;
                }
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] nums = scan.nextLine().split(" ");
        Stack<Integer> st = new Stack<Integer>();
        int smallest = 1000; // max number
        for(int i = 0; i < nums.length; i++) {
            int m = Integer.parseInt(nums[i]);
            if(m < smallest) smallest = m;
            st.push(m);
        }
        makeCuts(st, smallest);
    }
}
