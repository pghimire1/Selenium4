package day1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhaka\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html"
				);
		
//		WebElement checkbox2=driver.findElement(By.cssSelector("input[value=\"option-2\"]"));
//		checkbox2.click();
//		if (checkbox2.isSelected()){
//			System.out.println("checkbox selected");
//		}
//			else {
//				System.out.println("checkbox not selected");
//			
			
		//selecting all checkboxes

//List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
//
//for(int i = 0 ; i < checkboxes.size() ; i++ ) {
//	System.out.println(i);
//	if(!checkboxes.get(i).isSelected()) {		checkboxes.get(i).click();
//	}
		
	// radio button
		
WebElement Bluebutton =driver.findElement(By.cssSelector("input[value=\"blue\"]"));
Bluebutton.click();
		if(Bluebutton.isSelected())
			System.out.println("selected");
		
	else {
		System.out.println(" not selected.");
		}
		
		
		//select all radio button
//	List<WebElement>colorbutton=driver.findElements(By.cssSelector("input[name=\"color\"]"));
//	for(int a=0; a< colorbutton.size(); a++) {
//		System.out.println(a);
//		if(!colorbutton.get(a).isSelected()) {
//			colorbutton.get(a).click();
//		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
		
		
		
			
		
		
		
		
		
		
		
		
		
		
	


