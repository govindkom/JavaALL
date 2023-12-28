package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

	public static void main(String[] args) {
		// ConvertArrayToList
		
		// we can convert the array to list by traversing the array and adding the element in list one by one using 
		//list.add() Method
		
		// creating array
		String array[]= {"java","c","c#","python"};
		System.out.println("Printing array:"+Arrays.toString(array));
		
		// converting array to list
		List<String>list= new ArrayList<String>();
		for(String arr:array) {
			list.add(arr);
		}
		System.out.println("printing list:"+list);
	}

}
