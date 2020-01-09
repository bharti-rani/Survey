package test.cases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.survey.pages.SurveyBuilderPage;
import com.survey.pages.SurveyListingPage;
import com.survey.pages.SurveyPreviewPage;

public class CheckAdvanceBuilderFeature extends survey.base.TestBase {
	@Test
	public static void advanceFeature() throws InterruptedException {
		SurveyBuilderPage.questionTypeButton(driver).click();
		Thread.sleep(1000);
		for (WebElement el : SurveyBuilderPage.chooseQuestionType(driver)) {
 
			Thread.sleep(1000);
			if (el.getText().equalsIgnoreCase("Short Answer")) {
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

				for (WebElement req : SurveyBuilderPage.requiredQuestion(driver)) {
					Thread.sleep(1000);

					if (!req.isSelected()) {
						req.click();
						Assert.assertTrue(SurveyBuilderPage.requiredMessageTextField(driver).isDisplayed());
						SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
						Thread.sleep(1000);
						Assert.assertTrue(SurveyBuilderPage.requiredMessageTextFieldErrorMessage(driver).getText()
								.contains("Please Enter Required Error Message"));
						SurveyBuilderPage.requiredMessageTextField(driver)
								.sendKeys(config.getProperty("RequiredMessage"));
						SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
						Assert.assertTrue(SurveyBuilderPage.requiredMessageIcon(driver).isDisplayed());
						SurveyListingPage.saveAllButtonForBuilder(driver).click();
						Thread.sleep(2000);
						SurveyPreviewPage.previewTab(driver).click();
						Thread.sleep(1000);
						SurveyPreviewPage.startSurveyButton(driver).click();
						Thread.sleep(1000);
						Assert.assertTrue(SurveyPreviewPage.requiredIcon(driver).isDisplayed());
						Thread.sleep(1000);
						SurveyPreviewPage.submitButton(driver).click();
						Thread.sleep(2000);
						System.out.println("submit button");
						Thread.sleep(1000);
						Assert.assertTrue(SurveyPreviewPage.checkRequiredErrorMessage(driver).getText()
								.equalsIgnoreCase("It is required to give answer."));
						Thread.sleep(1000);
						break;
					}

				}

				SurveyBuilderPage.builderTab(driver).click();
				SurveyBuilderPage.editQuestion(driver).click();
				SurveyBuilderPage.advanceTab(driver).click();
				for (WebElement defaultvalue : SurveyBuilderPage.defaultValueQuestion(driver)) {
					Thread.sleep(1000);

					if (!defaultvalue.isSelected()) {
						defaultvalue.click();
						Assert.assertTrue(SurveyBuilderPage.defaultMessageTextField(driver).isDisplayed());
						SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
						Thread.sleep(1000);
						Assert.assertTrue(SurveyBuilderPage.defaultMessageTextFieldErrorMessage(driver).getText()
								.contains("Please Enter Default Value."));
						SurveyBuilderPage.defaultMessageTextField(driver)
								.sendKeys(config.getProperty("DefaultMessage"));
						SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
						Assert.assertTrue(SurveyBuilderPage.shortAnswerInputBox(driver).getAttribute("value")
								.equals(config.getProperty("DefaultMessage")));
						SurveyListingPage.saveAllButtonForBuilder(driver).click();
						Thread.sleep(1000);
						SurveyPreviewPage.previewTab(driver).click();
						Thread.sleep(1000);
						SurveyPreviewPage.startSurveyButton(driver).click();
						Thread.sleep(1000);
						System.out.println(SurveyPreviewPage.shortAnswerInputBox(driver).getText());
						Assert.assertTrue(SurveyPreviewPage.shortAnswerInputBox(driver).getAttribute("value")
								.equalsIgnoreCase(config.getProperty("DefaultMessage")));
						Thread.sleep(1000);
						SurveyPreviewPage.submitButton(driver).click();
						Thread.sleep(2000);
						break;
					}

				}
				SurveyBuilderPage.builderTab(driver).click();
				SurveyBuilderPage.editQuestion(driver).click();
				SurveyBuilderPage.advanceTab(driver).click();
				for (WebElement maxlength : SurveyBuilderPage.maxLengthQuestion(driver)) {
					Thread.sleep(1000);

					if (!maxlength.isSelected()) {
						maxlength.click();
						Assert.assertTrue(SurveyBuilderPage.maxLengthTextField(driver).isDisplayed());
						SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
						Thread.sleep(1000);
						Assert.assertTrue(SurveyBuilderPage.maxLengthTextFieldErrorMessage(driver).getText()
								.contains("Please Enter Max Length."));
						SurveyBuilderPage.maxLengthTextField(driver).sendKeys("string");
						SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
						Thread.sleep(1000);
						Assert.assertTrue(SurveyBuilderPage.maxLengthTextFieldErrorMessage(driver).getText()
								.contains("Please Enter Max Length."));
						Thread.sleep(1000);
						SurveyBuilderPage.maxLengthTextField(driver).clear();
						Thread.sleep(1000);
						SurveyBuilderPage.maxLengthTextField(driver).sendKeys(config.getProperty("MaxLength"));
						Thread.sleep(1000);
						SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
						Thread.sleep(1000);
						SurveyListingPage.saveAllButtonForBuilder(driver).click();
						Thread.sleep(1000);
						SurveyPreviewPage.previewTab(driver).click();
						Thread.sleep(1000);
						SurveyPreviewPage.startSurveyButton(driver).click();
						Thread.sleep(1000);
						SurveyPreviewPage.shortAnswerInputBox(driver).clear();
						Thread.sleep(1000);
						SurveyPreviewPage.shortAnswerInputBox(driver).sendKeys(config.getProperty("CheckMaxLength"));
						Thread.sleep(1000);
						String typevalue = SurveyPreviewPage.shortAnswerInputBox(driver).getAttribute("value");
						int getlength = typevalue.length();
						if (getlength == Integer.parseInt(config.getProperty("MaxLength"))) {
							assertTrue(true);

						} else {
							assertFalse(false);
						}

						SurveyPreviewPage.submitButton(driver).click();
						Thread.sleep(2000);
						break;
					}

				}
				SurveyBuilderPage.builderTab(driver).click();
				SurveyBuilderPage.editQuestion(driver).click();
				SurveyBuilderPage.advanceTab(driver).click();
				for (WebElement placeholder : SurveyBuilderPage.placeholderQuestion(driver)) {
					Thread.sleep(1000);

					if (!placeholder.isSelected()) {
						placeholder.click();
						Assert.assertTrue(SurveyBuilderPage.placeholderTextField(driver).isDisplayed());
						SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
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
						Thread.sleep(1000);
						SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
						Assert.assertTrue(SurveyBuilderPage.shortAnswerInputBox(driver).getAttribute("placeholder")
								.equals(config.getProperty("placeholder")));
						SurveyListingPage.saveAllButtonForBuilder(driver).click();
						Thread.sleep(1000);
						SurveyPreviewPage.previewTab(driver).click();
						Thread.sleep(1000);
						SurveyPreviewPage.startSurveyButton(driver).click();
						Thread.sleep(1000);
						Assert.assertTrue(SurveyPreviewPage.shortAnswerInputBox(driver).getAttribute("placeholder")
								.equalsIgnoreCase(config.getProperty("placeholder")));
						Thread.sleep(1000);
						SurveyPreviewPage.submitButton(driver).click();
						Thread.sleep(2000);
						break;
					}

				}
				SurveyBuilderPage.builderTab(driver).click();
				SurveyBuilderPage.editQuestion(driver).click();
				SurveyBuilderPage.advanceTab(driver).click();
				for (WebElement hidden : SurveyBuilderPage.hiddenQuestion(driver)) {
					Thread.sleep(1000);

					if (!hidden.isSelected()) {
						hidden.click();

						SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
						Thread.sleep(1000);
						Assert.assertTrue(SurveyBuilderPage.hiddenQuestionIcon(driver).isDisplayed());
						Thread.sleep(2000);
						System.out.println(SurveyBuilderPage.hiddenQuestionText(driver).getText());
						Assert.assertTrue(
								SurveyBuilderPage.hiddenQuestionText(driver).getText().contains("HIDDEN QUESTION"));
						Thread.sleep(1000);
						SurveyListingPage.saveAllButtonForBuilder(driver).click();
						Thread.sleep(1000);
						SurveyPreviewPage.previewTab(driver).click();
						Thread.sleep(1000);
						SurveyPreviewPage.startSurveyButton(driver).click();
						Thread.sleep(1000);

						Assert.assertTrue(SurveyPreviewPage.totalQuestionCount(driver).getText().equals("0"));
						Thread.sleep(1000);

						break;
					}
				}

				SurveyBuilderPage.builderTab(driver).click();

			}
		}
	}
}
