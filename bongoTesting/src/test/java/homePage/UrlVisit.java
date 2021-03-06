package homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlVisit {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		//webdriver object
		WebDriver driver= new ChromeDriver();
		driver.get("https://bongobd.com/");
		
		//capture title
		System.out.println("The Title of the page is: "+driver.getTitle());
		//capture current url
		System.out.println("The Current url of the page is: "+driver.getCurrentUrl());
		//capture page source code
		System.out.println("The Source code of the page is: "+driver.getPageSource());
		
		//window maximize,fullscreen & minimize
		driver.manage().window().maximize();
		
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		
		//driver.manage().window().minimize();
		
		//Navigate function
		driver.navigate().to("https://www.daraz.com.bd/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(4000);
//		driver.navigate().refresh();
		
		//open the new tab
		driver.switchTo().newWindow(WindowType.TAB).get("https://rokomari.com/");
		
		//close the current tab
		driver.close();
		Thread.sleep(3000);
		
		//close the browser
		//driver.quit();
		
		
	}

}
