package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrderArrayListInteger {

	public static void main(String[] args) {
		// DescendingOrderArrayListInteger
		
		ArrayList<Integer>al= new ArrayList<>();
		al.add(2300);
		al.add(566);
		al.add(123);
		al.add(110);
		al.add(689);
		al.add(12);
		al.add(95);
		System.out.println(" before sortyingb:"+al);
		
		// sorting arrayliost in descending order
		Collections.sort(al,Collections.reverseOrder());
	
	// after sorting arraylist
		System.out.println("after sorting arraylist");
		for(Integer i: al) {
			System.out.println(i);
		}
	
	
	}

}
