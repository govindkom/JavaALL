package IMPPrograms;

public class LeapYearProblem {

	public static void main(String[] args) {
		// LeapYearProblem
		
		int year=2003;
		
		if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
	        System.out.println("LEAP YEAR");  
	    }  
	    else{  
	        System.out.println("COMMON YEAR");  
	    } 
	}
}
