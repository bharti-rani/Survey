package test.cases;

import org.openqa.selenium.Keys;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.survey.pages.SalesforceHomePage;
import com.survey.pages.SurveySettingPage;




public class SurveyGeneralSetting extends survey.base.TestBase{

	
	@Test
	public void verfiyGeneralSetting() throws InterruptedException {
		
		SalesforceHomePage homepage = new SalesforceHomePage(); 
		homepage.SurveyTab(driver).click();
		
		CreateNewSurvey survey = new CreateNewSurvey();
		survey.verifycreatenewsurvey();
		SurveySettingPage.SurveySettingTab(driver).click();
		Thread.sleep(1000);
	    SurveySettingPage.GenrealTab(driver).isSelected();	
	    SurveySettingPage.SelectTagField(driver).sendKeys(config.getProperty("Tag")+Keys.ENTER);
	    Thread.sleep(3000);
	    SurveySettingPage.SurveySaveAllButton(driver).click();
	    Assert.assertTrue(SurveySettingPage.SurveySaveAllSuccessfullMessage(driver).getText().contains("Survey Configuration has been saved successfully."));
	    SurveySettingPage.SelectWelecomeTab(driver).click();
	    Assert.assertTrue(SurveySettingPage.CheckWelecomePopIsOpened(driver).getText().contains("Welcome Note"));
	    SurveySettingPage.IsWelcomeNotesEnable(driver).isEnabled();
	    SurveySettingPage.WelcomeNotesTextField(driver).sendKeys(config.getProperty("WelcomeNote"));
	    SurveySettingPage.SurveySaveAllButton(driver).click();
	
	}


}
