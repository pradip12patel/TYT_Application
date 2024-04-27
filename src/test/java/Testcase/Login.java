package Testcase;

import java.time.Duration;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjetModel.TYTObjetclass;
import Resources.Baseclass;

public class Login extends Baseclass {
	
	 
    @Test(dataProvider = "data")
	public void loginTYT(String email, String password) {
		 

			TYTObjetclass obj=new TYTObjetclass(driver);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		    obj.login().click();
		    
		    obj.email().sendKeys(email);
		    obj.password().sendKeys(password);
		    obj.gol().click();
		    obj.gol1().click();
		    obj.Login1().click();
		    
		
	
	
	
	 }
	
	
	
	
	
	
	
	@DataProvider
	 Object[][]     data()  {
	
	 Object[][]   datas = new Object[2][2];
	 
	 datas[0][0] = "patel9826ravi@gmail.com";
     datas[0][1] = "Ravi123@4";
	 datas[1][0] = "patel9826@gmail.com";
	 datas[1][1] = "sumit12@4";
					 
					 
	  return datas;
	
	
	
	
	 
	}

   }
