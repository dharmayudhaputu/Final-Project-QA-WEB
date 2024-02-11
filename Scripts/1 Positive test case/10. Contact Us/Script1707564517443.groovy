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

//CustomKeywords.'qawebtugas.keywordlogin.login'()
WebUI.openBrowser('')

WebUI.navigateToUrl('https://advantageonlineshopping.com/')

WebUI.selectOptionByValue(findTestObject('Object Repository/fitur contact us/select_Select CategoryLaptopsHeadphonesTabl_1ef56f'), 
    'object:60', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/fitur contact us/select_Select ProductHP Chromebook 14 G1(EN_361ba3'), 
    'object:123', true)

WebUI.setText(findTestObject('Object Repository/fitur contact us/input__emailContactUs'), email)

WebUI.setText(findTestObject('Object Repository/fitur contact us/textarea__subjectTextareaContactUs'), subject)

WebUI.click(findTestObject('Object Repository/fitur contact us/button_SEND'))

WebUI.delay(5)

WebUI.closeBrowser()

