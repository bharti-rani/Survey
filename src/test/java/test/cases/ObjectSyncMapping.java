package test.cases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.survey.pages.SurveySyncMapping;


public class ObjectSyncMapping extends survey.base.TestBase {
	
	@Test
	public static void objectMappingValidation() throws InterruptedException {
		if(!SurveySyncMapping.surveyTabMapping(driver).isDisplayed()) {
			AddSurveyQuestion.addQuestion();
			Thread.sleep(5000);
			SurveySyncMapping.surveyTabMapping(driver).click();
			Thread.sleep(2000);
			selectObjectValidation();
			SurveySyncMapping.objectSelectField(driver).sendKeys(config.getProperty("Account"));
			SurveySyncMapping.radioButtonObjectMapping(driver).click();
			SurveySyncMapping.proceedToMapping(driver).click();
			SurveySyncMapping.saveMapping(driver).click();
			Thread.sleep(1000);
			Assert.assertTrue(SurveySyncMapping.successSaveMapping(driver).getText().contains("Object Mapping Saved Successfully"));
			Thread.sleep(2000);
			SurveySyncMapping.editSurveyMapping(driver).click();
			Thread.sleep(5000);
			createObject();
		}else {
			System.out.println("Say What!");
			Assert.assertFalse(false);
		}
				
	}
	public static void createObject() throws InterruptedException {
		SurveySyncMapping.createNewObject(driver).click();
		SurveySyncMapping.labelForObjectName(driver).clear();
		SurveySyncMapping.apiNameForObjectLabel(driver).clear();
		Thread.sleep(1000);
		SurveySyncMapping.createObject(driver).click();
		if(SurveySyncMapping.labelForObjectNameValidation(driver).getText().equalsIgnoreCase("This field is required")) {
			SurveySyncMapping.labelForObjectName(driver).sendKeys(config.getProperty("NewObject"));
			SurveySyncMapping.apiNameForObjectLabel(driver).click();
			SurveySyncMapping.createObject(driver).click();
		}
		Thread.sleep(5000);
		if(SurveySyncMapping.autoCreatedText(driver).getText().equalsIgnoreCase("Auto Created")){
			editMapField();
		}else if(SurveySyncMapping.autoSuggestedText(driver).getText().equalsIgnoreCase("Auto Suggested")){
			SurveySyncMapping.crossOnMapField(driver).click();
		}else {
			SurveySyncMapping.saveMapping(driver).click();
		}
	}
	public static void selectObjectValidation() throws InterruptedException{
		SurveySyncMapping.proceedToMapping(driver).click();
		//Assert.assertTrue(SurveySyncMapping.showValidationOnObject(driver).getText().contains("please select object or create new"));
	}
	public static void editMapField() throws InterruptedException {
		SurveySyncMapping.editMapField(driver).click();
		SurveySyncMapping.editMapFieldLabel(driver).sendKeys(config.getProperty("FieldLabel"));
		SurveySyncMapping.editMapFieldLabelAPI(driver).click();
		SurveySyncMapping.editMapFieldType(driver).selectByValue(config.getProperty("FieldType"));
		SurveySyncMapping.editMapFieldLength(driver).selectByValue(config.getProperty("FieldLength"));
		SurveySyncMapping.editMapFieldDescription(driver).sendKeys("Test Description");
		SurveySyncMapping.editMapFieldDone(driver).click();
		Thread.sleep(2000);
		SurveySyncMapping.saveMapping(driver).click();
		Thread.sleep(8000);
		Assert.assertTrue(SurveySyncMapping.successSaveMapping(driver).getText().equalsIgnoreCase("Object Mapping Saved Successfully"));
	}
}
