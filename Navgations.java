package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navgations {

	public static void main(String[] args) {
	

		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C://driver//chromedriver_win32//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("navigation commands");
		driver.findElement(By.name("btnk")).submit();
		driver.navigate().to("https://facebook.com");
		driver.findElement(By.name("firstname")).sendKeys("latha");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		

	}

}
