package InterviewQuestions;

public class DuplicateElementFromArray {

	public static void main(String[] args) {
		// DuplicateElementFromArray
		
		String[] names= {"java","javascript","ruby","c","python","ruby","java"};
		
		
		// 1) st approach====time complexity O(n2)===> worst solution not recommded mostly
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("duplicate elemrnts:"+names[i]);
				}
				
				
			}
		}
	}

}
