package com.survey.pages;



import java.io.IOException;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SurveyDistributionPage {
	
	private static WebElement element = null;
	

	public static WebElement distributionTab(WebDriver driver) {
		element = driver.findElement(
				By.id("SurveyDistributionId"));
		return element;
	}
	public static WebElement createDistributionButton(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//button[contains(text(),'Create Distribution')]"));
		return element;
	}
	public static WebElement checkViewIdDisaplyOrNotToCreateDistribution(WebDriver driver) {
		element = driver.findElement(
				By.id("viewCreateNew"));
		return element;
	}
	public static WebElement checkObjectListboxSelected(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//a[@id='path-1']"));
	 	return element;
	}
	public static WebElement selectObjectForDistribution(WebDriver driver) {
		element = driver.findElement(
				By.id("distributionObj"));
		return element;
	}
	public static WebElement selectObject(WebDriver driver) {
		 element = driver.findElement(
				By.xpath("//span[text()='Account']//parent::label[@class='slds-radio__label slds-grid']//span[@class='slds-radio_faux slds-no-flex']"));
		return element;
	}
	
	
	
	public static WebElement nextButton(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//button[contains(text(),'Next')]"));
		return element;
	}
	public static WebElement verifyObjectError(WebDriver driver) {
		element = driver.findElement(
				By.id("showerror"));
		return element;
	}
	public static WebElement generateLink(WebDriver driver) {
		element = driver.findElement(
				By.id("generatedSurveyLink"));
		return element;
	}
	public static WebElement createTriggerButtonOfGenerateLink(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//div[@class='slds-p-around_small slds-has-divider--top']//button[@class='slds-button slds-button_brand'][contains(text(),'Create Trigger')]"));
		return element;
	}
	public static WebElement createTriggerButtonOfCreateTrigger(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//div[@class='slds-p-around_small']//button[@class='slds-button slds-button_brand'][contains(text(),'Create Trigger')]"));
		return element;
	}
	public static WebElement saveButton(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//button[contains(text(),'Save')]"));
		return element;
	}
	
	public static WebElement verifySaveSuccessMessage(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//div[contains(@class,'sf-text-size-16')]"));
		return element;
	}
	public static WebElement emailField(WebDriver driver) {
		element = driver.findElement(
				By.id("createselectFieldForEmail"));
		return element;
	}
	public static WebElement emailFieldError(WebDriver driver) {
		element = driver.findElement(
				By.id("selectEmailFieldError"));
		return element;
	}
	public static WebElement triggerName_Error(WebDriver driver) {
		element = driver.findElement(
				By.id("triggerName_Error"));
		return element;
	}
	public static WebElement createTriggerName(WebDriver driver) {
		element = driver.findElement(
				By.id("createTriggerName"));
		return element;
	}
	public static WebElement selectTriggerError(WebDriver driver) {
		element = driver.findElement(
				By.id("triggerEventError"));
		return element;
	}
	public static WebElement selectTrigger(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//span[text()='After Insert']//parent::label[@class='slds-radio__label']//span[@class='slds-radio_faux']"));
		return element;
	}
	
	public static WebElement templateError(WebDriver driver) {
		element = driver.findElement(
				By.id("templateError"));
		return element;
	}
	public static Select emailTemplate(WebDriver driver) {
		Select element = new Select(driver.findElement(By.id("emailTemplate")));
		return element;
	}
	
	public static WebElement triggerSuccessMessage(WebDriver driver) {
		 element = driver.findElement(By.xpath("//div[@class='sf-text-size-16']"));
		return element;
	}
	
	//Check trigger record is create or not,..
	
	

	public static List<WebElement> noOfrow(WebDriver driver) {
		List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"showDistributionData\"]/tr"));
		return element;
	}
	
	
}
