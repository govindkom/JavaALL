package IMPPrograms;

public class CopyArrayintoAnotherArray {

	public static void main(String[] args) {
		// CopyArrayintoAnotherArray
		
		  //Initialize array     
		int arr1[]=new int [] {1,2,3,4,5};
		
	    //Create another array arr2 with size of arr1    
		int arr2[]= new int[arr1.length];
		
		
		//Copying all elements of one array into another   
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		//Displaying elements of array arr1     
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]+" ");
		}
	    System.out.println(); 
	    
	    //Displaying elements of array arr2    
	    for(int i=0;i<arr2.length;i++) {
	    	System.out.println(arr2[i]+" ");
	    }
	}

}
