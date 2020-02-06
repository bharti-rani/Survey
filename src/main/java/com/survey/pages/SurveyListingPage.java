package com.survey.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SurveyListingPage {
	private static WebElement element = null;
	private static By by =null;
	
	public static By createNewsurveybutton(WebDriver driver) {
		by = By.xpath("//*[@id=\"bodyTable\"]/tbody/tr/td/div/div[4]/div/div/div[1]/div/div[3]/button");
		return by;
	}

	public static WebElement surveyName(WebDriver driver) {
		
		element = driver.findElement(By.id("surveyTitle"));
		return element;
	}

	public static WebElement surveyDescription(WebDriver driver) {
		element = driver.findElement(By.id("surveyDescription"));
		return element;
	}

	public static WebElement createSurveybutton(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[contains(text(),'Create Survey')]"));
		return element;
	}

	public static WebElement createSurveyError(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(@class,'sf-text-red')]"));
		return element;
	}

	public static By checkSurveyName(WebDriver driver) {
	
		by = By.id("surveyName");
		return by;
	}

	public static WebElement builderTab(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@id=\"j_id0:j_id6:j_id27\"]/ul/li[1]"));
		return element;
	}

	public static By saveAllButtonForBuilder(WebDriver driver) {
		
		by = By.xpath("//button[contains(@class,'slds-button slds-button_brand slds-m-right_medium')]");
		return by;
	}

	public static By saveAllSuccessMessage(WebDriver driver) {
		
 		by = By.xpath("//div[@class = 'slds-is-relative']/div/div/div/div[2]/div");
		return by;
	}

	public static By editSurveyName(WebDriver driver) {
		
		by = By.id("updateNameAndDescriptionIcon");
		return by;
	}

	public static WebElement surveyNameEdit(WebDriver driver) {
		
		element = driver.findElement(By.id("surveyNameEdit"));
		return element;
	}

	public static WebElement surveyDescriptionEdit(WebDriver driver) {
		
		element = driver.findElement(By.id("surveyDescriptionEdit"));
		return element;
	}

	public static WebElement updateSurveyBuuton(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@id=\"modalEditSF\"]/section/div/footer/button"));
		return element;
	}

	public static By editSurveyError(WebDriver driver) {
		
		by = By.xpath("//*[@id=\"modalEditSF\"]/section/div/div/div/div[1]/div[2]");
		return by;
	}

}
