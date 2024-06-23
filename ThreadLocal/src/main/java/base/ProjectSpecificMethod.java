package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {

	private static final ThreadLocal<RemoteWebDriver> rd = new ThreadLocal<RemoteWebDriver>();
	
	public void setDriver() {
		
		rd.set(new ChromeDriver());
		
	}
	
	public RemoteWebDriver getDriver() {
		
		return rd.get();
		
	}
	
	
	@BeforeMethod
	public void preConditionMethod() {
		setDriver();
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	@AfterMethod
	public void postConditionMethod() {
		
		getDriver().close();

	}
	
	

}
