import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  	static int lonelyinteger(int[] a) {
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
      for (int i = 0; i < a.length; i++) {
        if (map.containsKey(a[i])) {
          map.remove(a[i]);
        } else {
          map.put(new Integer(a[i]), new Integer(a[i]));
        }
      }
	  Collection<Integer> c = map.values();
      Object[] nums = c.toArray();
      if (nums.length != 1) return -1;
      return Integer.parseInt(nums[0].toString());
	}
  
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = lonelyinteger(_a);
        System.out.println(res);
        
    }
}