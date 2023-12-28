package Programss;

public class StringBufferAppendMethod {

	public static void main(String[] args) {
		// StringBufferAppendMethod
		
		// Approach 1===> Append Method
		StringBuffer sb= new StringBuffer("welcomw");
		sb.append("JAVA");
		System.out.println(sb);
		
		
		// Approach 2===> Insert Method
		StringBuffer sb1= new StringBuffer("hello");
		sb1.insert(2, false);
		System.out.println(sb1);

		// Approach 3===> Using replace Method()
		StringBuffer sb2= new StringBuffer("hello");
		sb.replace(1, 3, "java");
		System.out.println(sb);
		
		// Approach 4: delete ()Meyhod
		StringBuffer sb4= new StringBuffer("hello");
		sb4.delete(1, 3);
		System.out.println(sb4);
	}

}
