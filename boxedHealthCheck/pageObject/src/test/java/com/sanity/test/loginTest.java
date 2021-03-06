/**
 * 
 */
package com.sanity.test;


import org.junit.Test;

import pages.BrochureGatepage;
import pages.HomePage;
import pages.SignInPage;
import utilities.AbstractTest;

/**
 * @author manzurelahi
 *
 */
public class loginTest extends AbstractTest {

	@Test
	public void webLoginTest() throws InterruptedException{
		
		BrochureGatepage.verifyb2bLink();
		BrochureGatepage.verifyb2bPage();
		BrochureGatepage.returnTohome();
		BrochureGatepage.verifySignInLink();
		BrochureGatepage.dismissSignInModal();
		BrochureGatepage.verifyTermsLink();
		BrochureGatepage.verifyTermsPage();
		BrochureGatepage.returnTohome1();
		BrochureGatepage.verifyPrivacyLink();
		BrochureGatepage.verifyPrivacyPage();
		BrochureGatepage.returnTohome2();
		BrochureGatepage.ClickSignInLink();
		SignInPage.setUserName("apitest@example.com");
		SignInPage.setPassword("123456");
		SignInPage.tapLoginButton();
		//SignInPage.LoggedIn();
		HomePage.LoggedIn();
		HomePage.HoverMenu();
		HomePage.PLEitemMars();
		
	
	}
}
