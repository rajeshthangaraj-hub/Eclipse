package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class WelcomePage  extends ProjectSpecificMethod {
	
	public HomePage clickCrmsfaLink() {
		
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		
		return new HomePage();
	}
	
	public void clickLogout() {
		
		
	}

}
