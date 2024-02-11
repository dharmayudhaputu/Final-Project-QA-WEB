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

WebUI.click(findTestObject('Object Repository/Fitur Register/svg_CHECKOUT  (0.00)_menuUser'))

WebUI.click(findTestObject('Object Repository/Fitur Register/a_CREATE NEW ACCOUNT'))

WebUI.setText(findTestObject('Object Repository/Fitur Register/input__usernameRegisterPage'), 'yudhatesting')

WebUI.click(findTestObject('Object Repository/Fitur Register/label_Email'))

WebUI.setText(findTestObject('Object Repository/Fitur Register/input__emailRegisterPage'), 'yudhatesting@gmail.com')

WebUI.setText(findTestObject('Object Repository/Fitur Register/input__passwordRegisterPage'), 'Dharmayudha1')

WebUI.click(findTestObject('Object Repository/Fitur Register/label_Confirm password'))

WebUI.setText(findTestObject('Object Repository/Fitur Register/input__confirm_passwordRegisterPage'), 'Dharmayudha1')

WebUI.setText(findTestObject('Object Repository/Fitur Register/input_PERSONAL DETAILS_first_nameRegisterPage'), 'Dharma')

WebUI.click(findTestObject('Object Repository/Fitur Register/label_Last Name'))

WebUI.setText(findTestObject('Object Repository/Fitur Register/input_- Use maximum 30 character_last_nameR_6ef033'), 'Yudha')

WebUI.setText(findTestObject('Object Repository/Fitur Register/input_- Use maximum 30 character_phone_numb_7c938a'), '081353081122')

WebUI.selectOptionByValue(findTestObject('Object Repository/Fitur Register/select_AfganistanAlbaniaAlgeriaAmerican Sam_3cef8a'), 
    'object:153', true)

WebUI.setText(findTestObject('Object Repository/Fitur Register/input_Country_cityRegisterPage'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/Fitur Register/input_- Use maximum 25 character_addressReg_9e23b3'), 'Jalan Medan Merdeka No 5 Jakarta')

WebUI.click(findTestObject('Object Repository/Fitur Register/label_State  Province  Region'))

WebUI.setText(findTestObject('Object Repository/Fitur Register/input_- Use maximum 50 character_state__pro_272a54'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/Fitur Register/input_- Use maximum 10 character_postal_cod_639c2f'), '80582')

WebUI.click(findTestObject('Object Repository/Fitur Register/input_Receive exclusive offers and promotio_5c7450'))

WebUI.click(findTestObject('Object Repository/Fitur Register/button_REGISTER'))

WebUI.delay(5)

WebUI.closeBrowser()

