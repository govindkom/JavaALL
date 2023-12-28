package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrderArrayList {

	public static void main(String[] args) {
		// DescendingOrderArrayList
		
		ArrayList<String>list= new ArrayList<String>();
		list.add("data scieneced");
		list.add("testing");
		list.add("c#");
		list.add("uml");
		list.add("basic lan");
		list.add("algorithm");
		list.add("python");
		System.out.println("before sorting in descending order:"+list);
		
		// sorting implemnt here
		Collections.sort(list,Collections.reverseOrder());
		
		System.out.println("after sorting in descending order:"+list);

	}

}
