package day1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Grouping {
	
WebDriver driver;
	
 @Test(priority=1,groups = {"smoke"})
 void openApp()
 {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	 
 }

	@Test(priority=2,groups = {"smoke"})
	void StudentForm()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div")).click();
		driver.findElement(By.id("item-0")).click();
		
	}
	
	
	@Test(priority=3,groups = {"regression"})
	void RegistrationForm()
	{
		driver.findElement(By.id("firstName")).sendKeys("latha");
		driver.findElement(By.id("lastName")).sendKeys("bayapureddy");
		driver.findElement(By.id("userEmail")).sendKeys("latha@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
		driver.findElement(By.id("userNumber")).sendKeys("9986019419");
		driver.findElement(By.id("dateOfBirthInput")).sendKeys("11_06_1993");
		driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("english");
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label"));
		driver.findElement(By.id("currentAddress")).sendKeys("bt414df,,antrim");

		WebElement nameElement  =  driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]"));
		Select countryNameDropdown = new Select(nameElement);
		countryNameDropdown.selectByValue("Rajasthan");
		
		driver.findElement(By.id("submit")).click();		
		
		
	}

}
