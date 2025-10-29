package org.Petitpages;

import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AKIstagepom extends Ultilityclass{
	
	
	public AKIstagepom() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='product-info-stock-sku']")
    private WebElement PDPNAME1; 
	

	@FindBy(xpath="(//a[@class='has-sub-cat '])[1]")
    private WebElement Categeorymenu; 

		@FindBy(xpath="(//a[@class='has-sub-cat '])[2]")
    private WebElement Categeorymenu2; 
	

	@FindBy(xpath="(//a[@class='has-sub-cat '])[3]")
    private WebElement Categeorymenu3; 
	
	
	@FindBy(xpath="//li[text()='6 Years']")
    private WebElement Sizepdp6; 
	
	
	public WebElement getSizepdp6() {
		return Sizepdp6;
	}
	
	

	public WebElement getCategeorymenu3() {
		return Categeorymenu3;
	}

	public WebElement getImgBoys25() {
		return ImgBoys25;
	}

	@FindBy(xpath="(//img[@class='primary-image'])[25]")
    private WebElement ImgBoys25;
	
	@FindBy(xpath="//span[@class='select2-selection__rendered']")
    private WebElement Sortdrop;
	

	public WebElement getLowasc() {
		return Lowasc;
	}
	
	@FindBy(xpath="(//li[@class='select2-results__option select2-results__option--selectable'])[5]")
    private WebElement Lowasc;
	
	@FindBy(xpath="//button[text()='Load more items']")
    private WebElement Lodemore;
	
	public WebElement getLodemore() {
		return Lodemore;
	}

	public WebElement getSortdrop() {
		return Sortdrop;
	}


	
	public WebElement getTshirtback() {
		return Tshirtback;
	}


	@FindBy(xpath="(//span[@class='level2-name sub-cat-name'])[50]")
    private WebElement Tshirtback;
	
	public WebElement getSmallboy() {
		return Smallboy;
	}

	@FindBy(xpath="(//span[@class='level2-name sub-cat-name'])[27]")
    private WebElement Smallboy;
	

	@FindBy(xpath="(//button[@class='accordion-button collapsed'])[2]")
    private WebElement Couponcode;
	

	public WebElement getCouponcodeapply() {
		return Couponcodeapply;
	}

	public WebElement getCoupontext() {
		return Coupontext;
	}

	@FindBy(xpath="//button[@class='action apply primary btn-yellow']")
    private WebElement Couponcodeapply;
	
	
	@FindBy(xpath="//input[@id='coupon_code']")
    private WebElement Coupontext;
	

	public WebElement getCouponcode() {
		return Couponcode;
	}

	@FindBy(xpath="(//span[@class='level2-name sub-cat-name'])[26]")
    private WebElement Bags;

	
   @FindBy(xpath="(//img[@class='primary-image'])[7]")
   private WebElement img12;
   


   
  @FindBy(xpath="(//img[@class='primary-image'])[1]")
   private WebElement img2;
  



   
   
 
   @FindBy(id="search")
   private WebElement searchbox; 
   
   
   @FindBy(xpath="(//img[@class='ProductImage-sc-r6p7z fITroU'])[1]")
   private WebElement searchrelatedproduct; 
   

   @FindBy(xpath="//a[@class='product photo product-item-photo']")
   private WebElement imgFilter1; 
      


	@FindBy(xpath="(//div[@class='filter-options-title'])[3]")
   private WebElement CategoeryFillter; 
  

    @FindBy(id="3379")
    private WebElement Categeory4;
  
    @FindBy(id="574")
    private WebElement Gender1;
  

	@FindBy(xpath="(//div[@class='filter-options-title'])[2]")
    private WebElement GenderFillter; 
	
	@FindBy(xpath="(//div[@class='Grid-sc-nsk1nd fQZGYK'])[1]")
    private WebElement SearchProductname; 
   
	@FindBy(xpath="(//a[@class='action toquickview add-to-cart'])[3]")
    private WebElement Quickview;
	
	public WebElement getPOPRATEQ() {
		return POPRATEQ;
	}

	@FindBy(xpath="(//span[@class='price'])[1]")
    private WebElement POPRATEQ;
	
	@FindBy(xpath="//li[@id='select2-configopt-result-oowf-928']")
    private WebElement Popsizevalue;

	
	public WebElement getConfirmationmess() {
		return Confirmationmess;
	}

	@FindBy(xpath="//p[text()=\"We'll email you an order confirmation with details and tracking info.\"]")
    private WebElement Confirmationmess;

	
	
	public WebElement getPopsizevalue() {
		return Popsizevalue;
	}

	@FindBy(xpath="(//span[@class='price-special'])[1]")
    private WebElement PLPrate284; 
	

	
	@FindBy(xpath="(//span[@class='price'])[1]")
    private WebElement PDPproductrate;


	@FindBy(xpath="(//span[@class='select2-selection__arrow'])[2]")
    private WebElement productsizedrop;
	

	public WebElement getProductsizevalue8() {
		return productsizevalue8;
	}


	@FindBy(xpath="(//li[@class='select2-results__option select2-results__option--selectable'])[4]")
    private WebElement productsizevalue8;
	
	@FindBy(xpath="//li[text()='3 Months']")
    private WebElement Productsize; 
	
	



	@FindBy(xpath="//li[text()='24 Months']")
    private WebElement dropvalue;
	
	



	

	@FindBy(xpath="//div[@class='product-info-stock-sku']")
    private WebElement popproductname;
	
	
	

	@FindBy(xpath="//span[@class='ref-no']")
    private WebElement cartproductRef;
	

	@FindBy(xpath="(//i[@class='icon_delete'])[1]")
    private WebElement cartdelete;
	
	@FindBy(xpath="//button[@class='cart-sub']")
    private WebElement cartsubtraction;
	
	
	@FindBy(xpath="(//a[text()=\"Babies' Pyjamas and 3-Pack of Floral Bodysuits\"])[2]")
    private WebElement cartpagePname1;

	@FindBy(xpath="(//a[text()='Cotton Rabbit Sleeping Bag'])[2]")
    private WebElement cartpagePname2;
	
	@FindBy(xpath="(//a[text()=\"Cotton Rabbit Sleeping Bag\"])[2]")
    private WebElement cartpagePname3;
		
  public WebElement getCartpagePname3() {
		return cartpagePname3;
	}

@FindBy(xpath="(//input[@type='email'])[2]")
   private WebElement Emailbox;
 
  
@FindBy(xpath="(//input[@type='text'])[2]")
  private WebElement Firstnamebox;
  
 @FindBy(xpath="(//input[@type='text'])[3]")
 private WebElement Lastnamebox;
 
 

 

 



@FindBy(xpath="(//input[@type='text'])[7]")
 private WebElement City;

 @FindBy(xpath="(//input[@type='text'])[8]")
 private WebElement zipcode;
 


 

 
 
 

 @FindBy(xpath="//li[text()='Dubai']")
 private WebElement Sdubai;
 


	
	
 
	public WebElement getVerifyotp1() {
		return Verifyotp1;
	}

	@FindBy(xpath="(//a[@id='mobile-update'])[1]")
    private WebElement Verifyotp1; 
	
	

	public WebElement getGetotp1submit() {
		return Getotp1submit;
	}

	@FindBy(xpath="//button[@class='submit-verify-otp-btn withresend pop-bnt']")
    private WebElement Getotp1submit; 
	

	@FindBy(xpath="//button[@class='request-otp-btn-verify pop-bnt']")
    private WebElement Getotp1; 

	

 
 

 

@FindBy(xpath="//span[text()='Low in stock: only 1 left.']")
 private WebElement Instock;
 
 


 
 @FindBy(xpath="//span[@id='cartcount3']")
 private WebElement cartitemcount;
 
@FindBy(xpath="//p[text()='4']")
 private WebElement checkoutitemcount;


@FindBy(xpath="(//button[@class='button action continue primary'])[2]")
 private WebElement paymentnext;
 



//Without discount cart page detail



@FindBy(xpath="(//table[@class='data table totals']//tr//td)[2]")
private WebElement CartShippingcharge;

public WebElement getCartLeftTotalprice() {
	return cartLeftTotalprice;
}

@FindBy(xpath="(//div[@class='right'])[1]")
 private WebElement cartLeftTotalprice;

public WebElement getCartShippingcharge() {
	return CartShippingcharge;
}

public WebElement getCpshippingcharge() {
	return Cpshippingcharge;
}




public WebElement getCartpagediscountshippings() {
	return Cartpagediscountshippings;
}




@FindBy(xpath="(//table[@class='data table totals']//tr//td)[4]")
private WebElement Cartpagediscountshippings;



@FindBy(xpath="(//table[@class='data table totals']//tr//td)[2]")
 private WebElement Cartpagediscount1;

 
@FindBy(xpath="(//table[@class='data table totals']//tr//td)[1]")
 private WebElement Cartpagediscountsubtotal;


public WebElement getCartpagediscountsubtotal() {
	return Cartpagediscountsubtotal;
}

public WebElement getCartpagediscount1() {
	return Cartpagediscount1;
}

@FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[3]")
private WebElement Subtotalcheckoutpage;

//checkout page discount



public WebElement getShippingcheckoutpagediscount() {
	return shippingcheckoutpagediscount;
}

public WebElement getDiscountcheckoutpagediscount() {
	return discountcheckoutpagediscount;
}

public WebElement getTotalcheckoutpagediscount() {
	return Totalcheckoutpagediscount;
}


@FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[1]")
private WebElement Subtotalcheckoutpagediscount;

public WebElement getSubtotalcheckoutpagediscount() {
	return Subtotalcheckoutpagediscount;
}

@FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[3]")
private WebElement shippingcheckoutpagediscount;

@FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[2]")
private WebElement discountcheckoutpagediscount;


@FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[4]")
private WebElement Totalcheckoutpagediscount;




@FindBy(xpath="(//table[@class='data table table-totals']//tr//td)[2]")
private WebElement Cpshippingcharge;

@FindBy(xpath="(//a[@class='list'])[1]")
private WebElement Orderdetailpage;


@FindBy(xpath="(//button[@class='button btn-reset'])[2]")
private WebElement Cancelpayment1;


@FindBy(xpath="(//button[@class='button btn-reset'])[1]")
private WebElement Cancelpayment2;

@FindBy(xpath="//button[@class='action cancel primary btn-yellow']")
 private WebElement Couponcancelbtn;



    public WebElement getCouponcancelbtn() {
    return Couponcancelbtn;

	}

@FindBy(xpath="//button[@id='cancel']")
private WebElement Cancelpayment3inpopup;

@FindBy(xpath="//div[@class='message info empty']")
private WebElement NoOrdermessage;







public WebElement getNoOrdermessage() {
	return NoOrdermessage;
}



public WebElement getCancelpayment3inpopup() {
	return Cancelpayment3inpopup;
}



public WebElement getCancelpayment1() {
	return Cancelpayment1;
}



public WebElement getCancelpayment2() {
	return Cancelpayment2;
}



public WebElement getCategeorymenu2() {
	return Categeorymenu2;
}





public WebElement getOrderdetailpage() {
	return Orderdetailpage;
}

@FindBy(xpath="(//input[@type='radio'])[2]")
private WebElement Cashoption;



@FindBy(xpath="//div[@class='actions-toolbar-trigger']")
private WebElement Placeordercheck;


public WebElement getCheckorderid() {
	return Checkorderid;
}

public WebElement getMyaccoutorderid() {
	return Myaccoutorderid;
}



@FindBy(xpath="(//div[@class='checkout-success']//following-sibling::p)[1]")
private WebElement Checkorderid;

@FindBy(xpath="(//div[@class='product-count']//following-sibling::p)[1]")
private WebElement Checkproductcount;


public WebElement getCheckproductcount() {
	return Checkproductcount;
}

@FindBy(xpath="(//span[@class='icon'])[1]")
private WebElement MyorderIcon;

public WebElement getUsername() {
	return username;
}

@FindBy(xpath="(//a[@class='list']//following-sibling::h4)[1]")
private WebElement Myaccoutorderid;

@FindBy(xpath="//div[@class='product-description']//following-sibling::h4")
private WebElement Myaccoutproductname;


public WebElement getMyaccoutproductname() {
	return Myaccoutproductname;
}

public WebElement getMyaccoutproductrate() {
	return Myaccoutproductrate;
}

public WebElement getMyaccoutproductQuantity() {
	return MyaccoutproductQuantity;
}

public WebElement getMyaccoutSummaryTotal() {
	return MyaccoutSummaryTotal;
}

public WebElement getMyaccoutpaiddetail() {
	return Myaccoutpaiddetail;
}

@FindBy(xpath="(//div[@class='product-description']//following-sibling::div)[4]")
private WebElement Myaccoutproductrate;


@FindBy(xpath="(//div[@class='product-description']//following-sibling::div)[5]")
private WebElement MyaccoutproductQuantity;


@FindBy(xpath="(//div[@class='order-summary']//following-sibling::span)[5]")
private WebElement MyaccoutSummaryTotal;


@FindBy(xpath="(//div[@class='order-type']//following-sibling::span)[2]")
private WebElement Myaccoutpaiddetail;


@FindBy(xpath="(//div[@class='order-summary']//following-sibling::span)[1]")
private WebElement MyacctotalQty;




public WebElement getMyacctotalQty() {
	return MyacctotalQty;
}



public WebElement getMyaccountTotalprice() {
	return MyaccountTotalprice;
}


@FindBy(xpath="//div[@class='theme-title']")
private WebElement username;

@FindBy(xpath="(//p[text()='Total:AED15.00'])[1]")
private WebElement MyaccountTotalprice;


	public WebElement getMyorderIcon() {
	return MyorderIcon;
}

	@FindBy(id="3166")
	 private WebElement categeoryFillter2;
	 
	 @FindBy(xpath="(//div[@class='filter-options-title'])[5]")
	 private WebElement SizeFillter; 
	  
	 @FindBy(xpath="//a[@title='8 Years']")
	 private WebElement SizeFillter8 ; 
	 
	
	@FindBy(xpath="//button[@name='place']")
	 private WebElement placeguest ; 
 
	

public WebElement getCartpagePname1() {
		return cartpagePname1;
	}

  public WebElement getSdubai() {
 	return Sdubai;
 }

  
  

	public WebElement getDropvalue() {
		return dropvalue;
	}


	public WebElement getCategoeryFillter() {
		return CategoeryFillter;
	}



	public WebElement getSearchbox() {
	return searchbox;
}


	 public WebElement getImg12() {
			return img12;
		}
	 public WebElement getGender1() {
			return Gender1;
		}
	 public WebElement getCategeory4() {
			return Categeory4;
		}
	 

		public WebElement getGenderFillter() {
		return GenderFillter;
	}
		public WebElement getSearchrelatedproduct() {
			return searchrelatedproduct;
		}
		
	

		   public WebElement getCategoerFillter() {
			return CategoeryFillter;
		}

		   public WebElement getCategeorymenu() {
				return Categeorymenu;
			}

		   public WebElement getImgFilter1() {
			return imgFilter1;
		}

			public WebElement getSearchProductname() {
				return SearchProductname;
			}

			
			public WebElement getQuickview() {
				return Quickview;
			}


			public WebElement getPLPrate284() {
				return PLPrate284;
			}

			public WebElement getProductsizedrop() {
				return productsizedrop;
			}


			public WebElement getProductsize() {
				return Productsize;
			}


	
			
			public WebElement getPDPNAME1() {
				return PDPNAME1;
			}
			public WebElement getPDPproductrate() {
				return PDPproductrate;
			}

		

			public WebElement getPopproductname() {
				return popproductname;
			}

		
			
			public WebElement getCartdelete() {
				return cartdelete;
			}
			

			public WebElement getCartsubtraction() {
				return cartsubtraction;
			}

			public WebElement getBags() {
				return Bags;
			}


			   public WebElement getImg2() {
				return img2;
			}

			   
			 
			
			    public WebElement getCartproductRef() {
					return cartproductRef;
				}
			    public WebElement getCartpagePname2() {
					return cartpagePname2;
				}

			    public WebElement getEmailbox() {
			 		return Emailbox;
			 	}
			    

			    public WebElement getFirstnamebox() {
			  	return Firstnamebox;
			  }




			  public WebElement getLastnamebox() {
			  	return Lastnamebox;
			  }



public WebElement getCity() {
	return City;
}

public WebElement getZipcode() {
	return zipcode;
}







public WebElement getCartitemcount() {
	return cartitemcount;
}


public WebElement getCheckoutitemcount() {
	return checkoutitemcount;
}

public WebElement getPaymentnext() {
	return paymentnext;
}


public WebElement getInstock() {
	return Instock;
}



public WebElement getCategeoryFillter2() {
return categeoryFillter2;
}

public WebElement getSizeFillter() {
return SizeFillter;
}

public WebElement getSizeFillter8() {
return SizeFillter8;
}



public WebElement getGetotp1() {
	return Getotp1;
}




public WebElement getSubtotalcheckoutpage() {
	return Subtotalcheckoutpage;
}


public WebElement getCashoption() {
	return Cashoption;
}

public WebElement getPlaceordercheck() {
	return Placeordercheck;
}


public WebElement getPlaceguest() {
	return placeguest;
}

}
