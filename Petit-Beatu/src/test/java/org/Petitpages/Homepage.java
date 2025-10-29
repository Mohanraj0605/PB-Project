package org.Petitpages;

import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Ultilityclass {
	

	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//i[@class='icon_account-non-logged-new']")
    private WebElement ImageIcon; 
	

	public WebElement getLoggedImageIcon() {
		return LoggedImageIcon;
	}


	@FindBy(xpath="//i[@class='icon_account-logged-new']")
    private WebElement LoggedImageIcon; 
	


	@FindBy(xpath="//a[text()='Login ']")
    private WebElement LoginIcon; 
	

	@FindBy(xpath="//div[@class='selected-dial-code']")
    private WebElement dialcodedrop; 
	
	@FindBy(xpath="(//li[@class='country'])[98]")
    private WebElement Countrycode; 
	

	@FindBy(xpath="//a[@title='logo']")
    private WebElement PBLogo; 

	public WebElement getPBLogo() {
		return PBLogo;
	}

	
	@FindBy(xpath="//a[@title='Classic Petit Bateau logo in blue on white background']")
    private WebElement PBLogo1; 
	
	

	public WebElement getPBLogo1() {
		return PBLogo1;
	}


	@FindBy(xpath="//input[@name='mobile_number']")
    private WebElement Logintextbox; 
	
	@FindBy(xpath="//button[@name='send']")
    private WebElement Loginbutton; 
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
    private WebElement LoginOTP; 
	
	@FindBy(xpath="//button[@class='btn-blue']")
    private WebElement OTPVERIFY;


	
	

	
	

	public WebElement getImageIcon() {
		return ImageIcon;
	}

	public WebElement getLoginIcon() {
		return LoginIcon;
	}
	
	public WebElement getDialcodedrop() {
		return dialcodedrop;
	}

	public WebElement getCountrycode() {
		return Countrycode;
	}

	public WebElement getLogintextbox() {
		return Logintextbox;
	}

	public WebElement getLoginbutton() {
		return Loginbutton;
	}

	public WebElement getLoginOTP() {
		return LoginOTP;
	}

	public WebElement getOTPVERIFY() {
		return OTPVERIFY;
	}


	
	
}
