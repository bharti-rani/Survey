package com.survey.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SalesforceHomePage {

private static By element = null;

	public static By surveyTab(WebDriver driver) {
		
		element = By.xpath("//*[@id=\"01r4T000000H7hD_Tab\"]/a");
		return element;
	}
}
 