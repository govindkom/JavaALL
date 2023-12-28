package Programss;

public class EvenAndOddDigitsINNumber {

	public static void main(String[] args) {
		// EvenAndOddDigitsINNumber
		
		int num=145678;
		int evennocount=0;
		int oddnumcount=0;
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) 
			{
				evennocount++;
			}
		
		else
		{
			oddnumcount++;
		}
			num=num/10;
System.out.println(evennocount+" "+oddnumcount);
	}

}
}
