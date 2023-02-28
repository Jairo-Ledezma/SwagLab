package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	private By userNameField = By.id("user-name");
	private By pwdField = By.id("password");
	private By loginBtn = By.id("login-button");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getUsernameField() {
		return driver.findElement(userNameField);
	}
	
	public WebElement getPwdField() {
		return driver.findElement(pwdField);
	}
	
	public WebElement getLoginBtn() {
		return driver.findElement(loginBtn);
	}
}
