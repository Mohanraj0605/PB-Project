package org.Petitpages;

import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage extends Ultilityclass{
	
	
	public Checkoutpage() {
		PageFactory.initElements(driver, this);
	}


//Billinf form

 @FindBy(xpath="//li[text()='Sharjah']")
 private WebElement BSharjah;



public WebElement getBSharjah() {
	return BSharjah;
}



 @FindBy(xpath="(//li[@class='select2-results__option select2-results__option--selectable'])[4]")
 private WebElement statedubai;


 @FindBy(xpath="(//li[@class='select2-results__option select2-results__option--selectable'])[7]")
 private WebElement statesharja;








 public WebElement getStatedubai() {
    return statedubai;
}


 public WebElement getStatesharja() {
    return statesharja;
 }





@FindBy(xpath="(//input[@type='text'])[2]")
 private WebElement BillFirstname;

 @FindBy(xpath="(//input[@type='text'])[3]")
 private WebElement Billlastname;

 @FindBy(xpath="(//li[@class='country'])[97]")
 private WebElement Billcountrycode1;


 

     public WebElement getBillFirstname() {
    return BillFirstname;
}


 public WebElement getBilllastname() {
    return Billlastname;
 }

    @FindBy(xpath="(//input[@type='text'])[4]")
    private WebElement StreetfieldBill;



     @FindBy(xpath="(//input[@type='text'])[5]")
    private WebElement BulidingboxfieldBill;

    @FindBy(xpath="(//input[@type='text'])[6]")
    private WebElement CityfieldboxfieldBill;

     public WebElement getPincodefieldBill() {
        return PincodefieldBill;
    }

     @FindBy(xpath="//button[@class='action action-update']")
 private WebElement Updateaddress;

@FindBy(xpath="//span[text()='My billing and shipping address are the same']")
 private WebElement Billingcheckbox;
 
 

     public WebElement getUpdateaddress() {
        return Updateaddress;
    }


    @FindBy(xpath="//button[@class='action action-select-shipping-item']")
    private WebElement Existingaddressincheckout;
 


     public WebElement getExistingaddressincheckout() {
        return Existingaddressincheckout;
    }


    
    @FindBy(xpath="//button[@class='action primary action-save-address']")
    private WebElement Shipphere;

    
    public WebElement getShipphere() {
        return Shipphere;
    }


    @FindBy(xpath="//button[@class='action action-show-popup']")
 private WebElement Addnewaddressincheckout;

    

     public WebElement getAddnewaddressincheckout() {
        return Addnewaddressincheckout;
    }


     @FindBy(xpath="(//input[@type='text'])[9]")
    private WebElement PincodefieldBill;

    @FindBy(xpath="(//input[@type='text'])[8]")
    private WebElement MobilenumberBill;



    public WebElement getCityfieldboxfieldBill() {
        return CityfieldboxfieldBill;
    }


    public WebElement getBulidingboxfieldBill() {
        return BulidingboxfieldBill;
    }


    public WebElement getStreetfieldBill() {
        return StreetfieldBill;
    }


    @FindBy(xpath="(//input[@type='text'])[10]")
    private WebElement Mobilenumberfield;

    public WebElement getMobilenumberfield() {
        return Mobilenumberfield;
    }


    
    @FindBy(xpath="(//input[@type='text'])[20]")
    private WebElement Mobilenumberfieldinpopup;


    public WebElement getMobilenumberfieldinpopup() {
        return Mobilenumberfieldinpopup;
    }


    
    @FindBy(xpath="(//input[@type='text'])[24]")
    private WebElement Streetfieldinpopup;

    @FindBy(xpath="(//input[@type='text'])[25]")
     private WebElement Bulidingboxinpopup;

     
    @FindBy(xpath="(//input[@type='text'])[26]")
     private WebElement Cityboxinpopup;

      
    @FindBy(xpath="(//input[@type='text'])[29]")
     private WebElement Pincodefieldinpopup;



 


    public WebElement getStreetfieldinpopup() {
        return Streetfieldinpopup;
    }


    public WebElement getBulidingboxinpopup() {
        return Bulidingboxinpopup;
    }


    public WebElement getCityboxinpopup() {
        return Cityboxinpopup;
    }


    @FindBy(xpath="(//input[@type='text'])[14]")
    private WebElement Streetfield;

    public WebElement getStreetfield() {
        return Streetfield;
    }

    @FindBy(xpath="(//input[@type='text'])[15]")
     private WebElement Bulidingbox;

    public WebElement getBulidingbox() {
        return Bulidingbox;
    }

      @FindBy(xpath="(//input[@type='text'])[19]")
     private WebElement Pincodefieldship;

    
     public WebElement getPincodefieldship() {
        return Pincodefieldship;
    }

    @FindBy(xpath="//input[@id='verify-mobile-number']")
     private WebElement MobilefieldforGuest;

     @FindBy(xpath=" //input[@id='BC27XME']")
     private WebElement MobilefieldforGuest1;

    

     public WebElement getMobilefieldforGuest1() {
        return MobilefieldforGuest1;
    }

     @FindBy(xpath="//input[@id='verify-updateotp']")
     private WebElement VerifiyOTPfield;

      @FindBy(xpath="//button[@class='submit-verify-otp-btn withresend pop-bnt']")
     private WebElement VerifiyOTPsubmitbtn;

     
      @FindBy(xpath="//button[@class='request-otp-btn-verify pop-bnt']")
     private WebElement GetOTPforGuest;


     
 @FindBy(xpath="//button[@ID='continue-to-payment-trigger']")
private WebElement Checknext;

public WebElement getChecknext() {
	return Checknext;
}
    

    public WebElement getGetOTPforGuest() {
        return GetOTPforGuest;
    }

    public WebElement getVerifiyOTPfield() {
        return VerifiyOTPfield;
    }

      public WebElement getVerifiyOTPsubmitbtn() {
          return VerifiyOTPsubmitbtn;
      }

    public WebElement getMobilefieldforGuest() {
        return MobilefieldforGuest;
    }

    @FindBy(xpath="(//div[@class='iti-arrow'])[1]")
    private WebElement dialcodedrop1ship; 

    @FindBy(xpath="(//div[@class='iti-arrow'])[2]")
    private WebElement countrycodeshipfirst; 

    @FindBy(xpath="(//div[@class='iti-arrow'])[4]")
    private WebElement countrycodeshipsecond;

        public WebElement getCountrycodeshipsecond() {
            return countrycodeshipsecond;
        }
	
	public WebElement getCountrycodeshipfirst() {
        return countrycodeshipfirst;
    }


    @FindBy(xpath="(//li[@class='country'])[98]")
    private WebElement Countrycode1ship; 




     public WebElement getDialcodedrop1ship() {
        return dialcodedrop1ship;
    }

    public WebElement getCountrycode1ship() {
        return Countrycode1ship;
    }


     @FindBy(xpath="(//input[@type='text'])[16]")
     private WebElement Cityfield;

     public WebElement getCityfield() {
         return Cityfield;
     }

    

     @FindBy(xpath="(//span[@class='selection'])[3]")
     private WebElement Statefield;

     public WebElement getStatefield() {
         return Statefield;
     }


     public WebElement getBillingcheckbox() {
         return Billingcheckbox;
     }


     public WebElement getMobilenumberBill() {
         return MobilenumberBill;
     }


     public WebElement getBillcountrycode1() {
         return Billcountrycode1;
     }


     public WebElement getPincodefieldinpopup() {
         return Pincodefieldinpopup;
     }


    

     


   

    


    
}