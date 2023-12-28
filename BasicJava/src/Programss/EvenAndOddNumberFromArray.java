
package Programss;

public class EvenAndOddNumberFromArray {

	public static void main(String[] args) {
		// EvenAndOddNumberFromArray
		
	/*	int a[]= {1,2,3,4,5,6};
		System.out.println("Enter Even number");
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
			System.out.println("Enter Odd Number");
			for(int i1=0;i1<=a.length-1;i1++) {
				if(a[i1]%2!=0) {
					System.out.println(a[i1]);
				}
			}
		}*/
		
		// Approach 2===> using enhanced for each loop
		int a[]= {1,2,3,4,5,6};
		System.out.println("even numbers");
		for(int value:a) {
			if(value%2==0)
			System.out.println(value);
		}
		
		System.out.println("odd number");
		for(int val:a) {
			if(val%2!=0)
	System.out.println(val);
}
	}

}
