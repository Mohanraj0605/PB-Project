package org.steps;



import java.io.IOException;

import org.base.Ultilityclass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class PBHooks extends Ultilityclass {
	

	
	@Before
	public void Start() {

		launchBrowser(1);

		//launchurl("https://mcstaging.petit-bateauuat.com");

		launchurl("https://www.petit-bateau.ae/en/");
		
		pagemaximize();
	   
	}


	@After
	public void End(Scenario s) throws IOException, InterruptedException  {
		
if (s.isFailed()) {
			
			TakesScreenshot tk =(TakesScreenshot)driver;
			byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
		 
			//s.embed(screenshotAs, "image/png");
			
			s.attach(screenshotAs,"image/png" , s.getName());
			Thread.sleep(3000);
			// driver.close();
			
		} 
		
		else {
			
			allScreenshot1("screen");
		Thread.sleep(3000);
        driver.close();
		
	}
	
	}
}
