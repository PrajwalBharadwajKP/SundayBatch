package Generic;

import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BaseTest implements IConstants{
	public WebDriver driver;
	@BeforeClass 
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ITO));
		driver.get(URL);
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}