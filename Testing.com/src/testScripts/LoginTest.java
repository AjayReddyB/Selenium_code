package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import genericLib.ScreenshotOnFailure;
import objectRepo.HomePage;
import objectRepo.Login;

public class LoginTest{
	public WebDriver driver;

@Test
	public void logiinTest() {
	HomePage h=PageFactory.initElements(driver, HomePage.class);
	h.goToBankProj();
	
	}
@BeforeClass
public void configBC(){
		System.out.println("Launch Browser");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajayr\\workspace\\Git Repo\\Selenium_code\\Testing.com\\Recources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Before class completd");
	}
	@BeforeMethod 

		public void configBM(){
		Login l=PageFactory.initElements(driver, Login.class);
		l.login();
		System.out.println("Before method completed");
	}
	@AfterMethod
		public void configAM(ITestResult result){
		if(ITestResult.FAILURE==result.getStatus()) {
		ScreenshotOnFailure sc=new ScreenshotOnFailure();
		sc.captureSC(driver, result.getName());
		
		System.out.println("LOGOUT");
			System.out.println("after method completd");
		}
	}
	@AfterClass
	public void configAC(){
		driver.close();
		System.out.println("after class completed");
	}
}
