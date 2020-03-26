package Base_Class;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Get_Excel {
	public static String[][] testdata=new String[3][2];
	public  static void get_Excel()
	{
		try {
			File f1=new File("src\\test\\resources\\TEST_DATA\\exceldata.xlsx");
			FileInputStream f=new FileInputStream(f1);
			XSSFWorkbook wb=new XSSFWorkbook(f);
			XSSFSheet s=wb.getSheet("Sheet1");	
			for(int i=0;i<=2;i++)
			{
				XSSFRow r=s.getRow(i);
				for(int j=0;j<=1;j++)
				{
			XSSFCell c1=r.getCell(j);
			testdata[i][j]=c1.getStringCellValue();
			System.out.println(testdata[i][j]);
			}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}}