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

WebUI.click(findTestObject('Object Repository/Fitur Search 2/svg_CHECKOUT  (0.00)_menuUser'))

WebUI.setText(findTestObject('Object Repository/Fitur Search 2/input_OR_username'), 'yudhatesting')

WebUI.setEncryptedText(findTestObject('Object Repository/Fitur Search 2/input_Username_password'), 'VjyC/is+sZNhzZxZ8kSNJw==')

WebUI.click(findTestObject('Object Repository/Fitur Search 2/button_SIGN IN'))

// Masukkan kata kunci pencarian
String keyword = 'tablet'
WebUI.setText(findTestObject('Object Repository/Fitur Search 2/input_DEMO_mobile_search'), keyword)

WebUI.sendKeys(findTestObject('Object Repository/Fitur Search 2/input_DEMO_mobile_search'), Keys.chord(Keys.ENTER))

// Periksa apakah kata kunci yang dimasukkan adalah "tablet" atau tidak
if (!keyword.equalsIgnoreCase('tablet')) {
    // Tampilkan pesan informasi
    println('Maaf, keyword yang dimasukkan tidak sesuai.')
    // Tutup browser
    WebUI.closeBrowser()
	
} else {
    // Lakukan langkah-langkah pencarian produk jika kata kunci adalah "tablet"
    WebUI.click(findTestObject('Object Repository/Fitur Search 2/img_SHOP NOW_16'))

    WebUI.click(findTestObject('Object Repository/Fitur Search 2/img'))

    WebUI.click(findTestObject('Object Repository/Fitur Search 2/img_1'))

    WebUI.click(findTestObject('Object Repository/Fitur Search 2/img_1_2'))

    WebUI.closeBrowser()
}


