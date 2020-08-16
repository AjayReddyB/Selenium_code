package tests;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {

	public static void main(String[] args) {
			// creating driver object/ opening browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajayr\\workspace\\Git Repo\\Selenium_code\\Testing.com\\Recources\\chromedriver.exe");
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//opening web-site using URL
			driver.get("https://www.flipkart.com/");
			// closing the pop-up window
			driver.findElement(By.xpath("//*[text()='✕']")).click();
			// searching for desired Product
			driver.findElement(By.xpath("//*[@Title='Search for products, brands and more']")).sendKeys("IPhone 11 Pro");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			driver.findElement(By.xpath("//*[text()='Apple iPhone 11 Pro (Midnight Green, 64 GB)']")).click();
//			changing window control to child window 
			Set<String> winHal = driver.getWindowHandles();
			Iterator<String>it=winHal.iterator();
			String parentID=it.next();
			String childID=it.next();
			driver.switchTo().window(childID);
			// adding item to cart
			driver.findElementByXPath("//*[text()='ADD TO CART']").click();
			
			// switching back to main window for confirming product in cart.
			
			driver.switchTo().window(parentID);
			driver.findElementByXPath("//*[text()='Cart']").click();
			driver.quit();
	}

}
