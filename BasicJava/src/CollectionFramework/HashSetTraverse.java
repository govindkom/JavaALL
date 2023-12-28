package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTraverse {

	public static void main(String[] args) {
		// HashSetTraverse
		// creating arraylist
		ArrayList<String>al= new ArrayList<String>();
		al.add("govind");
		al.add("jamge");
		al.add("patil");
		System.out.println("initial list:"+al);
		
		// create HashSet
		HashSet<String>hs= new HashSet<String>(al);
		hs.add("java");
		hs.add("python");
		System.out.println("initial list:"+hs);
		
		// or we can iterate using iterator
		Iterator it= al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		
		

	}

}
