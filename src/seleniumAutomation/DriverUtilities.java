package seleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtilities
{
	//ChromeDriver driver = new ChromeDriver(); // 6789
	ChromeDriver driver; //null
	WebDriverWait wait;
	public DriverUtilities(ChromeDriver  mydriver)
	{
		driver = mydriver; //1234
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	}
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
