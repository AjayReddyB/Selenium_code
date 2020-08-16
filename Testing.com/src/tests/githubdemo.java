package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class githubdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating driver object/ opening browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ajayr\\workspace\\Git Repo\\Selenium_code\\Testing.com\\Recources\\chromedriver.exe");
					ChromeDriver driver= new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					//opening web-site using URL
					driver.get("https://amazon.in");
		driver.quit();

	}

}
