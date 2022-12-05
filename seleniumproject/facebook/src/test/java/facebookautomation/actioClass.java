package facebookautomation;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class actioClass {
	public WebDriver driver;
	@BeforeMethod
	public void driverSetup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\souna\\Driverfortesting\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void using_MovetoElement() throws InterruptedException, AWTException {
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		Robot rbt = new Robot();
		rbt.mouseWheel(1);
		
		driver.switchTo().frame(0);
		WebElement srcDrop = driver.findElement(By.id("draggable"));
		WebElement dstnDrop = driver.findElement(By.id("droppable"));
		
		Actions actn = new Actions(driver);
		actn.moveToElement(srcDrop).clickAndHold().perform();
		Thread.sleep(3000);
		actn.release(dstnDrop).perform();
		Thread.sleep(3000);
	}
	
	@Test
	public void contextClick_withKeyBoardFunctions() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Earth");
		WebElement click = driver.findElement(By.name("q"));
		Actions actn = new Actions(driver);
		actn.contextClick(click).perform();
		actn.sendKeys(Keys.DOWN).perform();
		Thread.sleep(3000);
		actn.sendKeys(Keys.DOWN).perform();
		Thread.sleep(3000);
		actn.sendKeys(Keys.DOWN).perform();
		Thread.sleep(3000);
		actn.sendKeys(Keys.ENTER).perform();
		
		driver.close();
		
	}

}
