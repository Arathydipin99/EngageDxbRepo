package com.engage.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.engage.Constants.Constants;

public class ExcelUtility {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	public static String getStringData(int a, int b) throws IOException {
		f=new FileInputStream(Constants.Excel_datasheet);
		w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		Row r=sh.getRow(a);
		Cell c=r.getCell(b);
		return c.getStringCellValue();
	}


}
