package Programss;

public class ReverseEachWordinString {

	public static void main(String[] args) {
		// ReverseEachWordinString
		
		String str="welcome to java";
		String [] word=str.split(" ");
		String reversestring="";
		String reverseword="";
		
		for(String w: word) {
			
			for(int i=w.length()-1;i>=0;i--) {
				reverseword=reverseword+w.charAt(i);
			}
			reversestring=reversestring+reverseword+" ";
		}
		System.out.println(reversestring);
	}

}
