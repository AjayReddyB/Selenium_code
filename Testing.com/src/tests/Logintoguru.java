package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Logintoguru {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajayr\\workspace\\Testing.com\\Recources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//opening web-site using URL
//		driver.get("https://www.flipkart.com");
		driver.get("http://demo.guru99.com/test/login.html");
		driver.findElement(By.id("email")).sendKeys("mngr265459");
		driver.findElement(By.id("passwd")).sendKeys("jEbAtun");
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		//driver.findElement(By.id("SubmitLogin")).click();
	}

}

