package com.survey.pages;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SurveyBuilderPage {
	private static WebElement element = null; 
	//private static Select selectType;

	public static WebElement enterQuestion(WebDriver driver) {
		element = driver.findElement(By.id("questionName"));
		return element;
	}
	public static WebElement questionTypeButton (WebDriver driver) {
		element = driver.findElement(By.xpath("//span[@class='slds-p-left_xx-small sf-view-inline sf-min-w-150 sf-text-left']"));
		return element;
	}
	public static List<WebElement> chooseQuestionType (WebDriver driver) {
		List<WebElement> element = new ArrayList<WebElement>();
		element.add(driver.findElement(By.xpath("//div[@class='slds-has-flexi-truncate']//span[contains(text(),'Multiple Choice')]")));
		element.add(driver.findElement(By.xpath("//span[contains(text(),'Checkboxes')]")));
		element.add(driver.findElement(By.xpath("//span[contains(text(),'Dropdown')]")));
		element.add(driver.findElement(By.xpath("//span[contains(text(),'Short Answer')]")));
		element.add(driver.findElement(By.xpath("//span[contains(text(),'Paragraph')]")));
		element.add(driver.findElement(By.xpath("//span[contains(text(),'Rating')]")));
		element.add(driver.findElement(By.xpath("//span[contains(text(),'Slider')]")));
		element.add(driver.findElement(By.xpath("//span[contains(text(),'Date Picker')]")));
		element.add(driver.findElement(By.xpath("//div[@class='slds-has-flexi-truncate']//span[contains(text(),'Section')]")));
		return element;
	}
	/*public static WebElement selectQuestionType (WebDriver driver) {
		
		return element;
	}
	*/
	public static List<WebElement> addOptionAsnwersChoice(WebDriver driver) {
	List<WebElement> element = driver.findElements(By.xpath("//input[@class='slds-input' and @placeholder='Option']"));
		return element;
	}
	public static WebElement addOtherCommentField(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"buildQesWrapper\"]/li[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[4]/div/div[1]/div/div/span/label/span[1]"));
		return element;
	}
	public static WebElement copyAndPasteQuestions(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"AddNewQuestionButton\"]/a"));
		return element;
	}
	
	public static WebElement writeAndPasteListOfQuestions(WebDriver driver) {
		element = driver.findElement(By.id("Copyandpastequestions"));
		return element;
	}
	
	public static WebElement addListOfQuestions(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"modalCreateNewSF\"]/section/div/footer/button"));
		return element;
	}
	
	public static WebElement AddListOfQuestions(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"modalCreateNewSF\"]/section/div/footer/button"));
		return element;
	}
	public static WebElement nextQuestions (WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"buildQesWrapper\"]/li[2]/div/div/div/div[2]/div/div/div[3]/div/div[1]/button"));
		return element;
	}
	
	public static WebElement editQuestions(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"buildQesWrapper\"]/li[1]/div/div/div/div[2]/div/div[2]/div[2]/div/div/button[1]"));
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
		element = driver.findElement(By.xpath("//div[contains(@class,'slds-p-bottom_medium')]//div[contains(@class,'slds-has-flexi-truncate')]//input[contains(@class,'slds-input')]"));
		return element;
	}
	
	public static WebElement checkParagraphLebel(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[contains(text(),'Paragraph')]"));
		return element;
	}
	public static WebElement checkParagraphField(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(@class,'slds-p-bottom_medium')]//textarea[contains(@class,'slds-textarea')]"));
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
}
