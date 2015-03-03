import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /**
     * This was my first solution, but I think there are easier ways to do this.
     */
    public static int lonelyinteger(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < a.length; i++) {
            if(map.containsKey(a[i])) {
                map.put(a[i], 2);
            } else {
                map.put(a[i], 1);
            }
        }
        for(Integer n: map.keySet()) {
            if(map.get(n) == 1) return n;
        }
        return 0;
    }
    
    /**
     * Cleaner solution (possible because all nums are betwee 1 and 100).
     */
    public static int lonelyinteger2(int[] a) {
        int[] numCounts = new int[100];
        for(int i = 0 ; i < a.length; i++) {
            numCounts[a[i]]++;
        }
        for(int i = 0; i < numCounts.length; i++) {
            if(numCounts[i] == 1) return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        int[] nums = new int[size];
        String[] numStr = scan.nextLine().split(" ");
        for(int i = 0; i < numStr.length; i++) {
            nums[i] = Integer.parseInt(numStr[i]);
        }
        System.out.println(lonelyinteger2(nums));
    }
}
