package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhaka\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/IFrame/index.html");
		WebElement frame = driver.findElement(By.id("frame"));
		driver.switchTo().frame(frame);
		driver.findElement(By.cssSelector("a[href=\"index.html\"]")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().parentFrame();
		
		
}}
