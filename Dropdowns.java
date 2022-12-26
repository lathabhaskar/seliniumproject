package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C://driver//chromedriver_win32//chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement nameElement  =  driver.findElement(By.name("country"));
		Select countryNameDropdown = new Select(nameElement);
		countryNameDropdown.selectByValue("KUWAIT");
		
		
		
	}

}
