package com.survey.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesforceHomePage {

	private static WebElement element = null;

	public static WebElement SurveyTab(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]"));
		return element;
	}
}
