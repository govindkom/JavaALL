package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElementFromTwoAL {

	public static void main(String[] args) {
		// CommonElementFromTwoAL===using Retain Method
		
		// create First ArrayList
		ArrayList<String>flist=new ArrayList<>(Arrays.asList("M","W","K","J","T"));
		System.out.println("first arraylist");
		System.out.println(flist);
		
		
		// creating second arraylist
		ArrayList<String>slist= new ArrayList<String>(Arrays.asList("M","W","E","J","T"));
		System.out.println("second arraylist");
		System.out.println(slist);
		
		// return the common element from both AL
		flist.retainAll(slist);
		System.out.println("common element:"+flist);
		
		// return uncommon element
		slist.removeAll(flist);
		System.out.println(slist);

	}

}
