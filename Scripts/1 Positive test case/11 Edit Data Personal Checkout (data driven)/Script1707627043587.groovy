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

WebUI.click(findTestObject('Object Repository/fitur edit data address/a_My account                        My orde_124641'))

WebUI.setText(findTestObject('Object Repository/fitur edit data address/input_OR_username'), 'yudhatesting')

WebUI.setEncryptedText(findTestObject('Object Repository/fitur edit data address/input_Username_password'), 'VjyC/is+sZNhzZxZ8kSNJw==')

WebUI.click(findTestObject('Object Repository/fitur edit data address/button_SIGN IN'))

WebUI.click(findTestObject('Object Repository/fitur edit data address/button_SEE OFFER'))

WebUI.click(findTestObject('Object Repository/fitur edit data address/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/fitur edit data address/a_6'))

WebUI.click(findTestObject('Object Repository/fitur edit data address/button_CHECKOUT (5,494.99)'))

WebUI.click(findTestObject('Object Repository/fitur edit data address/a_Edit shipping details'))

WebUI.setText(findTestObject('Object Repository/fitur edit data address/input_- Use maximum 25 character_address'), address)

WebUI.click(findTestObject('Object Repository/fitur edit data address/label_State  Province  Region'))

WebUI.setText(findTestObject('Object Repository/fitur edit data address/input_- Use maximum 10 character_state__pro_f620c3'), 
    region)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/fitur edit data address/button_NEXT'))

WebUI.click(findTestObject('Object Repository/fitur edit data address/button_PAY NOW'))

WebUI.closeBrowser()

