package Programss;

public class StringBuilderClassAllMethod {

	public static void main(String[] args) {
		// StringBuilderClassAllMethod
		
		// Approach 1===> Append Method
		StringBuilder sb= new StringBuilder("hello");
		sb.append("java");
		System.out.println(sb);
		
		// Approach 2==> Insert method
		StringBuilder sb1= new StringBuilder("hello");
		sb1.insert(2, false);
		System.out.println(sb1);

		// Approach 3===> replace method
		StringBuilder sb3= new StringBuilder("hello");
		sb3.replace(1, 2, "java");
		System.out.println(sb3);
		
		// approach 4===> reverse method
		StringBuilder sb5=new StringBuilder("hello");
		sb5.reverse();
		System.out.println(sb5);
	}

}
