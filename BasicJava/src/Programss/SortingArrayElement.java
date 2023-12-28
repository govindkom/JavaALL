package Programss;

import java.util.Arrays;

public class SortingArrayElement {

	public static void main(String[] args) {
		// SortingArrayElement
		
		int a[]= {4,2,1,5,3};
		System.out.println("Arrays before sorting:"+Arrays.toString(a));
		
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[i]<a[j+1]) {
					int temp=a[i];
					a[i]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("arrays after sorting:"+Arrays.toString(a));

	}

}
