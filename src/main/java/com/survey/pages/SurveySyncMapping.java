package com.survey.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SurveySyncMapping {
	private static WebElement element = null; 
	private static Select selectList = null;
	
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
	public static WebElement mapResponseWithObjectFields(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='sf-text-size-18 slds-p-around_small']"));
		return element;
	}
	public static WebElement autoCreatedText(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[@class='slds-badge sf-badge-auto-create']"));
		return element;
	}
	public static WebElement editMapField(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon slds-m-right_medium edit-button']"));
		return element;
	}
	public static WebElement editMapFieldLabel(WebDriver driver) {
		element = driver.findElement(By.id("field_label_Edit"));
		return element;
	}
	public static WebElement editMapFieldLabelAPI(WebDriver driver) {
		element = driver.findElement(By.id("field_api_name_Edit"));
		return element;
	}
	public static Select editMapFieldType(WebDriver driver) {
		selectList = new Select(driver.findElement(By.id("//select[@id='field_type_Edit']")))	;
		return selectList;
	}
	public static Select editMapFieldLength(WebDriver driver) {
		selectList = new Select(driver.findElement(By.id("//input[@id='field_length_Edit']")))	;
		return selectList;
	}
	public static WebElement editMapFieldDescription (WebDriver driver) {
		element = driver.findElement(By.xpath("//section[@class='slds-modal edit-Modal slds-fade-in-open']//div//div//textarea[@class='slds-textarea']"));
		return element;
	}
	public static WebElement editMapFieldDone (WebDriver driver) {
		element = driver.findElement(By.xpath("//section[@class='slds-modal edit-Modal slds-fade-in-open']//button[@class='slds-button slds-button_brand'][contains(text(),'Done')]"));
		return element;
	}
	public static WebElement editMapFieldCancel (WebDriver driver) {
		element = driver.findElement(By.xpath("//section[@class='slds-modal edit-Modal slds-fade-in-open']//button[@class='slds-button slds-button_neutral'][contains(text(),'Cancel')]"));
		return element;
	}
	public static WebElement saveMapping(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(@class,'slds-p-around--small slds-has-divider--bottom')]//button[1]"));
		return element;
	}
	
}
