package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ApacheDataDrivenTest {
	WebDriver driver;
	
  @Test(dataProvider="loginData")
  public void loginTest(String user,String pwd,String exp)
  {
	 driver.get("https://demo.guru99.com/V4/");
	 WebElement txtEmail=driver.findElement(By.name("uid"));
	 txtEmail.clear();
	 txtEmail.sendKeys(user);
	 
	 WebElement txtPswd= driver.findElement(By.name("password"));
	 txtEmail.clear();
	 txtEmail.sendKeys(pwd);
	 
	 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	 driver.switchTo().alert().accept(); //closing popup by using accept	
	
	 
  }
  
  @DataProvider(name="loginData")
  public String [][]  getData()
  {
	String loginData[][]= {{"latha@gmail.com","admin","valid"},
		                   {"lata@gmail.com","admin","invalid"},
		                   {"lathaa@gmail.com","1234","invalid"},
		                   {"lathi@gmail.com","admin","invalid"}         
			
	                      };
	return loginData;
	
  } 
@AfterClass
void tearDown()
	 
     {
		 driver.close();
	 }
	
  }
  
  
  

