package CollectionFramework;

import java.util.ArrayList;

public class CompareTwoArrayList {

	public static void main(String[] args) {
		// CompareTwoArrayList=====> using equals method
		
		// creating first list====
		ArrayList<String>list1= new ArrayList<>();
		list1.add("apple");
		list1.add("mango");
		list1.add("grapes");
		list1.add("fruit");
		System.out.println(list1);
		
		
		// creating second list
		ArrayList<String>list2= new ArrayList<>();
		list2.add("apple");
		list2.add("mango");
		list2.add("grapes");
		list2.add("fruit");
		list2.add("banana");
		System.out.println(list2);
		
		// compare two list using equals method
		boolean status= list1.equals(list2);
		System.out.println(status);
	}

}
