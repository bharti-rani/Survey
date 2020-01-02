package com.survey.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SurveyPreviewPage {

	private static WebElement element = null; 
	
	public static WebElement previewTab(WebDriver driver) {
		
          element = driver.findElement(By.xpath("//li[@previewtab='SurveyPreview']"));
          return element;      
	}
	public static WebElement desktopViewIcon(WebDriver driver) {
		
        element = driver.findElement(By.xpath("//i[contains(@class,'fa fa-2x fa-desktop')]"));
        return element;      
	}
   public static WebElement mobileViewIcon(WebDriver driver) {
		
        element = driver.findElement(By.xpath("//div[contains(@class,'sf-btn-custom slds-p-around_small')]"));
        return element;      
	}
   public static WebElement startSurveyButton(WebDriver driver) {
		
       element = driver.findElement(By.xpath("//button[@data-startsurveybutton='data-startSurveyButton']"));
       return element;      
	}
   public static WebElement requiredIcon(WebDriver driver) {
		
       element = driver.findElement(By.xpath("//span[contains(@class,'sf-text-size-21 sf-text-red')]"));
       return element;      
	}
   
   public static WebElement submitButton(WebDriver driver) {
		
       element = driver.findElement(By.xpath("//button[@data-submit-response='data-submit-response']"));
       return element;      
	}
 
 
}
