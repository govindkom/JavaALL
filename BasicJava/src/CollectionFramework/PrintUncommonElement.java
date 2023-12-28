package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintUncommonElement {

	public static void main(String[] args) {
		// PrintUncommonElement===<> from two ArrayList
		
		// create First ArrayList
		ArrayList<Integer>al1= new ArrayList<Integer>(Arrays.asList(12,4,67,90,34));
		System.out.println("first ArrayList");
		System.out.println(al1);
		
		// create Second ArrayList
		ArrayList<Integer>al2= new ArrayList<Integer>(Arrays.asList(12,4,67,0,34));
		System.out.println("second arraylist");
		System.out.println(al2);
		
		// return the uncommon element
		al2.removeAll(al1);
		System.out.println(al2);

	}

}
