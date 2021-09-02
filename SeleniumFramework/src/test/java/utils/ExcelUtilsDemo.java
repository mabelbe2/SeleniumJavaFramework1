package utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		ExcelUtils excel = new ExcelUtils("sheet1");
		
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
	}
}
