package test.cases;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.survey.pages.ResponcePage;
import com.survey.pages.SurveyBuilderPage;

public class CheckResponce extends survey.base.TestBase{
	
	@Test
	public static void checkResponce() throws InterruptedException {
		
	SurveyBuilderPage.builderTab(driver).click();
	
	int addedQuestionCount = ResponcePage.getAllAddedQuestion(driver).size();
	wait.until(ExpectedConditions.presenceOfElementLocated(ResponcePage.responceTab(driver))).click();
    WebElement foundQustionm = wait.until(ExpectedConditions.visibilityOfElementLocated(ResponcePage.getTotalQuestion(driver)));
	String responceqTotalQuestion = ResponcePage.getTotalQuestionCount(driver).getText();
	int converttotalquestioncount = Integer.parseInt(responceqTotalQuestion);
	Assert.assertEquals(converttotalquestioncount, addedQuestionCount);
	String getTotalResponceCount = ResponcePage.totalResponcesCount(driver).getText();
	int convertTotalResponceCount = Integer.parseInt(getTotalResponceCount);
	int responceTableRecordCount = ResponcePage.getResponceTableRecordCount(driver).size();
	Assert.assertEquals(responceTableRecordCount, convertTotalResponceCount);

	if(convertTotalResponceCount>0 && responceTableRecordCount>0) {
		
		int completedandPartiallyCompleted_ResponceRecords =ResponcePage.getCompletedRecordAndPartialyCompleted(driver).size();
	    
		System.out.println(completedandPartiallyCompleted_ResponceRecords);
		int percentage = ((completedandPartiallyCompleted_ResponceRecords/convertTotalResponceCount)*100);
		System.out.println(percentage);
	}
	else {
		System.out.println("There is no records");
	}
	
	
	}

}
