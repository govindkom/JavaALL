package Programss;

public class NoOfDigitsInNumber {

	public static void main(String[] args) {
		// NoOfDigitsInNumber
		
		int num=7877965;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);

	}

}

