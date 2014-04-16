
import java.util.*;
public class Solution {
  		
    static List<Integer> quickSort(List<Integer> list) {
      int len = list.size();
      if(len >= 3){
      	List<Integer> less = new LinkedList<Integer>();
      	List<Integer> more = new LinkedList<Integer>();
      	Integer pivot = list.get(0);
      	for(int i = 1; i < list.size(); i++){
      		Integer n = list.get(i);
      		if(pivot > n){
          		less.add(n);
        	} else {
          		more.add(n);
        	}
      	}
        less = quickSort(less);
        less.add(pivot);
        more = quickSort(more);
        less.addAll(more);
        list = less;
      } else if(len == 2){
        if(list.get(0) > list.get(1)) list.add(list.remove(0));
      } else {
        // size is less than or equal to 1
        return list;
      }
      printList(list);
      return list;
    }

  
  	static void printList(List<Integer> list) {
      String s = "";
      for(Integer n: list) {
        s += n + " ";
      }
      System.out.println(s);
    }
       
  	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      LinkedList<Integer> list = new LinkedList<Integer>();
      for(int i = 0; i < n; i++){
        list.add(in.nextInt());
      }
      List<Integer> result = quickSort(list);
    }    
  
}