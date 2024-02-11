import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'qawebtugas.keywordlogin.login'()

assert WebUI.verifyElementPresent(findTestObject('Object Repository/fitur sosmed/img_FOLLOW US_follow_facebook'), 10, FailureHandling.CONTINUE_ON_FAILURE)
assert WebUI.verifyElementPresent(findTestObject('Object Repository/fitur sosmed/img_FOLLOW US_follow_twitter'), 10, FailureHandling.CONTINUE_ON_FAILURE)
assert WebUI.verifyElementPresent(findTestObject('Object Repository/fitur sosmed/img_FOLLOW US_follow_linkedin'), 10, FailureHandling.CONTINUE_ON_FAILURE)
assert WebUI.verifyElementPresent(findTestObject('Object Repository/fitur sosmed/img_DEMO_go_up_btn'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/fitur sosmed/img_FOLLOW US_follow_facebook'))
WebUI.click(findTestObject('Object Repository/fitur sosmed/img_FOLLOW US_follow_twitter'))
WebUI.click(findTestObject('Object Repository/fitur sosmed/img_FOLLOW US_follow_linkedin'))
WebUI.click(findTestObject('Object Repository/fitur sosmed/img_DEMO_go_up_btn'))
WebUI.closeBrowser()


