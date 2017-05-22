/**
 * 
 */
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;




import utilities.AbstractPage;

/**
 * @author manzurelahi
 *
 */
public class HomePage extends AbstractPage{
	//assertion element for successful login
		@FindBy(xpath="//*[@id='top-nav']/nav/div[1]/span/span[1]/span/span[1]")
		
		private static WebElement LoggedInSuccessfully;
		
		@FindBy(xpath="//*[@id='menu']/div/ul[1]/li[1]/a")
		private static WebElement AllProducts;
		
		@FindBy(xpath="//*[@id='menu']/div/ul[1]/li[1]/ul/li[1]/ul/li[1]/a")
		private static WebElement Grocery;
		
		@FindBy(xpath="//*[@id='menu']/div/ul[1]/li[1]/ul/li[1]/ul/li[1]/div/ul/li[6]/a/span[2]")
		private static WebElement ChocAndCandy;
		
		@FindBy(xpath="//*[@id='page-content']/div[3]/div/div/div[2]/div[1]/ul/li[2]/div/div/div/button")
		private static WebElement MarsMandM;
		//@FindBy(xpath="//*[@id='page-content']/div[3]/div/div/div[2]/div/ul/li[4]/div/div/div/button")
		//private static WebElement HarsheyNugget;
		
		
	//methods 
		public static void LoggedIn() throws InterruptedException {
			LoggedInSuccessfully.isDisplayed();
			Thread.sleep(5000);	
		}
		public static void HoverMenu() throws InterruptedException {
			//AllProducts.click();
			Actions act= new Actions(driver);
			act.moveToElement(AllProducts).moveToElement(Grocery).moveToElement(ChocAndCandy).click().build().perform();
			Thread.sleep(2000);
		}
		
		public static void PLEitemMars(){
			MarsMandM.click();
		}
	
		
		
}
