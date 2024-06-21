package com.Assessment;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Base extends GeneralConstants {
	
public static WebDriver driver;
	
	public static WebDriver browserlaunch(String url) {
	     driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	 }
	
	public static void page_Title() {
		driver.getTitle();
	}
	
	public static void page_Url() {
		driver.getCurrentUrl();
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void navi_To(String url) {
		driver.navigate().to(url);
	}
	
	public static void navi_Back() {
		driver.navigate().back();
	}
	
	public static void navi_Forward() {
		driver.navigate().forward();
	}
	
	public static void navi_Refresh() {
		driver.navigate().refresh();
	}
	
	public static void sendkeys(WebElement ref,String keys) {
		ref.sendKeys(keys);
    }
	
	public static void checkbox(WebElement element) {
		element.click();    
    }
	
	public static void get_Text(WebElement element) {
        System.out.println(element.getText());
	}
	
	public static void is_Displayed(WebElement element) {
		boolean display = element.isDisplayed();
		System.out.println(display);
	}
	
	public static void get_Attribute(WebElement element,String value) {
		System.out.println(element.getAttribute(value));
	}
	
	public static void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}
	
	public static void is_Selected(WebElement element) {
		boolean select = element.isSelected();
		System.out.println(select);
	}
	
	public static void clear(WebElement element) {
		element.clear();
	}
	
	public static void selectbyvalue_Dropdown(WebElement value,String value1) {
		Select s = new Select(value);
		s.selectByValue(value1);
	}
	
	public static void selectbyindex_Dropdown(WebElement value,int value1) {
		Select s = new Select(value);
		s.selectByIndex(value1);
	}
	
	public static void selectbyvisibletext_Dropdown(WebElement element,String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
    }
	
	public static void get_First_Selected(WebElement element) {
		Select s = new Select(element);
		s.getFirstSelectedOption();
	}
	
	public static void deselectbyvalue_Dropdown(WebElement value,String value1) {
		Select s = new Select(value);
		s.deselectByValue(value1);
	}
	
	public static void deselectbyindex_Dropdown(WebElement value,int value1) {
		Select s = new Select(value);
		s.deselectByIndex(value1);	
	}
	
	public static void deselectbyvisibletext_Dropdown(WebElement element,String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);
	}
	
	public static void is_Multiple(WebElement element) {
		Select s = new Select(element);
		System.out.println(s.isMultiple());
	}
	
	public static void get_Options(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options2 = s.getOptions();
		for (WebElement webElement : options2) {
			System.out.println(webElement.getText());
		}
	}
	
	public static void get_All_Selected(WebElement element) {
		Select s = new Select(element);
		List<WebElement> all = s.getAllSelectedOptions();
		for (WebElement web : all) {
			System.out.println(web.getText());
		}
	}
	
	public static void deselectAll_Dropdown(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}
	
	public static void alert_Accept(WebElement element) {
		element.click();
		driver.switchTo().alert().accept();
	}
	
	public static void alert_dismiss(WebElement element) {
		element.click();
		driver.switchTo().alert().dismiss();
	}
	
	public static void alert_sendkeys(WebElement element,String value) {
		element.click();
		driver.switchTo().alert().sendKeys(value);
	}
	
	public static void alert_get_Text(WebElement element) {
		element.click();
		driver.switchTo().alert().getText();
	}
	
	public static void single_Frame(WebElement keys) {
		driver.switchTo().frame(keys);
	}
	
	public static void multi_Frame(WebElement element,WebElement element1) {
		driver.switchTo().frame(element);
		driver.switchTo().frame(element1);
	}
	
	public static void scrollBy(int a,int b) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(a,b)");
	}
	
	public static void scrollInto(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
	}
	
	public static void mouse_Click(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).build().perform();
	}
	
	public static void context_Click(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
	}
	
	public static void double_Click(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).build().perform();
	}
	
	public static void move_To_Element(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}
	
	public static void mouse_dragAndDrop(WebElement element,WebElement element1) {
		Actions a = new Actions(driver);
		a.dragAndDrop(element, element1);
	}
	
	public static void get_Window_Handle() {
		Set<String> handles = driver.getWindowHandles();
		for (String id : handles) {
			driver.switchTo().window(id);
		}
	}


}



