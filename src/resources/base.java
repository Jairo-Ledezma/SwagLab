package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base  {
	public   WebDriver driver;
	
	
	
	
	public  WebDriver startBrowser() {
		driver = new ChromeDriver();
		
		return  driver;
		
	}
	
	public static String getHomePage() {
		String text = "https://saucedemo.com";
		return text;
	}
	
	public static String getBuyersName() {
		String text = "Jairo";
		return text;
	}
	
	public static String getBuyersLastName() {
		String text = "Ledezma";
		return text;
	}
	
	public static String getZipCode() {
		String text = "45200";
		return text;
	}
	
	public static String getUserName() {
		String text = "standard_user";
		return text;
	}
	
	public static String getPwd() {
		String text = "secret_sauce";
		return text;
	}

	public static String getWantedProduct() {
		String text = "Jacket";
		return text;
	}
	
	public static String getButtonText() {
		String text = "ADD TO CART";
		return text;
	}
	
	public  void maximizeWindow() {
		 driver.manage().window().maximize();
	}
	
	public  void goTo(String url) {
		 driver.navigate().to(url);
	}
	

}
