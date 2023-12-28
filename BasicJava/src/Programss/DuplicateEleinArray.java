package Programss;

import java.util.HashSet;

public class DuplicateEleinArray {

	public static void main(String[] args) {
		//DuplicateEleinArray
		
		// approach 2===> using java hashset collection method
		
		String arr[]= {"java","c","c++","java"};
		HashSet <String> lang=new HashSet<String>();
		
		/*feature of HAshset===1) will ot allow to enter duplicate values array
		System.out.println(lang.add("java"));
		System.out.println(lang.add("c"));
		System.out.println(lang.add("java"));*/
		
		boolean flag=false;
		for(String s: arr) {
			if(lang.add(s)==false) {
				System.out.println("found duplicate elemnt:"+s);
			flag=true;
			}
		}
		if(flag==false) {
			System.out.println("duplicate not found");
		}
		
	}

}
