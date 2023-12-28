package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class AscendingOrderForIntegerArrayList {

	public static void main(String[] args) {
		// AscendingOrderForIntegerArrayList
		
		ArrayList<Integer>al= new ArrayList<Integer>();
		al.add(15);
		al.add(5);
		al.add(63);
		al.add(10);
		System.out.println("before sorting the array list:"+al);
		
		// sorting ArrayList
		 Collections.sort(al);
		 
		 System.out.println("after sorting the array list:"+al);
		 
		 System.out.println("================");
		 
	// traverse though for loop
		 for(int i=0;i<=al.size()-1;i++) {
			 System.out.println(al.get(i));
		 }
		 
		 System.out.println("================");
		 
		 // Traverse through for each loop
		 for(Integer i:al) {
			 System.out.println(i);
		 }

	}	

}
