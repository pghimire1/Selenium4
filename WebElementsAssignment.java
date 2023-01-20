package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhaka\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
	//driver.get("http://automationpractice.com/index.php");
	//send keys
	//driver.findElement(By.id("search_query_top")).sendKeys("dress");
	//click
	//driver.findElement(By.name("submit_search")).click();
	//get attribute
	//String att=driver.findElement(By.cssSelector("input[id=\"search_query_top\"]")).getAttribute("type");
	//System.out.println(att);
	//get text
	//String txt=driver.findElement(By.tagName("span")).getText();
	//System.out.println(txt);
	 
	//get tag name
	// String tg=driver.findElement(By.name("search_query")).getTagName();
	//System.out.println(tg);
	
	//get cssvalue
	
	//String color=  driver.findElement(By.tagName("input")).getCssValue("color");
  //  System.out.println(color);
		
		//driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
	//driver.findElement(By.name("email_create")).sendKeys("Pghimire.msstate@gmail.com");
	//driver.findElement(By.name("SubmitCreate")).click();
		
	driver.get("http://automationpractice.com/index.php");
	//boolean val=driver.findElement(By.name("submit_search")).isDisplayed();
	//System.out.println(val);
	
	boolean val1=driver.findElement(By.name("submit_search")).isEnabled();
		System.out.println(val1);
	
	}

}
