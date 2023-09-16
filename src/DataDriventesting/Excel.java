package DataDriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    FileInputStream fis=new FileInputStream("C:\\DataDrivenTesting\\Deepa.xlsx");
    //create file
    Workbook work= WorkbookFactory.create(fis);
    String testdata = work.getSheet("Sheet1").getRow(1).getCell(0).toString();
    System.out.println(testdata);
	}

}
