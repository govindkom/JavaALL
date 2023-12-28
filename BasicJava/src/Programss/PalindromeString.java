package Programss;

public class PalindromeString {

	public static void main(String[] args) {
		// PalindromeString
		
		String str="WELCOME";
		String rev="";
		String orgstr=str;
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(orgstr.contains(rev)) 
		{
			System.out.println(orgstr+"string palindrome");
		}
		else
		{
			System.out.println(orgstr+" not palindrome string");
		}
	}

}
