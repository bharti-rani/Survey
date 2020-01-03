package test.cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.survey.pages.SurveySyncMapping;

public class ObjectSyncMapping extends survey.base.TestBase {
	
	@Test
	public static void objectMappingValidation() throws InterruptedException {
	
		AddSurveyQuestion addquestion = new AddSurveyQuestion();
		Thread.sleep(5000);
		SurveySyncMapping.surveyTabMapping(driver).click();
		Thread.sleep(2000);
		SurveySyncMapping.objectSelectField(driver).sendKeys(config.getProperty("Account"));
		SurveySyncMapping.proceedToMapping(driver).click();
		if(SurveySyncMapping.noQuestionValidation(driver).getText().equalsIgnoreCase("No question found in survey")) {
			AddSurveyQuestion.addQuestion();
		}
		Assert.assertTrue(SurveySyncMapping.noQuestionValidation(driver).getText().contains("Please Enter Survey Name."));
		
	}
	public static void createObject() throws InterruptedException {
		SurveySyncMapping.createNewObject(driver).click();
		Thread.sleep(1000);
		SurveySyncMapping.labelForObjectName(driver).sendKeys(config.getProperty("surveyname"));
		SurveySyncMapping.apiNameForObjectLabel(driver).click();
		SurveySyncMapping.apiNameForObjectLabel(driver).sendKeys(config.getProperty("ObjectDescription"));
		
	}
	public static void selectObject() throws InterruptedException{
		
	}
}
