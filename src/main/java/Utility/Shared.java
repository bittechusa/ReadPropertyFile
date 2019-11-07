package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Shared {
	static Properties prop;
	
	public static Properties readPropertyFile(String pathname)  {
		try {
			FileInputStream f= new FileInputStream(new File(pathname));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println("File not found");
		}
		 prop= new Properties();
		prop.getProperty(pathname);
		
		return prop;
		
		
		
		
		
		
	}
	public static void openBrowser(WebDriver driver) {
		
		
		
		
		
		
		if(prop.get("browser").equals("chrome")) {
			driver= new ChromeDriver();
		}
		else if(prop.get("browser").equals("FireFox")) {
			driver= new FirefoxDriver();
		}
		else if(prop.get("browser").equals("InternetExporer")) {
			driver= new InternetExplorerDriver();
		}
		else if(prop.get("browser").equals("Safari")) {
			driver= new SafariDriver();
		}
		else {
			System.out.println("Driver is not found");
		}
		
		
		
		
		
		
		
	}
	
	
		
		
		
		
		}
	
	
	
	
	
	


