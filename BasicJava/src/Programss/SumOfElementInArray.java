package Programss;

public class SumOfElementInArray {

	public static void main(String[] args) {
		// SumOfElementInArray
		/* Approach 1====> using for loop
		int sum=0;
		int a[]= {5,2,7,9,6};
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);*/

		
		
		// Approach 2===> using for each loop
		int sum=0;
		int a[]= {5,2,7,9,6};
		for(int val:a) {
			sum=sum+val;
		}
		System.out.println("sum of element in an array:"+sum);
	}

}
