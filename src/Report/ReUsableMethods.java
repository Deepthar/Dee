package Report;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFHyperlink;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;


public class ReUsableMethods {
	
	static BufferedWriter bw = null;
	static BufferedWriter bw1 = null;
	static String htmlname;
	static String objType;
	static String objName;
	static String TestData;
	static String rootPath;
	static int report;

	static String locatorType;
	static String value;
	static String obj_Name;
	static String[][] locator;
	static String[][] matrix;

	static Date cur_dt = null;
	static String filenamer;
	static String TestReport;
	int rowcnt;
	static String exeStatus = "True";
	static int iflag = 0;
	static int j = 1;

	static FileInputStream stream;
	static String RepositoryFile;
	static Properties propertyFile = new Properties();
	
	
	static String fireFoxBrowser;
	static String chromeBrowser;

	static String result;

	static int intRowCount = 0;
	static String dataTablePath;
	static int i;
	static String browserName;
	
	 static HSSFSheet ExcelWSheet;
     static HSSFWorkbook ExcelWBook;
     static HSSFCell Cell;
     static HSSFRow Row;
     public static WebDriver driver;
     static Properties pro;
     
/*     public ReUsableMethods(){
    	 try{
    		 File src = new File("C:/Users/Shwetha/Desktop/Workspace/frameWork/Property/Object.properties");
 			FileInputStream fis = new FileInputStream(src);
 			pro = new Properties();
 			pro.load(fis);
 		}
 		catch(Exception e){
 			System.out.println("Exception is =="+e.getMessage());
 		}
     }
*/
 
 	public static void setValue(int row)
	{
		obj_Name=(String) locator[row][0];
		System.out.println(obj_Name);
		locatorType = (String) locator[row][1];
		value=(String) locator[row][2];
	}

	public static By getBy(String type, String value)
	{

		switch (type)
		{
		case "id":
			return By.id(value);
		case "xpath":
			return By.xpath(value);
		case "className":
			return By.className(value);
		case "name":
			return By.name(value);
		case "linkText":
			return By.linkText(value);
		case "partialLinkText":
			return By.partialLinkText(value);
		case "cssSelector":
			return By.cssSelector(value);
		case "tagName":
			return By.tagName(value);
		default:
			System.out.println("Unknown type");
			return null;

		}
	}
 	
	public static void readLocators(String path,String Sheet)
	{
		//String path = "C:/Users/Seema/workspace/Selenium/src/testdata/SF_ObjectRepository.xls";

			try {
				locator=readXlSheet(path,Sheet);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
    /* public By getObjectLocator(String locatorName)
 	{
 		
 		String locatorProperty = propertyFile.getProperty(locatorName);
 		System.out.println(locatorProperty.toString());
 		String locatorType = locatorProperty.split(":")[0];
 		String locatorValue = locatorProperty.split(":")[1];
 		System.out.println("Retrieving object of type '" + locatorType + "' and value '" + locatorValue + "' from the object map");
 		By locator = null;
 		switch(locatorType)
 		{
 		case "Id":
 			locator = By.id(locatorValue);
 			break;
 		case "Name":
 			locator = By.name(locatorValue);
 			break;
 		case "CssSelector":
 			locator = By.cssSelector(locatorValue);
 			break;
 		case "LinkText":
 			locator = By.linkText(locatorValue);
 			break;
 		case "PartialLinkText":
 			locator = By.partialLinkText(locatorValue);
 			break;
 		case "TagName":
 			locator = By.tagName(locatorValue);
 			break;
 		case "Xpath":
 			locator = By.xpath(locatorValue);
 			break;
 		}
 		return locator;
 	}*/
	
	/* Name Of the method: enterText
	 * Brief Description: Enter the text value to the text box
	 * Arguments: obj --> Text box object, textVal --> value to be entered, objName --> name of the object
	 * Created by: Automation team
	 * Creation Date: Aug 23 2017
	 * Last Modified: Aug 23 2017
	 * */
	public static void enterText(WebElement obj, String textVal, String objName){
			obj.sendKeys(textVal);
			System.out.println("Pass: " + textVal + " is entered in " + objName +" field");

	}
	/* Name Of the method: clickButton
	 * Brief Description: Click on button
	 * Arguments: obj --> web object,  objName --> name of the object
	 * Created by: Automation team
	 * Creation Date: Aug 23 2017
	 * Last Modified: Aug 23 2017
	 * */
	
	public static void clickButton(WebElement obj,  String objName){
		
			obj.click();
			System.out.println("Pass: " + objName +" is clicked.");
		
	}
	
	public static void launchBrowser(String url,String browser){

			if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shwetha\\Downloads\\geckodriver-v0.17.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			}
			else if(browser.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shwetha\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(url);
				driver.manage().window().maximize();
			}
			else if(browser.equals("ie")){
				System.setProperty("webdriver.ie.driver", "C:\\Users\\Shwetha\\Downloads\\IEdriver\\IEDriverServer.exe");
			    driver = new InternetExplorerDriver();
			    driver.get(url);
				driver.manage().window().maximize();
			}

		}
 
	
	public static String getText(WebElement obj){
		return obj.getText();
	}
	
	public static String getAttribute(WebElement obj){
	return obj.getAttribute("value");
	}
	
	public static String verify(String expected, String actual)
	{
		String result =null;
		if(expected.equals(actual))
		{
			result = "Pass";
			return result;
		}
		else
		{
			result = "Fail";
			return result;
		}
	}
	public static void select(WebElement obj, String val){
		Select select = new Select(obj);
		select.selectByVisibleText(val);
	}
	

	public static String[][] readXlSheet(String dt_path, String sheetName) throws IOException{

		//Step 1: Get the XL Path
		File xlFile = new File(dt_path);

		//Step2: Access the Xl File
		FileInputStream xlDoc = new FileInputStream(xlFile);


		//Step3: Access the work book 
		HSSFWorkbook wb = new HSSFWorkbook(xlDoc);
		
		//Step4: Access the Sheet 
		HSSFSheet sheet = wb.getSheet(sheetName);

		int iRowCount = sheet.getLastRowNum()+1;
		int iColCount = sheet.getRow(0).getLastCellNum();

		String[][] xlData = new String[iRowCount][iColCount];
		DataFormatter formatter = new DataFormatter();
		for(int i = 0; i < iRowCount; i++){
			for(int j = 0; j <iColCount; j++){
				xlData[i][j] = formatter.formatCellValue(sheet.getRow(i).getCell(j));
			}

		}
        xlDoc.close();
		return xlData;

	}
	
	public static void writeXlSheet(String dt_path,String Sheet, String val, int i) throws IOException{

		//Step 1: Get the XL Path
		File xlFile = new File(dt_path);

		//Step2: Access the Xl File
		FileInputStream xlDoc = new FileInputStream(xlFile);


		//Step3: Access the work book 
		HSSFWorkbook wb = new HSSFWorkbook(xlDoc);
		
		//Step4: Access the Sheet 
		HSSFSheet sheet = wb.getSheet(Sheet);
		
		HSSFRow row = sheet.getRow(i);
		HSSFCell cell = row.getCell(5);
		

		CreationHelper createHelper = wb.getCreationHelper();
		
		if(val.equals("Pass")){
			cell.setCellValue("Pass");
			HSSFCellStyle titleStyle = wb.createCellStyle();
			titleStyle.setFillForegroundColor(new HSSFColor.GREEN().getIndex());
			titleStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
			cell.setCellStyle(titleStyle);
		}
		else{
			cell.setCellValue("Fail");
		    HSSFCellStyle titleStyle = wb.createCellStyle();
		    titleStyle.setFillForegroundColor(new HSSFColor.RED().getIndex());
		    titleStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
		    cell.setCellStyle(titleStyle);
		    HSSFFont hlinkfont = wb.createFont();
		      hlinkfont.setUnderline(HSSFFont.U_SINGLE);
		      hlinkfont.setColor(HSSFColor.BLUE.index);
		      titleStyle.setFont(hlinkfont);
		    
		      HSSFHyperlink link = (HSSFHyperlink)createHelper
		    	      .createHyperlink(Hyperlink.LINK_URL);
		    	      link.setAddress(htmlname );
		    	      cell.setHyperlink((HSSFHyperlink) link);
		    	      cell.setCellStyle(titleStyle);
	}	
		FileOutputStream fout = new FileOutputStream(dt_path);
		wb.write(fout);
		fout.flush();
		fout.close();
				

	}
	
	
	
	public static void startReport(String scriptName, String ReportsPath) throws IOException{
		String strResultPath = null;
		String testScriptName =scriptName;
		cur_dt = new Date(); 
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String strTimeStamp = dateFormat.format(cur_dt);
		if (ReportsPath == "") { 
			ReportsPath = "C:\\";
		}
		if (ReportsPath.endsWith("\\")) { 
			ReportsPath = ReportsPath + "\\";
		}
		strResultPath = ReportsPath + "Log" + "/" +testScriptName +"/"; 
		File f = new File(strResultPath);
		f.mkdirs();
		htmlname = strResultPath  + testScriptName + "_" + strTimeStamp 
				+ ".html";

		bw = new BufferedWriter(new FileWriter(htmlname));
		bw.write("<HTML><BODY><TABLE BORDER=0 CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
		bw.write("<TABLE BORDER=0 BGCOLOR=BLACK CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
		bw.write("<TR><TD BGCOLOR=#66699 WIDTH=27%><FONT FACE=VERDANA COLOR=WHITE SIZE=2><B>Browser Name</B></FONT></TD><TD COLSPAN=6 BGCOLOR=#66699><FONT FACE=VERDANA COLOR=WHITE SIZE=2><B>"
				+ "FireFox " + "</B></FONT></TD></TR>");
		bw.write("<HTML><BODY><TABLE BORDER=1 CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
		bw.write("<TR COLS=7><TD BGCOLOR=#BDBDBD WIDTH=3%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>SL No</B></FONT></TD>"
				+ "<TD BGCOLOR=#BDBDBD WIDTH=10%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Step Name</B></FONT></TD>"
				+ "<TD BGCOLOR=#BDBDBD WIDTH=10%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Execution Time</B></FONT></TD> "
				+ "<TD BGCOLOR=#BDBDBD WIDTH=10%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Status</B></FONT></TD>"
				+ "<TD BGCOLOR=#BDBDBD WIDTH=47%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Detail Report</B></FONT></TD></TR>");
	}

	public static void Update_Report(String Res_type,String Action, String result) throws IOException {
		String str_time;
		Date exec_time = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		str_time = dateFormat.format(exec_time);
		if (Res_type.startsWith("Pass")) {
			bw.write("<TR COLS=7><TD BGCOLOR=#EEEEEE WIDTH=3%><FONT FACE=VERDANA SIZE=2>"
					+ (j++)
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
					+Action
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
					+ str_time
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2 COLOR = GREEN>"
					+ "Passed"
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = GREEN>"
					+ result + "</FONT></TD></TR>");

		} else if (Res_type.startsWith("Fail")) {
			String ss1Path1= screenshot();
			exeStatus = "Failed";
			report = 1;
			bw.write("<TR COLS=7><TD BGCOLOR=#EEEEEE WIDTH=3%><FONT FACE=VERDANA SIZE=2>"
					+ (j++)
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
					+Action
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
					+ str_time
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
					+ "<a href= "
					+ ss1Path1
					+ "  style=\"color: #FF0000\"> Failed </a>"
				+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
				+ result + "</FONT></TD></TR>");

		} 
	}
    public static String screenshot() throws IOException{
		
		Date exec_time = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String str_time = dateFormat.format(exec_time);
		//String fileName = "C:/Users/Sreeram/Desktop/WorkDayScreenShots/ss.png";
		String  ss1Path = "C:/Users/Shwetha/Desktop/Workspace/Report/"+ str_time+".png";
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(ss1Path));
		return ss1Path;
	}
}
