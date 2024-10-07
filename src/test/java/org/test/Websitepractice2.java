package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Websitepractice2 extends Baseclass {
	public static void main(String[] args) throws AWTException {
		
		browserLaunch();
		
		urlLaunch("https://verabradley.com/");
		impwait(10);
		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement USclick = driver.findElement(By.xpath("(//button[@class='hide-country-overlay'])[1]"));
		click(USclick);
//		
		WebElement USsearch = driver.findElement(By.xpath("//a[@class='block-title search-toggle']"));
		click(USsearch);
//		
		WebElement Enter = driver.findElement(By.xpath("//input[@placeholder='Search Vera Bradley']"));
		sendkeys(Enter,"Handbag");		
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement imageclick = driver.findElement(By.xpath("//p[text()='Rothvale Shoulder Bag']"));
		click(imageclick);
		
		WebElement colour = driver.findElement(By.xpath("(//img[@fetchpriority='high'])[18]"));
		click(colour);
		
		WebElement addtocart = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		click(addtocart);
		
		//		WebElement image = driver.findElement(By.xpath("(//p[text()='Portnoy Belt Bag'])[4]"));
//		image.click();
		
		
//		Select s=new Select(dropdown);
//		s.selectByVisibleText("Price, high to low");
		
		
		
		
	}

}
