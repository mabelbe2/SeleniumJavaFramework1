package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFSheet sheet;
	static XSSFWorkbook workbook;

	public ExcelUtils (String sheetName) {
		try {
			workbook = new XSSFWorkbook("/Users/mabelbe/eclipse-workspace/SeleniumFramework/excel/data.xlsx");
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		getRowCount();
		getCellDataString(0, 0);
		getCellDataNumber(1, 1);
	}
	public static int getRowCount() {
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		return rowCount;
	}
	
	public static int getColCount() {
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(colCount);
		return colCount;
	}


	public static String getCellDataString(int rownum, int colnum) {

		sheet = workbook.getSheet("Sheet1");
		String cellData = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
//		System.out.println(cellData);
		return cellData;
	}

	public static double getCellDataNumber(int rownum, int colnum) {

		sheet = workbook.getSheet("Sheet1");
		Double cellData = sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
//		System.out.println(cellData);
		return cellData;
	}
}
