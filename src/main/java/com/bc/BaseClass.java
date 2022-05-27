package com.bc;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	
	public void getDriver() {
     WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
	}
	
	public void loadUrl(String url) {
		driver.get(url);
	}
	
	public void type(WebElement element, String text) {
		element.sendKeys(text);
	}
	public void maximize() {
    driver.manage().window().maximize();
	}
	public void click(WebElement element) {   
		element.click();
	}
	public String getTitle() {
     String title = driver.getTitle();
	return title;
     }
	public String getCurrent() {
    String currentUrl = driver.getCurrentUrl();
	return currentUrl;
	}
	public WebElement elementById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}
	public WebElement elementByName(String name) {
    WebElement element = driver.findElement(By.name(name));
	return element;
	
	}
	public WebElement elementByClass(String className) {
		WebElement element = driver.findElement(By.className(className));
		return element;
	}
	public WebElement elementByXpath(String xpathExpression) {
    WebElement element = driver.findElement(By.xpath(xpathExpression));
	return element;
	}
	public void windowClose() {
    driver.close();
	}
	public void browserClose() {
    driver.quit();
	}
	public String windowHandle() {
    String handle = driver.getWindowHandle();
	return handle;
	}
	public Set<String> windowHandles() {
    Set<String> handles = driver.getWindowHandles();
	return handles;
	}
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
    }
    public void naviUrl(String url) {
    driver.navigate().to(url);
	}
    public void naviForward() {
    driver.navigate().forward();
	}
    public void naviBackward() {
    driver.navigate().back();
	}
    public void naviCurrentWeb() {
    driver.navigate().refresh();
	}
    public void naviClose() {
    driver.close();
	}
    public void clearCookies() {
    driver.manage().deleteAllCookies();
	}
    public void windowSize(Dimension size) {
    driver.manage().window().setSize(size);
	}
    public void windowPosition(Point ption) {
    driver.manage().window().setPosition(ption);
	}
    
   
    
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
