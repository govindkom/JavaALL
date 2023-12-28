package CollectionFramework;

import java.util.Iterator;
import java.util.Stack;

public class TraverseStackUsingIterator {

	public static void main(String[] args) {
		// TraverseStackUsingIterator
		
		Stack<Integer>s= new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(50);
		s.push(40);
		
		System.out.println(s);
		
		// iterate through iterator
		Iterator it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
