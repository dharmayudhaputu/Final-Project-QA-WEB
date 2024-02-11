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

WebUI.click(findTestObject('Object Repository/fitur checkout 1/a_My account                        My orde_124641'))

WebUI.setText(findTestObject('Object Repository/fitur checkout 1/input_OR_username'), 'yudhatesting')

WebUI.click(findTestObject('Object Repository/fitur checkout 1/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/fitur checkout 1/input_Username_password'), 'VjyC/is+sZNhzZxZ8kSNJw==')

WebUI.click(findTestObject('Object Repository/fitur checkout 1/button_SIGN IN'))

WebUI.click(findTestObject('Object Repository/fitur checkout 1/div_SPEAKERS                        Shop Now'))

WebUI.click(findTestObject('Object Repository/fitur checkout 1/img_SHOP NOW_20'))

WebUI.click(findTestObject('Object Repository/fitur checkout 1/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/fitur checkout 1/a_SPEAKERS'))

WebUI.click(findTestObject('Object Repository/fitur checkout 1/img_SHOP NOW_25'))

WebUI.click(findTestObject('Object Repository/fitur checkout 1/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/fitur checkout 1/a_SPEAKERS'))

WebUI.click(findTestObject('Object Repository/fitur checkout 1/a_11'))

WebUI.click(findTestObject('Object Repository/fitur checkout 1/button_CHECKOUT (7,634.90)'))

WebUI.click(findTestObject('Object Repository/fitur checkout 1/button_NEXT'))

WebUI.setText(findTestObject('Object Repository/fitur checkout 1/input__safepay_username'), username)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/fitur checkout 1/input__safepay_password'), password)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/fitur checkout 1/button_PAY NOW'))

WebUI.delay(5)

WebUI.closeBrowser()

