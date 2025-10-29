package org.Petitpages;

import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage extends Ultilityclass{
	
	
	public Cartpage() {
		PageFactory.initElements(driver, this);
	}


    @FindBy(xpath="(//div[@class='actual-price'])[1]")
    private WebElement productcartrate1;


    public WebElement getProductcartrate1() {
        return productcartrate1;
    } 


    @FindBy(xpath="(//div[@class='cart-col-2']//following-sibling::h6)[1]")
    private WebElement cartproductname;


    public WebElement getCartproductname() {
        return cartproductname;
    }


    @FindBy(xpath="(//table[@class='data table totals']//tr//td)[5]")
private WebElement Ordersummarytotaldiscountcart;


    	@FindBy(xpath="//button[@title='Order']")
    private WebElement Placeorder;

    
     public WebElement getPlaceorder() {
            return Placeorder;
        }

	public WebElement getOrdersummarytotaldiscountcart() {
	return Ordersummarytotaldiscountcart;
}

    @FindBy(xpath="(//table[@class='data table totals']//tr//td)[1]")
 private WebElement Cartsubtotalprice;


    public WebElement getCartsubtotalprice() {
        return Cartsubtotalprice;
    }
	

    @FindBy(xpath="(//table[@class='data table totals']//tr//td)[3]")
 private WebElement Cartordersummarytotal;


 @FindBy(xpath="//button[@class='action cancel primary btn-yellow']")
 private WebElement Couponcancelbtn;


 


    public WebElement getCouponcancelbtn() {
    return Couponcancelbtn;
}

    public WebElement getCartordersummarytotal() {
        return Cartordersummarytotal;
    }


     @FindBy(xpath="//div[@class='message-error error message']")
     private WebElement Couponcodeerrormessage;


     public WebElement getCouponcodeerrormessage() {
         return Couponcodeerrormessage;
     }
   


}
	

	