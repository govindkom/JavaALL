package CollectionFramework;

import java.util.ArrayList;

public class AddElementToArrayList {

	public static void main(String[] args) {
		// AddElementToArrayList
		
		ArrayList<String>list= new ArrayList<>();
		list.add("ravi");
		list.add("vijay");
		list.add("sachin");
		list.add("govind");
		System.out.println(list);
		
		// adding elememtn at specific position
		list.add(1,"raju");
		System.out.println("after invoking adding element at specified position:"+list);
		
		// creating second arrayList
		ArrayList<String>al2=new ArrayList<String>();
		al2.add("komal");
		al2.add("jamge");
		System.out.println("al2 list is:"+al2);
		
		// Adding second arraylist element to first arrayList element
		list.addAll(al2);
		System.out.println("after adding second list into first list element :"+list);
		
		// creating third ArrayList
		ArrayList<String>al3=new ArrayList<>();
		al3.add("java");
		al3.add("python");
		System.out.println("after creating al3 list elements are as:"+al3);
		
		// adding third list element to the first list at specific position
		list.addAll(1,al3);
		System.out.println("after invoking third list add all into first list methiod adding :"+list);
		

	}

}
