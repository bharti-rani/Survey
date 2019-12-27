package test.cases;


import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.survey.pages.SalesforceHomePage;
import com.survey.pages.SurveyListingPage;

public class CreateNewSurvey extends survey.base.TestBase {
	
	
	@Test
	public void verifycreatenewsurvey() throws InterruptedException {
		SalesforceHomePage homepage =	PageFactory.initElements(driver, SalesforceHomePage.class); 
		homepage.SurveyTab(driver).click();
		
		SurveyListingPage surveylisting = new SurveyListingPage();
		surveylisting.CreateNewsurveybutton(driver).click();
		surveylisting.SurveyName(driver).sendKeys("");
		surveylisting.SurveyDescription(driver);
		surveylisting.CreateSurveybutton(driver).click();
		String GetCreateError1 = surveylisting.CreateSurveyError(driver).getText();
		Assert.assertTrue(GetCreateError1.contains("Please Enter Survey Name."));
		surveylisting.SurveyName(driver).sendKeys(config.getProperty("surveyname"));
		surveylisting.CreateSurveybutton(driver).click();
		Thread.sleep(3000);
		String CheckSurveyTitle = surveylisting.CheckSurveyName(driver).getText();
		System.out.println(CheckSurveyTitle);
		Assert.assertTrue(CheckSurveyTitle.contains(config.getProperty("surveyname")));
		surveylisting.BuilderTab(driver).isSelected();
		Thread.sleep(1000);
		surveylisting.EditSurveyName(driver).click();
		Thread.sleep(1000);
		surveylisting.SurveyNameEdit(driver).clear();
		surveylisting.SurveyNameEdit(driver).sendKeys(" ");
		surveylisting.SurveyDescriptionEdit(driver).clear();
		surveylisting.UpdateSurveyBuuton(driver).click();
		String GetEditSurveyNameError = surveylisting.EditSurveyError(driver).getText();
		Assert.assertTrue(GetEditSurveyNameError.contains("Please Enter Survey Name."));
		Thread.sleep(1000);
		surveylisting.SurveyNameEdit(driver).sendKeys(config.getProperty("updatedSurveyName"));
		surveylisting.UpdateSurveyBuuton(driver).click();
		Thread.sleep(1000);
		String CheckSurveyTitle1 = surveylisting.CheckSurveyName(driver).getText();
		Assert.assertTrue(CheckSurveyTitle1.contains(config.getProperty("updatedSurveyName")));
		
		
	}

}
