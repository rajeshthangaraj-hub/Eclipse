package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
	
	public LoginPage enterUserName() {
		
		getDriver().findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		return this;
				
	}
	
	public LoginPage enterPassword() {
		getDriver().findElement(By.id("password")).sendKeys("crmsfa");
		
		return this;
		
	}
	
	public WelcomePage clickLoginBtn() {
		
		getDriver().findElement(By.className("decorativeSubmit")).click();
		
		return new WelcomePage();
	}

}
