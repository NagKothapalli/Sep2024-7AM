package seleniumAutomation;

import java.time.Duration;

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
		name = "Ram";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
	}
	
	//java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "this.name" is null
	//java.lang.NullPointerException: Cannot invoke "org.openqa.selenium.chrome.ChromeDriver.get(String)" because "this.driver" is null
	
	@Before  //Having before and After annotations in a java class is not mandatory . it will execute the Before annotation if any before each test method
	public void launchApsrtcApplication()
	{
		driver.get("https://www.apsrtconline.in/");   // null.findElement
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
		enterText(fromCityxpath,"HYDERABAD");		
		clickEnter();
		enterText(toCityxpath,"GUNTUR");
		clickEnter();
		clickElement(openCalxpath);
		clickElement(jdatexpath);
		clickElement(searchBtnxpath);
	}
	
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




