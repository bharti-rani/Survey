package test.cases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.survey.pages.SalesforceHomePage;
import com.survey.pages.SurveyBuilderPage;
import com.survey.pages.SurveyListingPage;



public class AddSurveyQuestion extends survey.base.TestBase{
	
	@Test
	public static void addQuestion() throws InterruptedException {
		
		
		Thread.sleep(1000);
		SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
		Thread.sleep(1000);
		Assert.assertTrue(SurveyBuilderPage.getQuestionError(driver).getText().contains("Please Enter Question."));
		SurveyBuilderPage.questionTypeButton(driver).click();
		Thread.sleep(1000);
		for(WebElement el : SurveyBuilderPage.chooseQuestionType(driver)) {

		Thread.sleep(1000);

			System.out.println(">>>>outside the if"+el.getText());
			
			 if(el.getText().equalsIgnoreCase("Multiple Choice")) {
				System.out.println(">>>>inside the if"+el.getText());
				el.click();
				Thread.sleep(2000);
				SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("MultipleChoiceType"));
				SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
				Thread.sleep(3000);
				Assert.assertTrue(SurveyBuilderPage.getAnswerChoiceError(driver).getText().contains("Please Enter atleast 2 options."));
				Thread.sleep(1000);
				for(int i=0; i<=SurveyBuilderPage.addOptionAsnwersChoice(driver).size(); i++) {
					if(i==0) {
						SurveyBuilderPage.addOptionAsnwersChoice(driver).get(i).sendKeys("choice1");	
					}
					else if(i==1) {
						SurveyBuilderPage.addOptionAsnwersChoice(driver).get(i).sendKeys("choice2");
					}
					
				}
				
				Assert.assertTrue(SurveyBuilderPage.advanceTab(driver).isDisplayed());
				Assert.assertTrue(SurveyBuilderPage.helpTab(driver).isDisplayed());
				Thread.sleep(1000);
				SurveyBuilderPage.advanceTab(driver).click();
				Thread.sleep(1000);
				for(WebElement req : SurveyBuilderPage.requiredQuestion(driver)) {
					if(req.getText().contains("Require an Answer to This Question")) {
						System.out.println("qq");
					}
					else {
						assertFalse(false);
					}
				}
				
				for(WebElement hid : SurveyBuilderPage.hiddenQuestion(driver)) {
					
					if(hid.getText().contains("Hidden Question")) {
						System.out.println("hh");
					}
					else {
						assertFalse(false);
					}
				}
				
			}else if(el.getText().equalsIgnoreCase("Checkboxes")) {
					System.out.println(">>>>inside the if"+el.getText());
					el.click();
					Thread.sleep(2000);
					SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("CheckboxType"));
					SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
					Thread.sleep(2000);
					Assert.assertTrue(SurveyBuilderPage.getAnswerChoiceError(driver).getText().contains("Please Enter atleast 2 options."));
					Thread.sleep(1000);
					for(int i=0; i<=SurveyBuilderPage.addOptionAsnwersChoice(driver).size(); i++) {
						if(i==0) {
							SurveyBuilderPage.addOptionAsnwersChoice(driver).get(i).sendKeys("checkbox1");	
						}
						else if(i==1) {
							SurveyBuilderPage.addOptionAsnwersChoice(driver).get(i).sendKeys("checkbox2");
						}
						
					}
					Assert.assertTrue(SurveyBuilderPage.advanceTab(driver).isDisplayed());
					Assert.assertTrue(SurveyBuilderPage.helpTab(driver).isDisplayed());
					
				}
			else if(el.getText().equalsIgnoreCase("Dropdown")) {
				System.out.println(">>>>inside the if"+el.getText());
				el.click();
				Thread.sleep(2000);
				SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("DropdownType"));
				SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
				Thread.sleep(2000);
				Assert.assertTrue(SurveyBuilderPage.getAnswerChoiceError(driver).getText().contains("Please Enter atleast 2 options."));
				Thread.sleep(1000);
				for(int i=0; i<=SurveyBuilderPage.addOptionAsnwersChoice(driver).size(); i++) {
					if(i==0) {
						SurveyBuilderPage.addOptionAsnwersChoice(driver).get(i).sendKeys("Dropdown1");	
					}
					else if(i==1) {
						SurveyBuilderPage.addOptionAsnwersChoice(driver).get(i).sendKeys("Dropdown2");
					}
					
				}
				Assert.assertTrue(SurveyBuilderPage.advanceTab(driver).isDisplayed());
				Assert.assertTrue(SurveyBuilderPage.helpTab(driver).isDisplayed());
				
			}
			else if(el.getText().equalsIgnoreCase("Short Answer")) {
				System.out.println(">>>>inside the if"+el.getText());
				el.click();
				Thread.sleep(2000);
				SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("ShortAnswerType"));
				
				Thread.sleep(2000);
				Assert.assertTrue(SurveyBuilderPage.checkShortAnswerLabel(driver).getText().contains("Short Answer"));
				Thread.sleep(2000);
				Assert.assertFalse(SurveyBuilderPage.checkShortAnswerChoice(driver).isEnabled());	
				
				Assert.assertTrue(SurveyBuilderPage.advanceTab(driver).isDisplayed());
				Assert.assertTrue(SurveyBuilderPage.helpTab(driver).isDisplayed());
			}
			else if(el.getText().equalsIgnoreCase("Paragraph")) {
				System.out.println(">>>>inside the if"+el.getText());
				el.click();
				Thread.sleep(2000);
				SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("ParagraphType"));
				
				Thread.sleep(2000);
				Assert.assertTrue(SurveyBuilderPage.checkParagraphLebel(driver).getText().contains("Paragraph"));
				Thread.sleep(2000);
				Assert.assertFalse(SurveyBuilderPage.checkParagraphField(driver).isEnabled());	
				Assert.assertTrue(SurveyBuilderPage.advanceTab(driver).isDisplayed());
				Assert.assertTrue(SurveyBuilderPage.helpTab(driver).isDisplayed());
			}
			else if(el.getText().equalsIgnoreCase("Rating")) {
				System.out.println(">>>>inside the if"+el.getText());
				el.click();
				Thread.sleep(2000);
				SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("RatingType"));
				
				Thread.sleep(2000);
				System.out.println(SurveyBuilderPage.ratingScale(driver).getFirstSelectedOption().getText());
				Assert.assertTrue(SurveyBuilderPage.ratingScale(driver).getFirstSelectedOption().getText().equals("1"));
				Thread.sleep(1000);
				SurveyBuilderPage.ratingScale(driver).selectByVisibleText("5");
				Thread.sleep(1000);
				Assert.assertTrue(SurveyBuilderPage.ratingShape(driver).getFirstSelectedOption().getText().contains("Star"));
				SurveyBuilderPage.ratingShape(driver).selectByVisibleText("Thumb");
				Thread.sleep(1000);
				Assert.assertTrue(SurveyBuilderPage.ratingColor(driver).getCssValue("color").equals("rgba(62, 62, 60, 1)"));	
				
				Assert.assertTrue(SurveyBuilderPage.helpTab(driver).isDisplayed());
			
			}
			else if(el.getText().equalsIgnoreCase("Slider")) {
				System.out.println(">>>>inside the if"+el.getText());
				el.click();
				Thread.sleep(2000);
				SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("SliderType"));	
				Thread.sleep(2000);
				Assert.assertTrue(SurveyBuilderPage.startSliderlength(driver).getText().equals("0"));
				Thread.sleep(1000);
				Assert.assertTrue(SurveyBuilderPage.endSliderlength(driver).getText().equals("100"));
				Assert.assertTrue(SurveyBuilderPage.advanceTab(driver).isDisplayed());
				Assert.assertTrue(SurveyBuilderPage.helpTab(driver).isDisplayed());
			
			}
			else if(el.getText().equalsIgnoreCase("Date Picker")) {
				System.out.println(">>>>inside the if"+el.getText());
				el.click();
				Thread.sleep(2000);
				SurveyBuilderPage.enterQuestion(driver).sendKeys(config.getProperty("DatePickerType"));	
				Thread.sleep(2000);
				SurveyBuilderPage.checkdatePickerIsDisabled(driver).isDisplayed();
				Assert.assertFalse(SurveyBuilderPage.checkdatePickerIsDisabled(driver).isEnabled());
				Assert.assertTrue(SurveyBuilderPage.advanceTab(driver).isDisplayed());
				Assert.assertTrue(SurveyBuilderPage.helpTab(driver).isDisplayed());
				break;
				
			}
			 
			 SurveyBuilderPage.clickDoneButtonOfQuestion(driver).click();
		     Thread.sleep(1000);
			 SurveyBuilderPage.addNewQuestionsButton(driver).click();
			 Thread.sleep(1000);
			 SurveyBuilderPage.scrollDown(driver);
			 
			 SurveyBuilderPage.questionTypeButton(driver).click();
		} 
		Thread.sleep(1000);
		SurveyListingPage.SaveAllButtonForBuilder(driver).click();
		Thread.sleep(3000);
		Assert.assertTrue(SurveyListingPage.SaveAllSuccessMessage(driver).getText().contains("Survey Configuration has been saved successfully."));
		
		
		
	}
	

	
}


