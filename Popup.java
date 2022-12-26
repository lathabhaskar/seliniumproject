package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C://driver//chromedriver_win32//chromedriver");
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		driver.findElement(By.name("emailid")).sendKeys("latha.eengg@gmail.com");
		driver.findElement(By.name("btnLogin")).submit();
		
		

	}

}
