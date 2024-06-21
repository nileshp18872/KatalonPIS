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

WebUI.click(findTestObject('Add Invoice/Page_Tridhya - PIS/i_Deleted Cr List_mdi mdi-file'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Add Invoice/Page_Tridhya - PIS/span_Add Invoice'))

WebUI.click(findTestObject('Add Invoice/Page_Tridhya - PIS/span_Test Client-1 Company (Test Client-1 LastName)'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Add Invoice/Page_Tridhya - PIS/input__select2-search__field'), Client)

WebUI.sendKeys(findTestObject('Add Invoice/Page_Tridhya - PIS/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Add Invoice/Page_Tridhya - PIS/span_Test Project1 - Fixed External'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Add Invoice/Page_Tridhya - PIS/input__select2-search__field'), Project)

WebUI.sendKeys(findTestObject('Add Invoice/Page_Tridhya - PIS/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Add Invoice/Page_Tridhya - PIS/input_Remark_remark'), Remark)

WebUI.setText(findTestObject('Add Invoice/Page_Tridhya - PIS/input__invoice_date'), InvDate)

WebUI.setText(findTestObject('Add Invoice/Page_Tridhya - PIS/input_Amount_additional_cost'), AddlAmt)

WebUI.setText(findTestObject('Add Invoice/Page_Tridhya - PIS/textarea_Additional Charges Description_additional_cost_reason'), 
    AddlDesc)

WebUI.click(findTestObject('Add Invoice/Page_Tridhya - PIS/input_INR_projectCrmilestoneIds'))

WebUI.setText(findTestObject('Add Invoice/Page_Tridhya - PIS/textarea_milestone1'), Mile1Desc)

WebUI.click(findTestObject('Add Invoice/Page_Tridhya - PIS/input_milestone1_projectCrmilestoneIds'))

WebUI.setText(findTestObject('Add Invoice/Page_Tridhya - PIS/textarea_milestone2'), Mile2Desc)

WebUI.click(findTestObject('Add Invoice/Page_Tridhya - PIS/input_milestone2_projectCrmilestoneIds'))

WebUI.setText(findTestObject('Add Invoice/Page_Tridhya - PIS/textarea_milestone3'), Mile3Desc)

