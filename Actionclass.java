package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhaka\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		
		
		// create object of the class
		
		Actions  a = new Actions (driver);
	//	WebElement e = driver.findElement(By.id("double-click"));
	//	a.doubleClick(e).perform();
		
		//Drag and Drop
		//act.dragAndDrop(from,to).build.perform();
	//	WebElement from = driver.findElement(By.cssSelector("#draggable"));
//		WebElement to = driver.findElement(By.cssSelector("#droppable"));
//		a.dragAndDrop(from,to).build().perform();
	
	// Arrangement , action , assertion	// Click and Hold()
	
//	WebElement e2 = driver.findElement(By.cssSelector("#click-box"));
//	a.moveToElement(e2);
//	a.clickAndHold().perform();
//	
		
		// Context click(need to ask, confused )
	//	WebElement e3 = driver.findElement(By.cssSelector("#double-click"));		a.contextClick(e3).perform();
	//	a.contextClick(e3).perform();
		
		
		// Hover over element
		
		WebElement e4 =  driver.findElement(By.cssSelector(".dropbtn"));
		a.moveToElement(e4).perform();
		
		// div[style='float:center;'] > button 
		
	//  Javascript
					// element created , element update , element delete , element retrive
					// attribute of element --> retrive , update , delete , added
					
		
		
		
	}

}
