package CollectionFramework;

import java.util.TreeSet;

public class NavigableSetOperations {

	public static void main(String[] args) {
		// NavigableSetOperations
		
		TreeSet<String>set= new TreeSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");
		System.out.println("initial treeset:"+set);
		
		// Reverse Set
		System.out.println("reverse set:"+set.descendingSet());
		
		// Head Set===> upto that value it will print 
		System.out.println("head set:"+set.headSet("d",true));
		
		// Sub Set===> in between a dn e values
		System.out.println("sub set:"+set.subSet("a", false,"e",false));
		
		// Tail Set
		System.out.println("tail set:"+set.tailSet("c",false));
	}

}
