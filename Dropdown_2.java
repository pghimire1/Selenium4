package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhaka\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.sugarcrm.com/request-demo/");
	driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
WebElement ddown=driver.findElement(By.name("awareness_source_c"));
	Select select=new Select(ddown);
	
	
	select.selectByIndex(3);
	Thread.sleep(2000);
	select.selectByVisibleText("Internet");
	Thread.sleep(2000);
	select.selectByValue("Event");
	Thread.sleep(2000);
	
	
	
	
	}

}
