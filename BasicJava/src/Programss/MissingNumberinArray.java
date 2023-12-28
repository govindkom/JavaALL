package Programss;

public class MissingNumberinArray {

	public static void main(String[] args) {
		// MissingNumberinArray
		
		int a[]= {1,2,3,5,6,7,8,9};
		
		// first we have to find sum of elements 
		int sum1=0;
		for(int i=0;i<=a.length-1;i++) {
			sum1=sum1+a[i];
		}
		System.out.println("sum of elements in array:"+sum1);

		
		int sum2=0;
		for(int i=1;i<=9;i++) {
			sum2=sum2+i;
		}
		System.out.println("sum of elements in array:"+sum1);
		System.out.println("missing number:"+(sum2-sum1));
	}

}
