package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhaka\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	
	WebElement dropdown=driver.findElement(By.id("dropdowm-menu-2"));
	
	Select select=new Select(dropdown);
//select by index
	//select.selectByIndex(2);
	
	//select by txt
	//select.selectByVisibleText("TestNG");
	
	//select by value
	select.selectByValue("junit");
	
	
	
	
	}

}
