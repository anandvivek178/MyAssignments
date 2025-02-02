package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData() throws IOException {
		//To Open the workbook - Navigate to the path
		XSSFWorkbook wb=new XSSFWorkbook("./Data/CreateLead.xlsx");

		//To open the worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");

		//To count the number of rows - 2 methods
		int rowCount = ws.getLastRowNum(); //Excluding header
		System.out.println("Row count is:"+rowCount);

		int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
		System.out.println("physicalNumberOfRows is :"+physicalNumberOfRows);

		//To count the column
		int columnCount = ws.getRow(0).getLastCellNum();
		System.out.println("columnCount is: "+columnCount);


		//To read a particular value

		String row1cell1String = ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println("Value is :" +row1cell1String);

		String[][] data =new String[rowCount][columnCount];

		//data[0][0] 
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue = row.getCell(j).getStringCellValue();
				System.out.println("All values are: "+stringCellValue);

				data[i-1][j]=stringCellValue;

				//   data[0][0] ="Qeagle"             
				//   data[0][1] ="Vineeth"
				//   data[0][2]="Rajendran";
				//   data[1][0]="Testleaf";
				//data[1][1]   ="Hari";
				//data[2][2]   "R"


			}

		}

		wb.close();
		return data;



	}

}
