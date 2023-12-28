package Programss;

public class StringSizeWithwhiteSpaces {

	public static void main(String[] args) {
		// StringSizeWithwhiteSpaces
		
		String str="welcome to java tpoint";
		int sizewithwhitespaces=str.length();
		System.out.println("in the string:"+" "+str+" ");
		
		str=str.replace(" ", "");
		int sizewithoutwhitespace=str.length();
		
		int noofwhitespaces=sizewithwhitespaces-sizewithoutwhitespace;
		System.out.println(noofwhitespaces);

	}

}
