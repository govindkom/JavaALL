package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class TraverseLinkedListUsingIterator {

	public static void main(String[] args) {
		// TraverseLinkedListUsingIterator
		
		LinkedList<String>ll= new LinkedList<>();
		ll.add("govind");
		ll.add("jamge");
		ll.add("patil");
		ll.add("engineer");
		
		System.out.println(ll);

		// iterate through iterator
		Iterator it= ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
