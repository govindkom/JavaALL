package IMPPrograms;

public class Testarray1 {

	public static void main(String[] args) {
		// Testarray1
		
		//declaration, instantiation and initialization  
		int a[]= {33,3,4,5};
		
		//printing array  
		//traversing the array===> for loop
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
// traversing the array using ===> forEachLoop
		for(int i:a) 
		{
			System.out.println(i);
		}
	}

}
