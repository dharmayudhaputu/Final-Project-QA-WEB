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
WebUI.click(findTestObject('Object Repository/fitur checkout 2/a_My account                        My orde_124641'))
WebUI.setText(findTestObject('Object Repository/fitur checkout 2/input_OR_username'), 'yudhatesting')
WebUI.setEncryptedText(findTestObject('Object Repository/fitur checkout 2/input_Username_password'), 'VjyC/is+sZNhzZxZ8kSNJw==')
WebUI.click(findTestObject('Object Repository/fitur checkout 2/button_SIGN IN'))

// Assertion untuk memeriksa apakah berhasil login
WebUI.verifyElementPresent(findTestObject('Object Repository/fitur checkout 2/label_View Details'), 10)

// Jika assertion berhasil, lanjutkan ke langkah berikutnya
if (WebUI.verifyElementPresent(findTestObject('Object Repository/fitur checkout 2/label_View Details'), 10)) {
    WebUI.click(findTestObject('Object Repository/fitur checkout 2/label_View Details'))
    WebUI.click(findTestObject('Object Repository/fitur checkout 2/button_ADD TO CART'))
    WebUI.click(findTestObject('Object Repository/fitur checkout 2/a_LAPTOPS'))
    WebUI.click(findTestObject('Object Repository/fitur checkout 2/a_3'))
    WebUI.click(findTestObject('Object Repository/fitur checkout 2/button_CHECKOUT (3,785.97)'))
    WebUI.click(findTestObject('Object Repository/fitur checkout 2/button_NEXT'))
    WebUI.click(findTestObject('Object Repository/fitur checkout 2/img'))
    WebUI.click(findTestObject('Object Repository/fitur checkout 2/button_PAY NOW'))
    WebUI.delay(5)
    WebUI.closeBrowser()
} else {
    // Jika assertion gagal, Anda dapat menambahkan log atau tindakan lain sesuai kebutuhan
    println('Login failed, cannot proceed to the next step.')
    WebUI.closeBrowser()
}



