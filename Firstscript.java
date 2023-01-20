package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//set the path of executable Browser Driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhaka\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
	// WebDriver is parent ChromeDriver 
	
 driver.get("http://selenium.dev");// opening url
 System.out.println(driver.getTitle());//printing title
 driver.quit();// closing title
	
	
	}

}
