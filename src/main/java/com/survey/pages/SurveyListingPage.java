package com.survey.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SurveyListingPage {
	private static WebElement element = null;

	public static WebElement createNewsurveybutton(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(
				By.xpath("//*[@id=\"bodyTable\"]/tbody/tr/td/div/div[4]/div/div/div[1]/div/div[3]/button"));
		return element;
	}

	public static WebElement surveyName(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.id("surveyTitle"));
		return element;
	}

	public static WebElement surveyDescription(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.id("surveyDescription"));
		return element;
	}

	public static WebElement createSurveybutton(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.xpath("//button[contains(text(),'Create Survey')]"));
		return element;
	}

	public static WebElement createSurveyError(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.xpath("//div[contains(@class,'sf-text-red')]"));
		return element;
	}

	public static WebElement checkSurveyName(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.id("surveyName"));
		return element;
	}

	public static WebElement builderTab(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.xpath("//*[@id=\"j_id0:j_id6:j_id27\"]/ul/li[1]"));
		return element;
	}

	public static WebElement saveAllButtonForBuilder(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(
				By.xpath("//button[contains(@class,'slds-button slds-button_brand slds-m-right_medium')]"));
		return element;
	}

	public static WebElement saveAllSuccessMessage(WebDriver driver) {
		// TODO Auto-generated method stub
 		element = driver.findElement(By.xpath("//div[@class = 'slds-is-relative']/div/div/div/div[2]/div"));
		return element;
	}

	public static WebElement editSurveyName(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.id("updateNameAndDescriptionIcon"));
		return element;
	}

	public static WebElement surveyNameEdit(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.id("surveyNameEdit"));
		return element;
	}

	public static WebElement surveyDescriptionEdit(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.id("surveyDescriptionEdit"));
		return element;
	}

	public static WebElement updateSurveyBuuton(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.xpath("//*[@id=\"modalEditSF\"]/section/div/footer/button"));
		return element;
	}

	public static WebElement editSurveyError(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.xpath("//*[@id=\"modalEditSF\"]/section/div/div/div/div[1]/div[2]"));
		return element;
	}

}
