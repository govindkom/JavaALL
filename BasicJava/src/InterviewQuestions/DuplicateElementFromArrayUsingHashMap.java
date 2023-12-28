package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementFromArrayUsingHashMap {

	public static void main(String[] args) {
		// DuplicateElementFromArrayUsingHashMap
		
		String[] names= {"java","javascript","ruby","c","python","ruby","java"};
		
		Map<String, Integer> hmap= new HashMap<String, Integer>();
		
		for(String name: names) {
			Integer count=hmap.get(name);
			if(count==null) {
				hmap.put(name, 1);
			}
			else
			{
				hmap.put(name, ++count);
			}
		}
		// get the va;lue from this hashmap
		Set<Entry<String,Integer>> entryset= hmap.entrySet();
		for(Entry<String,Integer> entry: entryset) {
			if(entry.getValue()>1) {
				System.out.println("duplicate elemrnts:"+entry.getKey());
			}
		}
		
		

	}

}
