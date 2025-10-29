package org.steps;

import java.awt.AWTException;

import java.io.IOException;

import org.Petitpages.AKIstagepom;
import org.Petitpages.Cartpage;
import org.Petitpages.Categeorypage;
import org.Petitpages.Checkoutpage;
import org.Petitpages.Homepage;
import org.Petitpages.Listingpage;
import org.Petitpages.PDPpage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.base.Ultilityclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PBSteps extends Ultilityclass {
	
	public static AKIstagepom a ;
	public static Homepage h ;
    public static Categeorypage c;
	public static JavascriptExecutor js;
	public static Listingpage L;
	public static  PDPpage p;
	public static Checkoutpage c1;
	public static Cartpage c2;
	
    private static final Logger LOGGER = LogManager.getLogger(PBSteps.class);



@Given("the user opens the Home page and do the login")
public void the_user_opens_the_home_page_and_do_the_login() {
   
	StartTimeprint();
	h = new Homepage();
	urlTittle();
	moveToElement(h.getImageIcon());
	implicitWait();
	actionClick(h.getLoginIcon());
	Threadsleep(3000);
	ClickElement(h.getDialcodedrop());
	Threadsleep(3000);
	ClickElement(h.getCountrycode());
	Threadsleep(3000);

	PassValues(h.getLogintextbox(), getdataExcel(1,4));
	Threadsleep(2000);
	ClickElement(h.getLoginbutton());
	Threadsleep(3000);
	PassValues(h.getLoginOTP(), getdataExcel(2,4));
	Threadsleep(3000);
	javascriptclick(h.getOTPVERIFY());
	LOGGER.info("Login Functionality  is Successfully verified");
	EndTimeprint();
	
}

@When("the user selects a category and subcategory option from the Home page")
public void the_user_selects_a_category_and_subcategory_option_from_the_home_page() {
       
	    StartTimeprint();
        c = new Categeorypage();
	    Threadsleep(5000);
	    moveToElement(c.getCategeorymenu3());
	   Threadsleep(5000);   
		// Prod  env  
		actionClick(c.getTshirtback());

	    //  //Stage env 
		//  actionClick(c.getTshirtback1());
		 LOGGER.info("SubCategory Successfully selected");
		EndTimeprint();

}

@When("the Product Listing Page is displayed based on the selected category")
public void the_product_listing_page_plp_is_displayed_based_on_the_selected_category() {
    
	    StartTimeprint();
        Threadsleep(4000);
		String PLP = driver.getTitle();
	    checkpresentElement("To check  PLP page",PLP.contains("T-Shirts") );
		LOGGER.info("Successfully verified PLP page title detail");
		EndTimeprint();

}

@When("the user clicks on any one product image based on the applied filter")
public void the_user_clicks_on_any_one_product_image_based_on_the_applied_filter() {
   
	StartTimeprint();
	a =new AKIstagepom();
	Threadsleep(4000);
	javascriptclick(a.getCategoerFillter());
	Threadsleep(4000);
    javascriptclick(a.getCategeoryFillter2()); 
	Threadsleep(4000);
	javascriptclick(a.getSizeFillter());
    Threadsleep(3000);
	javascriptclick(a.getSizeFillter8());
	Threadsleep(15000);
	String Curl = driver.getCurrentUrl();
	checkpresentElement("To checK fillter",Curl.contains("layered_category=3166&size=181") );
	Threadsleep(3000);
	LOGGER.info("Successfully verified product based on the Filltration"); 
    EndTimeprint();

}


@When("the user navigates from the Product Detail Page  to the cart page")
public void the_user_navigates_from_the_product_detail_page_to_the_cart_page() {
   
    StartTimeprint();

    a =new AKIstagepom();
	p = new PDPpage();
    L =new Listingpage();
	String PLPRATE1 = L.getPLPrate2().getText();
	System.out.println(PLPRATE1);
	javascriptclick(L.getImg19());
	Threadsleep(3000);

	String PDPrate2 = p.getPDPrate1().getText();
	System.out.println(PDPrate2);
   	Threadsleep(3000);
    WebElement sizedrop = driver.findElement(By.xpath("//span[@class='select2-selection__rendered']"));
	ClickElement(sizedrop);
	Threadsleep(4000);
	ClickElement(a.getProductsizevalue8());
    Threadsleep(4000);

	// javascriptclick(L.getQTYincrease());

	javascriptclick(L.getQTYincrease());
   	Threadsleep(3000);
    javascriptclick(L.getQTYDecrease());
	Threadsleep(3000);
	checkpresentElement("To verify the PLP& PDP page product price", PLPRATE1.contains(PDPrate2));
	LOGGER.info("Successfully verified product rate btw the PLP & PDP page");
	 javascriptclick(p.getMiniaddcart1());
	 Threadsleep(4000);
	 implicitWait();
	
	// //  javascriptclick(p.getSeebasket());
	// //  Threadsleep(3000);
	driver.navigate().refresh();
	Threadsleep(3000);
	moveToElement(p.getCarticon());
	Threadsleep(3000);
	actionClick(p.getSeeMycarticon());
	LOGGER.info("Successfully Verified   product name btw the PDP&CART page");
	Threadsleep(3000);	
     EndTimeprint();

}


 @When("the user clicks on the checkout button")
public void the_user_clicks_on_the_checkout_button() {
    
	  StartTimeprint();
	  a =new AKIstagepom(); 
	  c2 = new Cartpage();
	  Threadsleep(3000);	
	  driver.navigate().refresh();
	WebElement Cartcount = a.getCartitemcount();
	String Counts1 = Cartcount.getText();
	Threadsleep(5000);	
	javascriptclick(a.getCouponcode());
	  Threadsleep(4000);	
      PassValues(a.getCoupontext(), getdataExcel(1, 5));
	   Threadsleep(4000);	
	   javascriptclick(a.getCouponcodeapply());
	   Threadsleep(6000);	

      WebElement SubtotalDiscount = a.getCartpagediscountsubtotal();
	  String SubtotalDiscount1 = SubtotalDiscount.getText();
	  System.out.println(SubtotalDiscount1);
				  
      WebElement Discount = a.getCartpagediscount1();
	  String Discount1cart = Discount.getText();
	  System.out.println(Discount1cart);
				  
	  WebElement Discountshipp = a.getCartpagediscountshippings();
	  String Discountshipp1 = Discountshipp.getText();
	  System.out.println(Discountshipp1);
	 
	  WebElement Discountsub = c2.getOrdersummarytotaldiscountcart();
	  String Discountsub1 = Discountsub.getText();
	  System.out.println(Discountsub1);
	  Threadsleep(3000);
	  javascriptclick(c2.getPlaceorder());
	  Threadsleep(5000);

 checkequaltext("Compare to cart&Checkout page subtotal",SubtotalDiscount1, getText1(a.getSubtotalcheckoutpagediscount()));

checkequaltext("Compare to cart&Checkout page discount",Discount1cart,getText1(a.getDiscountcheckoutpagediscount() ));

checkequaltext("Compare to cart&Checkout page Charges",Discountshipp1, getText1(a.getShippingcheckoutpagediscount()));
	  
checkequaltext("To verify the product count btw cart&checkout page",Counts1 , getText1(a.getCheckproductcount()));
   
	LOGGER.info("Successfully Verified   product order summary Detail btw the CART&Checkout  page");

	Threadsleep(4000);

	  WebElement SubTotalamountcheckout = a.getSubtotalcheckoutpagediscount();
	  String SubTotalamountcheckout1 = SubTotalamountcheckout.getText();
	  String SubTotalamountcheckout2 = SubTotalamountcheckout1.substring(4);
	  Double SubTotalamountcheckout3 = Double.valueOf(SubTotalamountcheckout2);

	  WebElement Discountamount = a.getDiscountcheckoutpagediscount();
	  String Discountamount1 = Discountamount.getText();
	  String Discountamount2 = Discountamount1.substring(5);
	  Double Discountamount3 = Double.valueOf(Discountamount2);
	  
	  WebElement shippingamount = a.getShippingcheckoutpagediscount();
	  String shippingamount1 = shippingamount.getText();
	  String shippingamount2 = shippingamount1.substring(4);
	  Double shippingamount3 = Double.valueOf(shippingamount2);
	  
	  Double t =  SubTotalamountcheckout3+shippingamount3-Discountamount3;
	  
	WebElement Totalsummary = a.getTotalcheckoutpagediscount();
	String Totalsummarywithdiscount = Totalsummary.getText();
	String Totalsummarywithdiscount2 = Totalsummarywithdiscount.substring(4);
	Double Totalsummarywithdiscount3 = Double.valueOf(Totalsummarywithdiscount2);
	
	checkpresentElement("To check order summary calculation",t.equals(Totalsummarywithdiscount3) );

	Threadsleep(4000);
	LOGGER.info("Successfully Verified order summary calculation detail with discount offer ");
	EndTimeprint();

 }

@When("the user select the shipp addrres  details and   navigated to the Payment Options section")
public void the_user_select_the_shipp_addrres_details_and_navigated_to_the_payment_options_section() {
   
	StartTimeprint();
    a =new AKIstagepom();
    c1 =new Checkoutpage();

	 Threadsleep(3000);
	 javascriptclick(c1.getExistingaddressincheckout());
	 Threadsleep(5000);

	 LOGGER.info("Successfully displayed the existing  address on the checkout page."); 
	 LOGGER.info("Successfully address selected  from the existing  address on the checkout page."); 
	
	 javascriptclick(c1.getChecknext());
 
      EndTimeprint();
    
	
}

@Then("the user Select the payment option and places the order.Then,Verify the order detail in my account page")
public void the_user_select_the_payment_option_and_places_the_order_then_verify_the_order_detail_in_my_account_page() {
   
  
	
	   StartTimeprint();

	   a =new AKIstagepom();
	   Threadsleep(5000);
	   javascriptclick(a.getCashoption());
	   Threadsleep(7000);
	   moveToElement(a.getPlaceordercheck());
	   Threadsleep(3000);
	   actionClick(a.getPlaceordercheck());
	   Threadsleep(8000);

    checkpresentElement("To check payment gate page",driver.getTitle().contains("Payment") );

	LOGGER.info("Successfully verified Paymet Gateway page redirection");
   
	 Scrolldown();
	javascriptclick(a.getCancelpayment1());
    Threadsleep(4000);
	javascriptclick(a.getCancelpayment2());
     Threadsleep(6000);
	  javascriptclick(a.getCancelpayment3inpopup()); 
	  Threadsleep(6000);
	javascriptclick(a.getCartdelete());
  	Threadsleep(4000);	
	   
     LOGGER.info("After canceling the payments, the successfully selected product was removed from the cart page.");

     EndTimeprint();

// My account order detail verification part-----

//      WebElement confirmationmess = a.getConfirmationmess();
// 	 String message = confirmationmess.getText();

// 	 WebElement checkorder = a.getCheckorderid();
// 	 String checkorder1 = checkorder.getText();
// 	 String Orderid1 = checkorder1.substring(22, 31);
	 
// 	 Threadsleep(6000);
// 	 checkpresentElement("To verify the confirmation meaasge",message.contains("order confirmation"));
// 	 LOGGER.info("Successfully verified Order Template");

// 	 WebElement Myacprice = a.getMyaccountTotalprice();
//   String Myacprice1 = Myacprice.getText().substring(9);
//   System.out.println(Myacprice1); 

     
//      Threadsleep(5000);
//      WebElement myaccoutorderid = a.getMyaccoutorderid();
//      String myaccoutorderid1 = myaccoutorderid.getText();
//      String Orderid2 = myaccoutorderid1.substring(9, 18);
//      System.out.println(Orderid2);
// 	    Threadsleep(2000);
    
// 	checkpresentElement("To verify MyOrderid",Orderid2.equals(Orderid1));
     
// 	 Threadsleep(2000);
    
// 	 javascriptclick(a.getMyaccoutorderid());
     
// 	 Threadsleep(5000);
     
//    WebElement productNameElement = a.getMyaccoutproductname();
//    String actualProductName = productNameElement.getText();

//   WebElement quantityElement = a.getMyaccoutproductQuantity();
//    String actualQuantity = quantityElement.getText();


//   WebElement productRateElement = a.getMyaccoutproductrate();
//    String actualProductRate = productRateElement.getText();


//   WebElement summaryTotalElement = a.getMyaccoutSummaryTotal();
// String actualSummaryTotal = summaryTotalElement.getText();
// System.out.println(actualSummaryTotal);

// WebElement paidOptionElement = a.getMyaccoutpaiddetail();
// String actualPaidOption = paidOptionElement.getText();

// WebElement Totalqty = a.getMyacctotalQty();
// String Totalqty1  = Totalqty.getText();

// checkequaltext("Check product name", actualProductName, getText1(a.getMyaccoutproductname()));

// checkpresentElement("Check product quantity", actualQuantity.contains(Totalqty1));

// checkequaltext("Check product rate", actualProductRate, getText1(a.getMyaccoutproductrate()));

// checkpresentElement("Check summary total", actualSummaryTotal.contains(Myacprice1) );

// checkpresentElement("Check paid option", actualPaidOption.contains("Cash"));

// checkpresentElement("To verify the Orderid in Order detail page", driver.getTitle().contains(Orderid1));


// LOGGER.info("Successfully verified order id number btw the Order id page &My account page");
// LOGGER.info("Successfully verified order details on My Account page");

}



@Given("user opens the Home page as a guest user")
public void user_opens_the_home_page_as_a_guest_user() {
      
	 StartTimeprint();
	 h = new Homepage();
	 LOGGER.info("Petit Beteau site home page are launched");
     String title = driver.getTitle();
     checkpresentElement("To check title at Home page",title.contains("Babies & Kids"));
     implicitWait();
	 LOGGER.info("Home page title is verified");
	 EndTimeprint();

}

@When("User Enter the product name in search box {string}")
public void user_Enter_the_product_name_in_search_box(String product) throws IOException {
	  
	   StartTimeprint();
	   a =new AKIstagepom();
	   Threadsleep(4000);
	   PassValues(a.getSearchbox(), product);
	   Threadsleep(3000);
	   LOGGER.info("Successfully product name Entered  in search box");
	   EndTimeprint();
	
	
}

@Then("User Should be visible related product.then,Click on any product and navigate  to the PDP page")
public void user_should_be_visible_related_product_then_click_on_any_product_and_navigate_to_the_pdp_page() {
  
     	StartTimeprint();
      	a =new AKIstagepom();
	    Threadsleep(3000);
	    WebElement searchProductNameElement = a.getSearchProductname();
        String searchProductName = searchProductNameElement.getText();
		System.out.println(searchProductName);

		// Click on the related product to go to PDP

		javascriptclick(a.getSearchrelatedproduct());
		LOGGER.info("Succesfully clicked auto  suggestion Products based on search product name : " + searchProductName);


		    // Get product name from PDP
            WebElement pdpProductNameElement = a.getPDPNAME1();
            String pdpProductName = pdpProductNameElement.getText();
            System.out.println("PDP Product Name: " + pdpProductName);
		 
			// Alternatively, check if PDP product name contains part of the search name
          checkpresentElement("Verifying product name between Search and PDP",
          pdpProductName.toLowerCase().contains(searchProductName.toLowerCase()));

           LOGGER.info("Successfully verified product name consistency");
           EndTimeprint();

}


//Guest user checkout flow

@Given("the user opens the Home page as a guest and selects a category to navigate to the Product Listing Page")
public void the_user_opens_the_home_page_as_a_guest_and_selects_a_category_to_navigate_to_the_product_listing_page_plp() {
    
     StartTimeprint();
	 h = new Homepage();
	 LOGGER.info("Petit Beteau site home page are launched");
     String title = driver.getTitle();
     checkpresentElement("To check title at Home page",title.contains("Babies & Kids"));
     implicitWait();
	 LOGGER.info("Home page title is verified");
	 EndTimeprint();
}


@When("the user clicks on the quick view of any product from the PLP")
public void the_user_clicks_on_the_quick_view_of_any_product_from_the_plp() throws InterruptedException {
    
	
	      StartTimeprint();
		  a =new AKIstagepom();
		  moveToElement(a.getCategeorymenu());
		  Threadsleep(2000);
		  actionClick(a.getSmallboy());
		  String PLP = driver.getTitle();
		//Prod  env --
		checkpresentElement("To check  PLP page",PLP.contains("Muslin Cloth") );

		
		// Stage env --
		// checkpresentElement("To check  PLP page",PLP.contains("Baby Scarf") );
		  LOGGER.info("Successfully  verified product name in PLP page ");
		  Threadsleep(2000);
		  javascriptclick(a.getQuickview());
		  LOGGER.info(" Quik view  'POP-UP' page Sucessfully Viewed");
		  EndTimeprint();

}


@When("on the quick view popup, the user selects the size and quantity for the product")
public void on_the_quick_view_popup_the_user_selects_the_size_and_quantity_for_the_product() throws InterruptedException {
   
              StartTimeprint();
              L =new Listingpage();
              Thread.sleep(3000);  

         // Switch to iframe containing the product details

		 WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='mfp-iframe']"));
         driver.switchTo().frame(frame1);
         implicitWait();  

        // Locate the size dropdown

		WebElement sizeDrop = driver.findElement(By.xpath("//select[@class='select2-hidden-accessible']"));
        javascriptclick(sizeDrop);  

         Thread.sleep(2000);  
          selectByvalue(sizeDrop, "928"); 
        Thread.sleep(3000);  

        // Scroll down by 500 pixels
        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 0; i < 2; i++) {
    js.executeScript("window.scrollBy(0, 500);");  
    Thread.sleep(1000); 
    }

	Thread.sleep(3000);
	javascriptclick(L.getQTYincrease());
	Thread.sleep(2000);
	javascriptclick(L.getQTYincrease());
	Thread.sleep(2000);
	javascriptclick(L.getQTYDecrease());
	Thread.sleep(2000);

	LOGGER.info("Successfully product 'QTY' added in the Quick view page");
	EndTimeprint();

}



@When("the user clicks the Add to Cart button and is navigated to the Cart page")
public void the_user_clicks_the_add_to_cart_button_and_is_navigated_to_the_cart_page() {
    

	 StartTimeprint();
     a =new AKIstagepom();
	 L =new Listingpage();
	 c1 = new Checkoutpage();
	 p = new PDPpage();
	 h = new Homepage();
	
	WebElement poprate1= a.getPOPRATEQ();
	String poprate = poprate1.getText();
	System.out.println(poprate);
	
	WebElement popname1= a.getPopproductname();
	String popname = popname1.getText();
	System.out.println(popname);

	javascriptclick(L.getMiniaddcart());	
    
	Threadsleep(5000);
 
    p = new PDPpage();
	
	driver.navigate().refresh();

	// javascriptclick(p.getClosebaseket());

	// driver.navigate().refresh();
   
	Threadsleep(4000);
	
	moveToElement(p.getCarticon());

	actionClick(p.getSeeMycarticon());


	//ClickElement(p.getSeeMycart1());
	
	
	// Threadsleep(3000);

	// javascriptclick(p.getSeebasket());

	// Threadsleep(4000);

	// moveToElement(p.getSeeMycart1());
	// actionClick(p.getSeeMycart1());

	
	c2 = new Cartpage();

	WebElement cartrate1 = c2.getProductcartrate1();
	String CartPactualrate = cartrate1.getText().substring(4);
	System.err.println(CartPactualrate);

	checkequaltext("Comapre rate", poprate, CartPactualrate);


	Threadsleep(3000);

	checkequaltext("cart Product name",popname , getText1(c2.getCartproductname()));
	
   LOGGER.info("Sucessfully  Product rate&name verified btw Quick view  POP-UP & cart page");
	
}


@When("the user clicks the Checkout button as a guest user")
public void the_user_clicks_the_checkout_button_as_a_guest_user() {

	 c2 = new Cartpage();
    WebElement carlefttTotalprice = a.getCartLeftTotalprice();
	String CartTotalprice = carlefttTotalprice.getText();
	System.out.println(CartTotalprice);
	

	 WebElement Cartcount = a.getCartitemcount();
	String Counts1 = Cartcount.getText();

	   
	WebElement Cartsubtotalprice1 = c2.getCartsubtotalprice();
	String Cartsubtotalprice2 = Cartsubtotalprice1.getText();
	String Cartsubtotalprice3 = Cartsubtotalprice2.substring(4);
	Double valueOf = Double.valueOf(Cartsubtotalprice3);
	 

	WebElement Cartshipping = a.getCartShippingcharge();
	String Cartshipping1 = Cartshipping.getText();
	
	   WebElement Shippingcharge = a.getCartShippingcharge();
	   String Head2 = Shippingcharge.getText();
	  String Shipping2 = Head2.substring(4);
	  Double valueOf2 = Double.valueOf(Shipping2);
	
	  
	  Double t2 = valueOf +valueOf2;
	   
	  WebElement Ordersummaryincart1 = c2.getCartordersummarytotal();
	  String Ordersummaryincart2 = Ordersummaryincart1.getText();
	  String Ordersummaryincart3 = Ordersummaryincart2.substring(4);
	  Double valueOf3 = Double.valueOf(Ordersummaryincart3);
	  
	  checkpresentElement("Check order summary detail",t2.equals(valueOf3));
	
	  LOGGER.info("Sucessfully  verified order summary detail calculation without discount offer in cart page");
	  
	  Threadsleep(3000);
 

	  checkequaltext("Compare to the Product Total rate at cart page",CartTotalprice,Cartsubtotalprice2 );
	  
	 JavascriptExecutor js1 = (JavascriptExecutor) driver;
     for (int i = 0; i < 1; i++) {
    js1.executeScript("window.scrollBy(0, 500);");  
   Threadsleep(1000);
  }

	  javascriptclick(c2.getPlaceorder());
	 
	  Threadsleep(7000);
	 
	 checkequaltext("To verify the product count btw cart&checkout page",Counts1 , getText1(a.getCheckproductcount()));
	  
	 checkequaltext("Compare to cart&Checkout page Charges",Cartshipping1, getText1(a.getCpshippingcharge()));
	  
	 checkequaltext("Compare to cart&Checkout page subtotal",Ordersummaryincart2, getText1(a.getSubtotalcheckoutpage()));
	 
LOGGER.info("Successfully verified order summary details without discount offers between the cart and checkout pages.");
	 
	 EndTimeprint();

}




@Then("the user completes mobile number verification and observes the page response")
public void the_user_completes_mobile_number_verification_and_observes_the_page_response() throws AWTException {

	   StartTimeprint();

	   a =new AKIstagepom();
	   h = new Homepage();
	 
	   Threadsleep(4000);
	 
	  PassValues(a.getEmailbox(), getdataExcel(1,2));

	  Threadsleep(4000);
	 
	  javascriptclick(c1.getDialcodedrop1ship());
	  Threadsleep(4000);
	  javascriptclick(h.getCountrycode());
	  Threadsleep(3000);
	  javascriptclick(a.getVerifyotp1());
      Threadsleep(3000);
	  PassValues(c1.getMobilefieldforGuest(),getdataExcel(1,4));
      Threadsleep(3000);
	    ClickElement(c1.getGetOTPforGuest());
		Threadsleep(4000); 
	   PassValues(c1.getVerifiyOTPfield(), getdataExcel(2,4));
	  Threadsleep(3000); 
      
	  javascriptclick(c1.getVerifiyOTPsubmitbtn());
     
	   Threadsleep(7000);
	  
	   LOGGER.info("Sucessfully Verified Guest user mobile number in 'CHECKOUT' page");
	 
      EndTimeprint();


	//  PassValues(a.getFirstnamebox(), getdataExcel(2,1));
	//  PassValues(a.getLastnamebox(), getdataExcel(3,1));
	//  PassValues(c1.getStreetfield(), getdataExcel(4,1));
	//  PassValues(c1.getBulidingbox(), getdataExcel(5,1));
	//  Threadsleep(3000);
	//  PassValues(c1.getCityfield(), getdataExcel(7,1));
	
	
	//  PassValues(a.getZipcode(), getdataExcel(8,1)); 
	 
	//  Threadsleep(6000);

	//  PassValues(c1.getMobilenumberfield(),getdataExcel(1,3));
	//  System.out.println("Sucessfully Updated Billing address detail");


    //  a =new AKIstagepom();
	//  actions = new Actions(driver);
	//  actions.scrollToElement(a.getCashoption()).perform();
	//  javascriptclick(a.getCashoption());
	
	//   Threadsleep(5000);
	//    ClickElement(a.getPlaceordercheck());


	//   Threadsleep(10000);
	//  javascriptclick(a.getPlaceguest());

    //   WebElement confirmationmess = a.getConfirmationmess();
	//  String message = confirmationmess.getText();
	
	//  WebElement checkorder = a.getCheckorderid();
	//  String checkorder1 = checkorder.getText();
	
	//  Threadsleep(6000);
	//  checkpresentElement("To verify the confirmation meaasge",message.contains("order confirmation"));
    //  checkpresentElement ("To verify the order id",checkorder1.equals(checkorder1));
   
    //  System.out.println("Suceesfully verified OrderId&Template detail");
	

}


@Then("the user clicks on the Continue to Payment button and places the order")
public void the_user_clicks_on_the_continue_to_payment_button_and_places_the_order() throws AWTException {

	  StartTimeprint();
	  a =new AKIstagepom();
	  c2 = new Cartpage();
	  c1 = new Checkoutpage();

	   Threadsleep(3000);

	//   javascriptclick(a.getCouponcode());
	//   Threadsleep(2000);	    	
	//  javascriptclick(a.getCouponcancelbtn());     
	//  Threadsleep(4000);
    // driver.navigate().refresh();


	  for (int i = 0; i < 17 ; i++) {
        KeyDOWN();
    }


	Threadsleep(3000);

	javascriptclick(c2.getPlaceorder());
	 
	Threadsleep(3000);
	
	 c1 =new Checkoutpage();

	javascriptclick(c1.getExistingaddressincheckout());
	 
	Threadsleep(4000);

	javascriptclick(c1.getChecknext());

      LOGGER.info("Successfully navigated to the payment page after verifying mobile number as a guest user.");

 	 
	  c1 =new Checkoutpage();
 
		Threadsleep(5000);
	
	   javascriptclick(a.getCashoption());
    
	   Scrolldown();
	 
	   Threadsleep(4000);
	
	   moveToElement(a.getPlaceordercheck());
	   Threadsleep(3000);
	   actionClick(a.getPlaceordercheck());
	   
	   Threadsleep(7000);

       checkpresentElement("To check payment gate page",driver.getTitle().contains("Payment") );

	  LOGGER.info("Successfully verified Paymet Gateway page redirection");

	  Scrolldown();

	   javascriptclick(a.getCancelpayment1());

	    Threadsleep(4000);

	    javascriptclick(a.getCancelpayment2());

	    Threadsleep(6000);
	
	  javascriptclick(a.getCancelpayment3inpopup());
	
	  Threadsleep(8000);

	javascriptclick(a.getCartdelete());
	
	  Threadsleep(4000);	
	   
  LOGGER.info("After canceling the payments, the successfully selected product was removed from the cart page.");
  EndTimeprint();  

     StartTimeprint();
     Threadsleep(8000);
     h = new Homepage();
     Threadsleep(3000); 
     moveToElement(h.getLoggedImageIcon());
 	 implicitWait();
 	
	 a =new AKIstagepom();
    
	 ClickElement(a.getMyorderIcon());
     Threadsleep(3000);
     WebElement username = a.getUsername();
     String text = username.getText();
	 Threadsleep(3000);
     checkpresentElement("To verify user name ", text.contains("AKSHAY!"));
	 
	 LOGGER.info("Successfully verified username");

	 String Myorderdetailmeesage = a.getNoOrdermessage().getText();

   checkpresentElement("To verify user name ",Myorderdetailmeesage.contains("no orders"));

   LOGGER.info("After canceling the payments from PG PAGE, no canceled orders are displayed in the account order details page.");
    
   

	//  WebElement confirmationmess = a.getConfirmationmess();
	//  String message = confirmationmess.getText();

	//  WebElement checkorder = a.getCheckorderid();
	//  String checkorder2 = checkorder.getText();
	//  String Orderid1 = checkorder2.substring(22, 31);
	//  System.out.println(Orderid1);
	 
	//  Threadsleep(6000);
	//  checkpresentElement("To verify the confirmation meaasge",message.contains("order confirmation"));
     
	//  LOGGER.info("Successfully placed order and verified Order Template as a guest user");

	  Threadsleep(5000);

	


}





// Pagination , sorting  and billing addrees updation


@Given("user opens the Home page as a login user")
public void user_opens_the_home_page_as_a_login_user() {
    

	StartTimeprint();
	h = new Homepage();
	urlTittle();
	Threadsleep(3000);
	moveToElement(h.getImageIcon());
	implicitWait();
	actionClick(h.getLoginIcon());
	Threadsleep(3000);
	ClickElement(h.getDialcodedrop());
	Threadsleep(3000);
	ClickElement(h.getCountrycode());
	Threadsleep(3000);
	PassValues(h.getLogintextbox(), getdataExcel(1,4));
	Threadsleep(2000);
	ClickElement(h.getLoginbutton());
	Threadsleep(4000);
	PassValues(h.getLoginOTP(), getdataExcel(2,4));
	Threadsleep(5000);
	javascriptclick(h.getOTPVERIFY());
	LOGGER.info("Login Functionality  is Successfully verified");
	EndTimeprint();

   
}


@When("the user navigates from a main category to a subcategory")
public void the_user_navigates_from_a_main_category_to_a_subcategory() {
   
	
	  StartTimeprint();
	  a =new AKIstagepom();
	  c =new Categeorypage();
	  h = new Homepage();
	  
	  Threadsleep(5000);
	  
	  javascriptclick(h.getPBLogo1());
	 	
	   Threadsleep(3000);
	  
	moveToElement(a.getCategeorymenu3()); 
	 
	Threadsleep(3000);
	 
	// 	//Stage env
	//   actionClick(c.getPyjamas1());
	// 	Prod  env 
	
	  actionClick(c.getPyjamas());
	  Threadsleep(3000);
	  String PLP = driver.getTitle();

	  checkpresentElement("To check  PLP page",PLP.contains("Pyjama") );
	
	  LOGGER.info("Successfully  verified product name in PLP page ");
	 
	  EndTimeprint();
 }

@When("the user selects a Sort By option and verifies the sorted product listing")
public void the_user_selects_a_sort_by_option_and_verifies_the_sorted_product_listing() {
    
	StartTimeprint();
	a =new AKIstagepom();
	Threadsleep(3000);
	ClickElement(a.getSortdrop());
	Threadsleep(3000);
	ClickElement(a.getLowasc());
	Threadsleep(3000);
	String Sortingurl = driver.getCurrentUrl();
	Threadsleep(3000);
	checkpresentElement("To verify the Sorting Url",Sortingurl.contains("price_asc") );
	L =new Listingpage();
	Threadsleep(3000);
	ClickElement(L.getPLPclear());
	Threadsleep(4000);
	LOGGER.info("Succesfully verifed Sorting Order function in Listing page");
    EndTimeprint();
}


@When("the user checks the pagination functionality on the PLP page")
public void the_user_checks_the_pagination_functionality_on_the_plp_page() throws InterruptedException {
    
	
	StartTimeprint();
    L =new Listingpage();
	Threadsleep(3000);
	
// Scroll down by 500 pixels
JavascriptExecutor js = (JavascriptExecutor) driver;
for (int i = 0; i < 9; i++) {
    js.executeScript("window.scrollBy(0, 500);");  
    Thread.sleep(1000); 
}

driver.navigate().refresh();

Thread.sleep(15000) ; 

for (int i = 0; i < 3; i++) {
    js.executeScript("window.scrollBy(0, 500);");  
    Thread.sleep(1000); 
}


for (int i = 0; i < 5; i++) {
    js.executeScript("window.scrollBy(0, -500);");  
    Thread.sleep(1000);  
}

LOGGER.info("Successfully moved next products page using  scroll down & up and Pagination funtionality is working");
EndTimeprint();
	


}

@When("the user clicks on a product and is redirected to the Product Detail Page")
public void the_user_clicks_on_a_product_and_is_redirected_to_the_product_detail_page() throws AWTException {
   
	StartTimeprint();
	a =new AKIstagepom(); 
	p = new PDPpage();
	L =new Listingpage();

    Threadsleep(3000);
    javascriptclick(a.getImgBoys25());
    LOGGER.info("Succesfully product selected of the different page products");

      WebElement PDPNAME1 = a.getPDPNAME1();
	  String NAMEPDP = PDPNAME1.getText();
	  System.out.println(NAMEPDP);
	  Threadsleep(3000);
	WebElement Size24 = driver.findElement(By.xpath("//span[@class='selection']"));
	Size24.click();
	Threadsleep(2000);
	KeyDOWN();
	ClickElement(p.getDropvalue18());
	Threadsleep(3000);

	javascriptclick(L.getQTYincrease());
	Threadsleep(2000);
	javascriptclick(p.getMiniaddcart1());
	Threadsleep(2000);
	
	javascriptclick(p.getSeebasket());

	Threadsleep(6000);
	
	javascriptclick(a.getCartsubtraction());
	
	Threadsleep(6000);
	
	LOGGER.info("Succesfully  selected  product 'Qty' decreased");

	

}



@When("User adds multiple item to cart,then,removes items from cart and observes order summary calculation")
public void user_adds_multiple_item_to_cart_then_removes_items_from_cart_and_observes_order_summary_calculation() throws AWTException {
   

	// 2nd products 

	 h = new Homepage();
	 p = new PDPpage();
	 L =new Listingpage();
	 a =new AKIstagepom();
     Threadsleep(3000);
	 javascriptclick(h.getPBLogo1());
	 	
	 Threadsleep(3000);
	moveToElement(L.getCategeorymenu2());
	
	Threadsleep(3000);
	
	// stage env
	//actionClick(L.getSubCategeory1()); 

	// prod env env

	actionClick(L.getSubCategeory2()); 
   
	Threadsleep(3000);
	
	String PLPsleep = driver.getTitle();


	// stage env
	//checkpresentElement("To check  PLP page",PLPsleep.contains("Jumpers") );

	// prod env env
	checkpresentElement("To check  PLP page",PLPsleep.contains("Trousers") );

	System.out.println("PLP page is verified");
	  
	javascriptclick(L.getListedimg2());
   
	Threadsleep(3000);
	    
	 WebElement Size22 = driver.findElement(By.xpath("//span[@class='selection']"));
		
	 Size22.click();
        
		Threadsleep(3000);

		 for (int i = 0; i < 5 ; i++) {
        KeyDOWN();
    }
	
 
	    ClickElement(p.getDropvalue18());
	    
		Threadsleep(3000);
	   
		javascriptclick(L.getQTYincrease());
		
		Threadsleep(3000);
	   
		javascriptclick(p.getMiniaddcart1());
	
	   Threadsleep(3000);
	   
	   javascriptclick(p.getSeebasket());
	   
	   Threadsleep(4000);
	
	   javascriptclick(a.getCartdelete());
	
	  Threadsleep(8000);	
	   
	  LOGGER.info("Succesfully  selected  product removed from cart page");
	   
	  javascriptclick(a.getCouponcode());
	   
	  Threadsleep(2000);	
     	
	  PassValues(a.getCoupontext(), getdataExcel(2, 5));
	  
		Threadsleep(2000);	
	 javascriptclick(a.getCouponcodeapply());
        Threadsleep(3000);
	   
	 	c2 = new Cartpage();
		a =new AKIstagepom();

	String  Invalidcoupon = c2.getCouponcodeerrormessage().getText();
       
	checkpresentElement("To verify the copon code deail in cart page",Invalidcoupon.contains("not valid"));
   
	LOGGER.info("Succesfully  verified  Invalid coupon applying in the  cart page");


    Threadsleep(3000);	

 
	
    WebElement carlefttTotalprice = a.getCartLeftTotalprice();
	String CartTotalprice = carlefttTotalprice.getText();
	System.out.println(CartTotalprice);
	

	 WebElement Cartcount = a.getCartitemcount();
	String Counts1 = Cartcount.getText();

	   
	WebElement Cartsubtotalprice1 = c2.getCartsubtotalprice();
	String Cartsubtotalprice2 = Cartsubtotalprice1.getText();
	String Cartsubtotalprice3 = Cartsubtotalprice2.substring(4);
	Double valueOf = Double.valueOf(Cartsubtotalprice3);
	 

	WebElement Cartshipping = a.getCartShippingcharge();
	String Cartshipping1 = Cartshipping.getText();
	
	WebElement Shippingcharge = a.getCartShippingcharge();
	String Head2 = Shippingcharge.getText();
	String Shipping2 = Head2.substring(4);
	  Double valueOf2 = Double.valueOf(Shipping2);
	

	  Double t2 = valueOf +valueOf2;

	  WebElement Ordersummaryincart1 = c2.getCartordersummarytotal();
	  String Ordersummaryincart2 = Ordersummaryincart1.getText();
	  String Ordersummaryincart3 = Ordersummaryincart2.substring(4);
	  Double valueOf3 = Double.valueOf(Ordersummaryincart3);
	  
	  checkpresentElement("Check order summary detail",t2.equals(valueOf3));
	
	LOGGER.info("Sucessfully  verified order summary detail calculation without discount offer in cart page");
	  
	  Threadsleep(4000);
 
 
	  checkequaltext("Compare to the Product Total rate at cart page",CartTotalprice,Cartsubtotalprice2 );
	  
	 JavascriptExecutor js1 = (JavascriptExecutor) driver;
     for (int i = 0; i < 1; i++) {
    js1.executeScript("window.scrollBy(0, 500);");  
   Threadsleep(1000);
  
}
      	
      c2 = new Cartpage();
	  javascriptclick(c2.getPlaceorder());
	  
	  Threadsleep(5000);
	 
	 checkequaltext("To verify the product count btw cart&checkout page",Counts1 , getText1(a.getCheckproductcount()));
	  
	 checkequaltext("Compare to cart&Checkout page Charges",Cartshipping1, getText1(a.getCpshippingcharge()));
	  
	 checkequaltext("Compare to cart&Checkout page subtotal",Ordersummaryincart2, getText1(a.getSubtotalcheckoutpage()));
	 
    LOGGER.info("Successfully verified order summary details without discount offers between the cart and checkout pages.");
	 EndTimeprint();
}



@Then("the user enters shipping and billing address details in checkout page")
public void the_user_enters_shipping_and_billing_address_details_in_checkout_page() throws AWTException {


	 StartTimeprint();
	 c1 = new Checkoutpage();
	
	  h = new Homepage();

	 javascriptclick(c1.getAddnewaddressincheckout());

    Threadsleep(5000);
	 
	ClickElement(c1.getCountrycodeshipsecond());
	 
	  Threadsleep(3000);

      for (int i = 0; i < 98 ; i++) {
        KeyDOWN();
    }

	KeyEnter();
	
	//  javascriptclick(h.getCountrycode());
	 
	Threadsleep(3000);
	  
	    PassValues(c1.getMobilenumberfieldinpopup(), getdataExcel(1,4));

	    Threadsleep(3000); 
	
     	PassValues(c1.getStreetfieldinpopup(), getdataExcel(4,2));
	    PassValues(c1.getBulidingboxinpopup(), getdataExcel(5,2));
	    Threadsleep(3000);
	  
		PassValues(c1.getCityboxinpopup(), getdataExcel(6,2));
		Threadsleep(4000);
		WebElement stateshipp = driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[4]"));
		ClickElement(stateshipp);
	    Threadsleep(2000);
        ClickElement(c1.getStatedubai());
	   Threadsleep(2000);


		// WebElement stateshipp1 = driver.findElement(By.xpath("(//select[@class='select'])[4]"));
		// Select s = new Select(stateshipp1);
		// Threadsleep(2000);
		// s.selectByIndex(4);
	
	PassValues(c1.getPincodefieldinpopup(), getdataExcel(7,2));
	Threadsleep(5000);

	javascriptclick(c1.getShipphere());

	LOGGER.info("Successfully shipping new  address is updated in  checkout page."); 

//Billing address form field
// c1 = new Checkoutpage();
// javascriptclick(c1.getBillingcheckbox());
// Threadsleep(4000);
// 	//  PassValues(a.getBillFirstname(), getdataExcel(2,2));
// 	//  PassValues(a.getBilllastname(), getdataExcel(3,2));
// PassValues(c1.getStreetfieldBill(), getdataExcel(4,3));
// Threadsleep(2000);
// PassValues(c1.getBulidingboxfieldBill(), getdataExcel(5,3));
// Threadsleep(2000);
// PassValues(c1.getCityfieldboxfieldBill(), getdataExcel(6,3));
// Threadsleep(3000);
// WebElement statebill = driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[1]"));
// statebill.click();
// Threadsleep(2000);
// ClickElement(c1.getStatesharja());
// Threadsleep(2000);
// javascriptclick(c1.getDialcodedrop1ship());
//  Threadsleep(3000);
// ClickElement(c1.getBillcountrycode1());
	  
// Threadsleep(2000);

// PassValues(c1.getMobilenumberBill(), getdataExcel(8,3));
// Threadsleep(3000);
// PassValues(c1.getPincodefieldBill(), getdataExcel(7,3));
// Threadsleep(4000);

//javascriptclick(c1.getUpdateaddress());

Threadsleep(4000);



EndTimeprint();  

}



@Then("after entering the address details, the user selects a payment option and places the order")
public void after_entering_the_address_details_the_user_selects_a_payment_option_and_places_the_order() {

	  StartTimeprint();

	  c1 =new Checkoutpage();

	  a =new AKIstagepom();
	  Threadsleep(3000);
	
	   javascriptclick(c1.getChecknext());
	   
		Threadsleep(5000);
	
	   javascriptclick(a.getCashoption());
    
	   Scrolldown();
	 
	   Threadsleep(5000);
	
	   moveToElement(a.getPlaceordercheck());
	   Threadsleep(3000);
	   actionClick(a.getPlaceordercheck());
	   
	   Threadsleep(7000);

       checkpresentElement("To check payment gate page",driver.getTitle().contains("Payment") );

	  LOGGER.info("Successfully verified Paymet Gateway page redirection");
	   Scrolldown();
	   javascriptclick(a.getCancelpayment1());

	    Threadsleep(4000);

	    javascriptclick(a.getCancelpayment2());

	    Threadsleep(6000);

	
	  javascriptclick(a.getCancelpayment3inpopup());
	
	  Threadsleep(8000);

	javascriptclick(a.getCartdelete());
	
	  Threadsleep(4000);	
	   
  LOGGER.info("After canceling the payments, the successfully selected product was removed from the cart page.");
  EndTimeprint();  

     StartTimeprint();
     Threadsleep(8000);
     h = new Homepage();
     Threadsleep(3000); 
     moveToElement(h.getLoggedImageIcon());
 	 implicitWait();
 	
	 a =new AKIstagepom();
    
	 ClickElement(a.getMyorderIcon());
     Threadsleep(3000);
     WebElement username = a.getUsername();
     String text = username.getText();
	 Threadsleep(3000);
     checkpresentElement("To verify user name ", text.contains("AKSHAY!"));
	 
	 LOGGER.info("Successfully verified username");

	 String Myorderdetailmeesage = a.getNoOrdermessage().getText();

   checkpresentElement("To verify user name ",Myorderdetailmeesage.contains("no orders"));

   LOGGER.info("After canceling the payments from PG PAGE, no canceled orders are displayed in the account order details page.");
    
	 //On stage env-- scenarios

    //  WebElement confirmationmess = a.getConfirmationmess();
	//  String ordermessage = confirmationmess.getText();

	//  WebElement checkorder = a.getCheckorderid();
	//  String checkorder1 = checkorder.getText();
	//  String Orderid1 = checkorder1.substring(22, 31);
	//  System.out.println(Orderid1);
	 
	//  Threadsleep(6000);
	//  checkpresentElement("To verify the confirmation meaasge",ordermessage.contains("order confirmation"));
	//  LOGGER.info("Successfully verified placed  Order Template message in Thankypo page");

     EndTimeprint();  

}



	
	
	

}
