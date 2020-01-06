package com.survey.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SurveySyncMapping {
	private static WebElement element = null; 
	
	public static WebElement surveyTabMapping(WebDriver driver) {
		element = driver.findElement(By.id("SurveyObjectMappingId"));
		return element;
	}
	public static WebElement proceedToMapping(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"objectSelectTemplate\"]/div/div[2]/button[2]"));
 		return element;
	}
	public static WebElement showValidationOnObject(WebDriver driver) {
		element = driver.findElement(By.id("showerror"));
		return element;
	}
	public static WebElement noQuestionValidation (WebDriver driver) {
		element = driver.findElement(By.id("//*[@id=\"globalToast\"]/div/div/div[2]/div"));
		return element;
	}
	// This method is for button "Create New Object".
	public static WebElement createNewObject (WebDriver driver) {
		element = driver.findElement(By.id("//*[@id=\"objectSelectTemplate\"]/div/div[1]/div[2]/div/button"));
		return element;
	}
	public static WebElement objectSelectField(WebDriver driver) {
		element = driver.findElement(By.id("inputField"));
		return element;
	}
	public static WebElement labelForObjectName(WebDriver driver) {
		element = driver.findElement(By.id("object_label"));
		return element;
	}
	public static WebElement apiNameForObjectLabel (WebDriver driver) {
		element = driver.findElement(By.id("api_name"));
		return element;
	}
	public static WebElement objectDescription(WebDriver driver) {
		element = driver.findElement(By.id("object_description"));
		return element;
	}
	//To create Object after filling all the details of object.
	public static WebElement createObject(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"modalCreateNewObj\"]/section/div/footer/button[2]"));
		return element;
	}
	public static WebElement cancelObjectCreation(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"modalCreateNewObj\"]/section/div/footer/button[1]"));
		return element;
	}
	public static WebElement cancelObjectDialogByCross(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"modalCreateNewObj\"]/section/div/header/button"));
		return element;
	}
}
