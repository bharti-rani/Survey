package com.survey.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SurveyPreviewPage {

	private static WebElement element = null;

	private static By by = null;
	
 	public static By previewTab(WebDriver driver) {

		by = By.xpath("//li[@previewtab='SurveyPreview']");
		return by;
	}

	public static WebElement desktopViewIcon(WebDriver driver) {

		element = driver.findElement(By.xpath("//i[contains(@class,'fa fa-2x fa-desktop')]"));
		return element;
	}

	public static WebElement mobileViewIcon(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[contains(@class,'sf-btn-custom slds-p-around_small')]"));
		return element;
	}

	public static By startSurveyButton(WebDriver driver) {

		by = By.xpath("//button[@data-startsurveybutton='data-startSurveyButton']");
		return by;
	}

	public static WebElement requiredIcon(WebDriver driver) {

		element = driver.findElement(By.xpath("//i[contains(@class,'fa fa-sm fa-asterisk sf-text-red')]"));
		return element;
	}

	public static By submitButton(WebDriver driver) {

		by = By.xpath("//div[@id='questionsInPreview']//button[1]");
		return by;
	}

	public static WebElement checkRequiredErrorMessage(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id=\"questionsWrapper\"]/div/div/div[2]/div[2]/div[2]"));
		return element;
	}

	public static By shortAnswerInputBox(WebDriver driver) {
		by = By.xpath("//div[@id='questionsInPreviewForIframe']//div[1]//div[1]//div[2]//div[2]//div[1]//div[1]//input[1]");
		return by;
	}

	public static WebElement checkPlaceholderErrorMessage(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id=\"questionsWrapper\"]/div/div/div[2]/div[2]/div[2]"));
		return element;
	}

	public static WebElement placeholderInputBox(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//div[@id='questionsInPreviewForIframe']//div[1]//div[1]//div[2]//div[2]//div[1]//div[1]//input[1]"));
		return element;
	}

	public static WebElement totalQuestionCount(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[@class='totalQuestionPreview']"));
		return element;
	}

}
