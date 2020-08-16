package genericLib;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotOnFailure {
public  void captureSC(WebDriver driver, String screenshotname) {
	try {
		TakesScreenshot ts = (TakesScreenshot)driver;
				File source= ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./Screenshots"+screenshotname+".png"));;
				System.out.println("screen shot taken");
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception while taking screenshot"+e.getMessage());
	}
}
}
