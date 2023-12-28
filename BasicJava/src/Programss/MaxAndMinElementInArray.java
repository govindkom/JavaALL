package Programss;

public class MaxAndMinElementInArray {

	public static void main(String[] args) {
		// MaxAndMinElementInArray
		
		int a[]= {30,40,100,50,10,20};
		
		// first we are calculating ,max element 
		int max=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
		}
		System.out.println("max element in array:"+max);

		int min=a[0];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("min element in array:"+min);
	}

}
