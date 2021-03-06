package Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable {

	public static WebDriver driver;
	WebDriverWait wait;
	
	public void click(WebElement elemnt) {
		if(elemnt.isEnabled()==true) {
		elemnt.click();
		}}
	
	public void setvalue(WebElement element,String value) {
		element.clear();
		element.sendKeys(value);
	}
	
	public void waitforelement(WebElement element,int timeout) {
		wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void qauitebrowser(String browsername) throws IOException {
		if(browsername.equalsIgnoreCase("chrome")) {
			driver.quit();
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
		}
		else if(browsername.equalsIgnoreCase("firefox")){
			driver.quit();
			Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe /T");
		}
	}
}


		
