package Report;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationScripts extends ReUsableMethods{
	
	
	public static void TC01() throws Exception{
		setExcelFile("C:/Users/Shwetha/Desktop/July_Batch.xls","Sheet1");
		String link = ReUsableMethods.getCellData(1, 0);
		String username = ReUsableMethods.getCellData(1, 1);
		launchBrowser(link); 	
		WebElement username1 = driver.findElement(By.id("username"));
		enterText(username1,username,"username");	
		WebElement login = driver.findElement(By.id("Login"));
		clickButton(login,"login");
		WebElement error = driver.findElement(By.id("error"));
		String str = getText(error);
		verification(str,"Please enter your password.");
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( "Pass", "Test Case TC01",  "Test Case TC01 executing is complete.");
		bw.close();
		driver.close();
		
		
	}

	public static void TC02() throws Exception{
		setExcelFile("C:/Users/Shwetha/Desktop/July_Batch.xls","Sheet1");
		String link = ReUsableMethods.getCellData(1, 0);
		String username = ReUsableMethods.getCellData(1, 1);
		String pwd = ReUsableMethods.getCellData(1, 2);
		launchBrowser(link); 
		WebElement username1 = driver.findElement(By.id("username"));
		enterText(username1,username,"username");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password,pwd,"password");
		WebElement login = driver.findElement(By.id("Login"));		
		clickButton(login,"login");
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( "Pass", "Test Case TC02",  "Test Case TC02 executing is complete.");
		bw.close();
		driver.close();
	}
	
	public static void TC03() throws Exception{
		setExcelFile("C:/Users/Shwetha/Desktop/July_Batch.xls","Sheet1");
		String link = ReUsableMethods.getCellData(1, 0);
		String username = ReUsableMethods.getCellData(1, 1);
		String pwd = ReUsableMethods.getCellData(1, 2);
		launchBrowser(link); 
		WebElement username1 = driver.findElement(By.id("username"));
		enterText(username1,username,"username");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password,pwd,"password");
		WebElement remember = driver.findElement(By.id("rememberUn"));
		clickButton(remember,"remember");
		WebElement login = driver.findElement(By.id("Login"));
		clickButton(login,"login");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement menu = driver.findElement(By.xpath(".//*[@id='userNav-arrow']"));
		clickButton(menu,"menu");
		WebElement logout =driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[5]"));
		clickButton(logout,"logout");
		String str = getAttribute(username1);
        verification(str,username);	
        startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( "Pass", "Test Case TC03",  "Test Case TC03 executing is complete.");
		bw.close();
		driver.close();
	}
	
	public static void TC04a() throws Exception{
		setExcelFile("C:/Users/Shwetha/Desktop/July_Batch.xls","Sheet1");
		String link = ReUsableMethods.getCellData(1, 0);
		String username = ReUsableMethods.getCellData(1, 1);
		launchBrowser(link); 
		WebElement forgot = driver.findElement(By.linkText("Forgot Your Password?"));
		clickButton(forgot,"continu");
		WebElement username1 = driver.findElement(By.id("un"));
		enterText(username1,username,"username");
		WebElement continu = driver.findElement(By.id("continue"));
		clickButton(continu,"continu");
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( "Pass", "Test Case TC04a",  "Test Case TC04a executing is complete.");
		bw.close();
		driver.close();
	}	
	
	public static void TC04b() throws Exception{
		setExcelFile("C:/Users/Shwetha/Desktop/July_Batch.xls","Sheet1");
		String link = ReUsableMethods.getCellData(1, 0);
		String username = ReUsableMethods.getCellData(1, 1);
		String pwd = ReUsableMethods.getCellData(1, 2);
		launchBrowser(link); 
		WebElement username1 = driver.findElement(By.id("username"));
		enterText(username1,username,"username");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password,pwd,"password");
		WebElement login = driver.findElement(By.id("Login"));
		clickButton(login,"login");
		WebElement error = driver.findElement(By.id("error"));	
		clickButton(error,"error message");
		String str = getText(error);
        verification(str,"Your access to salesforce.com has been disabled by your System Administrator. Please contact your Administrator for more information.");	
        startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( "Pass", "Test Case TC04b",  "Test Case TC04b executing is complete.");
		bw.close();
		driver.close();
	}

	public static void TC05() throws Exception{
		setExcelFile("C:/Users/Shwetha/Desktop/July_Batch.xls","Sheet1");
		String link = ReUsableMethods.getCellData(1, 0);
		String username = ReUsableMethods.getCellData(1, 1);
		String pwd = ReUsableMethods.getCellData(1, 2);
		launchBrowser(link); 
		WebElement username1 = driver.findElement(By.id("username"));
		enterText(username1,username,"username");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password,pwd,"password");
		WebElement login = driver.findElement(By.id("Login"));		
		clickButton(login,"login");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement menu = driver.findElement(By.xpath(".//*[@id='userNav-arrow']"));
		clickButton(menu,"menu");
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( "Pass", "Test Case TC05",  "Test Case TC05 executing is complete.");
		bw.close();
		driver.close();
	}

	public static void TC08() throws Exception{
		setExcelFile("C:/Users/Shwetha/Desktop/July_Batch.xls","Sheet1");
		String link = ReUsableMethods.getCellData(1, 0);
		String username = ReUsableMethods.getCellData(1, 1);
		String pwd = ReUsableMethods.getCellData(1, 2);
		launchBrowser(link); 
		WebElement username1 = driver.findElement(By.id("username"));
		enterText(username1,username,"username");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password,pwd,"password");
		WebElement login = driver.findElement(By.id("Login"));
		clickButton(login,"login");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement menu = driver.findElement(By.xpath(".//*[@id='userNav-arrow']"));
		clickButton(menu,"menu");
		WebElement menu_select =driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[3]"));
		clickButton(menu_select,"menu_select");
        startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( "Pass", "Test Case TC08",  "Test Case TC08 executing is complete.");
		bw.close();
		driver.close();
		driver.quit();
	}

	public static void TC09() throws Exception{
		setExcelFile("C:/Users/Shwetha/Desktop/July_Batch.xls","Sheet1");
		String link = ReUsableMethods.getCellData(1, 0);
		String username = ReUsableMethods.getCellData(1, 1);
		String pwd = ReUsableMethods.getCellData(1, 2);
		launchBrowser(link); 
		WebElement username1 = driver.findElement(By.id("username"));
		enterText(username1,username,"username");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password,pwd,"password");
		WebElement remember = driver.findElement(By.id("rememberUn"));
		clickButton(remember,"remember");
		WebElement login = driver.findElement(By.id("Login"));
		clickButton(login,"login");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement menu = driver.findElement(By.xpath(".//*[@id='userNav-arrow']"));
		clickButton(menu,"menu");
		WebElement logout =driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[5]"));
		clickButton(logout,"logout");
        startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( "Pass", "Test Case TC09",  "Test Case TC09 executing is complete.");
		bw.close();
		driver.close();
	}




}