package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class TravesrHashSetUsingIteratorAndForEachLoop {

	public static void main(String[] args) {
		//TravesrHashSetUsingIteratorAndForEachLoop
		
		HashSet<String>hs= new HashSet<>();
		hs.add("govind");
		hs.add("jamge");
		hs.add("patil");
		System.out.println(hs);
		
		// traverse using for each loop
		for(String s: hs) {
			System.out.println(s);
		}
		
		System.out.println("========================");
		// traverse using Iterator Method
		Iterator it= hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
