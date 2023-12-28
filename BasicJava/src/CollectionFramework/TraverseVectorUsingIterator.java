package CollectionFramework;

import java.util.Iterator;
import java.util.Vector;

public class TraverseVectorUsingIterator {

	public static void main(String[] args) {
		// TraverseVectorUsingIterator
		
		Vector<String>v= new Vector<>();
		v.add("java");
		v.add("selenium");
		v.add("autoamtiom");
		v.add("easy");
		System.out.println(v);
		
		// iterate through iterator
		Iterator it=v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
