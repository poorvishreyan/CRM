package Com.CRM.GenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String readPropertyData(String proppath,String key) throws Throwable {
	FileInputStream fis = new FileInputStream(proppath);
	Properties prop = new Properties();
	prop.load(fis);
	
	String propValue = prop.getProperty(key, "Incorrect Key");
	return propValue;
	
	
}
	
	public String readExcelData(String excelpath, String sheet, int row, int cell) throws Throwable {
		
		FileInputStream fis = new FileInputStream(excelpath);
		
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		
		}
	
	
	public void writeExcelData(String excelPath, String sheet, int row, int cell, String data) throws Throwable, Throwable {
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		
		
		wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
		
	}
}