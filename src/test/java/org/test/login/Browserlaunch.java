package org.test.login;

import java.util.concurrent.TimeUnit;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserlaunch extends Baseclass {
	public static void main(String[] args) {
		
		browserLaunch();
	 
		urlLaunch("https://www.facebook.com/"); 
		
		impwait(10);
		
	    WebElement Username = driver.findElement(By.xpath("//input[@type='text']"));
	    sendkeys(Username, "tamil");
	    
	    WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	    password.sendKeys("1234567890");
	    
	    WebElement button = driver.findElement(By.xpath("//button[@value='1']"));
	    button.click();
	}

}
