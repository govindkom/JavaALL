package Programss;

public class DuplicateElementinArray {

	public static void main(String[] args) {
		// DuplicateElementinArray
		
		String str[]= {"java","c","c++","py"};
		
		// Approach 1
		
		boolean flag=false;
		for(int i=0;i<=str.length-1;i++) {
			for(int j=i+1;j<=str.length-1;j++) {
				if(str[i]==str[j]) {
					System.out.println("found duplaicte:"+str[i]);
					flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("duplicate not found");
		}
	}

}
