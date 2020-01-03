package test.cases;

import org.openqa.selenium.WebDriver;
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
		Assert.assertTrue(SurveySyncMapping.noQuestionValidation(driver).getText().contains("No question found in survey"));
		selectObject();
		createObject();
		Thread.sleep(5000);
		if(SurveySyncMapping.mapResponseWithObjectFields(driver).getText().equalsIgnoreCase("Map Response With Object Fields")) {
			editMapField();
		}
		SurveySyncMapping.saveMapping(driver);
	}
	public static void createObject() throws InterruptedException {
		SurveySyncMapping.createNewObject(driver).click();
		Thread.sleep(1000);
		SurveySyncMapping.labelForObjectName(driver).sendKeys(config.getProperty("surveyname"));
		SurveySyncMapping.apiNameForObjectLabel(driver).click();
		SurveySyncMapping.apiNameForObjectLabel(driver).sendKeys(config.getProperty("ObjectDescription"));
		SurveySyncMapping.createObject(driver).click();
		
	}
	public static void selectObject() throws InterruptedException{
		driver.navigate().refresh();
		Thread.sleep(5000);
		SurveySyncMapping.proceedToMapping(driver).click();
		Assert.assertTrue(SurveySyncMapping.showValidationOnObject(driver).getText().contains("please select object or create new"));
		SurveySyncMapping.objectSelectField(driver).sendKeys(config.getProperty("Account"));
		SurveySyncMapping.proceedToMapping(driver).click();
	}
	public static void editMapField() throws InterruptedException {
		if(SurveySyncMapping.autoCreatedText(driver).getText().equalsIgnoreCase("Auto Created")){
			SurveySyncMapping.editMapField(driver).click();
			SurveySyncMapping.editMapFieldLabel(driver).sendKeys(config.getProperty("FieldLabel"));
			SurveySyncMapping.editMapFieldLabelAPI(driver).click();
			SurveySyncMapping.editMapFieldType(driver).selectByValue(config.getProperty("FieldType"));
			SurveySyncMapping.editMapFieldLength(driver).selectByValue(config.getProperty("FieldLength"));
			SurveySyncMapping.editMapFieldDescription(driver).sendKeys("Test Description");
			SurveySyncMapping.editMapFieldDone(driver).click();
		}
		Thread.sleep(1000);
	}
}
