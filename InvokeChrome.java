package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32\\chromedriver");
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver-v0.32.0-win-aarch64.zip\\geckodriver");
		System.setProperty("webdriver.IEdriver", "C:\\driver\\IEDriverServer_Win32_4.5.0\\IEdriverserver");

		WebDriver driver=new ChromeDriver();
		WebDriver driver1=new FirefoxDriver();
		WebDriver driver2=new InternetExplorerDriver();		
		
		driver.get("https://www.google.com/");
		
		
		

	}

}
