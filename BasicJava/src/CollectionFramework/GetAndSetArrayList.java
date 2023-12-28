package CollectionFramework;

import java.util.ArrayList;

public class GetAndSetArrayList {

	public static void main(String[] args) {
		// GetAndSetArrayList
		
		// GET===> returns the element at the specified index
		// SET==> changes the element 
		
		ArrayList<String>al= new ArrayList<>();
		al.add("mango");
		al.add("banana");
		al.add("apple");
		al.add("grapes");
		System.out.println(al);
		
		// Acceessing the element 
		System.out.println("returning the element :"+al.get(2));
		System.out.println(al);
		
		System.out.println("============================");
		// changing/ set the element
		al.set(1, "sweet");
		System.out.println(al);
		System.out.println("============================");
		
		// iterate through for each llopop
		for(String s:al) {
			System.out.println(s);
		}

	}

}
