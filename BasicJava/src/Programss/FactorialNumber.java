package Programss;

public class FactorialNumber {

	public static void main(String[] args) {
		// FactorialNumber
		
		// Apprroach 1===> front type
		int num=5;
		long factorial=1;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.err.println("factorail of num is:"+factorial);
		
		
		// Approach 2====> reverse tyepe
		int no=5;
		long fact=1;
		for(int i=no;i>=1;i--) {
			fact=fact*i;
		}
		System.err.println("factorail of num is:"+fact);
	}

}
