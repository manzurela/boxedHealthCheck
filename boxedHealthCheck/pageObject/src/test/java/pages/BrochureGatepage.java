/**
 * 
 */
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractPage;


/**
 * @author manzurelahi
 *This class will have objects and methods for Brochure Gate for 
 */
public class BrochureGatepage extends AbstractPage{
	@FindBy(xpath="//*[@id='top-nav']/nav/div/span/span")
	private static WebElement SignInLink;

	@FindBy(xpath="//*[@id='modal-newa']/div[2]/div/div[1]/i")
	private static WebElement SignInModalDismiss;
	//@FindBy(xpath="//*[@id='brochure-gate']/div[1]/button")
	//private static WebElement FacebookButton;
	
	//@FindBy(xpath="//*[@id='brochure-gate']/div[1]/div[2]/form/span/input")
	//private static WebElement BrochureGateEmail;
	
	//@FindBy(xpath="//*[@id='brochure-gate']/div[1]/div[2]/form/button")
	//private static WebElement GoButton;
	
	@FindBy(xpath="//*[@id='brochure-gate']/div[5]/div/button")
	private static WebElement ShopBusinessButton;
	
	//assertion element for business page
	
	@FindBy(xpath="//*[@id='business']/section[2]/h2")
	private static WebElement B2BpageExists;
	
	//@FindBy(xpath="//*[@id='brochure-gate']/div[6]/div[1]/p/a")
	//private static WebElement TodayShowLink;
	
	// To Return to HomePage
	@FindBy(xpath="//*[@id='top-nav-logo']/span")
	private static WebElement BoxedLogo;
	
	//@FindBy(xpath="//*[@id='brochure-gate']/div[6]/div[2]/p/a")
	//private static WebElement RethinkPinkLink;
	
	@FindBy(xpath="//*[@id='brochure-gate']/div[1]/p/a[1]")
	private static WebElement TermsLink;
	
	//assertion element for Terms & Condition page 
	@FindBy(id="terms-conditions")
	private static WebElement TermCondExists;
	
	@FindBy(xpath="//*[@id='brochure-gate']/div[1]/p/a[2]")
	private static WebElement PrivacyLink;
	
	//assertion element for Privacy page
	@FindBy(xpath="//*[@id='privacy-policy']/div/header")
	private static WebElement PrivacyPageExists;
	
	//Methods
	public static void verifyb2bLink(){
	ShopBusinessButton.click();
	}
	//assertion method for b2b page 
	public static void verifyb2bPage(){
		B2BpageExists.isDisplayed();
	}
	public static void returnTohome(){
		BoxedLogo.click();
	}
	public static void verifySignInLink(){
		SignInLink.click();
	}
	public static void dismissSignInModal(){
		SignInModalDismiss.click();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void verifyTermsLink(){
		TermsLink.click();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//assertion method for Terms page
	public static void verifyTermsPage(){
		TermCondExists.isDisplayed();
	}
	
	public static void returnTohome1(){
		BoxedLogo.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void verifyPrivacyLink(){
		PrivacyLink.click();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//assertion method for Privacy page 
	public static void verifyPrivacyPage(){
		PrivacyPageExists.isDisplayed();
	}
	public static void returnTohome2(){
	BoxedLogo.click();}
	public static void ClickSignInLink(){
		SignInLink.click();
		PageFactory.initElements (driver,new SignInPage());
	}
	
}