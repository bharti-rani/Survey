package com.survey.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SurveyListingPage {
	private static WebElement element = null; 
	
	public static WebElement CreateNewsurveybutton(WebDriver driver) {
		// TODO Auto-generated method stub
          element = driver.findElement(By.xpath("//div[contains(@class,'slds-has-divider--bottom slds-p-around--small slds-theme--shade')]//button[1]"));
          return element;      
	}
	
	public static WebElement SurveyName(WebDriver driver) {
		// TODO Auto-generated method stub
          element = driver.findElement(By.id("surveyTitle"));
          return element;
	}
	
	public static WebElement SurveyDescription(WebDriver driver) {
		// TODO Auto-generated method stub
          element = driver.findElement(By.id("surveyDescription"));
          return element;
	}
	
	public static WebElement CreateSurveybutton(WebDriver driver) {
		// TODO Auto-generated method stub
          element = driver.findElement(By.xpath("//button[contains(text(),'Create Survey')]"));
          return element;
	}
	public static WebElement CreateSurveyError(WebDriver driver) {
		// TODO Auto-generated method stub
          element = driver.findElement(By.xpath("//div[contains(@class,'sf-text-red')]"));
          return element;
	}
	public static WebElement CheckSurveyName(WebDriver driver) {
		// TODO Auto-generated method stub
          element = driver.findElement(By.id("surveyName"));
          return element;
	}
	
	public static WebElement BuilderTab(WebDriver driver) {
		// TODO Auto-generated method stub
          element = driver.findElement(By.xpath("//*[@id=\"j_id0:j_id6:j_id27\"]/ul/li[1]"));
          return element;
	}
	
	public static WebElement SaveAllButtonForBuilder(WebDriver driver) {
		// TODO Auto-generated method stub
          element = driver.findElement(By.id("ActionButton"));
          return element;
	}
	public static WebElement SaveAllSuccessMessage(WebDriver driver) {
		// TODO Auto-generated method stub
          element = driver.findElement(By.xpath("//div[@class = 'slds-is-relative']/div/div/div/div[2]/div"));
          return element;
	}
          
          public static WebElement EditSurveyName(WebDriver driver) {
  			// TODO Auto-generated method stub
  	          element = driver.findElement(By.id("updateNameAndDescriptionIcon"));
  	          return element;
  		}
  		
  		public static WebElement SurveyNameEdit(WebDriver driver) {
  			// TODO Auto-generated method stub
  	          element = driver.findElement(By.id("surveyNameEdit"));
  	          return element;
  		}
  		
  		public static WebElement SurveyDescriptionEdit(WebDriver driver) {
  			// TODO Auto-generated method stub
  	          element = driver.findElement(By.id("surveyDescriptionEdit"));
  	          return element;
  		}
  		
  		public static WebElement UpdateSurveyBuuton(WebDriver driver) {
			// TODO Auto-generated method stub
	          element = driver.findElement(By.xpath("//*[@id=\"modalEditSF\"]/section/div/footer/button"));
	          return element;
		}
		public static WebElement EditSurveyError(WebDriver driver) {
			// TODO Auto-generated method stub
	          element = driver.findElement(By.xpath("//*[@id=\"modalEditSF\"]/section/div/div/div/div[1]/div[2]"));
	          return element;
		}
	

}
