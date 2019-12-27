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
		
		SurveyBuilderPage builder = PageFactory.initElements(driver, SurveyBuilderPage.class);
		builder.clickDoneButtonOfQuestion(driver).click();
		Thread.sleep(1000);
		Assert.assertTrue(builder.getQuestionError(driver).getText().contains("Please Enter Question."));
		builder.enterQuestion(driver).sendKeys(config.getProperty("QuestionText"));
		builder.clickDoneButtonOfQuestion(driver).click();
		Thread.sleep(1000);
		Assert.assertTrue(builder.getAnswerChoiceError(driver).getText().contains("Please Enter atleast 2 options."));
		for(WebElement choice : builder.addOptionAsnwersChoice(driver)) {
		
		}
		
		
	}
	
	

}
