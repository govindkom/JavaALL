package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayListUsingAllFunctions {

	public static void main(String[] args) {
		// IterateArrayListUsingAllFunctions=====> using Iterator, for loop and for each loop
		
		ArrayList<String>al= new ArrayList<>();
		al.add("Govind");
		al.add("jamge");
		al.add("patil");
		System.out.println(al);
		
		// iterate thorugh iterator
		Iterator it= al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-============================");
		
		// iterate through for each loop
		for(String s: al) {
			System.out.println(s);
		}
		
		System.out.println("======================================");
		// iterate through for loop
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}

	}

}
