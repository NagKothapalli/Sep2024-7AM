package seleniumAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteExecution {
	URL url;
	WebDriver driver;

	@Test
	public void bringMyRemoteDriver() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("name", "NagAutomation");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		capabilities.setCapability(CapabilityType.BROWSER_VERSION, "120");
		capabilities.setCapability(CapabilityType.PLATFORM_NAME, "Windows 11");
		capabilities.setCapability("screen-resolution", "1280x1024");
		capabilities.setCapability("username", "oauth-nagfeb2021-48d01");
		capabilities.setCapability("accessKey", "9e66abb5-9511-4557-81db-4960867a5bcb");
		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		driver = new RemoteWebDriver(url, capabilities);

		driver.get("https://gmail.com");
		driver.findElement(By.name("identifier")).click();
		driver.findElement(By.name("identifier")).sendKeys("jfglgkfdlgmfdgmdf");
		driver.findElement(By.name("identifier")).clear();
		driver.findElement(By.name("identifier")).sendKeys("abcd@gmail.com");
		driver.findElements(By.className("VfPpkd-vQzf8d")).get(1).click();
		driver.quit();
		// --------------------------------------------------------------

		/*
		 * ChromeOptions browserOptions = new ChromeOptions();
		 * browserOptions.setPlatformName("Windows 11");
		 * browserOptions.setBrowserVersion("120"); Map<String, Object> sauceOptions =
		 * new HashMap<>(); sauceOptions.put("username", "oauth-nagfeb2021-48d01");
		 * sauceOptions.put("accessKey", "9e66abb5-9511-4557-81db-4960867a5bcb");
		 * sauceOptions.put("build", "selenium-build-HQ448"); sauceOptions.put("name",
		 * "NagAutomation"); browserOptions.setCapability("sauce:options",
		 * sauceOptions);
		 * 
		 * // start the session URL url = new
		 * URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		 * RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
		 */

	}

	@Test
	public void bringMyRemoteDriver2() throws MalformedURLException {

		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");

		// --------------------------------------------------------------

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 10");
		browserOptions.setBrowserVersion("latest");
		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("username", "oauth-nagfeb2021-48d01");
		sauceOptions.put("accessKey", "9e66abb5-9511-4557-81db-4960867a5bcb");
		sauceOptions.put("build", "selenium-build-HQ448");
		sauceOptions.put("name", "NagAutomation");
		browserOptions.setCapability("sauce:options", sauceOptions);

		RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
		driver.get("https://gmail.com");
		driver.findElement(By.name("identifier")).click();
		driver.findElement(By.name("identifier")).sendKeys("jfglgkfdlgmfdgmdf");
		driver.findElement(By.name("identifier")).clear();
		driver.findElement(By.name("identifier")).sendKeys("abcd@gmail.com");
		driver.findElements(By.className("VfPpkd-vQzf8d")).get(1).click();
		driver.quit();

	}

}
