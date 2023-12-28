package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {

	public static void main(String[] args) {
		// ConvertListToArray
		List<String>ll= new ArrayList<>();
		ll.add("mango");
		ll.add("apple");
		ll.add("grapes");
		System.out.println(ll);
		
		// convertin list to array
		String arr[]= ll.toArray(new String[ll.size()]);
		System.out.println("printing array:"+Arrays.toString(arr));
		System.out.println("printing list:"+ll);
		

	}

}
