package com.survey.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SurveyBuilderPage {

	private static WebElement element = null;

	public static WebElement builderTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//li[contains(@class,'slds-col--bump-right')]"));
		return element;
	}

	public static WebElement enterQuestion(WebDriver driver) {
		element = driver.findElement(By.id("questionName"));
		return element;
	}

	public static WebElement questionTypeButton(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//span[@class='slds-p-left_xx-small sf-view-inline sf-min-w-150 sf-text-left']"));
		return element;
	}

	public static List<WebElement> chooseQuestionType(WebDriver driver) {
		List<WebElement> element = new ArrayList<WebElement>();
		element.add(driver.findElement(
				By.xpath("//div[@class='slds-has-flexi-truncate']//span[contains(text(),'Multiple Choice')]")));
		element.add(driver.findElement(By.xpath("//span[contains(text(),'Checkboxes')]")));
		element.add(driver.findElement(By.xpath("//span[contains(text(),'Dropdown')]")));
		element.add(driver.findElement(By.xpath("//span[contains(text(),'Short Answer')]")));
		element.add(driver.findElement(By.xpath("//span[contains(text(),'Paragraph')]")));
		element.add(driver.findElement(By.xpath("//span[contains(text(),'Rating')]")));
		element.add(driver.findElement(By.xpath("//span[contains(text(),'Slider')]")));
		element.add(driver.findElement(By.xpath("//span[contains(text(),'Date Picker')]")));

		return element;
	}

	public static JavascriptExecutor scrollDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		return js;
	}

	public static List<WebElement> addOptionAsnwersChoice(WebDriver driver) {
		List<WebElement> element = driver
				.findElements(By.xpath("//input[@class='slds-input' and @placeholder='Option']"));
		return element;
	}

	public static WebElement addNewQuestionsButton(WebDriver driver) {
		element = driver.findElement(By.id("AddNewQuestionButton"));
		return element;
	}

	public static WebElement clickDoneButtonOfQuestion(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[contains(text(),'Done')]"));
		return element;
	}

	public static WebElement getQuestionError(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Please Enter Question.')]"));
		return element;
	}

	public static WebElement getAnswerChoiceError(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Please Enter atleast 2 options.')]"));
		return element;
	}

	public static WebElement checkShortAnswerLabel(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[contains(text(),'Short Answer')]"));
		return element;
	}

	public static WebElement checkShortAnswerChoice(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//div[contains(@class,'slds-p-bottom_medium')]//div[contains(@class,'slds-has-flexi-truncate')]//input[contains(@class,'slds-input')]"));
		return element;
	}

	public static WebElement checkParagraphLebel(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[contains(text(),'Paragraph')]"));
		return element;
	}

	public static WebElement checkParagraphField(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//div[contains(@class,'slds-p-bottom_medium')]//textarea[contains(@class,'slds-textarea')]"));
		return element;
	}

	public static Select ratingScale(WebDriver driver) {
		Select element = new Select(driver.findElement(By.id("noRating")));
		return element;

	}

	public static Select ratingShape(WebDriver driver) {
		Select element = new Select(driver.findElement(By.id("ratingShape")));
		return element;
	}

	public static WebElement ratingColor(WebDriver driver) {
		element = driver.findElement(By.id("ratingColor"));
		return element;
	}

	public static WebElement startSliderlength(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='optionHtmlWrapper']//span[1]"));
		return element;
	}

	public static WebElement endSliderlength(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(@class,'slds-slider__value')][contains(text(),'100')]"));
		return element;
	}

	public static WebElement checkdatePickerIsDisabled(WebDriver driver) {
		element = driver.findElement(By.id("date-input-id"));
		return element;
	}

	public static WebElement advanceTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Advanced')]"));
		return element;
	}

	public static WebElement helpTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Help Tip')]"));
		return element;
	}

	public static List<WebElement> requiredQuestion(WebDriver driver) {
		List<WebElement> element = driver
				.findElements(By.xpath("//span[@random-id='isReq']//label[@for='isRequired']//span"));
		return element;
	}

	public static List<WebElement> placeholderQuestion(WebDriver driver) {
		List<WebElement> element = driver
				.findElements(By.xpath("//span[@random-id='plc']//label[@for='hasPlaceholder']//span"));
		return element;
	}

	public static List<WebElement> maxLengthQuestion(WebDriver driver) {
		List<WebElement> element = driver
				.findElements(By.xpath("//span[@random-id='max']//label[@for='hasMaxLength']//span"));
		return element;
	}

	public static List<WebElement> defaultValueQuestion(WebDriver driver) {
		List<WebElement> element = driver
				.findElements(By.xpath("//span[@random-id='val']//label[@for='hasDefaultValue']//span"));
		return element;
	}

	public static List<WebElement> hiddenQuestion(WebDriver driver) {
		List<WebElement> element = driver
				.findElements(By.xpath("//span[@random-id='val']//label[@for='hasQuesHidden']//span"));
		return element;
	}

	public static WebElement requiredMessageTextField(WebDriver driver) {
		element = driver.findElement(By.id("requiredMessage"));
		return element;
	}

	public static WebElement requiredMessageTextFieldErrorMessage(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Please Enter Required Error Message')]"));
		return element;
	}

	public static WebElement requiredMessageIcon(WebDriver driver) {
		element = driver.findElement(By.xpath("//i[@class='fa fa-asterisk sf-text-red slds-m-right_xx-small']"));
		return element;
	}

	public static WebElement editQuestion(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//button[@class='slds-button slds-button_neutral' and @data-editquestion-button='data-editQuestion-button']"));
		return element;
	}

	public static WebElement defaultMessageTextFieldErrorMessage(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Please Enter Default Value.')]"));
		return element;
	}

	public static WebElement defaultMessageTextField(WebDriver driver) {
		element = driver.findElement(By.id("defaultValue"));
		return element;
	}

	public static WebElement shortAnswerInputBox(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//div[contains(@class,'slds-p-around--small')]//input[contains(@class,'slds-input')]"));
		return element;
	}

	public static WebElement maxLengthTextFieldErrorMessage(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Please Enter Max Length.')]"));
		return element;
	}

	public static WebElement maxLengthTextField(WebDriver driver) {
		element = driver.findElement(By.id("maxLength"));
		return element;
	}

	public static WebElement placeholderTextFieldErrorMessage(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Please Enter Placeholder')]"));
		return element;
	}

	public static WebElement placeholderTextField(WebDriver driver) {
		element = driver.findElement(By.id("placeholders"));
		return element;
	}

	public static WebElement hiddenQuestionIcon(WebDriver driver) {
		element = driver.findElement(By.xpath("//i[@class='fa fa-eye-slash']"));
		return element;
	}

	public static WebElement hiddenQuestionText(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(@class,'slds-badge')]"));
		return element;
	}

}
