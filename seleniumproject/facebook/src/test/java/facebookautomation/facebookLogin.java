package facebookautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class facebookLogin{
public WebDriver driver;
@BeforeMethod
public void driverSetup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\souna\\driverfortest\\chromedriver.exe");
	driver = new ChromeDriver();
}
@Test
public void openFacebookPage(){
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	String url = driver.getCurrentUrl();
	System.out.println(url);
	String source = driver.getPageSource();
	System.out.println(source);
	driver.close();
	}
@Test
public void login() throws InterruptedException  {
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("email")).sendKeys("Ssarkar2");
	Thread.sleep(2000);
	
	driver.findElement(By.id("pass")).sendKeys("Sarkar99");
	Thread.sleep(2000);
	
	 driver.findElement(By.name("login")).click();
	 Thread.sleep(2000);
	 
	 driver.close();
	} 

@Test
public void forgetPass() throws InterruptedException {
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.partialLinkText("Forgotten password?")).click();
	Thread.sleep(2000);
	
	driver.close();
	}
}
