package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC001_Login2 extends ProjectSpecificMethod{
	
	@Test
	public void runTC002_Login() {
		
		LoginPage lp = new LoginPage();
		
		lp.enterPassword().enterUserName().clickLoginBtn().clickCrmsfaLink().clickLeadsTab().leadsPage();
		
	
		
	}

}
