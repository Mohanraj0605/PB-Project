package org.Petitpages;
import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Listingpage extends Ultilityclass {
	

	public Listingpage() {
		PageFactory.initElements(driver, this);
	}

    @FindBy(xpath="//a[@id='clearfilter']")
    private WebElement PLPclear;

    public WebElement getPLPclear() {
        return PLPclear;
    } 

   @FindBy(xpath="//button[@id='add']")
    private WebElement QTYincrease; 
	
	@FindBy(xpath="//button[@id='sub']")
    private WebElement QTYDecrease;

    public WebElement getQTYincrease() {
        return QTYincrease;
    }

    public WebElement getQTYDecrease() {
        return QTYDecrease;
    } 


    @FindBy(xpath="//button[@class='action primary tocart add-to-cart']")
    private WebElement miniaddcart; 

     @FindBy(xpath="(//div[@class='price'])[1]")
    private WebElement PLPrate2; 
	

    @FindBy(xpath="(//img[@class='primary-image'])[1]")
   private WebElement img19;


   @FindBy(xpath="(//img[@class='primary-image'])[1]")
   private WebElement Listedimg2;
   

   public WebElement getListedimg2() {
    return Listedimg2;
}


@FindBy(xpath="(//a[@class='has-sub-cat '])[2]")
    private WebElement Categeorymenu2; 


	@FindBy(xpath="(//span[@class='level2-name sub-cat-name'])[19]")
    private WebElement Categeorybaby;


    @FindBy(xpath="(//span[@class='level2-name sub-cat-name'])[38]")
    private WebElement SubCategeory1;
	
	

   public WebElement getSubCategeory8() {
        return SubCategeory1;
    }

     @FindBy(xpath="(//span[@class='level2-name sub-cat-name'])[41]")
    private WebElement SubCategeory2;
	
	

   public WebElement getSubCategeory2() {
        return SubCategeory2;
    }



   public WebElement getCategeorybaby() {
        return Categeorybaby;
    }

   public WebElement getImg19() {
	return img19;
}
	
    public WebElement getPLPrate2() {
        return PLPrate2;
    }

    public WebElement getMiniaddcart() {
        return miniaddcart;
    }

    public WebElement getCategeorymenu2() {
        return Categeorymenu2;
    }

   
    



}
