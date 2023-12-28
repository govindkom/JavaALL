package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	
	public static void main(String[] args) {
		
		//SortArrayList
		ArrayList<String>list= new ArrayList<>();
		
		list.add("mango");
		list.add("apple");
		list.add("grapes");
		list.add("banana");
		
		System.out.println("before sorting the list:"+list);
		
		
		// sorting the list
		Collections.sort(list);
		System.out.println("after sorting the list:"+list);
		
		// iterate through for each loop
		for(String s:list) {
			System.out.println(s);
		}
		
	}

}
