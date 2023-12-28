package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class TraverseArrayListUsingIterator {

	public static void main(String[] args) {
		// TraverseArrayListUsingIterator
		
		ArrayList<String>al= new ArrayList<>();
		al.add("govind");
		al.add("jamge");
		al.add("patil");
		al.add("engineerr");
		System.out.println(al);
		
		// iterate though iterator
		Iterator it= al.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());	
		}
		
		

	}

}
