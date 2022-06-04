package Dataexcelutils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldatademo {
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	//constructor
	public Exceldatademo(String xlpath,String sheetname) throws IOException {
		workbook=new XSSFWorkbook(xlpath);
		sheet=workbook.getSheet(sheetname);
			
	}
	public int getrownum() {
		int rownum=sheet.getPhysicalNumberOfRows();
		return rownum;
	}
	public int getcellnum() {
	int cellnum=sheet.getRow(0).getPhysicalNumberOfCells();
	return cellnum;
	}
	public String exelcellstringdata(int rown,int coln) throws IOException {
		
		DataFormatter format=new DataFormatter();
		String data=format.formatCellValue(sheet.getRow(rown).getCell(coln));
		return data;
	}

}
