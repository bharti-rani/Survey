package test.cases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.survey.pages.SurveyDistributionPage;
import com.survey.pages.SurveyListingPage;
import com.survey.pages.SurveySettingPage;

public class SurveyDistribution extends survey.base.TestBase{
	@Test
	public void checkDistribution() throws InterruptedException {
		
		SurveySettingPage.SurveySettingTab(driver).click();
		Thread.sleep(1000);
		WebElement publised = SurveySettingPage.publishToggleButton(driver);
	    publised.click();
		
	    SurveyListingPage.saveAllButtonForBuilder(driver).click();
		Thread.sleep(1000);
		
		if(SurveyDistributionPage.distributionTab(driver).isDisplayed()) {
			SurveyDistributionPage.distributionTab(driver).click();
			Thread.sleep(2000);
			SurveyDistributionPage.createDistributionButton(driver).click();
			Thread.sleep(1000);
			Assert.assertTrue(SurveyDistributionPage.checkViewIdDisaplyOrNotToCreateDistribution(driver).isDisplayed());
			Thread.sleep(1000);
			Assert.assertTrue(SurveyDistributionPage.checkObjectListboxSelected(driver).getAttribute("aria-selected").equals("true"));
			Thread.sleep(1000);
			SurveyDistributionPage.nextButton(driver).click();
			Thread.sleep(1000);
			Assert.assertTrue(SurveyDistributionPage.verifyObjectError(driver).getText().contains("please select object"));
			SurveyDistributionPage.selectObjectForDistribution(driver).sendKeys(config.getProperty("SelectObjectForDistribution"));
			for(WebElement VerifyObjectText : SurveyDistributionPage.verifyObjectText(driver)) {
				
				for(WebElement chooseObject : SurveyDistributionPage.selectObject(driver)) {
					if(VerifyObjectText.getText().equalsIgnoreCase(config.getProperty("SelectObjectForDistribution"))) {
						chooseObject.click();
	 				}
					else {
						System.out.println(VerifyObjectText.getText());
					}
				}
				
			}
			
			
			
			
			Thread.sleep(1000);
			Assert.assertTrue(SurveyDistributionPage.generateLink(driver).isDisplayed());
			SurveyDistributionPage.saveButton(driver).click();
			Thread.sleep(1000);
			Assert.assertTrue(SurveyDistributionPage.verifySaveSuccessMessage(driver).getText().contains("Record Saved Successfully"));			
			SurveyDistributionPage.createTriggerButton(driver).click();
			Thread.sleep(1000);
			SurveyDistributionPage.createTriggerButton(driver).click();
			Thread.sleep(1000);
			Assert.assertTrue(SurveyDistributionPage.emailFieldError(driver).getText().contains("Select Field"));
			SurveyDistributionPage.emailField(driver).sendKeys(config.getProperty("EmailField")+Keys.ENTER);
			Thread.sleep(1000);
			Assert.assertTrue(SurveyDistributionPage.triggerName_Error(driver).getText().contains("Trigger Name Required"));
			SurveyDistributionPage.createTriggerName(driver).sendKeys("trigger");
			SurveyDistributionPage.createTriggerButton(driver).click();
			Thread.sleep(1000);
			Assert.assertTrue(SurveyDistributionPage.triggerName_Error(driver).getText().contains("Trigger name should not contain reserved keyword."));
			SurveyDistributionPage.createTriggerName(driver).sendKeys(config.getProperty("TriggerName"));
			SurveyDistributionPage.createTriggerButton(driver).click();
			Thread.sleep(1000);
			Assert.assertTrue(SurveyDistributionPage.templateError(driver).getText().contains("Please select template"));
			SurveyDistributionPage.emailTemplate(driver).selectByVisibleText(config.getProperty("EmailTemplate"));
		
		}
		else
		{
			System.out.println("distribution tab is not showing");
		}
		
		
	}

}
