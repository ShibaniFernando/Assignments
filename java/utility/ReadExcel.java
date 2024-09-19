package utility;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static Object[][] readData() throws IOException {
		
		//open workbook
		XSSFWorkbook wb= new XSSFWorkbook("./input/DemoQa (1).xlsx");
		//open sheet
		XSSFSheet sheet=wb.getSheet("Sheet1");
		//get row count
		int rowNum = sheet.getLastRowNum();
		System.out.println(rowNum);
		//get col count
		int cellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(cellNum);
		
		//Instantiation of a string
		Object[][] value= new String[rowNum][cellNum];
		//getting all values
		for (int i=1;i<=rowNum;i++) {
			        XSSFRow row = sheet.getRow(i);
			for (int j=0;j<cellNum;j++) {
				
				XSSFCell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				
				switch(cellType) {
				
				case STRING:
	
					value[i-1][j]=cell.getStringCellValue();
					break;
				case NUMERIC:
					value[i-1][j]=String.valueOf(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					value[i-1][j]=String.valueOf(cell.getBooleanCellValue());
					
				}
				
				
			}
		}
		wb.close();
		return value;
		
		
		
	}
}
