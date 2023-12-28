package Programss;

public class CountingofCharFrequency {

	public static void main(String[] args) {
		// CountingofCharFrequency
		String str="welcome to javatpoint";
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println("frequecncy of t is:"+count);
		
	}

}
