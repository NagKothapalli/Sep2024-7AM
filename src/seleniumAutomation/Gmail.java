package seleniumAutomation;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail
{
	@Test
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
		//open an empty browser , call the url 
		//System.setProperty("webdriver.chrome.driver", "path of chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // chromedriver constructor will be executed as a result an empty chrome browser will be opened
		//Every browser window will have a unique session ID , selenium will identify the browser based on its session ID .
		
		driver.get("https://gmail.com");
		
		String sessionID = driver.getWindowHandle();
		
		System.out.println("My window session ID :"+ sessionID);
		
	}

}
