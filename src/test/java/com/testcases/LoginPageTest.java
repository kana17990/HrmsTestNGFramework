package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.utils.CommonMethods;

public class LoginPageTest extends CommonMethods {

	//Test case to validate valid login
		@Test
		public void login() {
			LoginPage login=new LoginPage();
			sendText(login.username, "Admin");
			sendText(login.password, "Hum@nhrm123");
			Click(login.loginBtn);
		}

		/* Navigate to HRMS 
		 * Enter uid
		 * leave password field blank
		 * click login
		 * verify "Password cannot be empty" text 
		 * close browser
		 */
		//@Test
		public void negativeLogin() {
			LoginPage login=new LoginPage();
			sendText(login.username, "Admin");
			Click(login.loginBtn);
			String expected="Password cannot be empty";
			//Assert.assertEquals(login.errMsg.getText(), expected);
		}
	}		
