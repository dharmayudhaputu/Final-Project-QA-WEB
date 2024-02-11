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

WebUI.click(findTestObject('Object Repository/Fitur Filter 2/div_SPEAKERS                        Shop Now'))

def filterType = filtername // ganti filter ini sesuai dengan kebutuhan test

switch (filterType) {
    case 'WIRELESS TECHNOLOGY':
        WebUI.click(findTestObject('Object Repository/Fitur Filter 2/h4_WIRELESS TECHNOLOGY'))

        WebUI.click(findTestObject('Object Repository/Fitur Filter 2/input_WIRELESS TECHNOLOGY_wireless_technology_0'))

        break
    case 'COLOR':
        WebUI.click(findTestObject('Object Repository/Fitur Filter 2/h4_COLOR'))

        WebUI.click(findTestObject('Object Repository/Fitur Filter 2/a_COLOR_productsColors414141'))

        break
    case 'MANUFACTURER':
        WebUI.click(findTestObject('Object Repository/Fitur Filter 2/h4_MANUFACTURER'))

        WebUI.click(findTestObject('Object Repository/Fitur Filter 2/input_MANUFACTURER_manufacturer_0'))

        break
    case 'COMPATIBILITY':
        WebUI.click(findTestObject('Object Repository/Fitur Filter 2/h4_COMPATIBILITY'))

        WebUI.click(findTestObject('Object Repository/Fitur Filter 2/label_Any device that has bluetooth enabled'))

        WebUI.click(findTestObject('Object Repository/Fitur Filter 2/input_COMPATIBILITY_compatibility_0'))

        break
    default:
        println('Invalid filter type')}

WebUI.delay(5)

WebUI.closeBrowser()

