package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		driver.manage().window().maximize();
		
		List<WebElement> table = driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//tr[4]"));
		for(WebElement x:table) {
			String text = x.getText();
			System.out.println(text);
		}
		
	}

}
