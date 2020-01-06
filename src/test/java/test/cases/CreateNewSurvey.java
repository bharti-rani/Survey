package test.cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.survey.pages.SalesforceHomePage;
import com.survey.pages.SurveyListingPage;

public class CreateNewSurvey extends survey.base.TestBase {

	@Test
	public void verifycreatenewsurvey() throws InterruptedException {
		SalesforceHomePage homepage = PageFactory.initElements(driver, SalesforceHomePage.class);
		homepage.SurveyTab(driver).click();
		Thread.sleep(2000);
		SurveyListingPage surveylisting = new SurveyListingPage();
		surveylisting.createNewsurveybutton(driver).click();
		surveylisting.surveyName(driver).sendKeys("");
		surveylisting.surveyDescription(driver);
		surveylisting.createSurveybutton(driver).click();
		String GetCreateError1 = surveylisting.createSurveyError(driver).getText();
		Assert.assertTrue(GetCreateError1.contains("Please Enter Survey Name."));
		surveylisting.surveyName(driver).sendKeys(config.getProperty("surveyname"));
		surveylisting.createSurveybutton(driver).click();
		Thread.sleep(3000);
		String CheckSurveyTitle = surveylisting.checkSurveyName(driver).getText();
		System.out.println(CheckSurveyTitle);
 
		Thread.sleep(4000);
		Assert.assertTrue(CheckSurveyTitle.contains(config.getProperty("surveyname")));
		surveylisting.builderTab(driver).isSelected();
		Thread.sleep(1000);
		surveylisting.editSurveyName(driver).click();
		Thread.sleep(1000);
		surveylisting.surveyNameEdit(driver).clear();
		surveylisting.surveyNameEdit(driver).sendKeys(" ");
		surveylisting.surveyDescriptionEdit(driver).clear();
		surveylisting.updateSurveyBuuton(driver).click();
		String GetEditSurveyNameError = surveylisting.editSurveyError(driver).getText();
		Assert.assertTrue(GetEditSurveyNameError.contains("Please Enter Survey Name."));
		Thread.sleep(1000);
		surveylisting.surveyNameEdit(driver).sendKeys(config.getProperty("updatedSurveyName"));
		surveylisting.updateSurveyBuuton(driver).click();
		Thread.sleep(1000);
		String CheckSurveyTitle1 = surveylisting.checkSurveyName(driver).getText();
		Assert.assertTrue(CheckSurveyTitle1.contains(config.getProperty("updatedSurveyName")));

	}

}
