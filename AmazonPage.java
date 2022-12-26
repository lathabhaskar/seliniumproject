package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPage {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();		
	driver.manage().window().maximize();
	//open URL
	driver.get("https://www.amazon.in/ref=nav_logo");
	//provide username
	//WebElement txtUsername=driver.findElement(By.name("email"));
	//txtUsername.sendKeys("Admin");
	driver.findElement(By.name("email")).sendKeys("latha.eengg@gmail.com");
		
	//provide pasword
	driver.findElement(By.name("password")).sendKeys("chgchg123");
	
	
	//click on login
	driver.findElement(By.xpath("//*[@id=\"auth-signin-button\"]")).click();
	
	//verify title of page 
	
	String act_title=driver.getTitle();
	String exp_title="amazon.in";
	
	
	if(act_title.equals(exp_title))
	{
		System.out.println("test passed");
	}
	else 
	{
	
		System.out.println("test failed");
	
	}
	
	//close browser
	driver.close();
	}
}
	
	



