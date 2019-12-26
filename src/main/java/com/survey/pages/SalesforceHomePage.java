package com.survey.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SalesforceHomePage {
	
	@FindBy(how=How.CSS,using = "#\\30 1r4T000000H7hD_Tab > a") 
	WebElement surveytab;
	
	public void survey() {
		surveytab.click();
	}

}
