package test.cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.survey.pages.SalesforceHomePage;
import com.survey.pages.SurveyBuilderPage;



public class AddSurveyQuestion extends survey.base.TestBase{
	
	@Test
	public void addQuestion() throws InterruptedException {
		
		CreateNewSurvey survey = new CreateNewSurvey();
		survey.verifycreatenewsurvey();
		Thread.sleep(1000);
		SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
<<<<<<< HEAD
		Thread.sleep(1000);
		Assert.assertTrue(SurveyBuilderPage.getQuestionError(driver).getText().contains("Please Enter Question."));
		for(WebElement el : SurveyBuilderPage.chooseQuestionType(driver)) {
			if(el.equals("QuestionType_1")) {
				// more lines to come.
			}
		}  
		Thread.sleep(1000);
		//System.out.println("-------"+SurveyBuilderPage.chooseQuestionType(driver));
		SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("Question_1"));
		SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
		Thread.sleep(1000);
		/*Assert.assertTrue(SurveyBuilderPage.getAnswerChoiceError(driver).getText().contains("Please Enter atleast 2 options."));
		for(WebElement choice : SurveyBuilderPage.addOptionAsnwersChoice(driver)) {
		
		}*/
=======
		Thread.sleep(1000);
		Assert.assertTrue(SurveyBuilderPage.getQuestionError(driver).getText().contains("Please Enter Question."));
		SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("QuestionText"));
		SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
		Thread.sleep(1000);
		Assert.assertTrue(SurveyBuilderPage.getAnswerChoiceError(driver).getText().contains("Please Enter atleast 2 options."));
		for(WebElement choice : SurveyBuilderPage.addOptionAsnwersChoice(driver)) {
		choice.sendKeys(config.getProperty("answerchoice1"));
		}
>>>>>>> 28fdace50da5791f3561e4e7ff847ca23606b3ee
		
		
		
		
	}
	
	

}
