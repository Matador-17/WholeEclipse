package com.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class XLRecap {

	@Test
	public void read() throws IOException {
		String filePath = System.getProperty("user.dir") + "/src/test/java/com/practice/Hello.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Login");
		String valu = sheet.getRow(1).getCell(0).toString();
		System.out.println(valu);
		int row = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();
		System.out.println(row);
		System.out.println(cols);

		// read entire data 1-1 from excel
		// how to read data from excel and store it inside a 2D array
		Object[][] data = new Object[row][cols];
		data[0][0] = "Hello";
		data[0][1] = "Hello";

		data[1][0] = "Bye";
		data[1][1] = "Bye1";
		for (int i = 1; i < row; i++) {
			for (int y = 0; y < cols; y++) {
				String value = sheet.getRow(i).getCell(y).toString();
				System.out.println(value);
				data[i - 1][y] = value;
			}
		}
		workbook.close();
		fis.close();

		System.out.println("Values from 2D Array---------------");
		for (Object[] rowArray : data) {
			for (Object d : rowArray) {
				System.out.println(d);
			}

		}

	}

}
