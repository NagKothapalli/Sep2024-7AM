package seleniumAutomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApsrtcAutomation 
{	
	ChromeDriver driver;  //null
	String name;  // null
	WebDriverWait wait;
	public ApsrtcAutomation() 
	{
		driver = new ChromeDriver(); //session ID = 1234
		driver.manage().window().maximize();
		name = "Ram";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
	}
	
	//java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "this.name" is null
	
	//java.lang.NullPointerException: Cannot invoke "org.openqa.selenium.chrome.ChromeDriver.get(String)" because "this.driver" is null
	
	//org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"*[name='identifier']"}
	
	//org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	
	//java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 0
	
	@Before  //Having before and After annotations in a java class is not mandatory . it will execute the Before annotation if any before each test method
	public void launchApsrtcApplication() throws IOException
	{
		//driver.get("https://www.apsrtconline.in/");   //null.get or  null.findElement -> NullPointerException
		driver.get(readData("URL"));
	}	
	
	@Test
	public void bookBusTicket_1() throws InterruptedException
	{
		System.out.println("TestCase : Book a Bus Ticket");
		//Thread.sleep(35000); // fixed / blind wait 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		
		driver.findElement(By.xpath("//input[@size='22' and @name='source']")).sendKeys("HYDERABAD");
		Thread.sleep(1000);
		Actions  actions = new Actions(driver); //1234
		actions.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		// driver can switch to another window , alert , iframe 
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@id='toPlaceName']")).sendKeys("GUNTUR");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		driver.findElement(By.xpath("//input[@id='txtJourneyDate']")).click();
		driver.findElement(By.xpath("//a[text()='10']")).click();
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
	}
	
	String timeTableTLNxpath = "//a[@title='TimeTable / Track']";
	String allServicesXpath = "//a[text()='All services Time Table & Tracking']";
	String homeTLNxpath = "//a[@title='Home']";
	
	//org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	@Test
	public void handleMultipleWindows() throws InterruptedException
	{		
		clickElement(timeTableTLNxpath);
		clickElement(allServicesXpath);
		Set<String> myset = driver.getWindowHandles();
		ArrayList<String>  mylist = new ArrayList<String>(myset);
		for(int i=0;i<mylist.size();i++) {
			System.out.println(mylist.get(i));
		}
		System.out.println("total windows : " + mylist.size());
		System.out.println("Title before switching :" + driver.getTitle());
		driver.switchTo().window(mylist.get(1));
		Thread.sleep(6000);
		System.out.println("Title after switching :" + driver.getTitle());		
		driver.close(); // Current active window will be closed
		//driver.quit(); // it will close the driver instance in the task manager
		driver.switchTo().window(mylist.get(0));
		Thread.sleep(4000);
		clickElement(homeTLNxpath);
		driver.quit();
	}
	
	@Test
	public void bookBusTicket() throws InterruptedException
	{
		System.out.println("TestCase : Book a Bus Ticket");
		//driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		driver.findElement(By.xpath("//*[@size='22' and @name='source']")).sendKeys("HYDERABAD");
		clickEnter();
		driver.findElement(By.xpath("//input[contains(@id ,'toPlaceN')]")).sendKeys("GUNTUR");
		clickEnter();
		driver.findElement(By.xpath("//input[@id='txtJourneyDate']")).click();
		driver.findElement(By.xpath("//a[text()='10']")).click();
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
	}
	
	@Test
	public void bookBusTicket_2() throws InterruptedException
	{
		System.out.println("TestCase : Book a Bus Ticket");		
		enterText("//*[@size='22' and @name='source']","HYDERABAD");		
		clickEnter();
		enterText("//input[contains(@id ,'toPlaceN')]","GUNTUR");
		clickEnter();
		clickElement("//input[@id='txtJourneyDate']");
		clickElement("//a[text()='10']");
		clickElement("//input[@id='searchBtn']");
	}

	String fromCityxpath = "//*[@size='22' and @name='source']";
	String toCityxpath = "//input[contains(@id ,'toPlaceN')]";
	String openCalxpath = "//input[@id='txtJourneyDate']";
	String jdatexpath = "//a[text()='10']";
	String searchBtnxpath = "//input[@id='searchBtn']";
	
	@Test
	public void bookBusTicket_3() throws InterruptedException
	{
		System.out.println("TestCase : Book a Bus Ticket");		
		enterText(fromCityxpath,"HYDERABAD");	// Hard coded test data 	
		clickEnter();
		enterText(toCityxpath,"GUNTUR"); // Hard coded test data
		clickEnter();
		clickElement(openCalxpath);
		clickElement(jdatexpath);
		clickElement(searchBtnxpath);
	}
	
	@Test
	public void bookBusTicket_4() throws InterruptedException, IOException
	{
		System.out.println("TestCase : Book a Bus Ticket");		
		enterText(fromCityxpath,readData("FromCity"));	//Parametrization
		clickEnter();
		enterText(toCityxpath,readData("ToCity")); 
		clickEnter();
		clickElement(openCalxpath);
		clickElement(jdatexpath);
		clickElement(searchBtnxpath);
	}
	
	//*********************************************
	
	//java.io.FileNotFoundException: D:\WorkSpace\Java\Sep2024-7AM\MyData\Apsrtc1.properties (The system cannot find the file specified)
	
	//Types of exceptions : Compile Time[Checked] Exceptions and Run Time[Unchecked]  Exceptions 
	
	@Test
	public void readDataFromDataSource() throws IOException
	{
		FileInputStream file = new FileInputStream("D:\\WorkSpace\\Java\\Sep2024-7AM\\MyData\\Apsrtc.properties"); //Like  News paper
		Properties myprop = new Properties(); // like news reader
		myprop.load(file);
		String v1 = myprop.getProperty("URL");
		System.out.println(v1);
		
		System.out.println(myprop.getProperty("UserName"));
		System.out.println(myprop.getProperty("PassWord"));
		System.out.println(myprop.getProperty("FromCity"));
		System.out.println(myprop.getProperty("ToCity"));
		
	}
	
	public String readData(String input) throws IOException
	{
		FileInputStream file = new FileInputStream("D:\\WorkSpace\\Java\\Sep2024-7AM\\MyData\\Apsrtc.properties"); //Like  News paper
		Properties myprop = new Properties(); // like news reader
		myprop.load(file);
		String output = myprop.getProperty(input);
		return output;
	}
	
	
	
	
	//************************************************
	
	//Reusable function / component
	public void clickEnter()
	{
		Actions  actions = new Actions(driver); //1234
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
	}
	
	
	public void clickElement(String myxpath) //abcd
	{
		WebElement element = driver.findElement(By.xpath(myxpath));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public void enterText(String myxpath,String mytext)
	{
		WebElement element = driver.findElement(By.xpath(myxpath));
		wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(mytext);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}




