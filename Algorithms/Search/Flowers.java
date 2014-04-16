import java.util.*;

class Solution{
  public static void solve(int[] prices, int k) {
    Arrays.sort(prices);
    int bought = 0;
    int result = 0;
    for (int i = prices.length-1; i >= 0; i--) {
      result += ((bought / k) + 1) * prices[i];
      bought++;
    }
    System.out.println(result);
  } 
  
  public static void main( String args[] ){    
    // helpers for input/output      
    Scanner in = new Scanner(System.in);
    int N, K;
    N = in.nextInt();
    K = in.nextInt();
      
    int C[] = new int[N];
    for(int i=0; i<N; i++){
      C[i] = in.nextInt();
    }
    solve(C, K);
   }
}