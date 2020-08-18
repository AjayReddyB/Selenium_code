package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Flipkthome {
	@FindBy(xpath="//*[text()='✕']")WebElement clsBtn;
	@FindBy(xpath="//*[@Title='Search for products, brands and more']")WebElement searchbar;
	@FindBy(xpath="//*[@type='submit']")WebElement searchBtn;
	public void search(String searchName){
		clsBtn.click();
		searchbar.sendKeys(searchName);
		searchBtn.click();
	}
}
