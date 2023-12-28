package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListInteger {

	public static void main(String[] args) {
		// SortArrayListInteger
		
		ArrayList<Integer>list= new ArrayList<Integer>();
		list.add(11);
		list.add(60);
		list.add(25);
		list.add(45);
		
		System.out.println("before sorting the list:"+list);

		// sorting the array
		Collections.sort(list);
		System.out.println("after sorting the list:"+list);
		
		// iterate through for each loop
		for (Integer integer : list) 
		{
			System.out.println(integer);	
		}
		
		

	}

}
