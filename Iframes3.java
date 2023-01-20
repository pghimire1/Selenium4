package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhaka\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert"
			);
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/button")).click();
		System.out.println(driver.getTitle());
		
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
	
//		
		
		
		
		
		
		
		
		
	}

}
