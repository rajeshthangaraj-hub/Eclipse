package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC001_Login extends ProjectSpecificMethod{
	
	@Test
	public void runTC001_Login() {
		
		LoginPage lp = new LoginPage();
		
		lp.enterPassword().enterUserName().clickLoginBtn().clickCrmsfaLink().clickLeadsTab().leadsPage();
		
	}

}
