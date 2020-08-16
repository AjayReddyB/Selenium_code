package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(linkText="Bank Project") WebElement BankProject;
	public void goToBankProj(){
		BankProject.click();
	}
}
