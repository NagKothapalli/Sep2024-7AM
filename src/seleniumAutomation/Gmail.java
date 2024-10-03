package seleniumAutomation;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import junit.framework.Assert;

public class Gmail
{
	
	String expectedTitle = "Gmail";  // Given by customer in the requirement document
	
	ChromeDriver driver = new ChromeDriver(); // chromedriver constructor will be executed as a result an empty chrome browser will be opened
	@After
	public void logoutApplication()
	{
		System.out.println("Logout From Application");
	}
	//@Test
	@Before
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
		
		//open an empty browser , call the url 
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win64-116\\chromedriver-win64\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win64-129\\chromedriver-win64\\chromedriver.exe");
		
		int stdNum; // local variable
		
		//EdgeDriver driver = new EdgeDriver();
		
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
		
		
	}
	//org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"*[name='identifier']"}
	//java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 0
	@Test
	public void loginToApplication()
	{
		System.out.println("Login to Application started ....");
		//launchApplication();
		//System.out.println(stdNum);
		//System.out.println(expectedTitle);
		boolean flag = driver.findElement(By.name("identifier")).isDisplayed();
		System.out.println(flag);
		if(driver.findElement(By.name("identifier")).isEnabled())
		{
			driver.findElement(By.name("identifier")).click();
			driver.findElement(By.name("identifier")).sendKeys("jfglgkfdlgmfdgmdf");
			driver.findElement(By.name("identifier")).clear();
			driver.findElement(By.name("identifier")).sendKeys("nag022@gmail.com");
			driver.findElements(By.className("VfPpkd-vQzf8d")).get(1).click();
		}
		else
		{
			System.out.println("Object is not enabled");
		}
	}
	
	@Test
	public void creatAccount()
	{
		//launchApplication();
		System.out.println("Test Case : Verify the Create Account Functionality");
		int count = driver.findElements(By.className("VfPpkd-vQzf8d")).size();
		System.out.println("Total elements count :" + count);
		//driver.findElements(By.className("VfPpkd-vQzf8d")).get(2).click();  // 0  1  2 
		
		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d' and  text()='Create account']")).click();
		
		//List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		//WebElement element = elements.get(2);
		//element.click();
		
		/*
		 * for(int i=0;i<elements.size();i++) // i=0 { String text =
		 * elements.get(i).getText(); // i th if(text.equals("Create account")) {
		 * elements.get(i).click(); break; }
		 * 
		 * }
		 */
		
	}
	
	@Test
	public void forgotEmail()
	{
		//launchApplication();
		//driver.findElements(By.tagName("button")).get(0).click();
		List<WebElement> elements = driver.findElements(By.tagName("button"));
		
		for(int i=0;i<elements.size();i++)  // i=0
		{
			String text = elements.get(i).getText();  // i th
			if(text.equals("Forgot email?"))
			{
				 elements.get(i).click();
				 break;
			}
			
		}
		
	}
	
	@Test
	public void learMoreAboutGuestMode()
	{
		//launchApplication();
		//driver.findElements(By.tagName("button")).get(0).click();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<elements.size();i++)  // i=0
		{
			String text = elements.get(i).getText();  // i th
			if(text.equals("Learn more about using Guest mode"))
			{
				 elements.get(i).click();
				 break;
			}
			
		}
		
	}
	
	
	
	//WebDriver : ChromeDriver : get(),getWindowHandle(),getTitle(),getCurrentUrl(),findElement(),findElements(),
	
	//By : id , name , class , tagName , linkText , partialLinkText , xpath , cssSelector  - Locators / Selectors in selenium
	
	//WebElement : click(),clear(),sendKeys(),isDisplayed(),isEnabled(),getText() , getTagName , getClassName , getAttribute ,findElement(),findElements()
	
	@Test
	public void learMoreAboutGuestMode_linktext()
	{
		//launchApplication();
		//driver.findElement(By.linkText("Learn more about using Guest mode")).click();
		driver.findElement(By.partialLinkText("Learn more about using")).click();
	}
	
	//XPATH - Absolute Xpath : XML path
	@Test
	public void absoluteXpath()
	{
	   //    	/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("dsgdfdg@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("nag022@gmail.com");
		
		String emailObj = "/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input";
		String name = "Ram";
		
		driver.findElement(By.xpath(emailObj)).click();
		driver.findElement(By.xpath(emailObj)).sendKeys("jkdsfdsjkdkjfgjg");
		driver.findElement(By.xpath(emailObj)).clear();
		driver.findElement(By.xpath(emailObj)).sendKeys("nag022@gmail.com");
	}
	
	//XPATH : Relative xpath : Its like select SQL query .    :   select empSalary from Employee where EmpName = Nag and EmpID=1234
	
	//tagName[@attribute = 'value'] 
	
	//tagName[text() = 'value']
	
	//tagName[@attribute1 = 'value'  and @attribute2 = 'value']]  
	
	//tagName[@attribute = 'value'  and text() = 'value']]  
	
	//tagName[@attribute1 = 'green'  or  @attribute2 = 'red']]
	
	//tagName[@attribute = 'value'  or text() = 'value']]  
	
	
	    //tagName[contains(@attribute , 'value')] 
	
		//tagName[contains(text() , 'value')]
		
		//tagName[contains(@attribute1 , 'value')  and @attribute2 = 'value']]  
		
		//tagName[@attribute = 'value'  and contains(text() , 'value')]  
		
		//tagName[@attribute1 = 'green'  or  contains(@attribute2 , 'red')]
		
		//tagName[contains(@attribute , 'value')  or text() = 'value'] 
	
	
	    //*[@attribute = 'value'] 
	
		//*[text() = 'value']
		
		//*[@attribute1 = 'value'  and @attribute2 = 'value']]  
		
		//*[@attribute = 'value'  and text() = 'value']]  
		
		//*[@attribute1 = 'green'  or  @attribute2 = 'red']]
		
		//*[@attribute = 'value'  or text() = 'value']] 
	
	@Test
	public void relativeXpath()
	{
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("ng022@gmail.com");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
