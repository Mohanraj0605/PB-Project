package org.Petitpages;

import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Categeorypage extends Ultilityclass{
	
	
	public Categeorypage() {
		PageFactory.initElements(driver, this);
	}


    




	@FindBy(xpath="(//a[@class='has-sub-cat '])[1]")
    private WebElement Categeorymenu1; 
	

	public WebElement getCategeorymenu1() {
        return Categeorymenu1;
    }

    @FindBy(xpath="(//a[@class='has-sub-cat '])[3]")
    private WebElement Categeorymenu3; 


    public WebElement getCategeorymenu3() {
		return Categeorymenu3;
	}

	public WebElement getTshirtback() {
		return Tshirtback;
	}


	@FindBy(xpath="(//span[@class='level2-name sub-cat-name'])[50]")
    private WebElement Tshirtback;

	@FindBy(xpath="(//span[@class='level2-name sub-cat-name'])[63]")
    private WebElement Tshirtback1;


	@FindBy(xpath="(//span[@class='level2-name sub-cat-name'])[70]")
    private WebElement Pyjamas1;


	public WebElement getPyjamas1() {
		return Pyjamas1;
	}

	public WebElement getTshirtback1() {
		return Tshirtback1;
	}


	public WebElement getPyjamas() {
		return Pyjamas;
	}

	

	@FindBy(xpath="(//span[@class='level2-name sub-cat-name'])[55]")
    private WebElement Pyjamas;
	


}