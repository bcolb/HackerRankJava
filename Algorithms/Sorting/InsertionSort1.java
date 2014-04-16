
import java.util.*;
public class Solution {
       
      static void insertionSort(int[] ar) {
         // Check for already sorted case(s)
         if(ar.length <= 1) System.exit(0);
         int num = ar[ar.length-1];
         if(num >= ar[ar.length-2]) System.exit(0);
         // Now countdown
         for(int i = ar.length-2; i >= -1; i--) {
           // Check last case
           if(i == -1) {
             ar[0] = num;
             printArray(ar);
             break;
           } else if(num > ar[i]) {
             ar[i+1] = num;
             printArray(ar);
             break;
           } else {
             ar[i+1] = ar[i];
             printArray(ar);
           }
         }
      }   
 
      static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           insertionSort(ar);
       }    
   }
