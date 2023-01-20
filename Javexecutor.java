package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javexecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhaka\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
				driver.manage().window().maximize();
				WebElement  e =driver.findElement(By.id("iframeResult"));
		//System.out.println(driver.getTitle());
				//String script = "return document.title;";
				JavascriptExecutor js = (JavascriptExecutor) driver;
			//	String title = (String)(js.executeScript(script));
			//	System.out.println(title);
				
// click button
				
//				driver.switchTo().frame(e);
//				driver.findElement(By.xpath("/html/body/button")).click();
//			driver.switchTo().alert().accept();
		

				
// Javascript
				
//		//	js.executeScript("myFunction()");
//		 //   Thread.sleep(3000);
//		//	driver.switchTo().alert().accept();
		
		
		
// Highlight element
				
			//	WebElement e1 = driver.findElement(By.xpath("/html/body/button"));
			//	js.executeScript("arguments[0].style.border='5px solid green'", e1);
		// scroll to view		
				driver.navigate().to("https://www.w3schools.com/");
				WebElement e2 = driver.findElement(By.xpath("//*[@id=\"howto_padding\"]/a"));
				js.executeScript("arguments[0].scrollIntoView(true);", e2);
		
	}

}
