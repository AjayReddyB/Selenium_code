package genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	String path="C:/Users/ajayr/workspace/Testing.com/Test Data/TestInputdata.xlsx";
	public String getExcaldata(String sheetname,int rownum,int colmnum,int cellnum) throws Throwable{
		FileInputStream  fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		Row rw= sh.getRow(rownum);
		String data=rw.getCell(cellnum).getStringCellValue();
		wb.close();
		return data;
	}
	public void SetExceldata(String Sheetname, int rownum, int colmnum,int cellnum, String CelData) throws Throwable{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheetname);
		Row rw = sh.getRow(rownum);
		Cell cl = rw.createCell(cellnum);
		cl.setCellValue(CelData);
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		wb.close();
	}
}
