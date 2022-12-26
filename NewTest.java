package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	WebDriver driver;
	
 @BeforeMethod
 void openApp()
 {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/login.html");
	 

 }
 
 @Test
 void Login()
 {
	 driver.findElement(By.name("email")).sendKeys("latha@gamil.com");
	 driver.findElement(By.name("passwd")).sendKeys("12345");
	 driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
	 
 }
 
 @AfterMethod
 void close()
 {
	 driver.quit();
 }
 
}
