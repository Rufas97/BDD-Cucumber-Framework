package Basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 public static WebDriver Driver;
	 
	 
		public static void application_launch()
		{	
			WebDriverManager.chromedriver().setup();	
			Driver= new ChromeDriver();
			Driver.get("https://www.fb.com");	
		}
		
		public static void APplication_close()
		{
			
			Driver.close();
		}
		
	}
