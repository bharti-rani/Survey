package test.cases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.survey.pages.AttendSurveyPage;



public class AttendSurvey extends survey.base.TestBase{

	@Test()
	public static void createAccount() throws InterruptedException {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(AttendSurveyPage.salesforceAllTab(driver))).click();
		Thread.sleep(1000);
		for(WebElement salesforceObject : AttendSurveyPage.salesforce_ObjectList(driver)) {
			Thread.sleep(1000);
			System.out.println("all object page");
			if(salesforceObject.getText().contains(config.getProperty("SelectObjectForDistribution"))) {
				Thread.sleep(1000);
				salesforceObject.click();
				AttendSurveyPage.crossButton(driver).click();
		        wait.until(ExpectedConditions.presenceOfElementLocated(AttendSurveyPage.objectNewButton(driver))).click();
				if(config.getProperty("SelectObjectForDistribution").equalsIgnoreCase("Account")) {
					AttendSurveyPage.accountName(driver).sendKeys("TestingAccount");
					
					AttendSurveyPage.findAccountInputFiled(driver).sendKeys(config.getProperty("GmailId"));
					
					AttendSurveyPage.saveAccountButton(driver).click();
				}
				else if(config.getProperty("SelectObjectForDistribution").equalsIgnoreCase("Contact")) {
					
					AttendSurveyPage.contactName(driver).sendKeys("Contact");
					AttendSurveyPage.saveAccountButton(driver).click();
					
				}
				else if(config.getProperty("SelectObjectForDistribution").equalsIgnoreCase("Opportunity")) {
					AttendSurveyPage.oppName(driver).sendKeys("TestingOpp");
					AttendSurveyPage.oppCloseDate(driver).click();
					
					AttendSurveyPage.oppStage(driver).selectByVisibleText("Prospecting");
					AttendSurveyPage.saveAccountButton(driver).click();
				}
			
			}
			else {
				System.out.println("not found");
			}
			
		}
		
		
	}
	
	
	
	@Test()
	public static void loginGmail() throws InterruptedException {
		
		driver.get("https://accounts.google.com/signin");
		wait.until(ExpectedConditions.presenceOfElementLocated(AttendSurveyPage.gmailId(driver))).sendKeys(config.getProperty("GmailId"));
		
		AttendSurveyPage.idnextButton(driver).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(AttendSurveyPage.gmailPass(driver))).sendKeys(config.getProperty("GmailPass"));
		
		AttendSurveyPage.passnextButton(driver).click();
	}
	

}
