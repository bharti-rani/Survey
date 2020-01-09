package test.cases;

import static org.testng.Assert.assertTrue;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.survey.pages.SurveyDistributionPage;
import com.survey.pages.SurveyListingPage;
import com.survey.pages.SurveySettingPage;

public class SurveyDistribution extends survey.base.TestBase {
	@Test
	public void checkDistribution() throws InterruptedException {

		SurveySettingPage.SurveySettingTab(driver).click();
		Thread.sleep(1000);
		WebElement publised = SurveySettingPage.publishToggleButton(driver);
		publised.click();

		SurveyListingPage.saveAllButtonForBuilder(driver).click();
		Thread.sleep(1000);

		if (SurveyDistributionPage.distributionTab(driver).isDisplayed()) {
			SurveyDistributionPage.distributionTab(driver).click();
			Thread.sleep(5000);
			SurveyDistributionPage.createDistributionButton(driver).click();
			Thread.sleep(1000);
			Assert.assertTrue(SurveyDistributionPage.checkViewIdDisaplyOrNotToCreateDistribution(driver).isDisplayed());
			Thread.sleep(1000);
			Assert.assertTrue(SurveyDistributionPage.checkObjectListboxSelected(driver).getAttribute("aria-selected")
					.equals("true"));
			Thread.sleep(1000);
			SurveyDistributionPage.nextButton(driver).click();
			Thread.sleep(3000);
			Assert.assertTrue(SurveyDistributionPage.verifyObjectError(driver).getText().equalsIgnoreCase("Please Select Object"));
			SurveyDistributionPage.selectObjectForDistribution(driver).sendKeys(config.getProperty("SelectObjectForDistribution"));
			Thread.sleep(1000);
			SurveyDistributionPage.selectObject(driver).click();

			Thread.sleep(1000);
			SurveyDistributionPage.nextButton(driver).click();
			Thread.sleep(3000);
			Assert.assertTrue(SurveyDistributionPage.generateLink(driver).isDisplayed());
			SurveyDistributionPage.saveButton(driver).click();
			Thread.sleep(3000);
			Assert.assertTrue(SurveyDistributionPage.verifySaveSuccessMessage(driver).getText()
					.contains("Record Saved Successfully"));
			SurveyDistributionPage.createTriggerButtonOfGenerateLink(driver).click();
			Thread.sleep(3000);
			SurveyDistributionPage.createTriggerButtonOfCreateTrigger(driver).click();
			Thread.sleep(3000);
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
			WebElement TriggerName =SurveyDistributionPage.createTriggerName(driver);
			TriggerName.sendKeys(config.getProperty("TriggerName"));
			
			SurveyDistributionPage.createTriggerButtonOfCreateTrigger(driver).click();
			Thread.sleep(2000);
			Assert.assertTrue(SurveyDistributionPage.selectTriggerError(driver).getText().contains("Select Event"));
			SurveyDistributionPage.selectTrigger(driver).click();
			SurveyDistributionPage.createTriggerButtonOfCreateTrigger(driver).click();
			Thread.sleep(2000);
			Assert.assertTrue(SurveyDistributionPage.templateError(driver).getText().contains("Please select template"));
			SurveyDistributionPage.emailTemplate(driver).selectByVisibleText(config.getProperty("EmailTemplate"));
			SurveyDistributionPage.createTriggerButtonOfCreateTrigger(driver).click();
			Thread.sleep(2000);
			if(SurveyDistributionPage.triggerSuccessMessage(driver).getText().contains("Trigger Created Successfully")) {
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				 Date date = new Date();
				 String date1= dateFormat.format(date);
				 System.out.println("Current date and time is " +date1);
			}
			else if(SurveyDistributionPage.triggerSuccessMessage(driver).getText().contains("duplicate value found: <unknown> duplicates value on record with id: <unknown>")) {
				
				for(int i=1; i<=100; i++) {
				SurveyDistributionPage.createTriggerName(driver).sendKeys(Integer.toString(i));
				SurveyDistributionPage.createTriggerButtonOfCreateTrigger(driver).click();
					if(SurveyDistributionPage.triggerSuccessMessage(driver).getText().contains("Trigger Created Successfully")) {
						DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						 Date date = new Date();
						 String date2= dateFormat.format(date);
						 System.out.println("Current date and time is " +date2);
						 break;
					}
				}
				
			}
			
			

		} else {
			System.out.println("distribution tab is not showing");
		}

	}
	@Test
	public void checkTriggerIsCreatedOrNot() {
		for(WebElement row: SurveyDistributionPage.noOfrow(driver)) {
			System.out.println(row.getAttribute("class"));
			List<WebElement> Allcol = row.findElements(By.xpath("/td"));
			for(WebElement col : Allcol) {
				WebElement coldetail = col.findElement(By.xpath("/div"));
				
				System.out.println("content >>   " + coldetail.getText());
			}
		}
		
		
			
		}
	}


