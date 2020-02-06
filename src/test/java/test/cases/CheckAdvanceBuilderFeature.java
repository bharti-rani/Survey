package test.cases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.survey.pages.SurveyBuilderPage;
import com.survey.pages.SurveyListingPage;
import com.survey.pages.SurveyPreviewPage;

public class CheckAdvanceBuilderFeature extends survey.base.TestBase {
	@Test
	public static void advanceFeature() throws InterruptedException {
		wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.questionTypeButton(driver))).click();
		
		for (WebElement el : SurveyBuilderPage.chooseQuestionType(driver)) {
 
			Thread.sleep(1000);
			if (el.getText().equalsIgnoreCase("Short Answer")) {
				el.click();
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.enterQuestion(driver))).sendKeys(config.getProperty("ShortAnswerType"));

				
				Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.checkShortAnswerLabel(driver))).getText().contains("Short Answer"));
				
				Assert.assertFalse(wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.checkShortAnswerChoice(driver))).isEnabled());

				Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.advanceTab(driver))).isDisplayed());
				Assert.assertTrue(SurveyBuilderPage.helpTab(driver).isDisplayed());
				
				wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.advanceTab(driver))).click();
				

				for (WebElement req : SurveyBuilderPage.requiredQuestion(driver)) {
					Thread.sleep(1000);

					if (!req.isSelected()) {
						req.click();
						Assert.assertTrue(SurveyBuilderPage.requiredMessageTextField(driver).isDisplayed());
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.clickDoneButtonOfQuestion(driver))).click();
						Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyBuilderPage.requiredMessageTextFieldErrorMessage(driver))).getText()
								.contains("Please Enter Required Error Message"));
						SurveyBuilderPage.requiredMessageTextField(driver)
								.sendKeys(config.getProperty("RequiredMessage"));
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.clickDoneButtonOfQuestion(driver))).click();
						Assert.assertTrue(SurveyBuilderPage.requiredMessageIcon(driver).isDisplayed());
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyListingPage.saveAllButtonForBuilder(driver))).click();
						Thread.sleep(1000);
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyPreviewPage.previewTab(driver))).click();
						
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyPreviewPage.startSurveyButton(driver))).click();
						
						Assert.assertTrue(SurveyPreviewPage.requiredIcon(driver).isDisplayed());
						
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyPreviewPage.submitButton(driver))).click();
						
						Assert.assertTrue(SurveyPreviewPage.checkRequiredErrorMessage(driver).getText()
								.equalsIgnoreCase("It is required to give answer."));
						
						break;
					}

				}

				SurveyBuilderPage.builderTab(driver).click();
				SurveyBuilderPage.editQuestion(driver).click();
				wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.advanceTab(driver))).click();
				for (WebElement defaultvalue : SurveyBuilderPage.defaultValueQuestion(driver)) {
					Thread.sleep(1000);

					if (!defaultvalue.isSelected()) {
						defaultvalue.click();
						Assert.assertTrue(SurveyBuilderPage.defaultMessageTextField(driver).isDisplayed());
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.clickDoneButtonOfQuestion(driver))).click();
						Thread.sleep(1000);
						Assert.assertTrue(SurveyBuilderPage.defaultMessageTextFieldErrorMessage(driver).getText()
								.contains("Please Enter Default Value."));
						SurveyBuilderPage.defaultMessageTextField(driver)
								.sendKeys(config.getProperty("DefaultMessage"));
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.clickDoneButtonOfQuestion(driver))).click();
						Assert.assertTrue(SurveyBuilderPage.shortAnswerInputBox(driver).getAttribute("value")
								.equals(config.getProperty("DefaultMessage")));
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyListingPage.saveAllButtonForBuilder(driver))).click();
						
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyPreviewPage.previewTab(driver))).click();
						
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyPreviewPage.startSurveyButton(driver))).click();
						
						System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyPreviewPage.shortAnswerInputBox(driver))).getText());
						Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyPreviewPage.shortAnswerInputBox(driver))).getAttribute("value")
								.equalsIgnoreCase(config.getProperty("DefaultMessage")));
						
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyPreviewPage.submitButton(driver))).click();
						
						break;
					}

				}
				SurveyBuilderPage.builderTab(driver).click();
				SurveyBuilderPage.editQuestion(driver).click();
				wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.advanceTab(driver))).click();
				for (WebElement maxlength : SurveyBuilderPage.maxLengthQuestion(driver)) {
					Thread.sleep(1000);

					if (!maxlength.isSelected()) {
						maxlength.click();
						Assert.assertTrue(SurveyBuilderPage.maxLengthTextField(driver).isDisplayed());
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.clickDoneButtonOfQuestion(driver))).click();
						
						Assert.assertTrue(SurveyBuilderPage.maxLengthTextFieldErrorMessage(driver).getText()
								.contains("Please Enter Max Length."));
						SurveyBuilderPage.maxLengthTextField(driver).sendKeys("string");
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.clickDoneButtonOfQuestion(driver))).click();
						
						Assert.assertTrue(SurveyBuilderPage.maxLengthTextFieldErrorMessage(driver).getText()
								.contains("Please Enter Max Length."));
						Thread.sleep(1000);
						SurveyBuilderPage.maxLengthTextField(driver).clear();
						Thread.sleep(1000);
						SurveyBuilderPage.maxLengthTextField(driver).sendKeys(config.getProperty("MaxLength"));
					
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.clickDoneButtonOfQuestion(driver))).click();
						
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyListingPage.saveAllButtonForBuilder(driver))).click();
						
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyPreviewPage.previewTab(driver))).click();
						
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyPreviewPage.startSurveyButton(driver))).click();
						
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyPreviewPage.shortAnswerInputBox(driver))).clear();
						
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyPreviewPage.shortAnswerInputBox(driver))).sendKeys(config.getProperty("CheckMaxLength"));
						
						String typevalue = wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyPreviewPage.shortAnswerInputBox(driver))).getAttribute("value");
						int getlength = typevalue.length();
						if (getlength == Integer.parseInt(config.getProperty("MaxLength"))) {
							assertTrue(true);

						} else {
							assertFalse(false);
						}

						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyPreviewPage.submitButton(driver))).click();
						Thread.sleep(2000);
						break;
					}

				}
				SurveyBuilderPage.builderTab(driver).click();
				SurveyBuilderPage.editQuestion(driver).click();
				wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.advanceTab(driver))).click();
				for (WebElement placeholder : SurveyBuilderPage.placeholderQuestion(driver)) {
					Thread.sleep(1000);

					if (!placeholder.isSelected()) {
						placeholder.click();
						Assert.assertTrue(SurveyBuilderPage.placeholderTextField(driver).isDisplayed());
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.clickDoneButtonOfQuestion(driver))).click();
						Thread.sleep(1000);
						Assert.assertTrue(SurveyBuilderPage.placeholderTextFieldErrorMessage(driver).getText()
								.contains("Please Enter Placeholder"));
						Thread.sleep(1000);
						SurveyBuilderPage.placeholderTextField(driver).sendKeys(config.getProperty("placeholder"));

						for (WebElement defaultvalue : SurveyBuilderPage.defaultValueQuestion(driver)) {
							if (!defaultvalue.isSelected()) {
								defaultvalue.click();
								break;
							}

						}
						
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.clickDoneButtonOfQuestion(driver))).click();
						Assert.assertTrue(SurveyBuilderPage.shortAnswerInputBox(driver).getAttribute("placeholder")
								.equals(config.getProperty("placeholder")));
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyListingPage.saveAllButtonForBuilder(driver))).click();
						
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyPreviewPage.previewTab(driver))).click();
						
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyPreviewPage.startSurveyButton(driver))).click();
						
						Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(SurveyPreviewPage.shortAnswerInputBox(driver))).getAttribute("placeholder")
								.equalsIgnoreCase(config.getProperty("placeholder")));
						
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyPreviewPage.submitButton(driver))).click();
						
						break;
					}

				}
				SurveyBuilderPage.builderTab(driver).click();
				SurveyBuilderPage.editQuestion(driver).click();
				wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.advanceTab(driver))).click();
				for (WebElement hidden : SurveyBuilderPage.hiddenQuestion(driver)) {
					Thread.sleep(1000);

					if (!hidden.isSelected()) {
						hidden.click();

						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyBuilderPage.clickDoneButtonOfQuestion(driver))).click();
						
						Assert.assertTrue(SurveyBuilderPage.hiddenQuestionIcon(driver).isDisplayed());
						Thread.sleep(2000);
						System.out.println(SurveyBuilderPage.hiddenQuestionText(driver).getText());
						Assert.assertTrue(
								SurveyBuilderPage.hiddenQuestionText(driver).getText().contains("HIDDEN QUESTION"));
						
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyListingPage.saveAllButtonForBuilder(driver))).click();
						
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyPreviewPage.previewTab(driver))).click();
						
						wait.until(ExpectedConditions.presenceOfElementLocated(SurveyPreviewPage.startSurveyButton(driver))).click();
						

						Assert.assertTrue(SurveyPreviewPage.totalQuestionCount(driver).getText().equals("0"));
						

						break;
					}
				}

				SurveyBuilderPage.builderTab(driver).click();

			}
		}
	}
}
