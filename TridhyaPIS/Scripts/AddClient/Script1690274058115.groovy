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

WebUI.navigateToUrl('https://devpis.tridhyatech.com/login')

WebUI.setText(findTestObject('Object Repository/Page_PIS Login/input_Forgot Password_email'), 'sagar.s@tridhyatech.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_PIS Login/input_Forgot Password_password'), 'goYbUHNbhadcx8Knm4P0og==')

WebUI.click(findTestObject('Object Repository/Page_PIS Login/input_Forgot Password_btn btn-success float-right'))

WebUI.delay(5)

//WebUI.navigateToUrl('https://devpis.tridhyatech.com/projects')
//WebUI.delay(5)

WebUI.click(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/i_Logout_mdi mdi-account-switch'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_Add Client'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/html_swal-icon--errorborder-colorf27474-web_3ac672'))

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__first_name'), FirstName)

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/b'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input_Cancel_select2-search__field'), Designation)

WebUI.sendKeys(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input_Cancel_select2-search__field'), Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/span_Select Account Manager'))
WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/textarea__address'), address)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__company_name'), clientcompany)

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_Select Account Manager'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input__select2-search__field'), AccountManager)

WebUI.sendKeys(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input_Skype Id_skype_id'), skypeID)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__state'), State)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__code'), Zip)

//----------
WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__last_name'), LastName)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__email'), email)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__phone'), phone)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__website'), Website)

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_Select Country'))

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input_concat(id(, , select2-country_id-cont_e30186'), 
    Country)

WebUI.sendKeys(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input_Cancel_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__city'), City)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Tridhya - PIS/input_Status_btn btn-success save_client'))

