package org.Petitpages;

import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PDPpage extends Ultilityclass {


    public PDPpage() {
		PageFactory.initElements(driver, this);
	}


     public WebElement getMiniaddcart1() {
        return miniaddcart1;
    } 


    @FindBy(xpath="//a[@class='btn-blue']")
    private WebElement seebasket; 
	

    public WebElement getSeebasket() {
        return seebasket;
    }

     @FindBy(xpath="//a[text()='See My Cart']")
    private WebElement seeMycart1; 

     @FindBy(xpath="//i[@class='icon_cart-vide-new']")
    private WebElement Carticon; 


     @FindBy(xpath="//a[text()='See My Basket']")
    private WebElement SeeMycarticon; 

   @FindBy(xpath="//a[@id='CloseBasket']")
    private WebElement Closebaseket; 

    
   

    public WebElement getClosebaseket() {
    return Closebaseket;
}


    public WebElement getCarticon() {
        return Carticon;
    }


     public WebElement getSeeMycarticon() {
         return SeeMycarticon;
     }


    public WebElement getSeeMycart1() {
        return seeMycart1;
    }


    @FindBy(xpath="//li[@class='select2-results__option select2-results__option--selectable select2-results__option--highlighted']")
    private WebElement dropvalue18;

    public WebElement getDropvalue18() {
        return dropvalue18;
    }


    @FindBy(xpath="//div[@data-price-type='finalPrice']")
    private WebElement PDPrate1;
	


    public WebElement getPDPrate1() {
        return PDPrate1;
    }


    @FindBy(xpath="//button[@class='action primary tocart add-to-cart']")
    private WebElement miniaddcart1;


    
   
    
	
	
    }


	