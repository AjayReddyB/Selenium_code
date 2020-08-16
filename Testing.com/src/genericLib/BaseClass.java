package genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import objectRepo.Login;

public class BaseClass {
	public WebDriver driver;
@org.testng.annotations.BeforeClass
public void configBC(){
		System.out.println("Launch Browser");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajayr\\workspace\\Testing.com\\Recources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Before class completd");
	}
	@BeforeMethod 
	
		public void configBM(){
		Login l=new Login();
		l.login();
		System.out.println("Before method completed");
	}
	@AfterMethod
		public void configAM(){
			System.out.println("LOGOUT");
			System.out.println("after method completd");
		
	}
	@AfterClass
	public void configAC(){
		driver.close();
		System.out.println("after class completed");
	}
	}
		
	

