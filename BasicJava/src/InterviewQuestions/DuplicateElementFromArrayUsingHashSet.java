package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementFromArrayUsingHashSet {

	public static void main(String[] args) {
		// DuplicateElementFromArrayUsingHashSet
		
		String[] names= {"java","javascript","ruby","c","python","ruby","java"};
		
		Set<String> store= new HashSet<>();
		
		for(String name: names) {
			if(store.add(name)==false) {
				System.out.println("duplicate elemrnts:"+name);
			}
		}

	}

}
