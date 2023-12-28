package Programss;

public class SumOfDigitsinNumber {

	public static void main(String[] args) {
		// SumOfDigitsinNumber
		
		int num=889977;
		int sum=0;
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);

	}

}
