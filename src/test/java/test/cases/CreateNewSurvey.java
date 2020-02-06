package test.cases;



import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.survey.pages.SalesforceHomePage;
import com.survey.pages.SurveyListingPage;

public class CreateNewSurvey extends survey.base.TestBase {
	
	

	@Test
	public void verifycreatenewsurvey() throws InterruptedException {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(SalesforceHomePage.surveyTab(driver))).click();
		
		SurveyListingPage surveylisting = new SurveyListingPage();
		wait.until(ExpectedConditions.presenceOfElementLocated(SurveyListingPage.createNewsurveybutton(driver))).click();
		surveylisting.surveyName(driver).sendKeys("");
		surveylisting.surveyDescription(driver);
		surveylisting.createSurveybutton(driver).click();
		String GetCreateError1 = surveylisting.createSurveyError(driver).getText();
		Assert.assertTrue(GetCreateError1.contains("Please Enter Survey Name."));
		surveylisting.surveyName(driver).sendKeys(config.getProperty("surveyname"));
		surveylisting.createSurveybutton(driver).click();
		
		 WebElement CheckSurveyTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(surveylisting.checkSurveyName(driver)));
		 Assert.assertTrue(CheckSurveyTitle.getText().equalsIgnoreCase(config.getProperty("surveyname")));
		 surveylisting.builderTab(driver).isSelected();
		wait.until(ExpectedConditions.presenceOfElementLocated(surveylisting.editSurveyName(driver))).click();
		surveylisting.surveyNameEdit(driver).clear();
		surveylisting.surveyNameEdit(driver).sendKeys(" ");
		surveylisting.surveyDescriptionEdit(driver).clear();
		surveylisting.updateSurveyBuuton(driver).click();
		String GetEditSurveyNameError = wait.until(ExpectedConditions.visibilityOfElementLocated(surveylisting.editSurveyError(driver))).getText();
		Assert.assertTrue(GetEditSurveyNameError.contains("Please Enter Survey Name."));
		surveylisting.surveyNameEdit(driver).sendKeys(config.getProperty("updatedSurveyName"));
		surveylisting.updateSurveyBuuton(driver).click();
		String CheckSurveyTitle1 = wait.until(ExpectedConditions.visibilityOfElementLocated(surveylisting.checkSurveyName(driver))).getText();
		Assert.assertTrue(CheckSurveyTitle1.contains(config.getProperty("updatedSurveyName")));

	}

}
