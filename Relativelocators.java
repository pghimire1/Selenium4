package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativelocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhaka\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
	}

}
