package CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInterface {

	public static void main(String[] args) {
		// ListIteratorInterface===> for forward and Reverse/Back Direction
		
		List<String>list= new ArrayList<String>();
		list.add("Amit");
		list.add("vijay");
		list.add("kumar");
		list.add("sachin");
		list.add("sachin");
		list.add("govind");
		System.out.println("initial list:"+list);	
		
		// Traversing elemnt through forward direction
		ListIterator<String>itr= list.listIterator();
		while(itr.hasNext()) {
			System.out.println("index:"+itr.nextIndex()+"value"+itr.next());
		}
		
		// Travewrsing element though Back/ Reverse Direction
		while(itr.hasPrevious()) {
			System.out.println("index of:"+itr.previousIndex()+"value"+itr.previous());
		}

	}

}
