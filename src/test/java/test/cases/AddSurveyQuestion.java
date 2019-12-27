package test.cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.survey.pages.SalesforceHomePage;
import com.survey.pages.SurveyBuilderPage;



public class AddSurveyQuestion extends survey.base.TestBase{
	
	@Test
	public void addquestion() throws InterruptedException {
		
		CreateNewSurvey survey = new CreateNewSurvey();
		survey.verifycreatenewsurvey();
		Thread.sleep(1000);
		SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
		Thread.sleep(1000);
		Assert.assertTrue(SurveyBuilderPage.getQuestionError(driver).getText().contains("Please Enter Question."));
		SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("QuestionText"));
		SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
		Thread.sleep(1000);
		Assert.assertTrue(SurveyBuilderPage.getAnswerChoiceError(driver).getText().contains("Please Enter atleast 2 options."));
		for(WebElement choice : SurveyBuilderPage.addOptionAsnwersChoice(driver)) {
		choice.sendKeys(config.getProperty("answerchoice1"));
		}
		
		
		
		
	}
	
	

}
