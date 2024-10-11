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
	Actions actions;
	public DriverUtilities(ChromeDriver  mydriver)
	{
		driver = mydriver; //1234
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		actions = new Actions(driver);
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
	
	public void clickElement(WebElement element) //abcd
	{
		//WebElement element = driver.findElement(By.xpath(myxpath));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}	
	
	//By by = By.xpath("abcd");
	public void clickElement(By by) //abcd
	{
		
		//WebElement element = driver.findElement(By.xpath(myxpath));
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();
	}
	
	public void enterText(String myxpath,String mytext)
	{
		WebElement element = driver.findElement(By.xpath(myxpath));
		wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(mytext);
	}
	
	public void doubleClickElement(String myxpath) //abcd
	{
		WebElement element = driver.findElement(By.xpath(myxpath));
		//wait.until(ExpectedConditions.elementToBeClickable(element));
		actions.moveToElement(wait.until(ExpectedConditions.elementToBeClickable(element))).doubleClick().build().perform();
	}
	public void rightClickElement(String myxpath) //abcd
	{
		WebElement element = driver.findElement(By.xpath(myxpath));
		actions.moveToElement(wait.until(ExpectedConditions.elementToBeClickable(element))).contextClick().build().perform();
	}


}
