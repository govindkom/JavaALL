package Programss;

public class NumberPrimeOrNot {

	public static void main(String[] args) {
		// NumberPrimeOrNot
		
		int num=20;
		int count=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					count++;
			}
			if(count==2) {
				System.out.println("prime number");
			}
			else
			{
				System.out.println("not prime number");
			}
		}

	}

}
