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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://advantageonlineshopping.com/')

WebUI.click(findTestObject('Object Repository/invalid CC Payment Method/path_CHECKOUT  (0.00)_menuUserSVGPath'))

WebUI.setText(findTestObject('Object Repository/invalid CC Payment Method/input_OR_username'), 'yudhatesting')

WebUI.setEncryptedText(findTestObject('Object Repository/invalid CC Payment Method/input_Username_password'), 'VjyC/is+sZNhzZxZ8kSNJw==')

WebUI.click(findTestObject('Object Repository/invalid CC Payment Method/button_SIGN IN'))

WebUI.click(findTestObject('Object Repository/invalid CC Payment Method/div_TABLETS                        Shop Now'))

WebUI.click(findTestObject('Object Repository/invalid CC Payment Method/img_SHOP NOW_16'))

WebUI.click(findTestObject('Object Repository/invalid CC Payment Method/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/invalid CC Payment Method/a_2'))

WebUI.click(findTestObject('Object Repository/invalid CC Payment Method/button_CHECKOUT (1,278.99)'))

WebUI.click(findTestObject('Object Repository/invalid CC Payment Method/button_NEXT'))

WebUI.click(findTestObject('Object Repository/invalid CC Payment Method/img'))

WebUI.setText(findTestObject('Object Repository/invalid CC Payment Method/input__card_number'), '1234 5678 9002')

WebUI.click(findTestObject('Object Repository/invalid CC Payment Method/label_Cardholder name'))

WebUI.setText(findTestObject('Object Repository/invalid CC Payment Method/input__cardholder_name'), 'dharmayudhaputu')

WebUI.click(findTestObject('Object Repository/invalid CC Payment Method/label_CVV number'))

WebUI.setText(findTestObject('Object Repository/invalid CC Payment Method/input__cvv_number'), '2')

WebUI.click(findTestObject('Object Repository/invalid CC Payment Method/div_1. SHIPPING DETAILS         2. PAYMENT _93ea38'))

WebUI.setText(findTestObject('Object Repository/invalid CC Payment Method/input__card_number'), '1234 5678 900')

WebUI.click(findTestObject('Object Repository/invalid CC Payment Method/div_1. SHIPPING DETAILS         2. PAYMENT _93ea38_1'))
WebUI.delay(5)

WebUI.closeBrowser()

