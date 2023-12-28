package Programss;

public class CountWordinString {

	public static void main(String[] args) {
		// CountWordinString
		
		String str="welcome to java oops";
		int count=1;
		
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)==' '&& str.charAt(i+1)!=' ')
			{
			count++;	
			}
		}
		System.out.println("no of words in string:"+count);

	}

}
