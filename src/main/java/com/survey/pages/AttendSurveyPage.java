package com.survey.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

 public class AttendSurveyPage {
	private static WebElement element = null;
	private static By by = null;
	
public static By salesforceAllTab(WebDriver driver) {
		
		by = By.id("AllTab_Tab");
		return by;
	}
	

 public static List<WebElement> salesforce_ObjectList(WebDriver driver) {
	
	List<WebElement> element = driver.findElements(By.xpath("//a"));
	return element;
 }
 public static WebElement crossButton(WebDriver driver) {
		
	 element = driver.findElement(By.id("tryLexDialogX"));
		return element;
	}
 
 
 
 public static By objectNewButton(WebDriver driver) {
		
		by = By.xpath("//input[@type='button'][@value=' New ']");
		return by;
	}
 public static WebElement accountName(WebDriver driver) {
		
	 element = driver.findElement(By.id("acc2"));
		return element;
	}
 public static WebElement saveAccountButton(WebDriver driver) {
		
	  element = driver.findElement(By.xpath("//input[@name='save']"));
		return element;
	}

 public static WebElement findAccountInputFiled(WebDriver driver) {
		
	  element = driver.findElement(By.xpath("//label[text()='Billing City']/parent::td/parent::tr//td[@class='dataCol col02']//input"));
		return element;
	}
 public static WebElement contactName(WebDriver driver) {
		
	 element = driver.findElement(By.id("name_lastcon2"));
		return element;
	}
 public static WebElement findConInputFiledForEmail(WebDriver driver) {
		
	  element = driver.findElement(By.xpath("//label[text()='Email']/parent::td[@class='labelCol']/following-sibling::td//input"));
		return element;
	}

 public static WebElement oppName(WebDriver driver) {
		
	 element = driver.findElement(By.id("opp3"));
		return element;
	}
 public static WebElement oppCloseDate(WebDriver driver) {
		
	 element = driver.findElement(By.id("//span[@class='dateFormat']//a"));
		return element;
	}

 public static WebElement findOppInputFiledForEmail(WebDriver driver) {
		
	  element = driver.findElement(By.xpath("//label[text()='Next Step']/parent::td[@class='labelCol']/parent::tr//td[@class='dataCol']//input"));
		return element;
	}

 public static Select oppStage(WebDriver driver) {
		Select element = new Select(driver.findElement(By.id("opp11")));
		return element;
	}
 
 public static By gmailId(WebDriver driver) {
		
		by = By.id("identifierId");
		return by;
	}
 public static WebElement idnextButton(WebDriver driver) {
		
	 element = driver.findElement(By.id("identifierNext"));
		return element;
	}
 
 public static By gmailPass(WebDriver driver) {
		
		by = By.xpath("//input[@type='password']");
		return by;
	}
 public static WebElement passnextButton(WebDriver driver) {
		
	 element = driver.findElement(By.id("passwordNext"));
		return element;
	}
 
 

}
