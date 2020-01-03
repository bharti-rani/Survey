package com.survey.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SurveySettingPage {
	private static WebElement element = null;
	
	public static WebElement SurveySettingTab(WebDriver driver) {
		// TODO Auto-generated method stub
          element = driver.findElement(By.xpath("//span[@id='j_id0:j_id6:j_id27']//li[2]"));
          return element;      
	}
	
	public static WebElement GenrealTab(WebDriver driver) {
		// TODO Auto-generated method stub
          element = driver.findElement(By.xpath("//a[contains(text(),'General')]"));
          return element;      
	}
	public static WebElement SelectTagField(WebDriver driver) {
		// TODO Auto-generated method stub
          element = driver.findElement(By.className("select2-search__field"));
          return element;      
	}
	
	public static WebElement SurveySaveAllButton(WebDriver driver) {
		// TODO Auto-generated method stub
          element = driver.findElement(By.className("slds-button slds-button_brand slds-m-right_medium"));
          return element;      
        
	}
	
	public static WebElement SurveySaveAllSuccessfullMessage(WebDriver driver) {
		// TODO Auto-generated method stub
          element = driver.findElement(By.className("//div[contains(text(),'Survey Configuration has been saved successfully.')]"));
          return element;      
	}
	
	public static WebElement SelectTag(WebDriver driver) {
		// TODO Auto-generated method stub
          element = driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']"));
          return element;      
	}
	
	public static WebElement SelectWelecomeTab(WebDriver driver) {
		// TODO Auto-generated method stub
          element = driver.findElement(By.xpath("//a[contains(text(),'Welcome Note')]"));
          return element;      
	}
	
	public static WebElement CheckWelecomePopIsOpened(WebDriver driver) {
		// TODO Auto-generated method stub
          element = driver.findElement(By.xpath("//span[@class='slds-text-heading_medium'][contains(text(),'Welcome Note')]"));
          return element;      
	}
	
	public static WebElement IsWelcomeNotesEnable(WebDriver driver) {
		// TODO Auto-generated method stub
          element = driver.findElement(By.id("toggle-desc"));
          return element;      
	}
	public static WebElement WelcomeNotesTextField(WebDriver driver) {
		// TODO Auto-generated method stub
          element = driver.findElement(By.xpath("//div[@class='slds-rich-text-editor slds-grid slds-grid_vertical slds-nowrap slds-has-focus']//div[@class='ql-editor ql-blank slds-rich-text-area__content slds-text-color_weak slds-grow']"));
          return element;      
	}
	
	
	
	
}
