package day1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageTitle {

	public static void main(String[] args) {

     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("htps //microsoft.com/devicelogin");
     
     //actual title
     String my_title=driver.getTitle();
     
     System.out.println("title is "+my_title);
     
     String expected_title="Add a device to your Microsoft account";
     
     Assert.assertEquals(my_title, expected_title);
     System.out.println("test completed");
		
	}

}
