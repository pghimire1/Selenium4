package day1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhaka\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		

//Implicit wait
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
//		driver.manage().window().maximize();
//	    WebElement e = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
//	    Actions action = new Actions(driver);
//	    action.moveToElement(e).perform();
//	

		// Explicit wait

//	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
//	wait.until(ExpectedConditions.elementToBeClickable(e));
//	 driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a")).click();
//	
		// fluent wait
//		driver.get("https://www.google.com/");
//		driver.findElement(By.name("q")).sendKeys("abcd");
//		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
//		driver.findElement(By.linkText("ChuChu TV Classics - ABCD Song in Alphabet Water Park"));
//		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

	}

}
