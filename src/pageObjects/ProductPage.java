package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class ProductPage {
	public WebDriver driver;

	private By shoppingCart = By.className("shopping_cart_link");
	private By getProductList = By.className("inventory_item_name");
	private By getButtonList = By.tagName("button");

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getShoppingcart() {
		return driver.findElement(shoppingCart);
	}

	public void clickOnDesiredProduct() {
		List<WebElement> products = driver.findElements(getProductList);

		for (WebElement e : products) {
			if (e.getText().contains(base.getWantedProduct())) {
				e.click();
				break;
			}
		}
	}

	public void clickOnAddToCartOnDesiredProduct() {
		List<WebElement> buttons = driver.findElements(getButtonList);
		for (WebElement e : buttons) {
			if (e.getText().contains(base.getButtonText())) {
				e.click();
				break;
			}
		}
	}

}
