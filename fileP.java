package day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fileP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties pro = new Properties();

		FileInputStream input = new FileInputStream(
				"C:\\Users\\dhaka\\eclipse-workspace\\Selenium4\\src\\testdata.properties");
		pro.load(input);
		System.out.println(pro.getProperty("browser"));
		System.out.println(pro.getProperty("url"));

		FileOutputStream output = new FileOutputStream(
				"C:\\Users\\dhaka\\eclipse-workspace\\Selenium4\\src\\testdata.properties");
		pro.setProperty("city", "San Antonio");
		pro.store(output, "storing the city");

		pro.setProperty("url", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		pro.setProperty("uname", "Admin");
		pro.setProperty("pass", "admin123");
		pro.store(output, null);
	}

}
