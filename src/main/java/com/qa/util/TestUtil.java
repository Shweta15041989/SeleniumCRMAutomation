package com.qa.util;
import java.io.*;
import java.util.*;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.time.Duration;

public class TestUtil {

	static Workbook book;
	static Sheet sheet;
	public static long Page_Load_Timeout = 20;
	public static long Implicit_Timeout = 10;

	public static String TestData_Sheet_Path = "src/main/java/com/qa/test-data/TestData.xlsx");
	// /Volumes/Data/Shweta_Project/SeleniumCRMAutomation/src/main/java/com/qa/test-data/TestData.xlsx";


	public static Object[][] getTestData(String sheetname){
		FileInputStream file = null;

		try {
			file = new FileInputStream(TestData_Sheet_Path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			book =WorkbookFactory.create(file);
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetname);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;

	}
}

