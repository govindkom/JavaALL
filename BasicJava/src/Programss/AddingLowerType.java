package Programss;

public class AddingLowerType {

	public static void main(String[] args) {
		// AddingLowerType
		
		byte a= 10;
		byte b=20;
	// If we did byte c=a+b;   ===> we will get compile time error
// so we have to use below method
				byte c=(byte)(a+b);
		System.out.println(c);
	}

}
