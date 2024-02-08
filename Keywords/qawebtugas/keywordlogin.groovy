package qawebtugas

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class keywordlogin {

	@Keyword
	def static void login() {
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://advantageonlineshopping.com/')
		
		WebUI.click(findTestObject('Object Repository/Fitur Search 2/svg_CHECKOUT  (0.00)_menuUser'))
		
		WebUI.setText(findTestObject('Object Repository/Fitur Search 2/input_OR_username'), 'yudhatesting')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Fitur Search 2/input_Username_password'), 'VjyC/is+sZNhzZxZ8kSNJw==')
		
		WebUI.click(findTestObject('Object Repository/Fitur Search 2/button_SIGN IN'))
	}
}
