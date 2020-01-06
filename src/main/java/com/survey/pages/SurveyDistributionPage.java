package com.survey.pages;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SurveyDistributionPage {
	
	private static WebElement element = null;
	public static Properties config = new Properties();
	public static FileInputStream fls;
	public static FileInputStream readfile() {
		 try {
			fls =new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			config.load(fls);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fls;
		
	}
	

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
	public static List<WebElement> selectObject(WebDriver driver) {
		List<WebElement> element = driver.findElements(
				By.xpath("//label[@class = 'slds-radio__label slds-grid' ]//span[@class ='slds-radio_faux slds-no-flex']"));
		return element;
	}
	public static List<WebElement> verifyObjectText(WebDriver driver) {
		List<WebElement> element = driver.findElements(
				By.xpath("//label[@class = 'slds-radio__label slds-grid' ]//span[@class ='slds-form-element__label userName']"));
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
	public static WebElement createTriggerButton(WebDriver driver) {
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
				By.xpath("//label[@class='slds-radio__label' and @for='ckb_after_insert']//span[@class='slds-radio_faux']"));
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
	
	
	
}
