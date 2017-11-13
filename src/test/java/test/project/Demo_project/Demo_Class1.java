package test.project.Demo_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Demo_Class1 {
	WebDriver driver=null;
	
	@BeforeTest
	public void beforeTest() {
	//		driver=new FirefoxDriver();
			String driverPath = "./drivers/ubuntu/chromedriver";
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver=new ChromeDriver();
			driver.get("https://www.google.co.in");
			driver.manage().window().maximize();
	}
  @Test
  public void f() {
	  	driver.navigate().refresh();
	  	System.out.println("Test Success");
	  
  }


  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
