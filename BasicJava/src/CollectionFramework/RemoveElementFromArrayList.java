package CollectionFramework;

import java.util.ArrayList;

public class RemoveElementFromArrayList {

	public static void main(String[] args) {
		// RemoveElementFromArrayList
		
		ArrayList<String>al=new ArrayList<String>();
		al.add("ravi");
		al.add("vijay");
		al.add("ajay");
		al.add("vikas");
		al.add("raj");
		System.out.println("initial list of element:"+al);
		
		// Remove specific element from arraylist
		al.remove("vijay");
		System.out.println("after remove object:"+al);
		
		// Remove the element on the basis of specific position
		al.remove(2);
		System.out.println("after remove object as per index:"+al);
		
		// creating another arraylist
		ArrayList<String>al2=new ArrayList<String>();
		al2.add("hanumant");
		al2.add("patil");
		System.out.println("after invoking adding (index)method :"+al2);
		
		// removing element on the basis of specified condition
		al.removeIf(str->str.contains("ravi"));
		System.out.println("after invoking removeIf method:"+al);
		
		
		// Removing all the element avaialble in the list
		al.clear();
		System.out.println("after ibnvoking clear () method :"+al);
		

	}

}
