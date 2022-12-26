package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadiobuttonAndCheckboxes {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C://driver//chromedriver_win32//chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("webform")).submit();
		//total number of checkboxes
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("/html/body/div[4]/strong[2] and @type='checkbox'"));
		System.out.println("total number of checkboxes:"+checkboxes.size());
		
		for(int i=0;i<2;i++)
		{	
			
		checkboxes.get(i).click();

	    }
		

}

}