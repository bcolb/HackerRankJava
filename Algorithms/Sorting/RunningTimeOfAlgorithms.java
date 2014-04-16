
import java.util.*;
public class Solution {
       
      static void insertionSort(int[] ar) {
        // Keeps track of the number of shifts
        int shifts = 0;
         // Check for already sorted case(s)
         if(ar.length >= 1) {
           for(int i = 1; i < ar.length; i++) {
             int num = ar[i];
             for(int j = i-1; j >= 0; j--) {
               if(num < ar[j]) {
               	ar[j+1] = ar[j];
               	ar[j] = num;
                shifts++;
               } else {
               	break;
               }
             }
           }
         } else {
           // do nothing - array is already sorted
         }
        System.out.println(shifts);
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