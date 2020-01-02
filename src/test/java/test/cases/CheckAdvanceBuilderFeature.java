package test.cases;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.survey.pages.SurveyBuilderPage;
import com.survey.pages.SurveyListingPage;
import com.survey.pages.SurveyPreviewPage;

public class CheckAdvanceBuilderFeature extends survey.base.TestBase{
	@Test
	public static void advanceFeature() throws InterruptedException {
		SurveyBuilderPage.questionTypeButton(driver).click();
		Thread.sleep(1000);
		for(WebElement el : SurveyBuilderPage.chooseQuestionType(driver)) {

		Thread.sleep(1000);
		if(el.getText().equalsIgnoreCase("Short Answer")) {
			el.click();
			Thread.sleep(2000);
			SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("ShortAnswerType"));
			
			Thread.sleep(2000);
			Assert.assertTrue(SurveyBuilderPage.checkShortAnswerLabel(driver).getText().contains("Short Answer"));
			Thread.sleep(2000);
			Assert.assertFalse(SurveyBuilderPage.checkShortAnswerChoice(driver).isEnabled());	
			
			Assert.assertTrue(SurveyBuilderPage.advanceTab(driver).isDisplayed());
			Assert.assertTrue(SurveyBuilderPage.helpTab(driver).isDisplayed());
			Thread.sleep(1000);
			SurveyBuilderPage.advanceTab(driver).click();
			Thread.sleep(1000);
			
			for(WebElement req : SurveyBuilderPage.requiredQuestion(driver)) {
				Thread.sleep(1000);
				System.out.println(req.getText());
				if(req.getText().contains("Require an Answer to This Question")) {
					System.out.println("qq");
				
				}
				else if(!req.isSelected()) {
					req.click(); 
					Assert.assertTrue(SurveyBuilderPage.requiredMessageTextField(driver).isDisplayed());
					SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
					Thread.sleep(1000);
					Assert.assertTrue(SurveyBuilderPage.requiredMessageTextFieldErrorMessage(driver).getText().contains("Please Enter Required Error Message"));
					SurveyBuilderPage.requiredMessageTextField(driver).sendKeys(config.getProperty("RequiredMessage"));
					SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();	
					Assert.assertTrue(SurveyBuilderPage.requiredMessageIcon(driver).isDisplayed());
					SurveyListingPage.SaveAllButtonForBuilder(driver).click();
					Thread.sleep(1000);
					SurveyPreviewPage.previewTab(driver).click();
					Thread.sleep(1000);
					
					SurveyPreviewPage.startSurveyButton(driver).click();
				}
					
					
			}
			
			
		}

	}
	}
}
