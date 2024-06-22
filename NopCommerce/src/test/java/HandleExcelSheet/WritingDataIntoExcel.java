package HandleExcelSheet;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// excel file--> workbook--> sheets--> Rows--> cells
		
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Data");
		
		XSSFRow row1=sheet.createRow(0);
		
		row1.createCell(0).setCellValue("java");
		row1.createCell(1).setCellValue(19);
		row1.createCell(2).setCellValue("automation");
		
		
	XSSFRow row2=	sheet.createRow(1);
		
	row2.createCell(0).setCellValue("Python");
	row2.createCell(1).setCellValue(3);
	row2.createCell(2).setCellValue("Automation");
		
	XSSFRow row3=	sheet.createRow(1);
	
	row3.createCell(0).setCellValue("C#");
	row3.createCell(1).setCellValue(5);
	row3.createCell(2).setCellValue("Automation");
	
	
	//workbook.write(file);
	workbook.write(file);
	workbook.close();
	file.close();
	
	System.out.println("file is created");
		
		
	}

}
