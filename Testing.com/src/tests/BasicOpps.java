package tests;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicOpps {
	public static void main(String[] args){	
	// creating driver object/ opening browser
	FirefoxDriver driver= new FirefoxDriver();
	//opening web-site using URL
	driver.get("https://gmail.com");
	//taking web-site name for confirmation
	String title=driver.getTitle();
	System.out.println(title);
	// taking URL for confirmation
	String url=driver.getCurrentUrl();
	System.out.println(url);
	//collecting page source code
	String htmlpagecode=driver.getPageSource();
	System.out.println(htmlpagecode);
	// closing browser
	driver.close();
}


}
