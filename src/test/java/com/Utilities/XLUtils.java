package com.Utilities;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class XLUtils 
{
public static FileInputStream fi;
public static FileOutputStream fo;
public static XSSFWorkbook workbook;
public static XSSFSheet sheet;
public static XSSFRow row;
public static XSSFCell cell;
public static CellStyle style;   
//String path=null;
//String path;

/*UtilityFile(String path)
{
this.path=path;
}*/


public  static int getRowCount(String xlfile, String xlsheet) throws IOException 
{
fi=new FileInputStream(xlfile);
workbook=new XSSFWorkbook(fi);
sheet=workbook.getSheet(xlsheet);
int rowcount=sheet.getLastRowNum();
workbook.close();
fi.close();
return rowcount;		
}

public static int getCellCount(String xlfile, String xlsheet, int rownum) throws IOException
{
fi=new FileInputStream(xlfile);
workbook=new XSSFWorkbook(fi);
sheet=workbook.getSheet(xlsheet);
row=sheet.getRow(rownum);
int cellcount=row.getLastCellNum();
workbook.close();
fi.close();
return cellcount;
}


public static String getCellData(String xlfile, String xlsheet,int rownum,int colnum) throws IOException
{
fi=new FileInputStream(xlfile);
workbook=new XSSFWorkbook(fi);
sheet=workbook.getSheet(xlsheet);
row=sheet.getRow(rownum);
cell=row.getCell(colnum);

DataFormatter formatter = new DataFormatter();
String data;
try{
data = formatter.formatCellValue(cell); //Returns the formatted value of a cell as a String regardless of the cell type.
}
catch(Exception e)
{
data="";
}
workbook.close();
fi.close();
return data;
}



public void setCellData(String xlfile, String xlsheet, int rownum, int colnum, String data) throws IOException
{		
{
File xlfiles=new File(xlfile);
if(!xlfiles.exists())    // If file not exists then create new file
{
workbook=new XSSFWorkbook();
fo=new FileOutputStream(xlfile);
workbook.write(fo);
}

fi=new FileInputStream(xlfile);
workbook=new XSSFWorkbook(fi);
sheet=workbook.getSheet(xlsheet);

if(workbook.getSheetIndex(xlsheet)==-1) // If sheet not exists then create new Sheet
workbook.createSheet(xlsheet);

sheet=workbook.getSheet(xlsheet);

if(sheet.getRow(rownum)==null)   // If row not exists then create new Row
	sheet.createRow(rownum);
row=sheet.getRow(rownum);

cell=row.createCell(colnum);
cell.setCellValue(data);

fo=new FileOutputStream(xlfile);
workbook.write(fo);		
workbook.close();
fi.close();
fo.close();
}
}

public void fillRedColor(String xlfile, String xlsheet,int rownum,int colnum) throws IOException
{
fi=new FileInputStream(xlfile);
workbook=new XSSFWorkbook(fi);
sheet=workbook.getSheet(xlsheet);
row=sheet.getRow(rownum);
cell=row.getCell(colnum);

style=workbook.createCellStyle();

style.setFillForegroundColor(IndexedColors.RED.getIndex());
style.setFillPattern(FillPatternType.SOLID_FOREGROUND);  

cell.setCellStyle(style);		
workbook.write(fo);
workbook.close();
fi.close();
fo.close();
}


}
	

