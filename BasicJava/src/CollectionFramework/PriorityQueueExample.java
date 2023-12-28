package CollectionFramework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// PriorityQueue
		
		PriorityQueue<String>q= new PriorityQueue<String>();
		q.add("amit");
		q.add("vijay");
		q.add("karan");
		q.add("jay");
		q.add("rahul");
		System.out.println("initial q:"+q);
		
		System.out.println("head:"+q.element());
		System.out.println("peek:"+q.peek());
		
		System.out.println(" Iterator the queue elemnt");
		Iterator it= q.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
