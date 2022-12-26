package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions {


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C://driver//chromedriver_win32//chromedriver");
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
	
		WebElement source_Element = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement target_Element = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	 
		Action act = new Action (driver);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		

	}

}
