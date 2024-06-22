package HandleExcelSheet;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelSheet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		// excel file--> workbook--> sheets--> Rows--> cells

		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");  // name of sheet (mostly use this)
		
		// alternate method
		
		//XSSFSheet sheet = workbook.getSheetAt(0);  // index of sheet
		
		int totalrows=sheet.getLastRowNum();
		
		int totalcells= sheet.getRow(totalrows).getLastCellNum();
		
		System.out.println("number of rows"+totalrows);
		System.out.println("number of rows"+totalcells);
		
		// reading data by using 2 different for loop 
		// outer loop--rows
		// inner loop---> cells
		
		for(int r=0;r<=totalrows;r++) {
			XSSFRow currentrow=	sheet.getRow(r);
			
			for(int c=0;c<totalcells;c++) {
				
			XSSFCell cell=currentrow.getCell(c);
			
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
	}

}
