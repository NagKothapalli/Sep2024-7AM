package seleniumAutomation;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

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
	public void bookBusTicket()
	{
		System.out.println("TestCase : Book a Bus Ticket");
		//driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		driver.findElement(By.xpath("//input[@size='22' and @name='source']")).sendKeys("HYDERABAD");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}




