package com.survey.pages;

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
	
	public static WebElement allSetToSaveQuestions(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"buildQesWrapper\"]/li[2]/div/div/div/div[2]/div/div/div[3]/div/div[2]/button[2]"));
		return element;
	}
	
	public static WebElement cancelQuestion (WebDriver driver) {
		element = driver.findElement(By.id("//*[@id=\"buildQesWrapper\"]/li[2]/div/div/div/div[2]/div/div/div[3]/div/div[2]/button[1]"));
		return element;
	}
	
	public static WebElement addOptionAsnwers(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"buildQesWrapper\"]/li[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[2]/button"));
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
}
