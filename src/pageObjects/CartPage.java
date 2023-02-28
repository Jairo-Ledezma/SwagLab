package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	
	public WebDriver driver;
	
	private By checkoutButton = By.cssSelector("#checkout");
	private By firstNameField = By.id("first-name");
	private By lastNameField = By.id("last-name");
	private By zipCodeField = By.id("postal-code");
	private By continueButton = By.id("continue");
	private By finishButton = By.id("finish");
	private By backToProductsButton = By.id("back-to-products");
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getCheckoutButton () {
		return driver.findElement(checkoutButton);
	}
	
	public WebElement getFirstNameField() {
		return driver.findElement(firstNameField);
	}
	
	public WebElement getLastNameField() {
		return driver.findElement(lastNameField);
	}
	
	public WebElement getZipcodeField() {
		return driver.findElement(zipCodeField);
	}
	
	public WebElement getContinueButton() {
		return driver.findElement(continueButton);
	}
	
	public WebElement getFinishButton() {
		return driver.findElement(finishButton);
	}
	
	public WebElement getBackToProductsButton() {
		return driver.findElement(backToProductsButton);
	}

}
