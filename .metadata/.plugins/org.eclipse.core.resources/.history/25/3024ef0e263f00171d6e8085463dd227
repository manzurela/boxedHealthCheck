/**
 * 
 */
package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractPage;

/**
 * @author manzurelahi
 *
 */
public class SignInPage extends AbstractPage{

	//objects 
	@FindBy(name="email")
	private static WebElement EditEmail;
	
	@FindBy(name="password")
	private static WebElement EditPassword;
	
	@FindBy(xpath="//*[@id='account-login']/form/button")
	private static WebElement SignInButton;
	//assertion element for successful login
	@FindBy(xpath="//*[@id='top-nav']/nav/div[1]/span/span[1]/span/span[1]")
	private static WebElement LoggedInSuccessfully;
	
	@FindBy(xpath="//*[@id='account-login']/form/div/a")
	private static WebElement ForgotPassLink;
	
	@FindBy(xpath="//*[@id='account-login']/button")
	private static WebElement ContFacebookButton;
	
	@FindBy(xpath="//*[@id='account-login']/p[2]/a")
	private static WebElement CreateAccountLink;
	
	//Methods
	public static void setUserName(String usermail){ 
		EditEmail.sendKeys(usermail);
		}
	public static void setPassword(String pass){
		EditPassword.sendKeys(pass);
	}
	
	public static void tapLoginButton() throws InterruptedException{
		SignInButton.click();
		PageFactory.initElements(driver,new HomePage());
		Thread.sleep(3000);
		}
	//assertion method for successful login
	public static void LoggedIn(){
		 
		 
		 LoggedInSuccessfully.isDisplayed();
			//PageFactory.initElements (driver,new SignInPage());
	}
	
	public static void tapForgotLnk(){
		ForgotPassLink.click();
	}
	public static void tapConFBbutton(){  
		ContFacebookButton.click();
		}
	public static void clickAccntCreateLnk(){
		CreateAccountLink.click();
		//going to HomePage
		
	}
	
	
			
}
