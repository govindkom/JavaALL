package Programss;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Approacgh 1===> using char array
	/*String str="automation";
		char chars[]=str.toCharArray();
		
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]);
		}
		
		// Approach 2 ===> using String concatenation operator
		
		String str="welcome to java";
		String rev="";
		int len=str.length();/// for printing length
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);*/
		
		// Approach 3===> using StringBuffer
		String str="welcome";
		StringBuffer sb= new StringBuffer(str);
		System.out.println(sb.reverse());
		

	}

}
