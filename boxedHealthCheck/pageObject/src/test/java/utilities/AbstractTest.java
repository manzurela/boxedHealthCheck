/**
 * 
 */
package utilities;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import pages.BrochureGatepage;


/**
 * @author manzurelahi
 *
 */
public class AbstractTest {
	public static WebDriver driver;
	@BeforeClass
	public static void startBrowser()
	{	System.setProperty("webdriver.chrome.driver", "/Users/manzurelahi/Downloads/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "/Users/manzurelahi/Downloads/geckodriver");
		//driver= new FirefoxDriver();
		driver= new ChromeDriver();
		
		//if(browserName.equals("firefox"))
		//{
			//driver=new FirefoxDriver();
		//}
		
		//else if(browserName.equals("chrome"))
		//{
			//driver=new ChromeDriver();
		//}
		//else if(browserName.equals("safari"))
		//{
			//driver=new SafariDriver();
		//}
		
		driver.get("https://vpc-staging-web-public.boxed.com/");
		
		//return driver;
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		Actions act= new Actions(driver);
		PageFactory.initElements(driver,new BrochureGatepage());
		
		
	}
		@AfterClass
		public static void tearEnvironment() throws InterruptedException{
			Thread.sleep(5000);
			driver.quit();
		}
}
