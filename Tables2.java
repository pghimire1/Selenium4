package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tables2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhaka\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/swaminarayan-pro-twenty-2022-23-1342104/mafuko-mavericks-vs-play-master-warriors-14th-match-1342125/full-scorecard");

//		List<WebElement> totalTable = driver.findElements(By.xpath("//*[table]"));
//		System.out.println(totalTable.size());
//		int ctables = totalTable.size();
//		
//		
//		
		List<WebElement> rowElements = driver.findElements(By.xpath("//*[@id=\"main-container\"]/div[5]/div[1]/div/div[3]/div[1]/div[2]/div[1]/div[2]/div/div[2]/table[1]/tbody/tr"));
		System.out.println(rowElements.size());
		int rowsize = rowElements.size();
		
	
		List<WebElement> ColumnElements = driver.findElements(By.xpath("//*[@id=\"main-container\"]/div[5]/div[1]/div/div[3]/div[1]/div[2]/div[1]/div[2]/div/div[2]/table[1]/tbody/tr[1]/td"));
		System.out.println(ColumnElements.size());
		int columnsize = ColumnElements.size();
		
		
String txt=	driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[5]/div[1]/div/div[3]/div[1]/div[2]/div[1]/div[2]/div/div[2]/table[1]/tbody/tr[1]/td[3]/strong")).getText();
	System.out.println(txt);
	
	for(int i=1; i<rowsize; i++) {
		String text=driver.findElement(By.xpath("driver.findElement(By.xpath(\"//*[@id=\\\"main-container\\\"]/div[5]/div[1]/div/div[3]/div[1]/div[2]/div[1]/div[2]/div/div[2]/table[1]/tbody/tr[" + i + "]/td[3]")).getText();
	System.out.println(text);
	}
	
	
	
	
	}}



	
	