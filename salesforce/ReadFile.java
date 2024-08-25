package salesforce;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFile {
	public static String[][] readData() throws IOException {
		// to open workbook
		String filename="./Data/CreateOpportunity.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(filename);

		// to enter into the work sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		// to count the number of rows excluding header
		int rowCount = sheet.getLastRowNum();
		// to count the column
		int columnCount = sheet.getRow(0).getLastCellNum();

		// Adding data
		String data[][] = new String[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String allData = row.getCell(j).getStringCellValue();
				data[i - 1][j] = allData;

			}

		}
		wb.close();
		return data;

	}
}
