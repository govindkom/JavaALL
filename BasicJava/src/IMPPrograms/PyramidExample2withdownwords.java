package IMPPrograms;

public class PyramidExample2withdownwords {

	public static void main(String[] args) {
		//PyramidExample2withdownwords
		
		int term=6;
		for(int i=1;i<=term;i++) {
			for(int j=term;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
