package CollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDescending {

	public static void main(String[] args) {
		// TreeSetDescending
		
		TreeSet<Integer>ts= new TreeSet<Integer>();
		ts.add(15);
		ts.add(5);
		ts.add(88);
		ts.add(18);
		System.out.println("inital treeset:"+ts);
		
		// tyraversing in descending order
		System.out.println("descending order:"+ts.descendingSet());
		
		// Traverse  through Iterator
		Iterator<Integer> it = ts.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
