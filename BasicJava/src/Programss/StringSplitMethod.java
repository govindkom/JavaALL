package Programss;

public class StringSplitMethod {

	public static void main(String[] args) {
		// StringSplitMethod
		String str="java string split method by javatpoint";
		String []word=str.split("\\s");
		
		for(String s: word) {
			System.out.println(s);
		}

	}

}
