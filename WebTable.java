package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C://driver//chromedriver_win32//chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		int rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr")).size();
		System.out.println(rows);
		
		int columns = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th")).size();
		System.out.println(columns);
		
		for(int i=2;i<=rows;i++)
		{
			for(int j=1;j<=columns;j++)
			{
				String value = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+rows+"]/td["+columns+"]/a")).getText();
				System.out.println("value");
				
			}
			
			System.out.println();
		}
		
		
				

	}

}
