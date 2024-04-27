package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	
	 Properties p;
	 
	public static    WebDriver driver;
	
	
	public void Initilize() throws IOException   {
	
	
	FileInputStream file = new FileInputStream("H:\\Java Workspace\\Pratice2\\src\\main\\java\\data.properties");
	
	 p= new Properties();
	 
	 p.load(file);
	 
	 
	 String key=p.getProperty("browser");
		
		if(key.equalsIgnoreCase("chrome"))  {
			
			System.setProperty("webdriver.chrome.driver", "G:\\chromedriver-win32\\chromedriver.exe");
			
			ChromeOptions op=new ChromeOptions();
			
			op.addArguments("--remote-allow-origins=*");
			op.setBinary("C:\\Users\\LENOVO\\.cache\\selenium\\chrome\\win64\\116.0.5845.49\\chrome.exe");
			
			 driver=new ChromeDriver(op);
			 
		 }
	     
		 else {
			 
			 System.out.println("verify the browser name");
		 }
	 
	
	}
	
	@BeforeMethod
	public void openurl() throws IOException  {
		
		Initilize();
		
		String key1 = p.getProperty("url");
		
		driver.get(key1);
	}
	 
	
	@AfterMethod
	public void  close()   {
		
		driver.manage().window().maximize();
		
	}
	
	
	
	
	

}
