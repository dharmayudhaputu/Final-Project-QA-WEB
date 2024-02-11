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

WebUI.click(findTestObject('Object Repository/Fitur gagal checkout/div_MICE                        Shop Now'))

WebUI.click(findTestObject('Object Repository/Fitur gagal checkout/img_SHOP NOW_29'))

WebUI.click(findTestObject('Object Repository/Fitur gagal checkout/div_Quantity_plus'))

WebUI.click(findTestObject('Object Repository/Fitur gagal checkout/div_Quantity_plus'))

WebUI.click(findTestObject('Object Repository/Fitur gagal checkout/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/Fitur gagal checkout/a_3'))

WebUI.click(findTestObject('Object Repository/Fitur gagal checkout/button_CHECKOUT (29.97)'))

WebUI.setText(findTestObject('Object Repository/Fitur gagal checkout/input_Already have an account_usernameInOrd_818284'), 
    username)

WebUI.setText(findTestObject('Object Repository/Fitur gagal checkout/input_Username_passwordInOrderPayment'), password)

WebUI.click(findTestObject('Object Repository/Fitur gagal checkout/button_LOGIN'))

WebUI.delay(5)

WebUI.closeBrowser()

