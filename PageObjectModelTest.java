package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageObjectModelTest {
  @Test
  public void pageurl() 
  {
	System.setProperty("webdriver.chrome.driver", "C://driver//chromedriver_win32//chromedriver");
	WebDriver driver=new ChromeDriver();
	PageObjectModel headers= new PageObjectModel(driver);
	
	

  }
}
