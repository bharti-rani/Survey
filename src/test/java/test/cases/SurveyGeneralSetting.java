package test.cases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.survey.pages.SalesforceHomePage;
import com.survey.pages.SurveySettingPage;


public class SurveyGeneralSetting extends survey.base.TestBase{

	
	@Test
	public void verfiyGeneralSetting() throws InterruptedException {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(SalesforceHomePage.surveyTab(driver))).click();
		
	 	CreateNewSurvey survey = new CreateNewSurvey();
		survey.verifycreatenewsurvey();
		SurveySettingPage.surveySettingTab(driver).click();
		Thread.sleep(1000);
	    SurveySettingPage.genrealTab(driver).isSelected();	
	    SurveySettingPage.selectTagField(driver).sendKeys(config.getProperty("Tag")+Keys.ENTER);
	    Thread.sleep(3000);
	    SurveySettingPage.surveySaveAllButton(driver).click();
	    Assert.assertTrue(SurveySettingPage.surveySaveAllSuccessfullMessage(driver).getText().contains("Survey Configuration has been saved successfully."));
	    SurveySettingPage.selectWelecomeTab(driver).click();
	    Assert.assertTrue(SurveySettingPage.CheckWelecomePopIsOpened(driver).getText().contains("Welcome Note"));
	    SurveySettingPage.isWelcomeNotesEnable(driver).isEnabled();
	    SurveySettingPage.welcomeNotesTextField(driver).sendKeys(config.getProperty("WelcomeNote"));
	    SurveySettingPage.surveySaveAllButton(driver).click();
	
	}


}
