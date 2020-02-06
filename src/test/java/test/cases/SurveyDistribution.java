package test.cases;

import static org.testng.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.survey.pages.SurveyDistributionPage;
import com.survey.pages.SurveyListingPage;
import com.survey.pages.SurveySettingPage;

public class SurveyDistribution extends survey.base.TestBase {
	
	static String generatedLink;
	@Test
	public void checkDistribution() throws InterruptedException {

		SurveySettingPage.surveySettingTab(driver).click();
		Thread.sleep(1000);
		WebElement publised = SurveySettingPage.publishToggleButton(driver);
		publised.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(SurveyListingPage.saveAllButtonForBuilder(driver))).click();
		Thread.sleep(1000);

		if (SurveyDistributionPage.distributionTab(driver).isDisplayed()) {
			SurveyDistributionPage.distributionTab(driver).click();
			Thread.sleep(3000);
			SurveyDistributionPage.createDistributionButton(driver).click();
			Thread.sleep(1000);
			Assert.assertTrue(SurveyDistributionPage.checkViewIdDisaplyOrNotToCreateDistribution(driver).isDisplayed());
			Thread.sleep(1000);
			Assert.assertTrue(SurveyDistributionPage.checkObjectListboxSelected(driver).getAttribute("aria-selected")
					.equals("true"));
			Thread.sleep(1000);
			SurveyDistributionPage.nextButton(driver).click();
			Thread.sleep(2000);
			Assert.assertTrue(SurveyDistributionPage.verifyObjectError(driver).getText()
					.equalsIgnoreCase("Please Select Object"));
			SurveyDistributionPage.selectObjectForDistribution(driver)
					.sendKeys(config.getProperty("SelectObjectForDistribution"));
			Thread.sleep(1000);
			SurveyDistributionPage.selectObject(driver).click();

			Thread.sleep(1000);
			SurveyDistributionPage.nextButton(driver).click();
			Thread.sleep(2000);
			Assert.assertTrue(SurveyDistributionPage.generateLink(driver).isDisplayed());
		 generatedLink = SurveyDistributionPage.generateLink(driver).getText();
		 System.out.println(generatedLink);
			SurveyDistributionPage.saveButton(driver).click();
			Thread.sleep(1000);
			Assert.assertTrue(SurveyDistributionPage.verifySaveSuccessMessage(driver).getText()
					.contains("Record Saved Successfully"));
			SurveyDistributionPage.createTriggerButtonOfGenerateLink(driver).click();
			Thread.sleep(3000);
			SurveyDistributionPage.createTriggerButtonOfCreateTrigger(driver).click();
			Thread.sleep(2000);
			Assert.assertTrue(SurveyDistributionPage.emailFieldError(driver).getText().contains("Select Field"));
			SurveyDistributionPage.emailField(driver).sendKeys(config.getProperty("EmailField") + Keys.ENTER);
			SurveyDistributionPage.createTriggerButtonOfCreateTrigger(driver).click();
			Thread.sleep(1000);
			Assert.assertTrue(
					SurveyDistributionPage.triggerName_Error(driver).getText().contains("Trigger Name Required"));
			SurveyDistributionPage.createTriggerName(driver).sendKeys("trigger");
			SurveyDistributionPage.createTriggerButtonOfCreateTrigger(driver).click();
			Thread.sleep(1000);
			Assert.assertTrue(SurveyDistributionPage.triggerName_Error(driver).getText()
					.contains("Trigger name should not contain reserved keyword."));
			SurveyDistributionPage.createTriggerName(driver).clear();
			WebElement TriggerName = SurveyDistributionPage.createTriggerName(driver);
			TriggerName.sendKeys(config.getProperty("TriggerName"));

			SurveyDistributionPage.createTriggerButtonOfCreateTrigger(driver).click();
			Thread.sleep(2000);
			Assert.assertTrue(SurveyDistributionPage.selectTriggerError(driver).getText().contains("Select Event"));
			SurveyDistributionPage.selectTrigger(driver).click();
			SurveyDistributionPage.createTriggerButtonOfCreateTrigger(driver).click();
			Thread.sleep(2000);
			Assert.assertTrue(
					SurveyDistributionPage.templateError(driver).getText().contains("Please select template"));
			SurveyDistributionPage.emailTemplate(driver).selectByVisibleText(config.getProperty("EmailTemplate"));
			SurveyDistributionPage.createTriggerButtonOfCreateTrigger(driver).click();
			Thread.sleep(2000);
			if (SurveyDistributionPage.triggerSuccessMessage(driver).getText()
					.contains("Trigger Created Successfully")) {
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date date = new Date();
				String date1 = dateFormat.format(date);
				System.out.println("Current date and time is " + date1);
				Thread.sleep(1000);
				
			} else if (SurveyDistributionPage.triggerSuccessMessage(driver).getText()
					.contains("duplicate value found: <unknown> duplicates value on record with id: <unknown>")) {

				for (int i = 1; i <= 100; i++) {

					SurveyDistributionPage.createTriggerName(driver).sendKeys(Integer.toString(i));

					SurveyDistributionPage.createTriggerButtonOfCreateTrigger(driver).click();
					Thread.sleep(2000);
					if (SurveyDistributionPage.triggerSuccessMessage(driver).getText()
							.contains("Trigger Created Successfully")) {
						DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						Date date = new Date();
						String date2 = dateFormat.format(date);
						System.out.println("Current date and time is " + date2);
						
						break;
					}
				}
				Thread.sleep(1000);

			}

		} else {
			System.out.println("distribution tab is not showing");
		}

	}

	@Test
	public void editDistribution() throws InterruptedException {
		Thread.sleep(1000);
		SurveyDistributionPage.editDistributionButton(driver).click();
		Thread.sleep(1000);
		WebElement SelectedObject = SurveyDistributionPage.editDistributionSelectedObject(driver);
		Assert.assertTrue(SelectedObject.getText().equalsIgnoreCase(config.getProperty("SelectObjectForDistribution")));
		WebElement LastModifiedDate = SurveyDistributionPage.editDistribution_LastModifyDateAndTime(driver);
		LastModifiedDate.getText();
		WebElement SelectedEmailField = SurveyDistributionPage.editDistribution_SelectedEmailField(driver);
		Thread.sleep(1000);
		Assert.assertTrue(SelectedEmailField.getText().equalsIgnoreCase(config.getProperty("EmailField")));
		Thread.sleep(1000);
		String GenerateLinkClass = SurveyDistributionPage.editDistribution_CheckGenrateLinkTabSelectedOrNot(driver).getAttribute("class");
	    System.out.println(GenerateLinkClass);
	    Thread.sleep(1000);
	    Assert.assertTrue(GenerateLinkClass.contains("slds-is-active"));
	    Thread.sleep(1000);
	    String CreateTriggerTab = SurveyDistributionPage.editDistribution_CreateTriggerTabSelectedOrNot(driver).getAttribute("class");
	    Thread.sleep(1000);
	    Assert.assertFalse(CreateTriggerTab.contains("slds-is-active"));
	    Thread.sleep(1000);
		WebElement GeneratedSurveyLink = SurveyDistributionPage.editDistribution_GeneratedSurveyLink(driver);
		Thread.sleep(1000);
		Assert.assertTrue(GeneratedSurveyLink.getText().equalsIgnoreCase(generatedLink));
		Thread.sleep(1000);
		SurveyDistributionPage.editDistribution_CreateTriggerTab(driver).click();
		WebElement SelectedOption = SurveyDistributionPage.emailTemplate(driver).getFirstSelectedOption();
	    
	    System.out.println(SelectedOption.getText());
	    Thread.sleep(1000);
	    Assert.assertTrue(SelectedOption.getText().equalsIgnoreCase(config.getProperty("EmailTemplate")));
	    Thread.sleep(1000);
	    SurveyDistributionPage.editDistribution_RemoveSelectedObject(driver).click();
	    SurveyDistributionPage.editDistribution_SaveButton(driver).click();
	    Thread.sleep(1000);
	 //   Assert.assertTrue(SurveyDistributionPage.editDistribution_objectError(driver).getText().equalsIgnoreCase("Please Select Object"));
	   // Thread.sleep(1000);
	    SurveyDistributionPage.editDistribution_editObject(driver).sendKeys(config.getProperty("EditSelectedObject"));
	    
	    SurveyDistributionPage.editDistribution_selectObject(driver).click();
	    SurveyDistributionPage.editDistribution_SaveButton(driver).click();
	    Assert.assertTrue(SurveyDistributionPage.editDistribution_selectedEmailFieldError(driver).getText().equalsIgnoreCase("Select Field"));
	    SurveyDistributionPage.editDistribution_editselectedFieldForEmail(driver).sendKeys(config.getProperty("EditEmailField") + Keys.ENTER);
	    SurveyDistributionPage.editDistribution_SaveButton(driver).click();
	    Assert.assertTrue(
				SurveyDistributionPage.triggerName_Error(driver).getText().contains("Trigger Name Required"));
		SurveyDistributionPage.editTriggerName(driver).sendKeys("trigger");
		SurveyDistributionPage.editDistribution_SaveButton(driver).click();
		Thread.sleep(1000);
		Assert.assertTrue(SurveyDistributionPage.triggerName_Error(driver).getText()
				.contains("Trigger name should not contain reserved keyword."));
		Thread.sleep(1000);
		for (int i = 101; i <= 200; i++) {

			SurveyDistributionPage.editTriggerName(driver).sendKeys(Integer.toString(i));

			SurveyDistributionPage.editDistribution_SaveButton(driver).click();
			Thread.sleep(1000);
			if (SurveyDistributionPage.triggerSuccessMessage(driver).getText()
					.contains("Record Saved Successfully")) {
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date date = new Date();
				String editdate = dateFormat.format(date);
				System.out.println("Current date and time is " + editdate);
				break;
			}
		}
		
		SurveyDistributionPage.emailTemplate(driver).selectByVisibleText(config.getProperty("EditEmailTemplate"));
		SurveyDistributionPage.editDistribution_SaveButton(driver).click();
		SurveyDistributionPage.editDistribution_CancelButton(driver).click();
		Thread.sleep(2000);
		
	}
	@Test
	public void deleteDistribution() {
		
		SurveyDistributionPage.deleteDistributionButton(driver).click();
		System.out.println(SurveyDistributionPage.deleteDistributionMessage(driver).getText());
		Assert.assertTrue(SurveyDistributionPage.deleteDistributionMessage(driver).getText().contains("are you sure you want to delete"));
		SurveyDistributionPage.deleteDistributionOkButton(driver).click();
		Assert.assertTrue(SurveyDistributionPage.deleteDistributionSuccessMessage(driver).getText().contains("Record Deleted"));
	}
	

	
}
