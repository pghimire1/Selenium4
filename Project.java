package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Project {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhaka\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// registration
		driver.get("https://qatest.commentsoldrt.com/webstore-register?destination=/account");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#customer-first-name")).sendKeys("Pratibha");
		driver.findElement(By.cssSelector("#customer-last-name")).sendKeys("Ghimire");
		driver.findElement(By.cssSelector("#customer-email")).sendKeys("dhakal50@gmail.com");
		driver.findElement(By.cssSelector("#customer-password")).sendKeys("PgSd1122");
		// driver.findElement(By.cssSelector("#login-section > form > button")).click();
		// login
		driver.findElement(By.cssSelector("#login-section > form > a")).click();

		driver.findElement(By.cssSelector("#email")).sendKeys("dhakal50@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("PgSd1122");
		driver.findElement(By.cssSelector("#login-section > form > button.ws-v2-button-primary.mt-1r")).click();

		// driver.findElement(By.cssSelector("#login-section > form > a")).click();
		// driver.findElement(By.cssSelector("#pink-button")).click();
		//add to cart
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'Shop')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("body > div.ReactModalPortal > div > div > div > button > svg")).click();
		driver.findElement(By.xpath(
				"(//a[@class=\"text-nav lg:text-nav-lg inline-block my-4 border-transparent hover:border-current uppercase\"])[2]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/div[3]/div[2]/div[2]/div[2]/div/a")).click();

		Thread.sleep(5000);
		
	driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("a[href=\"/checkout\"]")).click();
	
	// adding delivery Address
	
//	driver.findElement(By.xpath("(//button[@class=\"_pill-button\"])[2]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.cssSelector("input[autocomplete=\"address-line1\"]")).click();
//	driver.findElement(By.cssSelector("input[autocomplete=\"address-line1\"]")).sendKeys("2327 Ruby Oaks");
//	driver.findElement(By.cssSelector("input[name=\"locality\"]")).sendKeys("San Antonio");
//	WebElement drop = driver.findElement(By.cssSelector("select[name=\"state\"]"));
//	Select select = new Select(drop);
//	select.selectByValue("TX");
//	driver.findElement(By.cssSelector("input[autocomplete=\"postal-code\"]")).sendKeys("78232");
//	Thread.sleep(5000);
//	driver.findElement(By.cssSelector("button[id=\"save-button\"]")).click();

	// switching iframe
			// payment
			driver.findElement(By.xpath("//label[contains(@for, 'credit-card')]")).click();

			WebElement credit = driver.findElement(By.cssSelector("iframe[title=\"Secure card payment input frame\"]"));
			driver.switchTo().frame(credit);

			
			driver.findElement(By.cssSelector("input[name=\"cardnumber\"]")).sendKeys("5544 5544 5544 5544");
			driver.findElement(By.cssSelector("input[name=\"exp-date\"]")).sendKeys("12/25");
			driver.findElement(By.cssSelector("input[name=\"cvc\"]")).sendKeys("346");
			driver.findElement(By.cssSelector("input[name=\"postal\"]")).sendKeys("78232");

			driver.switchTo().parentFrame();
			driver.findElement(By.id("stripe-button")).click();
			driver.findElement(By.cssSelector("button[id=\"stripe-button\"]")).click();
	 
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[contains(text(),'Add Code ')]")).click();
			driver.findElement(By.cssSelector("input[placeholder=\"Enter Code\"]")).sendKeys("1TIMEONLY");
			driver.findElement(By.id("save-button")).click();
			driver.findElement(By.cssSelector("button[class=\"_cta-button\"]")).click();
			//logout
			driver.findElement(By.cssSelector("a[class=\"webstore-checkout-btn\"]")).click();
			driver.quit();
	}
}
