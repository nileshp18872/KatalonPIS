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
WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/i_View Clients_mdi mdi-account-switch'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_Add Vendor'))

WebUI.navigateToUrl('https://devpis.tridhyatech.com/vendor/create')

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__first_name'), FirstName)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__last_name'), LastName)

//WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_Select Designation'))
WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_Select Designation'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input_Cancel_select2-search__field'), Designation)

WebUI.sendKeys(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input_Cancel_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__email'), email)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/textarea_Address_address'), address)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input_Phone_phone'), phone)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input_Client Company Name_company_name'), clientcompany)

//WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/b'))
WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/b'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input__select2-search__field'), AccountManager)

WebUI.sendKeys(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input_Website_website'), Website)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input_Skype Id_skype_id'), skypeID)

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_Select Country'))

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input_concat(id(, , select2-country_id-cont_e30186'), 
    Country)

WebUI.sendKeys(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input_Cancel_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input_State_state'), State)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input_City_city'), City)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input_City_btn btn-success'))
