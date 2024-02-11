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

WebUI.click(findTestObject('Object Repository/fitur gagal safepay payment/svg_CHECKOUT  (0.00)_menuUser'))

WebUI.setText(findTestObject('Object Repository/fitur gagal safepay payment/input_OR_username'), 'yudhatesting')

WebUI.setEncryptedText(findTestObject('Object Repository/fitur gagal safepay payment/input_Username_password'), 'VjyC/is+sZNhzZxZ8kSNJw==')

WebUI.click(findTestObject('Object Repository/fitur gagal safepay payment/button_SIGN IN'))

WebUI.click(findTestObject('Object Repository/fitur gagal safepay payment/div_TABLETS                        Shop Now'))

WebUI.click(findTestObject('Object Repository/fitur gagal safepay payment/img_SHOP NOW_16'))

WebUI.click(findTestObject('Object Repository/fitur gagal safepay payment/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/fitur gagal safepay payment/a_4'))

WebUI.click(findTestObject('Object Repository/fitur gagal safepay payment/button_CHECKOUT (3,296.99)'))

WebUI.click(findTestObject('Object Repository/fitur gagal safepay payment/button_NEXT'))

WebUI.setEncryptedText(findTestObject('Object Repository/fitur gagal safepay payment/input__safepay_password'), 'aj9YhGxH1gRaOs7gChVLIg==')

WebUI.click(findTestObject('Object Repository/fitur gagal safepay payment/sec-form_SafePay usernameSafePay username- _b44954'))

WebUI.delay(5)

WebUI.closeBrowser()

