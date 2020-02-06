package com.survey.pages;

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
				By.xpath("//div[contains(@class,'slds-no-flex slds-p-left_small')]//button[@class='slds-button slds-button_brand'][contains(text(),'Next')]"));
		return element;
	}
	public static WebElement createTriggerButtonOfCreateTrigger(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//button[contains(text(),'Create Trigger')]"));
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
	
	public static WebElement noOfcol(WebDriver driver) {
		 element = driver.findElement(By.xpath("//a[text()='llkh123']/parent::div/parent::td/preceding-sibling::td[3]//div"));
		return element;
	}
	public static WebElement editDistributionButton(WebDriver driver) {
		 element = driver.findElement(By.xpath("//div[@id='distributionForm']//button[@title='Edit']"));
		return element;
	}
	public static WebElement editDistributionSelectedObject(WebDriver driver) {
		 element = driver.findElement(By.xpath("//div[@class='slds-truncate sf-text-size-14 field-object']"));
		return element;
	}
	public static WebElement editDistribution_LastModifyDateAndTime(WebDriver driver) {
		 element = driver.findElement(By.xpath("//div[@class='slds-size_1-of-1 slds-medium-size_6-of-12 slds-p-horizontal_small Distribution-Name']//font[2]"));
		return element;
	}
	public static WebElement editDistribution_SelectedEmailField(WebDriver driver) {
		 element = driver.findElement(By.xpath("//div[@class='slds-truncate sf-text-size-14 field-label']"));
		return element;
	}
	public static WebElement editDistribution_GeneratedSurveyLink(WebDriver driver) {
		 element = driver.findElement(By.id("editGeneratedSurveyLink"));
		return element;
	}
	public static WebElement editDistribution_CheckGenrateLinkTabSelectedOrNot(WebDriver driver) {
		 element = driver.findElement(By.xpath("//li[contains(@target-tab,'generate-link')]"));
		return element;
	}
	
	public static WebElement editDistribution_CreateTriggerTabSelectedOrNot(WebDriver driver) {
		 element = driver.findElement(By.xpath("//li[contains(@target-tab,'create-trigger')]"));
		return element;
	}
	public static WebElement editDistribution_CreateTriggerTab(WebDriver driver) {
		 element = driver.findElement(By.xpath("//div[@id='showEditDistributionTemplate']//li[2]//a[1]"));
		return element;
	}
	public static WebElement editDistribution_RemoveSelectedObject(WebDriver driver) {
		 element = driver.findElement(By.xpath("//div[@class='editpillforObject']//i[@class='fa fa-times']"));
		return element;
	}
	
	public static WebElement editDistribution_objectError(WebDriver driver) {
		 element = driver.findElement(By.id("editObjectError"));
		return element;
	}
	public static WebElement editDistribution_editObject(WebDriver driver) {
		 element = driver.findElement(By.id("editObject"));
		return element;
	}
	public static WebElement editDistribution_selectedEmailFieldError(WebDriver driver) {
		 element = driver.findElement(By.id("selectEmailFieldError"));
		return element;
	}
	public static WebElement editDistribution_editselectedFieldForEmail(WebDriver driver) {
		 element = driver.findElement(By.id("editselectFieldForEmail"));
		return element;
	}
	public static WebElement editTriggerName(WebDriver driver) {
		element = driver.findElement(
				By.id("editTriggerName"));
		return element;
	}
	public static WebElement editDistribution_SaveButton(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//div[contains(@class,'slds-p-top_small slds-has-divider--top')]//button[contains(@class,'slds-button slds-button_brand')][contains(text(),'Save')]"));
		return element;
	}
	public static WebElement editDistribution_CancelButton(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//div[contains(@class,'slds-has-flexi-truncate slds-text-align_right')]//button[contains(@class,'slds-button slds-button_neutral')][contains(text(),'Cancel')]"));
		return element;
	}
	public static WebElement deleteDistributionButton(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//div[@id='distributionForm']//button[@title='Delete']"));
		return element;
	}
	public static WebElement deleteDistributionMessage(WebDriver driver) {
		element = driver.findElement(
				By.id("modalGlobalErrorBody"));
		return element;
	}
	public static WebElement editDistribution_selectObject(WebDriver driver) {
		 element = driver.findElement(
				By.xpath("//li//div[contains(text(),'Contact')]"));
		return element;
	}
	
	public static WebElement deleteDistributionOkButton(WebDriver driver) {
		 element = driver.findElement(
				By.id("bindOkErrorMethodId"));
		return element;
	}
	
	
	public static WebElement deleteDistributionSuccessMessage(WebDriver driver) {
		 element = driver.findElement(
				By.xpath("//div[@class='sf-text-size-16']"));
		return element;
	}
	
}
