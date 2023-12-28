package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class RetainarrayList {

	public static void main(String[] args) {
		// RetainarrayList
		
		
		// creating first arraylist
		ArrayList<String>al= new ArrayList<String>();
		al.add("ajay");
		al.add("vijay");
		al.add("raj");
		System.out.println("inital list:"+al);
		
		// creating second arraylist
		ArrayList<String>al2= new ArrayList<String>();
		al2.add("hanumant");
		al2.add("raj");
		System.out.println("iterate the element after retaining the element of al2");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
	}

}
