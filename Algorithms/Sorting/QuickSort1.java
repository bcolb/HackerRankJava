
import java.util.*;
public class Solution {
  		
     static void partition(List<Integer> list) {

      LinkedList<Integer> l1 = new LinkedList<Integer>();
      LinkedList<Integer> l2 = new LinkedList<Integer>();
      
      if(list.size() <= 1) {
        printList(list);
      } else {
        int pivot = list.get(0);
        for(Integer n: list) {
          if(pivot > n) {
            l1.add(n);
          } else {
            l2.add(n);
          }
        }
      }
      l1.addAll(l2);
      printList(l1);
    }   
  
  	static void printList(List<Integer> list) {
      for(Integer n: list) {
        System.out.print(n + " ");
      }
    }
       
  	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      LinkedList<Integer> list = new LinkedList<Integer>();
      for(int i = 0; i < n; i++){
        list.add(in.nextInt());
      }
      partition(list);
    }    
  
}