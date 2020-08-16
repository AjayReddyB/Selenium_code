package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Login {
	@FindBy(id="email") WebElement Emailaddress;
	@FindBy(id="passwd")WebElement Psword;
	@FindBy(id="SubmitLogin") WebElement Signin;
	@FindBy(linkText="Forgot your password?") WebElement ForgotPsword;
	public void login(){
		Emailaddress.sendKeys("mngr265459");
		Psword.sendKeys("jEbAtun");
		Signin.click();
	}
	
}
