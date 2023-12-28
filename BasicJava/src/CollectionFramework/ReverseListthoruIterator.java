package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseListthoruIterator {

	public static void main(String[] args) {
		// ReverseListthoruIterator==> Iterator method
		
	LinkedList<String>ll= new LinkedList<String>();
	ll.add("ajay");
	ll.add("vijay");
	ll.add("govind");
	System.out.println(ll);
	
	// traversing the list of element in reverse order
	Iterator it= ll.descendingIterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	}

	
	
}
