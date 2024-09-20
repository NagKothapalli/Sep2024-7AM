package seleniumAutomation;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import junit.framework.Assert;

public class Gmail
{
	
	String expectedTitle = "Gmail";  // Given by customer in the requirement document
	
	@Test
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
		
		//open an empty browser , call the url 
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win64-116\\chromedriver-win64\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win64-129\\chromedriver-win64\\chromedriver.exe");
		
		//ChromeDriver driver = new ChromeDriver(); // chromedriver constructor will be executed as a result an empty chrome browser will be opened
		
		EdgeDriver driver = new EdgeDriver();
		
		//Every browser window will have a unique session ID , selenium will identify the browser based on its session ID .
		
		driver.get("https://gmail.com");
		
		String sessionID = driver.getWindowHandle();
		
		System.out.println("My window session ID :"+ sessionID);
		
		String actualTitle = driver.getTitle(); // captured from the application
		
		//Validation = ExpectedValue : ActualValue
		
		//Junit Assertions
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
		//User assertion
		if(expectedTitle.equals(actualTitle))
		{
			//true
			System.out.println("Title Validation Passed");
		}
		else
		{
			System.out.println("Title Validation Failed");
		}
		
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println("My Current URL :" + currentUrl );
		boolean flag = driver.findElement(By.name("identifier")).isDisplayed();
		System.out.println(flag);
		if(driver.findElement(By.name("identifier")).isEnabled())
		{
			driver.findElement(By.name("identifier")).click();
			driver.findElement(By.name("identifier")).sendKeys("jfglgkfdlgmfdgmdf");
			driver.findElement(By.name("identifier")).clear();
			driver.findElement(By.name("identifier")).sendKeys("nag022@gmail.com");
		}
		else
		{
			System.out.println("Object is not enabled");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
