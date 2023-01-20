package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set the path of executable Browser Driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhaka\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	
	
	
	
	// WebDriver is parent ChromeDriver 
	
// driver.get("http://selenium.dev");// opening url
 //System.out.println(driver.getTitle());//printing title
// driver.quit();// closing title
	
	driver.get("https://www.saucedemo.com/");
	//element
	//<input class="input_error form_input" placeholder="Username"
	//type="text" data-test="username" id="user-name" 
	//name="user-name" autocorrect="off" autocapitalize="none" value="">
	
	//by id
//driver.findElement(By.id("user-name")).sendKeys("standard_user");
	
	//by name
	//driver.findElement(By.name("user-name")).sendKeys("standard_user");
//by classname

      //driver.findElement(By.className("input_error")).sendKeys("standard_user");
	
//by tagname

//driver.findElement(By.tagName("input")).sendKeys("standard_user");

//by css selector
//	driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");

	//by Xpath
	//driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");

	
	//by link text
	driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
	//driver.findElement(By.linkText("Overview")).click();
	
	//by partial link text
	
	//driver.findElement(By.partialLinkText("Getting")).click();
	
	}

}
