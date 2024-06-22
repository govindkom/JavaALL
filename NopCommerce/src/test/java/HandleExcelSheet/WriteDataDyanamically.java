package HandleExcelSheet;

import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataDyanamically {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile_dyamic");
		
		
		XSSFWorkbook workbook= new XSSFWorkbook();
	XSSFSheet sheet=	workbook.createSheet("dynamicdata");
	
	// user defined
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter how many rows u want?");
	
	int noofrows= sc.nextInt();
	
	
	System.out.println("Enter how many cells u want");
	int noofcellss= sc.nextInt();
	
	
	for(int r=0;r<=noofrows;r++) {
		
	XSSFRow currentRow=	sheet.createRow(r);
	
		for(int c=0;c<noofcellss;c++)
		{
			XSSFCell cell=currentRow.createCell(c);
			cell.setCellValue(sc.next());
		}
	}
	
	
	workbook.write(file);
	workbook.close();
	
	file.close();
	
	System.out.println("file created");
	
	
	
	}

}
