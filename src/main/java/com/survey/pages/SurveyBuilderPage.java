package com.survey.pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SurveyBuilderPage {
	private static WebElement element = null; 
	private static Select selectType;

	public static WebElement enterQuestion(WebDriver driver) {
		element = driver.findElement(By.id("questionName"));
		return element;
	}
	
	public static Select chooseQuestionType (WebDriver driver) {
		selectType = new Select(driver.findElement(By.xpath("//*[@id=\"buildQesWrapper\"]/li[2]/div/div/div/div[2]/div/div/div[1]/div/div[3]/div/button")));
		return selectType;
	}
	
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
	
	
}
