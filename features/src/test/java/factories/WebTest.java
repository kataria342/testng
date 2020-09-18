package factories;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTest {

	WebDriver driver;
	String Browser;
	public WebTest(String Browser) {
		this.Browser = Browser;
    }
	
	@BeforeTest
	public void setup() {
        if(Browser == "chrome") {
        	WebDriverManager.chromedriver().setup();
        	driver = new ChromeDriver();
        	driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        }
        else if (Browser == "firefox") {
        	WebDriverManager.firefoxdriver().setup();
        	driver = new FirefoxDriver();
        	driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        }
	}

	  @Test
	  public void openGoogle() {
		  driver.get("https://www.google.com");
		  System.out.println(driver.getTitle());
	  }
	  
	  @AfterTest
	  public void closeBrowser() {
		  driver.quit();
	  }
}
