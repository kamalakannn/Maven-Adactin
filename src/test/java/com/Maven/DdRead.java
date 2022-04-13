package com.Maven;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DdRead {
	
	public static Workbook b;
	public static File fi;
	public static  FileInputStream fis;
	public static FileOutputStream fos;
	public static void data() throws IOException, InvalidFormatException {
		
		fi = new File("C:\\Users\\USER\\Desktop\\book1.xlsx");
		
	     b = new XSSFWorkbook(fi);
	     
	     b.createSheet("kama").createRow(0).createCell(0).setCellValue("kama");
	
	FileOutputStream foi = new FileOutputStream(fi);
	b.write(foi);
	
	}
		
	public static void main(String[] args) throws IOException, InvalidFormatException{
	  data();
			
	}
	
}
