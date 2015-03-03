import java.io.*;
import java.util.*;

class Solution {
    
    /**
     * It's easier to handle this one without a helper method.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numLines = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < numLines; i++) {
            String[] numStrs = scan.nextLine().split(" ");
            int a = Integer.parseInt(numStrs[0]);
            int b = Integer.parseInt(numStrs[1]);
            System.out.println("" + (a + b));
        }
    }
}
