package CollectionFramework;

import java.util.ArrayList;

public class RetrunAllMethodComparison {

	public static void main(String[] args) {
		// RetrunAllMethodComparison
		// creating first list====using RetrunAllMethodComparison method
		
		ArrayList<String>list= new ArrayList<>();
		list.add("apple");
		list.add("mango");
		list.add("grapes");
		list.add("fruit");
		System.out.println(list);
		
		// creating Second list
		
		ArrayList<String>list1= new ArrayList<>();
		list1.add("apple");
		list1.add("mango");
		list1.add("grapes");
		list1.add("papaya");
		System.out.println(list1);
		
		// Rempove all element from the first list
		
		list1.removeAll(list);
		
		System.out.println(list1);
	}

}
