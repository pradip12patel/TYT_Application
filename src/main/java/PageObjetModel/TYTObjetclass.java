package PageObjetModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TYTObjetclass {
	
  public WebDriver driver;
	
	By log = By.xpath("//div[@class='flex items-center gap-x-12']");
	By sign = By.xpath("//span[@class='cursor-pointer hover:underline']");	
	By name= By.xpath("//input[@placeholder='Full Name']");
    By phn= By.xpath("//input[@placeholder='Mobile no.']");
    By vrfy = By.xpath("//div[@class='cursor-pointer']//*[name()='svg']");
	
    By mail = By.xpath("//input[@placeholder='Email Address']");
    By pass = By.xpath("//input[@placeholder='Password']");
    By boq = By.xpath("(//input[@type='checkbox'])[1]");
    By boq1 = By.xpath("(//input[@type='checkbox'])[2]");
    By Logi = By.xpath("//button[contains(text(),'Login')]");
    
    
    
	public TYTObjetclass(WebDriver driver2)  {
		
		this.driver=driver2;
		
	}
	
	
	
	
	
	
	public WebElement login() {
		
		return driver.findElement(log);
	}
	
	
	
     public WebElement signup() {
		
		return driver.findElement(sign);
	}
	
	
     public WebElement namefull() {
 		
 		return driver.findElement(name);
 	}
	
	
     public WebElement phone() {
 		
 		return driver.findElement(phn);
 	}
	
     public WebElement verify() {
 		
 		return driver.findElement(vrfy);
 	}
     
     
     //Login
     public WebElement email() {
  		
  		return driver.findElement(mail);
  	}
     
     
     public WebElement password() {
  		
  		return driver.findElement(pass);
  	}
     
     
     public WebElement gol() {
   		
   		return driver.findElement(boq);
   	}
     
     
     public WebElement gol1() {
   		
   		return driver.findElement(boq1);
   	}
     
     
     public WebElement Login1() {
    		
    		return driver.findElement(Logi);
    	}
     
     
     
     
     
     
}
