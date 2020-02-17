package com.survey.pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResponcePage {
private static WebElement element = null;
private static By by = null;


 
	public static By responceTab(WebDriver driver) {
		by = By.id("SurveyResponseTabId");
		return by;
	}
	
	public static By getTotalQuestion(WebDriver driver) {
		by = By.xpath("//div[@id='basicResponseInfo']//div[contains(@class,'slds-grid')]//div[1]//div[1]//div[1]//div[1]");
		return by;
	}
	public static WebElement getTotalQuestionCount(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@data-response='totalQuestion']//div[@class='sf-text-size-18']//strong"));
		return element;
	}
	
	public static List<WebElement> getAllAddedQuestion(WebDriver driver) {
		 List<WebElement>  element = driver.findElements(By.xpath("//ul[@id='buildQesWrapper']//li"));
		return element;
	}
	
	public static WebElement totalResponcesCount(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@data-response='totalResponse']//div[@class='sf-text-size-18']//strong"));
		return element;
	}
	public static List<WebElement> getResponceTableRecordCount(WebDriver driver) {
		 List<WebElement>  element = driver.findElements(By.xpath("//table[@id='SurveyResponse']//tbody//tr"));
		return element;
	}
	public static List<WebElement> getCompletedRecordAndPartialyCompleted(WebDriver driver) {
		 List<WebElement>  element = driver.findElements(By.xpath("//table[@id='SurveyResponse']//tbody//tr//div[contains(@class,'slds-truncate')][contains(text(),'Completed')]"));
		return element;
	}
	public static WebElement getConversionPercentage(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@data-response='conversion']//div[@class='sf-text-size-18']//strong"));
		return element;
	}
	
	
	
}
