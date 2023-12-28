package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class AscendingOrderSortArrayList {

	public static void main(String[] args) {
		// AscendingOrderSortArrayList
		
		ArrayList<String>list= new ArrayList<>();
		list.add("toyoto");
		list.add("thar");
		list.add("mahindra");
		list.add("bmw");
		list.add("audi");
		System.out.println("before sorting arraylist:"+list);
		
		// sorting arraylist
		Collections.sort(list);
		
		System.out.println("before sorting arraylist:"+list);
		
		
		// traverse using for each loop	
		for(String st: list) {
			System.out.println(st);
		}

	}

}
