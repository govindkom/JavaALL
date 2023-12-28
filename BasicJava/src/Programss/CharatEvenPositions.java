package Programss;

public class CharatEvenPositions {

	public static void main(String[] args) {
		// CharatEvenPositions
		
		String str="welcome to javatpoint";
		for(int i=0;i<=str.length()-1;i++) {
			if(i%2==0) {
				System.out.println("char at:"+i+"place"+" "+str.charAt(i));
			}
		}

	}

}
