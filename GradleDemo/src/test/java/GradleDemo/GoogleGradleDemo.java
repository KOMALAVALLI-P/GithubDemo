package GradleDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class GoogleGradleDemo {
@Test
public void Login()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1205\\Downloads\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    driver.get("https://www.linkedin.com/");
    driver.manage().window().maximize();
}
}
