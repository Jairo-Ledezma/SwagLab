package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.CartPage;
import pageObjects.LoginPage;
import pageObjects.ProductPage;

import resources.base;

public class swagLab  {

	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeTest
	public  void initDriver() {
		base b = new base();
		driver = b.startBrowser();
		driver.manage().timeouts().implicitlyWait(03, TimeUnit.SECONDS);
		b.maximizeWindow();
		b.goTo(base.getHomePage());
	}

	@Test
	public void testLoginPage() {
		LoginPage lp = new LoginPage(driver);
		Reporter.log("test");
		lp.getUsernameField().sendKeys(base.getUserName());
		lp.getPwdField().sendKeys(base.getPwd());
		lp.getLoginBtn().click();
	
	}

	@Test
	public void testProductPage() {

		ProductPage pp = new ProductPage(driver);
		pp.clickOnDesiredProduct();
		pp.clickOnAddToCartOnDesiredProduct();
		pp.getShoppingcart().click();
	}

	@Test
	public void testCartPage() throws InterruptedException {

		CartPage cp = new CartPage(driver);
		cp.getCheckoutButton().click();
		cp.getFirstNameField().sendKeys(base.getBuyersName());
		cp.getLastNameField().sendKeys(base.getBuyersLastName());
		cp.getZipcodeField().sendKeys(base.getZipCode());
		cp.getContinueButton().click();
		cp.getFinishButton().click();
		cp.getBackToProductsButton().click();
	}

}
