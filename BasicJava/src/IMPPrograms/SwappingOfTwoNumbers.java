package IMPPrograms;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		
		// approach 1
		/*int t=a;
		a=b;
		b=t;
		System.out.println(a);
		System.out.println(b);
		
		
		// Approach2 ===> use + & - withpout using thiord variablex
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		// Approach 3===> using * & / operator without using third variables
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(a);
		System.out.println(b);
		
		// approach 4===> bitwise xor operator
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);*/
		
		// Approach 5-====> using single statement
		System.out.println(b=a+b-(a=b));
	}

}
