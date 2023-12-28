package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class TraverseArrayDequeUsingForEachLoop {

	public static void main(String[] args) {
		// TraverseArrayDequeUsingForEachLoop
		
		Deque<String>q= new ArrayDeque<>();
		q.add("govind");
		q.add("jamge");
		q.add("patil");
		System.out.println(q);

		
		// iterate through for eachllop
		for(String s:q) {
			System.out.println(s);
		}
	}

}
