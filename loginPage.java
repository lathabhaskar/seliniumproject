package day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginPage {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C://driver//chromedriver_win32//chromedriver");
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("latha.eengg@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("1235");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();		
		

	}

}
