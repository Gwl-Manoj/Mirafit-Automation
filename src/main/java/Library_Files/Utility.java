package Library_Files;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility 
{
	
	public static String getdata(int rowindex, int cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/Test_Data/Utility.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Utility").getRow(rowindex).getCell(cellindex).getStringCellValue();
		return value;
		
	}	
	
	public static Sheet getmultipledata(String sheetname) throws  IOException
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/Test_Data/Utility.xlsx");
		//FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test_Data\\Utility.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet(sheetname);
		return sh;
	}
	
}
