package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TraverseLinkedHashSetUsingForEachLoopAndIterator {

	public static void main(String[] args) {
		// TraverseLinkedHashSetUsingForEachLoopAndIterator
		
		LinkedHashSet<Integer> ls= new LinkedHashSet<>();
		ls.add(11);
		ls.add(12);
		ls.add(13);
		ls.add(14);
		System.out.println(ls);
		
		
		// iterate through iterator
		Iterator it= ls.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("================================");
		
		//  iterate through for each llop
		for(Integer i:ls) {
			System.out.println(i);
		}
	}

}
