package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivemethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\dhaka\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
	//driver.get("https://www.netflix.com/np/");
//	driver.manage().window().minimize();
//	String A=driver.getTitle();
//	System.out.println(A);
//	String getpagesource=driver.getPageSource();
//	System.out.println(getpagesource);
//	String currenturl=driver.getCurrentUrl();
//	System.out.println(currenturl);
//	driver.navigate().to("https://webdriveruniversity.com/");

//	driver.close();
//	driver.quit();
	//driver.findElement(By.id("id_email_hero_fuji" ))
//	.sendKeys("pg2@gmail.com");
		
	driver.get("https://www.saucedemo.com/");
//	 driver.findElement(By.id("user-name")).sendKeys("standard_user");
//	 driver.findElement(By.id("password")).sendKeys("secret_sauce");
//	 driver.findElement(By.id("login-button")).click();
//	//shift+ctrl+Ofor autoimporting
//	 List<WebElement> k = driver.findElements(By.className("inventory_item"));
//	 System.out.println(k.size());	
	String q1 = driver.findElement(By.tagName("h4")).getText();
	System.out.println(q1);
		
	}

}
