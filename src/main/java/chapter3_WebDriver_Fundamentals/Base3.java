package chapter3_WebDriver_Fundamentals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base3 {
public static WebDriver driver;
	
	@BeforeMethod
	public void openbrowser() {//Browser opening method
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		driver.manage().window().maximize();
		}


	@AfterMethod
    public void closeingbrowser() {//Browser closing method
		driver.close();
		
    }

}
