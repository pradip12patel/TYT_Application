package Testcase;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjetModel.TYTObjetclass;
import Resources.Baseclass;
import Resources.constantMethod;

public class Register extends Baseclass {
	
	
	@Test
  public void registration()  {
		
		TYTObjetclass obj=new TYTObjetclass(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		obj.login().click();
		obj.signup().click();
		
		obj.namefull().sendKeys(constantMethod.name);
		obj.phone().sendKeys(constantMethod.phone);
		obj.verify().click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
