package Programss;

public class PalindromeNumber {

	public static void main(String[] args) {
		// PalindromeNumber
		
		int num=16461;
		int rev=0;
		int orgnum=num;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(orgnum==rev) {
			System.out.println(orgnum+"panindrome niumber");
		}
		else
		{
			System.out.println(orgnum+"not panindrome niumber");
		}

	}

}