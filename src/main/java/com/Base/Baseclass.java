package com.Base;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
	public static Select sel;
	public static WebDriver driver;
	public static WebElement element; 
	public static WebDriver borswerLanuch(String borwserName) {
		
		if(borwserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\MavenProject\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			}
			
			else if (borwserName.equalsIgnoreCase("firefox")) {
				
				System.setProperty("webdriver.chrome.driver",
						"D:\\MavenProject\\Driver\\chromedriver.exe");
				driver = new FirefoxDriver();	
			}
			else if(borwserName.equalsIgnoreCase("internetexplorer")) {
				
				System.setProperty("webdriver.chrome.driver",
						"D:\\MavenProject\\Driver\\chromedriver.exe");
				driver = new InternetExplorerDriver();
				
			}
			else {
				System.out.println("Borwser is not install");
			}
			
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void  getUrl(String url) {
		
		driver.get(url);
	}
	
	public static WebElement locater(String locaterName, String locater) {
		
		if (locaterName.equalsIgnoreCase("xpath")) {
		  element = driver.findElement(By.xpath(locater));
		}
		else if(locaterName.equalsIgnoreCase("name")) {
			element = driver.findElement(By.name(locater));
		}
		else if (locaterName.equalsIgnoreCase("id")) {
			element = driver.findElement(By.id(locater));
		}
		return element;
		
	}
	public static void sendValues(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public static void click(WebElement element) {
	       element.click(); 
	}
	public static void clear(WebElement element) {
		element.clear();
	}
	
	public static void closeWindow() {
		driver.close();
	}
	
	public static void quitWindow() {
		driver.quit();
	}
	
	public static void toNavigate(String url) {
		
		driver.navigate().to(url);
	}
	public static void backNavigate() {
		driver.navigate().back();
	}
	public static void forwardNavigate() {
		driver.navigate().forward();
	}
	public static void refreshNavigate() {
		driver.navigate().refresh();
	}
	
	public static boolean enable(WebElement element) {
		boolean a = element.isEnabled();
		return a;
	}
	
	public static  boolean display(WebElement element) {
		boolean dis = element.isDisplayed();
		return dis;
				}
	public static boolean selected(WebElement element) {
		boolean select = element.isSelected();
		return select;
	}
	public static void screenshot(String filename) throws IOException {
		TakesScreenshot screen = (TakesScreenshot)  driver;
        File scoure = screen.getScreenshotAs(OutputType.FILE);	
		
		File dest = new File("D:\\MavenProject\\Screentake\\"+ filename +"png");
		FileUtils.copyFile(scoure, dest);
	}
		
	public static void selectMethod(WebElement element, String selectType, String value, int number ) {
		sel = new Select(element);
		
		if(selectType.equalsIgnoreCase("index")) {
		sel.selectByIndex(number);
		}
		else if(selectType.equalsIgnoreCase("Value")) {
		sel.selectByValue(value);
		}
		else if (selectType.equalsIgnoreCase("visibletext")) {
		sel.selectByVisibleText(value);
		}
	}
	
	public static void deselectMethod(WebElement element, String selectType, String value, int number) {
		sel =new Select(element);

		if(selectType.equalsIgnoreCase("index")) {
		sel.deselectByIndex(number);
		}
		else if(selectType.equalsIgnoreCase("Value")) {
		sel.deselectByValue(value);
		}
		else if (selectType.equalsIgnoreCase("visibletext")) {
		sel.deselectByVisibleText(value);
		
		}
	}
	
	public static boolean multipleNot(WebElement element) {
		sel = new Select(element);
		boolean multiple = sel.isMultiple();
		return multiple;
	}
	
	public static void options(WebElement element) {
		sel = new Select(element);
		List<WebElement> options = sel.getOptions();
		
		for (WebElement webElement : options) {
			
			System.out.println(webElement.getText());
		}
	}
	
	public static void firstOption(WebElement element) {
		
		sel = new Select(element);
		System.out.println(sel.getFirstSelectedOption().getText());
		
	}
	
	public static void allOptions(WebElement element) {
		sel = new Select(element);
		List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();
		for (WebElement a : allSelectedOptions) {
			
			System.out.println(a.getText());
			}
		
	}
	public static void allDeseleceted(WebElement element) {
		sel = new Select(element);
		sel.deselectAll();
	}

	
	
	
	
	
	
	
}
