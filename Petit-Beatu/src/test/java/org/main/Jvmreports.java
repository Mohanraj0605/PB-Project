package org.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;



import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Jvmreports  {
	

	
	public static void generateJVM(String j) {
		
		
		File f = new File(System.getProperty("user.dir")+"\\target\\Cucumber-Reports\\Jvm");
		
		Configuration c = new Configuration(f,"AKI-Petit") ;
		c.addClassifications("OS", "Windows");
		c.addClassifications("BrowserVersion", "121");
		c.addClassifications("Petit Bateau", "KIDS");
		
		
	
		List<String> li = new ArrayList<String> ();
		li.add(j);
		
		ReportBuilder r = new ReportBuilder (li,c);
		r.generateReports();

	}

}
