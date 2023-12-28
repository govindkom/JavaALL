package IMPPrograms;

public class BreakExample2withInnerLoop {

	public static void main(String[] args) {
	
		// BreakExample2withInnerLoop

		for(int i=1;i<5;i++) {
			for(int j=1;j<=4;j++) {
				if(j==3) {
					break;
				}
				System.out.println(i+" "+j);
			}
		}
		
		
		
	}

}
