package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Websitepractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shop.inspiremore.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//		WebElement frame1 = driver.findElement(By.xpath("//iframe[@aria-hidden='true']"));
//		driver.switchTo().frame(frame1);
	
		WebElement search = driver.findElement(By.xpath("(//span[@class='icon icon-search'])[1]"));
		search.click();
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@type='search']"));
		inputbox.sendKeys("T shirts",Keys.ENTER);
		
		WebElement Tshirtclick = driver.findElement(By.xpath("//img[@class='product--image ProductImage-6672452223089 lazyautosizes lazyloaded']"));
		Tshirtclick.click();
		
		WebElement Tshirtcolour = driver.findElement(By.xpath("(//img[@class='product-single__thumb'])[3]"));
		Tshirtcolour.click();
		
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@data-index='option1']"));
		
		Select s=new Select(dropdown1);
		s.selectByValue("Asphalt");
		
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@data-index='option2']"));
		Select s1=new Select(dropdown2);
		s1.selectByIndex(2);
		
		WebElement clickbutton = driver.findElement(By.xpath("//div[@role='button']"));
		clickbutton.click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("shop-pay-login-iframe");
		
		WebElement emailentry = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		emailentry.sendKeys("smartsentha007@gmail.com",Keys.ENTER);
//		Actions a=new Actions(driver);
//	    a.moveToElement(search).perform();
		
		
		
		
		
	}

}
