package IMPPrograms;

public class Testarray {

	public static void main(String[] args) {
		// Testarray
		
		int a[]= new int [5];   //declaration and instantiation  
		a[0]=10; /// Initialization of array
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
/*traversing the array===> for loop
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/
		
		
// traversing the array using ===> forEachLoop
		for(int i:a) 
		{
			System.out.println(i);
		}
	}

}
