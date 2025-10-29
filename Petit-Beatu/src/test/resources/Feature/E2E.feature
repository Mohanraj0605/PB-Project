@E2E
Feature: To be Verify the E2E Functionality in Petit Beteau site


@Case1
Scenario: To Validate Sorting,Paginaton function and  Billing address detail updation in checkout page for new loggedin users

 Given  user opens the Home page as a login user 
 When   the user navigates from a main category to a subcategory  
 And    the user selects a Sort By option and verifies the sorted product listing  
 And    the user checks the pagination functionality on the PLP page  
 And    the user clicks on a product and is redirected to the Product Detail Page
 And    User adds multiple item to cart,then,removes items from cart and observes order summary calculation
 Then   the user enters shipping and billing address details in checkout page
 And    after entering the address details, the user selects a payment option and places the order

@Case1
Scenario: To Validate  the  checkout flow for   logged-in  user

Given  the user opens the Home page and do the login 
When   the user selects a category and subcategory option from the Home page  
And    the Product Listing Page is displayed based on the selected category  
And    the user clicks on any one product image based on the applied filter  
And    the user navigates from the Product Detail Page  to the cart page  
And    the user clicks on the checkout button  
And    the user select the shipp addrres  details and   navigated to the Payment Options section  
Then   the user Select the payment option and places the order.Then,Verify the order detail in my account page

  
@Case1
Scenario:  To Validate the guest user checkout flow via quick view from PLP

Given  the user opens the Home page as a guest and selects a category to navigate to the Product Listing Page  
When   the user clicks on the quick view of any product from the PLP  
And    on the quick view popup, the user selects the size and quantity for the product  
And    the user clicks the Add to Cart button and is navigated to the Cart page  
And    the user clicks the Checkout button as a guest user  
Then   the user completes mobile number verification and observes the page response  
And    the user clicks on the Continue to Payment button and places the order  


@Case1
Scenario Outline: To validate the search field functionlaity for products level

Given  user opens the Home page as a guest user
When   User Enter the product name in search box "<Product Name>"
Then   User Should be visible related product.then,Click on any product and navigate  to the PDP page
   

 Examples:
          |Product Name|
          |TROUSERS|       
 


 
 
 
 
 
 
 
 
 
 
 
 
 
 
 