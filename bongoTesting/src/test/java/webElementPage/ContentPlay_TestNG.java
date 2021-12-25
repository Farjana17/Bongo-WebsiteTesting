package webElementPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContentPlay_TestNG {
	@Test
	public void unittest() throws InterruptedException, AWTException {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//driver.get("https://bongobd.com/shows");
		driver.get("https://bongobd.com/watch/DoC1SZp3bP8");
		//driver.switchTo().newWindow(WindowType.TAB).get("https://bongobd.com/watch/DoC1SZp3bP8");
		
		Thread.sleep(3000);
		
		Robot rb= new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(4000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(4000);
		rb.keyPress(KeyEvent.VK_SPACE);
				
	
	}

}
