package Programss;

public class ReverseEachWordinStringUsingStringBuilder {

	public static void main(String[] args) {
		// ReverseEachWordinStringUsingStringBuilder
		
		String str="welcome to java";
		String [] word=str.split("\\s");
		String reverseword="";
		for(String s:word) {
			StringBuilder sb= new StringBuilder(s);
			sb.reverse();
			reverseword=reverseword+sb.toString()+" ";
		
		}
		System.out.println(reverseword);
	}

}
