package facebookautomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class robotClass {
	public WebDriver driver;
	@BeforeMethod
	public void driverSetup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\souna\\Driverfortesting\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void keyboardOpt() throws AWTException, InterruptedException {
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Robot robot = new Robot();
		
		
		//Email address field
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_K);
		robot.keyRelease(KeyEvent.VK_K);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		//Password Field
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_K);
		robot.keyRelease(KeyEvent.VK_K);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		
		Thread.sleep(2000);
		
		WebElement click = driver.findElement(By.linkText("Log in"));
		
		int x = click.getLocation().getX();
		int y = click.getLocation().getY();
		
		robot.mousePress(x);
		robot.mousePress(y);
		
		robot.mouseRelease(x);
		robot.mouseRelease(y);
		
		Thread.sleep(3000);
		
		robot.mouseWheel(2);
		
		driver.close();
		driver.quit();
	}

}
