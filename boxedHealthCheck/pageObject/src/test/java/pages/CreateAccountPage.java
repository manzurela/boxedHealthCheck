/**
 * 
 */
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.AbstractPage;

/**
 * @author manzurelahi
 *
 */
public class CreateAccountPage extends AbstractPage{
	//objects
	@FindBy(id="Email address")
	private static WebElement enterEmail;
	
	@FindBy (xpath="//*[@id='account-join']/form/span[2]/input[1]")
	private static WebElement enterPassword;
	
	@FindBy(xpath="//*[@id='account-join']/form/button")
	private static WebElement tapSignUpButton;
	
	@FindBy(xpath="//*[@id='account-join']/button")
	private static WebElement contWithFBbutton;
	
	@FindBy(xpath="//*[@id='account-join']/p[2]/a")
	private static WebElement signInLnk;
	//methods
	
	public static void setEmail(String email){
		enterEmail.sendKeys(email);	
	}
	public static void setPassword(String pass){
		enterPassword.sendKeys(pass);
	}
	public static void clickSignUp(){
		tapSignUpButton.click();
		}
	
}	
	
