package IMPPrograms;

public class DuplicateWordsAndOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Noida is good city and is very good Noida Good";
		System.out.println(str.length());
		
		String str1[]=str.split(" ");
		
		int count=1;
		
		for(int i=0;i<str1.length;i++) {
			for(int j=0;j<str1.length;j++) {
				if(str1[i].equalsIgnoreCase(str1[j])) {
					count++;
					str1[i]="0";
				}
			}
			if(count>1 && str1[i]!="0") {
				System.out.println(str1[i]+" "+count);
			}
			count=1;
		}

	}

}
