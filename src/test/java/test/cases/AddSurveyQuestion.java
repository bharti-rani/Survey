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
		Thread.sleep(1000);
		Assert.assertTrue(SurveyBuilderPage.getQuestionError(driver).getText().contains("Please Enter Question."));
		SurveyBuilderPage.questionTypeButton(driver).click();
		Thread.sleep(1000);
		for(WebElement el : SurveyBuilderPage.chooseQuestionType(driver)) {
			System.out.println(">>>>outside the if"+el.getText());
			if(el.getText().equalsIgnoreCase(config.getProperty("ShortAnswerType"))) {
				System.out.println(">>>>inside the if");
				el.click();
				Thread.sleep(1000);
				SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("Question_1"));
				SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
				Thread.sleep(5000);
				SurveyBuilderPage.addNewQuestions(driver).click();
				Thread.sleep(2000);
				SurveyBuilderPage.questionTypeButton(driver).click();
				Thread.sleep(1000);
			}else if(el.getText().equalsIgnoreCase(config.getProperty("ParagraphType"))) {
				System.out.println(">>>>inside the if");
				el.click();
				Thread.sleep(1000);
				System.out.println("-------"+SurveyBuilderPage.chooseQuestionType(driver));
				SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("Question_2"));
				SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
				Thread.sleep(5000);
				SurveyBuilderPage.addNewQuestions(driver).click();
				Thread.sleep(2000);
				SurveyBuilderPage.questionTypeButton(driver).click();
				Thread.sleep(1000);
			}else if(el.getText().equalsIgnoreCase(config.getProperty("RatingType"))) {
				System.out.println(">>>>inside the if");
				el.click();
				Thread.sleep(1000);
				System.out.println("-------"+SurveyBuilderPage.chooseQuestionType(driver));
				SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("Question_3"));
				SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
				Thread.sleep(5000);
				SurveyBuilderPage.addNewQuestions(driver).click();
				Thread.sleep(2000);
				SurveyBuilderPage.questionTypeButton(driver).click();
				Thread.sleep(1000);
			}else if(el.getText().equalsIgnoreCase(config.getProperty("SliderType"))) {
				System.out.println(">>>>inside the if");
				el.click();
				Thread.sleep(1000);
				System.out.println("-------"+SurveyBuilderPage.chooseQuestionType(driver));
				SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("Question_4"));
				SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
				Thread.sleep(5000);
				SurveyBuilderPage.addNewQuestions(driver).click();
				Thread.sleep(2000);
				SurveyBuilderPage.questionTypeButton(driver).click();
				Thread.sleep(1000);
			}else if(el.getText().equalsIgnoreCase(config.getProperty("DatePickerType"))) {
				System.out.println(">>>>inside the if");
				el.click();
				Thread.sleep(1000);
				System.out.println("-------"+SurveyBuilderPage.chooseQuestionType(driver));
				SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("Question_5"));
				SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
				Thread.sleep(5000);
				SurveyBuilderPage.addNewQuestions(driver).click();
				Thread.sleep(2000);
				SurveyBuilderPage.questionTypeButton(driver).click();
				Thread.sleep(1000);
			}else if(el.getText().equalsIgnoreCase(config.getProperty("SectionType"))) {
				System.out.println(">>>>inside the if");
				el.click();
				Thread.sleep(1000);
				System.out.println("-------"+SurveyBuilderPage.chooseQuestionType(driver));
				SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("Question_6"));
				SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
				Thread.sleep(5000);
				SurveyBuilderPage.addNewQuestions(driver).click();
				Thread.sleep(2000);
				SurveyBuilderPage.questionTypeButton(driver).click();
				Thread.sleep(1000);
			}else if(el.getText().equalsIgnoreCase(config.getProperty("DropdownType"))) {
				System.out.println(">>>>inside the if");
				el.click();
				Thread.sleep(1000);
				System.out.println("-------"+SurveyBuilderPage.chooseQuestionType(driver));
				SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("Question_7"));
				SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
				Thread.sleep(5000);
				SurveyBuilderPage.addNewQuestions(driver).click();
				Thread.sleep(2000);
				SurveyBuilderPage.questionTypeButton(driver).click();
				Thread.sleep(1000);
			}else if(el.getText().equalsIgnoreCase(config.getProperty("CheckboxType"))) {
				System.out.println(">>>>inside the if");
				el.click();
				Thread.sleep(1000);
				System.out.println("-------"+SurveyBuilderPage.chooseQuestionType(driver));
				SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("Question_8"));
				SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
				Thread.sleep(5000);
				SurveyBuilderPage.addNewQuestions(driver).click();
				Thread.sleep(2000);
				SurveyBuilderPage.questionTypeButton(driver).click();
				Thread.sleep(1000);
			}else if(el.getText().equalsIgnoreCase(config.getProperty("MultipleChoiceType"))) {
				System.out.println(">>>>inside the if");
				el.click();
				Thread.sleep(1000);
				System.out.println("-------"+SurveyBuilderPage.chooseQuestionType(driver));
				SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("Question_9"));
				SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
				Thread.sleep(5000);
				SurveyBuilderPage.addNewQuestions(driver).click();
				Thread.sleep(2000);
				SurveyBuilderPage.questionTypeButton(driver).click();
				Thread.sleep(1000);
			}
			
		} 
		//System.out.println("-------"+SurveyBuilderPage.chooseQuestionType(driver));
		/*Assert.assertTrue(SurveyBuilderPage.getAnswerChoiceError(driver).getText().contains("Please Enter atleast 2 options."));
		for(WebElement choice : SurveyBuilderPage.addOptionAsnwersChoice(driver)) {
		
		}*/

	}
	

	
	

}
