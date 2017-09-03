package Report;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationScripts extends ReUsableMethods{
	static boolean val = false;
	
	/*public static String TC01() throws Exception{

		String[][] recData =readXlSheet("C:/Users/Shwetha/Desktop/test_data.xls","Sheet1");
		String url = recData[1][0];
		String browser = recData[1][1];
		String search = recData[1][2];
		String expected = recData[1][3];
		
		launchBrowser(url,browser); 	
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		enterText(searchBox,search,"search");	
		WebElement searchButton = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"));
		clickButton(searchButton,"login");
		WebElement linkText = driver.findElement(By.linkText("Apple iPhone 6 16GB Unlocked GSM Smartphone - Space Gray (Certified Refurbished)"));
		clickButton(linkText,"linkText");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement cartButton = driver.findElement(By.id("add-to-cart-button"));
		clickButton(cartButton,"cartButton");
		WebElement cartCount = driver.findElement(By.id("nav-cart-count"));
		String actual = getText(cartCount);
	
		result = verify(expected,actual);
		System.out.println(result);
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( result, "TC01",  "Execution Completed");
		bw.close();
		driver.close();

		return result;
		
	}
	
	public static String TC02() throws Exception{

		String[][] recData =readXlSheet("C:/Users/Shwetha/Desktop/test_data.xls","Sheet2");
		String url = recData[1][0];
		String browser = recData[1][1];
		String vdepartment = recData[1][2];
		String vaccount = recData[1][3];
		String vdeal = recData[1][4];
		
		launchBrowser(url,browser); 	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement department = driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(department).build().perform();
		String actual = department.getText();
		System.out.println(actual);
		result = verify(vdepartment,actual);
		System.out.println(result);
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( result, "TC02a",  "Execution Completed");
		bw.close();
		
		WebElement account = driver.findElement(By.xpath(".//*[@id='nav-your-amazon']"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(account).build().perform();
		String actual1 = account.getText();
		System.out.println(actual1);
		result = verify(vaccount,actual1);
		System.out.println(result);
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( result, "TC02b",  "Execution Completed");
		bw.close();
		
		WebElement deal = driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[2]"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(deal).build().perform();
		String actual2 = deal.getText();
		System.out.println(actual2);
		result = verify(vdeal,actual2);
		System.out.println(result);
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( result, "TC02c",  "Execution Completed");
		bw.close();
		
		driver.close();

		return result;
		
	}
	
	public static String TC03() throws Exception{

		String[][] recData =readXlSheet("C:/Users/Shwetha/Desktop/test_data.xls","Sheet3");
		String url = recData[1][0];
		String browser = recData[1][1];
		String vdepartment = recData[1][2];
		
		launchBrowser(url,browser); 	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement department = driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(department).build().perform();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String actual = department.getText();
		System.out.println(actual);
		result = verify(vdepartment,actual);
		System.out.println(result);
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( result, "TC03",  "Execution Completed");
		bw.close();
		driver.close();

		return result;
		
	}

	public static String TC04() throws Exception{

		String[][] recData =readXlSheet("C:/Users/Shwetha/Desktop/test_data.xls","Sheet4");
		String url = recData[1][0];
		String browser = recData[1][1];
		String vaccount = recData[1][2];
		
		launchBrowser(url,browser); 	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement account = driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(account).build().perform();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String actual = account.getText();
		System.out.println(actual);
		result = verify(vaccount,actual);
		System.out.println(result);
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( result, "TC04",  "Execution Completed");
		bw.close();
		driver.close();

		return result;
		
	}
	
	public static String TC05() throws Exception{

		String[][] recData =readXlSheet("C:/Users/Shwetha/Desktop/test_data.xls","Sheet5");
		String url = recData[1][0];
		String browser = recData[1][1];
		
		launchBrowser(url,browser); 	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement add = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[1]"));
		clickButton(add,"linkText");
		result = "Pass";
		System.out.println(result);
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( result, "TC05",  "Execution Completed");
		bw.close();
		driver.close();

		return result;
	}	

	public static String TC06() throws Exception{

		String[][] recData =readXlSheet("C:/Users/Shwetha/Desktop/test_data.xls","Sheet6");
		String url = recData[1][0];
		String browser = recData[1][1];
		String search = recData[1][2];
		String expected = recData[1][3];
		
		launchBrowser(url,browser); 	
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		enterText(searchBox,search,"search");	
		WebElement searchButton = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"));
		clickButton(searchButton,"searchButton");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement linkText = driver.findElement(By.linkText("Apple iPhone 6 16GB Unlocked GSM Smartphone - Space Gray (Certified Refurbished)"));
		clickButton(linkText,"linkText");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement cartButton = driver.findElement(By.id("add-to-cart-button"));
		clickButton(cartButton,"cartButton");
		WebElement cartButton0 = driver.findElement(By.xpath(".//*[@id='nav-cart']"));
		clickButton(cartButton0,"cartButton0");
		WebElement delete = driver.findElement(By.xpath(".//*[@id='activeCartViewForm']/div[2]/div/div[4]/div/div[1]/div/div/div[2]/div/span[1]/span/input"));
		clickButton(delete,"delete");	
		WebElement cartCount = driver.findElement(By.id("nav-cart-count"));
		String actual = getText(cartCount);
	
		result = verify(expected,actual);
		System.out.println(result);
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( result, "TC06",  "Execution Completed");
		bw.close();
		driver.close();

		return result;

	}
	
	public static String TC07() throws Exception{

		String[][] recData =readXlSheet("C:/Users/Shwetha/Desktop/test_data.xls","Sheet7");
		String url = recData[1][0];
		String browser = recData[1][1];
		String hello = recData[1][2];
		String order = recData[1][3];
		String returnq = recData[1][4];
		String support = recData[1][5];
		String manage = recData[1][6];
		String card = recData[1][7];
		String settings = recData[1][8];
		String solution = recData[1][9];
		
		launchBrowser(url,browser); 	

		WebElement helpMessage = driver.findElement(By.linkText("Help"));
		clickButton(helpMessage,"helpMessage");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement hellov = driver.findElement(By.xpath("html/body/div[2]/div[1]/h1"));
		String actual = getText(hellov);
		System.out.println(actual);
		result = verify(hello,actual);
		System.out.println(result);
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( result, "TC06a",  "Execution Completed");
		bw.close();
		
		WebElement orderv = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[1]/div[1]/div[1]/div/div[2]/a"));
		String actua = getText(orderv);
		System.out.println(actua);
		result = verify(order,actua);
		System.out.println(result);
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( result, "TC06b",  "Execution Completed");
		bw.close();

		
		WebElement returnqv = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[1]/div[1]/div[2]/div/div[2]/a"));
		String actual1 = getText(returnqv);
		result = verify(returnq,actual1);
		System.out.println(actual1);
		System.out.println(result);
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( result, "TC06c",  "Execution Completed");
		bw.close();
		
		WebElement supportv = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[1]/div[1]/div[3]/div/div[2]/a"));
		String actual2 = getText(supportv);
		System.out.println(actual2);
		result = verify(support,actual2);
		System.out.println(result);
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( result, "TC06d",  "Execution Completed");
		bw.close();
		
		WebElement managev = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[1]/div[2]/div[1]/div/div[2]/a"));
		String actual3 = getText(managev);
		System.out.println(actual3);
		result = verify(manage,actual3);
		System.out.println(result);
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( result, "TC06e",  "Execution Completed");
		bw.close();
		
		WebElement cardv = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[1]/div[2]/div[2]/div/div[2]/a"));
		String actual4 = getText(cardv);
		System.out.println(actual4);
		result = verify(card,actual4);
		System.out.println(result);
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( result, "TC06f",  "Execution Completed");
		bw.close();
		
		WebElement settingsv = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[1]/div[2]/div[3]/div/div[2]/a"));
		String actual5 = getText(settingsv);
		System.out.println(actual5);
		result = verify(settings,actual5);
		System.out.println(result);
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( result, "TC06g",  "Execution Completed");
		bw.close();
		
		WebElement solutionv = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[2]/p"));
		String actual6 = getText(solutionv);
		System.out.println(actual6);
		result = verify(solution,actual6);
		System.out.println(result);
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( result, "TC06h",  "Execution Completed");
		bw.close();
		
		driver.close();

		return result;

	}
*/		
	public static String TC08() throws Exception{

		String[][] recData =readXlSheet("C:/Users/Shwetha/Desktop/test_data.xls","Sheet8");
		String url = recData[1][0];
		String browser = recData[1][1];
		String search = recData[1][2];
		
		launchBrowser(url,browser); 	
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		enterText(searchBox,search,"search");	
		WebElement searchButton = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"));
		clickButton(searchButton,"searchButton");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement linkText = driver.findElement(By.linkText("Head First Java, 2nd Edition"));
		clickButton(linkText,"linkText");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement cartButton = driver.findElement(By.id("add-to-cart-button"));
		clickButton(cartButton,"cartButton");
		result = "Pass";
		System.out.println(result);
		startReport("July 10th batch","C:/Users/Shwetha/Desktop/Workspace/Report/");
		Update_Report( result, "TC01",  "Execution Completed");
		bw.close();
		driver.close();

		return result;
		
	}
	}