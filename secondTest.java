package day1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class secondTest {
	public class NewTest {
		WebDriver driver;
		
	 @BeforeClass
	 void openApp()
	 {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		 

	 }
	 
	 @Test(dataProvider="dp")
	 void TestLogin(String email, String pswd)
	 {
		 driver.findElement(By.name("email")).sendKeys(email);
		 driver.findElement(By.name("passwd")).sendKeys(pswd);
		 driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		 
		 String exp_title="guru demo site";
		 String actual_title=driver.getTitle();
		 
		 Assert.assertEquals(exp_title, actual_title);
		 
	 }
	 
	 @AfterClass
	 void tearDown()
	 {
		 driver.close();
	 }
	 
	 @DataProvider(name="dp")
	 String[][] loginTest()
	 {
		 String data[][]={ {"abc@gmail.com","1234"},
				           {"bcd@gmail.com","5678"},
				           {"efg@gmail.com","91011"},
				           {"hij@gmail.com","1213"}		 
		 
		                 };
		 
		 return  data;
		 
		 }
		 
		 
	 
	}
}
