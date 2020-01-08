package test.cases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.survey.pages.SurveySyncMapping;

public class ObjectSyncMapping extends survey.base.TestBase {
	private static int i;
	
	@Test
	public static void objectMappingValidation() throws InterruptedException {
	
		AddSurveyQuestion addquestion = new AddSurveyQuestion();
		addquestion.addQuestion();
		Thread.sleep(5000);
	 	SurveySyncMapping.surveyTabMapping(driver).click();
		Thread.sleep(2000);
		SurveySyncMapping.objectSelectField(driver).sendKeys(config.getProperty("Account"));
		SurveySyncMapping getivalue = new SurveySyncMapping(i);
		for(i=1; i<=5; i++) {
			String objectName = getivalue.beforePath(driver, i).getText();
			if(objectName.contains(config.getProperty("Account"))) {
				getivalue.afterPath(driver, i).click();
				break;
			}
			
		}
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
		SurveySyncMapping.createObject(driver).click();
		
	}
	/*public static void selectObject() throws InterruptedException{
		
	}*/
}
