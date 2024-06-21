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

WebUI.click(findTestObject('AddPayment/Page_Tridhya - PIS/i_View Vendor Invoice_mdi mdi-cash-multiple'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('AddPayment/Page_Tridhya - PIS/span_Add Payments'))

WebUI.click(findTestObject('AddPayment/Page_Tridhya - PIS/span_H2M Solutions W.L.L. (Abeer Husaini)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.setText(findTestObject('AddPayment/Page_Tridhya - PIS/input__select2-search__field'), Client)

WebUI.sendKeys(findTestObject('AddPayment/Page_Tridhya - PIS/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByIndex(findTestObject('AddPayment/Page_Tridhya - PIS/select_Select Payment Method'), PayMethod, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('AddPayment/Page_Tridhya - PIS/input__received_inr_amount'), RecdTotAmt)

WebUI.setText(findTestObject('AddPayment/Page_Tridhya - PIS/textarea_Comment_comment'), Comment)

WebUI.click(findTestObject('AddPayment/Page_Tridhya - PIS/input_Adjust Amount_payment'))

WebUI.setText(findTestObject('AddPayment/Page_Tridhya - PIS/input_NA_amount_10835'), RecdAmt)

WebUI.click(findTestObject('AddPayment/Page_Tridhya - PIS/input_NA_adjust_payment'))

WebUI.setText(findTestObject('AddPayment/Page_Tridhya - PIS/textarea__invoice_paid_reason'), AdjustReason)

WebUI.uploadFile(findTestObject('AddPayment/Page_Tridhya - PIS/input__document'), AdjustDoc)

WebUI.click(findTestObject('AddPayment/Page_Tridhya - PIS/button_Update'))

WebUI.delay(5)

//WebUI.click(findTestObject('AddPayment/Page_Tridhya - PIS/button_Submit'))

WebUI.delay(5)

