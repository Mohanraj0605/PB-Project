package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;


/*
 * --------Functional List-------------
 * 1.Launch Any Browser
 * 2.Launch the Url
 * 3.Screen Maximize
 * 4.Get the UrlTittle
 * 5.Get the Current Page Url
 * 6.Sendvalues for Textbox
 * 7.Click the Element
 * 8.Clear the Values
 * 9.Get the Text From Webpage
 * 10.Get the Attributte values From Webpage
 * 11.MouseHover In Actions Class
 * 12.Get the Webpage page Source Code
 * 13.Launch URL Navigation methods
 * 14.Screenshot By Using Takescreenshot
 * 15.Simple Alert Handling
 * 16.Dropdown By Using select class -SelectByindex
 * 17.Dropdown By Using select class -SelectBytext
 * 18.Static Wait
 * 19.Dynamic Wait --Implicit Wait 
 * 20.Click Using By JavascriptExecutor
 * 21.SendValue into text box Using By JavascriptExecutor
 * 22.Switch into Frame Using by txt
 * 23.SwithTo window based on Window ID 
 * 24.Verification and Vadidation Using By Assertion
 * 25.To read the Excel
 * 26.To create the Excel sheet
 * 27.Scrollup & Scrolldown  Using By JavascriptExecutor
 * 
 */

public class Ultilityclass {
	
	
	public static Actions actions;
	public static  WebDriver driver;
	public static Navigation navigate;
	public static TakesScreenshot screen;
	public static Alert alert;
	public static Select select;
	public static JavascriptExecutor js;
      public static Robot R;
       public static Alert A;

	/*
	 * @author:MOHANRAJ K
	 * @ Purpose:  Launch Any Browser
	 */
	
	public static void launchBrowser (int B) {
		
		if (B==1) {
			
			WebDriverManager.chromedriver().setup();
			
			

            // ChromeOptions options = new ChromeOptions();
            // options.addArguments("--disable-dev-shm-usage");
            // options.addArguments("--no-sandbox");
            // options.addArguments("--disable-gpu");
            // options.addArguments("--remote-allow-origins=*");

            // Launch Chrome with options
          
            driver = new ChromeDriver();
			
		}
		else if (B==2) {
			
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
		}
		
		else if (B==3)  {
			
			WebDriverManager.edgedriver().setup();
			
			driver = new EdgeDriver();
	}
		else {
			
			System.out.println("null");
			
		}
		
	
	}
	

    /*
	 * @author:MOHANRAJ K
	 * @ Purpose:Launch the Url
	 */
	public  static void launchurl(String Enterurl) {
		
		driver.get(Enterurl);

}
public  static void close() {
		
		driver.close();

}
     /*
	  * @ Purpose: Screen Maximize
	  */

    public  static void pagemaximize () {
		
		driver.manage().window().maximize();
		}
     /*
	  * @ Purpose: Screen Minimize
	  */
   public  static void pageminimize () {
		
		driver.manage().window().minimize();
   }   
     /*
	  * @ Purpose: Get the UrlTittle
	  */
	
   public static void urlTittle() {
	   
	   String title = driver.getTitle();
	   System.out.println(title);
	   
	  }
     /*
	  * @ Purpose: Get the Current Page Url
	  */
   
  public static void currentUrl() {
	   
	   String Current = driver.getCurrentUrl();
	   System.out.println(Current);
	   
	  }
     /*
	  * @ Purpose: Sendvalues for Textbox
	  */
  public static void PassValues(WebElement eleName,String Value) {
	  eleName.sendKeys(Value);
	   
	    }
     /*
	  * @ Purpose: Click the Element
	  */
    public static void ClickElement(WebElement eleName) {
    	
    	eleName.click();

}


      public static void verifyButton(WebElement element, String expectedText) {
        
        assertTrue("Element not displayed: " + expectedText, element.isDisplayed());
        assertEquals("Text mismatch for button", expectedText, element.getText().trim());
    }

     /*
	  * @ Purpose: Clear the Values
	  */
    
     public static void clearvalue(WebElement eleName) {
    	
    	eleName.clear();

}
     
     /*
	  * @ Purpose: Get the Text From Webpage
	  */
     public static void getText(WebElement eleName) {
     	
     	String text = eleName.getText();
     	System.out.println(text);

 }
     
     /*
	  * @ Purpose: Get the Text From Webpage
	  */
     public static String  getText1(WebElement eleName) {
     	
     	String text1 = eleName.getText();
     	return text1;

 }
     /*
	  * @ Purpose: Get the Attributte values From Webpage
	  */
     public static String getAttributte (WebElement eleName) {
      	
      	String Attribute = eleName.getAttribute("value");
      	return Attribute;
  }

     /*
	  * @ Purpose: Get the Webpage page Source Code
	  */
     
     public static void getPagesource () {
       	
       	String pageSource = driver.getPageSource();
       	System.out.println(pageSource);

   }
     public static void StartTimeprint () {
        	
        Date c = new Date();	
        System.out.println("Start Time:"+c);

    }
     public static void EndTimeprint () {
     	
         Date d = new Date();	
         System.out.println("End Time:" +d);

     }

     public void waitForClickableAndClick(WebElement element) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
    wait.until(ExpectedConditions.elementToBeClickable(element));
    element.click();  
    
    
}

public void waitUntilVisible(WebElement element) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.visibilityOf(element));
}
     
    /*
 	 * @author:MOHANRAJ K
 	 * @ Purpose:MouseHover In Actions Class
 	 */
     public static void moveToElement (WebElement categeoryoptions2 ) {
        	
        	actions = new Actions(driver);
        	actions.moveToElement(categeoryoptions2).perform();
    }


    //  public static void  moveToElement2( List<WebElement> ListofElement ) {
        	
    //     	actions = new Actions(driver);
    //     	actions.moveToElement ((WebElement) ListofElement).perform();
    // }
    
    /*
  	 * @ Purpose:Drag and Drop THE Element
  	 */
     public static void dragAnddrop (WebElement SourceName,WebElement TargetName ) {
     	
     	actions = new Actions(driver);
     	actions.dragAndDrop(SourceName, TargetName).perform();
 }
     
    /*
   	 * @ Purpose:Right Click Element
   	 */
     
     public static void rightClick (WebElement SourceName) {
      	
      	actions = new Actions(driver);
      	actions.contextClick(SourceName).perform();
  }
        /*
    	 * @ Purpose:Double  Click the Element
    	 */
     
     public static void doubleClick (WebElement SourceName) {
      	
      	actions = new Actions(driver);
      	actions.contextClick(SourceName).perform();
      	
  }
     /*
   	 * @ Purpose: Send the Values By Using  Action Class
   	 */
      public static void actionSenkeys (WebElement SourceName,String Value) {
         	
         	actions = new Actions(driver);
         	actions.sendKeys(SourceName, Value).perform();
         	 }
    /*
 	 * @ Purpose: Click the Element By Using Action Class
 	 */
     
     public static void actionClick (WebElement SourceName) {
       	
       	actions = new Actions(driver);
       	actions.click(SourceName).perform();
       	
   }
	 
      /*
       * @ Purpose: Click and Hold the Element
       */

    public static void clickAndhold (WebElement SourceName,WebElement TargetName) {
	
	actions = new Actions(driver);
	actions.clickAndHold(SourceName).perform();
	actions.release(TargetName).perform();
    }
    
    /*
     * @ Purpose: Navigation URL Launch
     */
    
    public static void  navigateTo(String url) {
		navigate = driver.navigate();
		
		navigate.to(url);
}
    /*
     * @ Purpose:  Refresh page Using navigation
     */
    public static void navigateRefresh() {
		navigate = driver.navigate();
		navigate.refresh();
	}


   public static void Quite() {

		driver.quit();
		
	}
       public static void KeyEnter() throws AWTException {
		             R = new Robot();
           R.keyPress(KeyEvent.VK_ENTER);
           R.keyRelease(KeyEvent.VK_ENTER);
	}

       public static void KeyDOWN() throws AWTException {
		             R = new Robot();

           R.keyPress(KeyEvent.VK_DOWN);
           R.keyRelease(KeyEvent.VK_DOWN);;
	}

  public static void KeyUP() throws AWTException {
		             R = new Robot();

           R.keyPress(KeyEvent.VK_UP);
           R.keyRelease(KeyEvent.VK_UP);;
	}
      

    /*
     * @ Purpose:  Forward page Using navigation
     */
    
    public static void navigatefoward() {
		navigate = driver.navigate();
		navigate.forward();
	}
    
    /*
     * @ Purpose:  Back page Using navigation
     */
    
     public static void navigateBack() {
		navigate = driver.navigate();
		navigate.back();
	}
     

  public static void Refresh() {
    
    driver.navigate().refresh();
    
  }
     /*
      * @ Purpose:  Screenshot By Using Takescreenshot
      */
     
     public static void takeScreenshot(String file)   {
    	try {
    	 screen = (TakesScreenshot) driver;
    	 
    	 File ScreenshotAs =screen.getScreenshotAs(OutputType.FILE);
    	 File  des = new File(file);
    	 FileUtils.copyFile(ScreenshotAs, des);
    	 
    	 }
    	catch (IOException e) {
    		e.getMessage();
    	}
			
		}
    	 

     /*
      * @ Purpose:  KBL--Screenshot By Using Takescreenshot
      */
     
     public static void allScreenshot(String screen) throws IOException  {
    		try {
    	 TakesScreenshot tk = (TakesScreenshot) driver;
    	 
    	 File ScreenshotAs =tk.getScreenshotAs(OutputType.FILE);
    	 File  des = new File("E:\\MOHAN\\KBL\\Snap\\"+screen+".jpg");
    	 FileUtils.copyFile(ScreenshotAs, des);
    	 
    	 }
    		catch (IOException e) {
        		e.getMessage();
        	}
     
     }
     

     /*
      * @ Purpose:  AKI sites--Screenshot By Using Takescreenshot
      */
     
     public static void allScreenshot1(String screen) throws IOException  {
 		try {
 	 TakesScreenshot tk = (TakesScreenshot) driver;
 	 
 	 File ScreenshotAs =tk.getScreenshotAs(OutputType.FILE);
     File  des = new File("E:\\PB-Project\\Petit-Beatu\\Screenshot\\"+screen+".jpg");
 	 FileUtils.copyFile(ScreenshotAs, des);
 	 
 	 }
     
 		catch (IOException e) {
     		e.getMessage();
     	}
  
  }

     
     /*
      * @ Purpose:  Simple Alert Handling
      */
     public static void simpleAlert() {
		alert = driver.switchTo().alert();
		alert.accept();
}
     
     public static void conformalert() {
    	 alert = driver.switchTo().alert();
 		 alert.dismiss();

	}
     

     /*
      * @author: MOHANRAJ K
      * 
      * @ Purpose:  Dropdown By Using select class -SelectByindex
      */
     
     
     public static void selectByindex(WebElement selectRef,int index) {
    	 select = new  Select (selectRef);
    	 select.selectByIndex(index);

	}
     /*
      * @ Purpose:  Dropdown By Using select class -SelectBytext
      */
     public static void selectBytext(WebElement selectRef,String text) {
    	 select = new  Select (selectRef);
    	 select.selectByVisibleText(text);

	}
     /*
      * @ Purpose:  DrselectByvalueopdown By Using select class -SelectByvalue
      */
     public static void selectByvalue(WebElement selectRef,String value) {
    	 select = new  Select (selectRef);
    	 select.selectByValue(value);

	}
     /*
      * @ Purpose:  Dropdown By Using select class -FirstSelectedoption
      */
     public static void FirstSelectedoption(WebElement selectRef) {
    	 select = new  Select (selectRef);
    	 select.getFirstSelectedOption();

	}
     /*
      * @ Purpose:  Dropdown By Using select class -Getoptions
      */
     public static void getOptions(WebElement selectRef) {
    	 select = new  Select (selectRef);
    	 select.getOptions();

	}
     /*
      * @ Purpose:  Dropdown By Using select class -deselectByIndex  
      */
     public static void deselectByIndex (WebElement selectRef,int index) {
    	 select = new  Select (selectRef);
    	 select.deselectByIndex(index);

	}
     
     /*
      * @ Purpose:  Dropdown By Using select class -deselectByIndex  
      */
     public static void deselectBytext (WebElement selectRef,String text) {
    	 select = new  Select (selectRef);
    	 select.deselectByVisibleText(text);

	}
     

     /*
      * @ Purpose:  Dropdown By Using select class -deselectByvalue  
      */
     public static void deselectByvalue (WebElement selectRef,String value) {
    	 select = new  Select (selectRef);
    	 select.deselectByValue(value);

	}
     


     /*
      * @ Purpose:  Static Wait 
      */
     
     public static void Threadsleep(int sec){
    	 try {
    		 
    		 Thread.sleep(sec);
			} 
    	 
    	 catch (InterruptedException e) {
            e.getMessage();
			
		}
    	
	
     }

     /*
      * @ Purpose:  Dynamic Wait --Implicit Wait 
      */
     
     public static void implicitWait() {
    	 
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	}


/*
 * Waits until the given element is clickable.
 */
public static void waitUntilClickable(WebElement categoryLink) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(categoryLink));
}

     
     /*
      * @ Purpose:  Click Using By JavascriptExecutor
      */
     public static void javascriptclick (WebElement ele) {
		
           js =(JavascriptExecutor)driver;
           js.executeScript("arguments[0].click()",ele);
     }
     /*
      * @ Purpose:  SendValue into text box Using By JavascriptExecutor
      */
     public static void javascriptsetAttribute (String text,WebElement ele) {
		
           js =(JavascriptExecutor)driver;
           js.executeScript("arguments[0].setAttribute('value','"+text+"')",ele);
     }
     
     /*
      * @ Purpose:  GetAttribute Using By JavascriptExecutor
      */
     public static void javascriptGetAttribute (String value,WebElement ele) {
		
           js =(JavascriptExecutor)driver;
           js.executeScript("return arguments[0].getAttribute('"+ value +"')",ele);      
     }

public static void Scrolldown () {

     JavascriptExecutor js = (JavascriptExecutor) driver;    
	for (int i = 0; i < 1; i++) 
    js.executeScript("window.scrollBy(0, 500);");  
	Threadsleep(1000);
    
}



public static void ScrollUp () {

     JavascriptExecutor js = (JavascriptExecutor) driver;    
	for (int i = 0; i < 2; i++) 
    js.executeScript("window.scrollBy(0, -500);");  
	Threadsleep(1000);
    
}

     /*
      * @ Purpose:  Scrolldown  Using By JavascriptExecutor
      */
      
     public static void Scrolldownjavascript (WebElement ele) {
          
           js =(JavascriptExecutor)driver;
           js.executeScript("arguments[0].scrollIntoView(true)",ele);      
     }

     public static void Scrolldownjavascript2 (WebElement ele) {
		
           js =(JavascriptExecutor)driver;
           js.executeScript("arguments[0].ScrollIntoview(true)",ele);      
     }
     
     /*
      * @ Purpose:  Scrollup  Using By JavascriptExecutor
      */

     public static void Scrollupjavascript (WebElement ele) {
		
           js =(JavascriptExecutor)driver;
           js.executeScript("arguments[0].scrollIntoview(false)",ele);      
     }
     /*
      * @ Purpose:  ZoomIn and Out Using By JavascriptExecutor
      */
     public static void ZoomInout (int  percent) {
 		
         js =(JavascriptExecutor)driver;
         String Zoom ="document.body.style.zoom= '"+percent+"%;'";
         js.executeScript(Zoom);      
   }
     /*
      * @ Purpose:  Swith into Frame Using by txt
      */
     public static void switchframe (String frame) {
  		
         driver.switchTo().frame(frame);    
   }
     /*
      * @ Purpose:  Swith into Frame Using by index
      */
     
     public static void switchframeindex (int index) {
   		
         driver.switchTo().frame(index);    
   }
     /*
      * @ Purpose:  Swith into Frame Using by Webelement
      */
     
     public static void switchframeelement (WebElement ele) {
   		
         driver.switchTo().frame(ele);    
   }
     
     /*
      * @ Purpose:  SwithTo window based on Window ID 
      */
     
     public static void window (String  ID) {
   		
         driver.switchTo().window(ID);
   }
     

   public void setPriceRange(WebElement element, String value) throws InterruptedException {
    
    element.clear();
    Thread.sleep(3000); // Or use WebDriverWait
    PassValues(element, value);
}
      /*
      * @ Purpose:  Verification and Vadidation Using By Assertion
      */


     public static void checkpresentElement(String commit,boolean ele) {
         
        assertTrue(commit, ele);
     }
     
     /*
      * @ Purpose:  Verification Using By text
      */

     public static void checkequaltext(String commit,String  Value1 ,String Actual) {

         assertEquals(commit, Value1, Actual);
        
      }
     /*
      * @ Purpose:  Verification Using By text and webelement
      * 
      */
     
     public static void checkequalElement(String commit,String Expected ,String Actual) {
         
         assertEquals(commit, Expected, Actual);
            
      }

      /*
      * @ Purpose:  Alert accept and dismiss
      * 
      */

      public static void Alertaccept () {
    	 
    	 A = driver.switchTo().alert();
    	 A.accept();
    		
      }

      public static void Alertdismiss () {

    	 A = driver.switchTo().alert();
    	 A.dismiss();

      }



     /*
      * @ Purpose:  To read the Excel
      */

    public static String  getdataExcel(int row,int col)   {
    	
        String value = "";
    	 
     try {
     File f = new File ("E:\\PB-Project\\Petit-Beatu\\target\\Data\\Petit-stage data.xlsx"); 
     FileInputStream fin = new FileInputStream(f); 
     Workbook w = new XSSFWorkbook(fin);
     Sheet sheet = w.getSheet("PB datas");
     
     Row rowdata = sheet.getRow(row);
     Cell cell = rowdata.getCell(col);
     CellType type = cell.getCellType();
     
     if (type == CellType.STRING) {
         
         value = cell.getStringCellValue();
        
    }
     else if (type == CellType.NUMERIC) {

         double Digit = cell.getNumericCellValue();
         
         long l = (long)Digit;
         
          value = String.valueOf(l);
         
        
    }
     else if (DateUtil.isCellDateFormatted(cell)){
         
         Date D = cell.getDateCellValue();
        
         SimpleDateFormat sim = new SimpleDateFormat("dd,mm,yyyy");
        
         value = sim.format(D);
         
     }
     w.close();
     fin.close();
         }catch (IOException e) {
            e.printStackTrace();
        }
     
     return value;
     
     }

     
    //   public static List<Map<String, String>> getExcelData2(String path, String sheetName) 

    //     List<Map<String, String>> dataList = new ArrayList<>();
    //   try (FileInputStream fis = new FileInputStream("E:\\KBL-Project\\KBL-Business flow\\target\\Data\\Footerlinks.xlsx");
    //        Workbook workbook = new XSSFWorkbook(fis)) {

    //       Sheet sheet = workbook.getSheet("Footer");
    //       Row headerRow = sheet.getRow(1);

    //       for (int i = 1; i <= sheet.getLastRowNum(); i++) {
    //         Row row = sheet.getRow(i);
    //         Map<String, String> rowMap = new HashMap<>();

    //         for (int j = 0; j < row.getLastCellNum(); j++) {
    //             String key = headerRow.getCell(j).getStringCellValue().trim();
    //             String value = row.getCell(j).getStringCellValue().trim();
    //             rowMap.put(key, value);
    //         }

    //         dataList.add(rowMap);
    //       }

    //   } catch (Exception e) {
    //       e.printStackTrace();
    //   }
    //     return dataList;
    // }
     
     /*
      * @ Purpose:  To create the Excel sheet
      * 
      */
     

 public static void createSheet (String filepath,int row,int col,String value) {

      Workbook w = null;
      FileOutputStream fileout = null;
      try {
     File f =new File (System.getProperty("user.dir")+filepath);
     w = new XSSFWorkbook(f);
 
     Sheet CS = w.createSheet();
     Row CR = CS.createRow(row);
     Cell C = CR.createCell(col);
     C.setCellValue(value);
     fileout = new FileOutputStream(f);
     w.write(fileout);
    }
    catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if (w != null) {
                w.close();
            }
            if (fileout != null) {
                fileout.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    


 }    
     

    public static  List<Map<String, String>> Categeoryreader (String path, String sheetName) {

        List<Map<String, String>> Categeorydatas = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream("E:\\KBL-Project\\KBL-Business flow\\target\\Data\\KBL datas.xlsx");
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet("KBL datas");
            Row headerRow = sheet.getRow(1);

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                Map<String, String> rowMap = new HashMap<>();

                for (int j = 0; j < headerRow.getLastCellNum(); j++) {
                    String key = headerRow.getCell(j).getStringCellValue();
                    String value = row.getCell(j).getStringCellValue();
                    rowMap.put(key, value);
                }

                Categeorydatas.add(rowMap);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return Categeorydatas;
    }
	

    
public static void writeToExcel1(String data, String fileName) {
    Workbook workbook = new XSSFWorkbook();
    Sheet sheet = workbook.createSheet("Warehouse Codes");

    Row row = sheet.createRow(0);  // Write to first row
    row.createCell(0).setCellValue(data);  // Write the string in first column

    try (FileOutputStream out = new FileOutputStream(fileName)) {
        workbook.write(out);
        workbook.close();
        System.out.println("Excel file written: " + fileName);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    
public static void writeToExcel2(List<String> data, String fileName) {
    Workbook workbook = new XSSFWorkbook();
    Sheet sheet = workbook.createSheet("Warehouse Codes3");

    int rowCount = 0;
    for (String entry : data) {
        Row row = sheet.createRow(rowCount++);
        row.createCell(0).setCellValue(entry);
    }

    // make sure parent dirs exist etc.
    try (FileOutputStream out = new FileOutputStream(fileName)) {
        workbook.write(out);
        System.out.println("Excel file written: " + fileName);
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


    public static void writeUniqueCodesToExcel(String filePath, List<String> uniqueCodes, String sheetName) {
    try {
        System.out.println(">> Starting to write unique codes to Excel...");

        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = WorkbookFactory.create(fis);
        fis.close(); // Close input stream after loading

        Sheet sheet = workbook.getSheet(sheetName);
        if (sheet == null) {
            System.out.println("Sheet not found. Creating new sheet: " + sheetName);
            sheet = workbook.createSheet(sheetName);
        }

        System.out.println("Unique codes to write: " + uniqueCodes);
        System.out.println("Total unique codes: " + uniqueCodes.size());

        for (int i = 0; i < uniqueCodes.size(); i++) {
            Row row = sheet.getRow(i);
            if (row == null) {
                row = sheet.createRow(i);
            }
            Cell cell = row.createCell(0); // Column A
            cell.setCellValue(uniqueCodes.get(i));
            System.out.println("Written: " + uniqueCodes.get(i));
        }
        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);
        fos.close();
        workbook.close();
        System.out.println("Done writing to Excel.");
    } 
    
    catch (Exception e) {
        e.printStackTrace();
    }
}



public List<String> readWarehouseCodesFromExcel(String filePath) {
    List<String> warehouseCodes = new ArrayList<>();

    try (FileInputStream fis = new FileInputStream(filePath);
         Workbook workbook = new XSSFWorkbook(fis)) {

        Sheet sheet = workbook.getSheetAt(0); // First sheet

        for (Row row : sheet) {
            Cell cell = row.getCell(0); // Column A (index 0)

            if (cell != null) {
                String code = cell.getStringCellValue().trim();
                if (!code.isEmpty()) {
                    warehouseCodes.add(code);
                }
            }
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return warehouseCodes;
}
 

	
	
	

}
