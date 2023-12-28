package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		// ReverseArrayList
		
		ArrayList<String>list1= new ArrayList<String>();
		list1.add("apple");
		list1.add("mango");
		list1.add("grapes");
		list1.add("fruit");
		System.out.println(list1);
		
		// reverse arraylist
		Collections.reverse(list1);
		System.out.println("after reverse:"+list1);
		

	}

}
