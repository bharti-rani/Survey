package test.cases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.survey.pages.SalesforceHomePage;
import com.survey.pages.SurveyBuilderPage;
import com.survey.pages.SurveyListingPage;

public class AddSurveyQuestion extends survey.base.TestBase {
 
	@Test
	public static void addQuestion() throws InterruptedException {

		wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.clickDoneButtonOfQuestion(driver))).click();
		Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.getQuestionError(driver))).getText().contains("Please Enter Question."));
		wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.questionTypeButton(driver))).click();
		
		for (WebElement el : SurveyBuilderPage.chooseQuestionType(driver)) {
Thread.sleep(1000);
			if (el.getText().equalsIgnoreCase("Multiple Choice")) {
				System.out.println(">>>>inside the if" + el.getText());
				el.click();
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.enterQuestion(driver))).sendKeys(config.getProperty("MultipleChoiceType"));
				wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.clickDoneButtonOfQuestion(driver))).click();
				Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.getAnswerChoiceError(driver))).getText()
						.contains("Please Enter atleast 2 options."));
				for (int i = 0; i <= SurveyBuilderPage.addOptionAsnwersChoice(driver).size(); i++) {
					if (i == 0) {
						SurveyBuilderPage.addOptionAsnwersChoice(driver).get(i).sendKeys("choice1");
					} else if (i == 1) {
						SurveyBuilderPage.addOptionAsnwersChoice(driver).get(i).sendKeys("choice2");
					}

				}

				Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.advanceTab(driver))).isDisplayed());
				Assert.assertTrue(SurveyBuilderPage.helpTab(driver).isDisplayed());
				wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.advanceTab(driver))).click();
				Thread.sleep(1000);
				for (WebElement req : SurveyBuilderPage.requiredQuestion(driver)) {
					if (req.getText().contains("Require an Answer to This Question")) {
						System.out.println("qq");
					} else {
						assertFalse(false);
					}
				}

				for (WebElement hid : SurveyBuilderPage.hiddenQuestion(driver)) {

					if (hid.getText().contains("Hidden Question")) {
						System.out.println("hh");
					} else {
						assertFalse(false);
					}
				}

			} else if (el.getText().equalsIgnoreCase("Checkboxes")) {
				System.out.println(">>>>inside the if" + el.getText());
				el.click();
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.enterQuestion(driver))).sendKeys(config.getProperty("CheckboxType"));
				wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.clickDoneButtonOfQuestion(driver))).click();
				
				Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.getAnswerChoiceError(driver))).getText()
						.contains("Please Enter atleast 2 options."));
				
				for (int i = 0; i <= SurveyBuilderPage.addOptionAsnwersChoice(driver).size(); i++) {
					if (i == 0) {
						SurveyBuilderPage.addOptionAsnwersChoice(driver).get(i).sendKeys("checkbox1");
					} else if (i == 1) {
						SurveyBuilderPage.addOptionAsnwersChoice(driver).get(i).sendKeys("checkbox2");
					}

				}
				Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.advanceTab(driver))).isDisplayed());
				Assert.assertTrue(SurveyBuilderPage.helpTab(driver).isDisplayed());

			} else if (el.getText().equalsIgnoreCase("Dropdown")) {
				System.out.println(">>>>inside the if" + el.getText());
				el.click();
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.enterQuestion(driver))).sendKeys(config.getProperty("DropdownType"));
				wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.clickDoneButtonOfQuestion(driver))).click();
				
				Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.getAnswerChoiceError(driver))).getText()
						.contains("Please Enter atleast 2 options."));
			
				for (int i = 0; i <= SurveyBuilderPage.addOptionAsnwersChoice(driver).size(); i++) {
					if (i == 0) {
						SurveyBuilderPage.addOptionAsnwersChoice(driver).get(i).sendKeys("Dropdown1");
					} else if (i == 1) {
						SurveyBuilderPage.addOptionAsnwersChoice(driver).get(i).sendKeys("Dropdown2");
					}

				}
				Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.advanceTab(driver))).isDisplayed());
				Assert.assertTrue(SurveyBuilderPage.helpTab(driver).isDisplayed());

			} else if (el.getText().equalsIgnoreCase("Short Answer")) {
				System.out.println(">>>>inside the if" + el.getText());
				el.click();
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.enterQuestion(driver))).sendKeys(config.getProperty("ShortAnswerType"));
				Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.checkShortAnswerLabel(driver))).getText().contains("Short Answer"));
				
				Assert.assertFalse(wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.checkShortAnswerChoice(driver))).isEnabled());

				Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.advanceTab(driver))).isDisplayed());
				Assert.assertTrue(SurveyBuilderPage.helpTab(driver).isDisplayed());
			} else if (el.getText().equalsIgnoreCase("Paragraph")) {
				System.out.println(">>>>inside the if" + el.getText());
				el.click();
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.enterQuestion(driver))).sendKeys(config.getProperty("ParagraphType"));
				Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.checkParagraphLebel(driver))).getText().contains("Paragraph"));
				Assert.assertFalse(wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.checkParagraphField(driver))).isEnabled());
				Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.advanceTab(driver))).isDisplayed());
				Assert.assertTrue(SurveyBuilderPage.helpTab(driver).isDisplayed());
			} else if (el.getText().equalsIgnoreCase("Rating")) {
				System.out.println(">>>>inside the if" + el.getText());
				el.click();
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.enterQuestion(driver))).sendKeys(config.getProperty("RatingType"));
				Assert.assertTrue(SurveyBuilderPage.ratingScale(driver).getFirstSelectedOption().getText().equals("1"));
				SurveyBuilderPage.ratingScale(driver).selectByVisibleText("5");
				Assert.assertTrue(
						SurveyBuilderPage.ratingShape(driver).getFirstSelectedOption().getText().contains("Star"));
				SurveyBuilderPage.ratingShape(driver).selectByVisibleText("Thumb");
				Assert.assertTrue(
						SurveyBuilderPage.ratingColor(driver).getCssValue("color").equals("rgba(62, 62, 60, 1)"));

				Assert.assertTrue(SurveyBuilderPage.helpTab(driver).isDisplayed());

			} else if (el.getText().equalsIgnoreCase("Slider")) {
				System.out.println(">>>>inside the if" + el.getText());
				el.click();
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.enterQuestion(driver))).sendKeys(config.getProperty("SliderType"));
				
				Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.startSliderlength(driver))).getText().equals("0"));
				
				Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.endSliderlength(driver))).getText().equals("100"));
				Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.advanceTab(driver))).isDisplayed());
				Assert.assertTrue(SurveyBuilderPage.helpTab(driver).isDisplayed());

			} else if (el.getText().equalsIgnoreCase("Date Picker")) {
				System.out.println(">>>>inside the if" + el.getText());
				el.click();
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.enterQuestion(driver))).sendKeys(config.getProperty("DatePickerType"));
				Thread.sleep(1000);
				SurveyBuilderPage.checkdatePickerIsDisabled(driver).isDisplayed();
				Assert.assertFalse(SurveyBuilderPage.checkdatePickerIsDisabled(driver).isEnabled());
				Assert.assertTrue(wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.advanceTab(driver))).isDisplayed());
				Assert.assertTrue(SurveyBuilderPage.helpTab(driver).isDisplayed());
				wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.clickDoneButtonOfQuestion(driver))).click();
				break;

			}

			wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.clickDoneButtonOfQuestion(driver))).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.addNewQuestionsButton(driver))).click();
		
			SurveyBuilderPage.scrollDown(driver);

			wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.questionTypeButton(driver))).click();
		}
		
		wait.until(ExpectedConditions.presenceOfElementLocated(SurveyListingPage.saveAllButtonForBuilder(driver))).click();
		
		Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyListingPage.saveAllSuccessMessage(driver))).getText()
				.contains("Survey Configuration has been saved successfully."));

	}

}
