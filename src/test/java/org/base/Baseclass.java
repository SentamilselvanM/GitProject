package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;
//other name for base class is below
//Functional library
//super class
//parent class
//utility class
//base class
//it is useed for code simplify,reduce,reuse
public class Baseclass {
	public static WebDriver driver;
     public static WebDriver browserLaunch() {
        WebDriverManager.chromedriver().setup();
    	return driver=new ChromeDriver();
		
	}
     
public static void urlLaunch(String url) {
	driver.get(url);
	driver.manage().window().maximize();
}
public static void impwait(long sec) {
	driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

}
public static void sendkeys(WebElement e,String value) {
	e.sendKeys(value);

}

public static void click(WebElement e) {
	e.click();

}

public static void quit() {
	driver.quit();

}

public static void close() {
	driver.close();

}

public static String getAttribute(WebElement e,String value) {
	String att = e.getAttribute(value);
    System.out.println(att);
    return att;
}

public static String getCurrenturl() {
	String url = driver.getCurrentUrl();
    System.out.println(url);
	return url;
}

public static void getText(WebElement e,String value) {
	String text = e.getText();
    System.out.println(text);
}

public static void movetoElement(WebElement t) {
	Actions a=new Actions(driver);
    a.moveToElement(t);
}


public static void dragAndDrop(WebElement src,WebElement des) {
	Actions a=new Actions(driver);
    a.dragAndDrop(src, des);
}

public static void selectByIndex(WebElement e,int index) {
	Select s=new Select(e);
	s.selectByIndex(index);
}

public static void deSelectByIndex(WebElement e,int index ) {
	  Select s=new Select(e);
	  s.deselectByIndex(index);

}


}









