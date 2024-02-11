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

WebUI.click(findTestObject('Object Repository/fitur add to chart/a_My account                        My orde_124641'))

WebUI.setText(findTestObject('Object Repository/fitur add to chart/input_OR_username'), 'yudhatesting')

WebUI.setEncryptedText(findTestObject('Object Repository/fitur add to chart/input_Username_password'), 'VjyC/is+sZNhzZxZ8kSNJw==')

WebUI.click(findTestObject('Object Repository/fitur add to chart/button_SIGN IN'))

WebUI.click(findTestObject('Object Repository/fitur add to chart/div_LAPTOPS                        Shop Now'))

def laptopType = datalaptop // ganti filter ini sesuai dengan kebutuhan test

switch (laptopType) {
    case 'LAPTOP A':
        WebUI.click(findTestObject('Object Repository/fitur add to chart/img_SHOP NOW_9'))

        WebUI.click(findTestObject('Object Repository/fitur add to chart/button_ADD TO CART'))

        WebUI.click(findTestObject('Object Repository/fitur add to chart/a_LAPTOPS'))

        break
    case 'LAPTOP B':
        WebUI.click(findTestObject('Object Repository/fitur add to chart/img_SHOP NOW_10'))

        WebUI.click(findTestObject('Object Repository/fitur add to chart/button_ADD TO CART'))

        WebUI.click(findTestObject('Object Repository/fitur add to chart/a_LAPTOPS'))

        break
    case 'LAPTOP C':
        WebUI.click(findTestObject('Object Repository/fitur add to chart/img_SHOP NOW_7'))

        WebUI.click(findTestObject('Object Repository/fitur add to chart/button_ADD TO CART'))

        WebUI.click(findTestObject('Object Repository/fitur add to chart/a_LAPTOPS'))

        break
    default:
        println('Invalid LAPTOP type')}

WebUI.click(findTestObject('Object Repository/fitur add to chart/a_3'))

WebUI.delay(5)

WebUI.closeBrowser()

