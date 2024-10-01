package seleniumAutomation;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ApsrtcAutomation 
{	
	ChromeDriver driver;  //null
	String name;  // null
	public ApsrtcAutomation() 
	{
		driver = new ChromeDriver(); //session ID = 1234
		name = "Ram";
		
	}
	
	//java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "this.name" is null
	//java.lang.NullPointerException: Cannot invoke "org.openqa.selenium.chrome.ChromeDriver.get(String)" because "this.driver" is null
	
	@Before  //Having before and After annotations in a java class is not mandatory . it will execute the Before annotation if any before each test method
	public void launchApsrtcApplication()
	{
		driver.get("https://www.apsrtconline.in/");   // null.findElement
	}
	
	
	
	@Test
	public void bookBusTicket() throws InterruptedException
	{
		System.out.println("TestCase : Book a Bus Ticket");
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}




