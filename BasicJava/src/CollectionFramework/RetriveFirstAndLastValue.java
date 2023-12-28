package CollectionFramework;

import java.util.TreeSet;

public class RetriveFirstAndLastValue {

	public static void main(String[] args) {
		// RetriveFirstAndLastValue
		
		TreeSet<Integer>ts= new TreeSet<Integer>();
		ts.add(24);
		ts.add(66);
		ts.add(15);
		ts.add(12);
		System.out.println("initial trerset:"+ts);
		
		// Retriving first value
		System.out.println(ts.pollFirst());

		// Retriving last value
		System.out.println(ts.pollLast());
	}

}
