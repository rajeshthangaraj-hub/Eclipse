package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{
	
	public HomePage() {
		
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public LeadsPage clickLeadsTab() {
		
		getDriver().findElement(By.linkText("Leads")).click();
		
		return new LeadsPage();
	}

}
