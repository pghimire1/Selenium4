package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Weblocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhaka\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//				
//				driver.get("https://www.saucedemo.com/");
//				
//				//to maximize window
//			driver.manage().window().maximize();
//			
//			//get current url
//		String A=driver.getCurrentUrl();
//		System.out.println(A);
//			
//			//get title
//		String title=driver.getTitle();
//		System.out.println(title);
//		
//		//close current tab close
//		driver.close();

		// close all tabs quit
		// driver.quit();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String B = driver.getTitle();
		System.out.println(B);
		String C = driver.getCurrentUrl();
		System.out.println(C);
		//driver.close();
	//	driver.quit();

	}

}
