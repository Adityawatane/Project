package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class RegistrationPage extends TestBase {

	@FindBy(id="FirstName")private WebElement fname;
	@FindBy(id="LastName")private WebElement lname;
	@FindBy(id="Email")private WebElement email;
	@FindBy(id="Password")private WebElement password;
	@FindBy(id="ConfirmPassword")private WebElement conpassword;
	@FindBy(xpath="//button[@type='submit']")private WebElement submitbtn;
	@FindBy(xpath="//h4[@class='card-title']")private WebElement congratutionmsg;
	@FindBy(xpath="//a[@id='loginLink']")private WebElement loginbtn;
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyURLofPage() {
		return driver.getCurrentUrl();
	}
	
	public String verifyCongratulationMessage() throws InterruptedException {
		fname.sendKeys("abc");
		lname.sendKeys("xyz");
		email.sendKeys("abc@gmail.com");
		password.sendKeys("xyzabc");
		conpassword.sendKeys("xyzabc");
		submitbtn.click();
		Thread.sleep(3000);
		return congratutionmsg.getText();
	}
	
	public String verifyLoginPageURL() {
		loginbtn.click();
		return driver.getCurrentUrl();
	}
}
