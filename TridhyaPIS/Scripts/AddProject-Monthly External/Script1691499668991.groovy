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

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/i_View Employee_fa fa-laptop'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_Add Project'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_Select Client'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input__select2-search__field'), Client)

WebUI.sendKeys(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tridhya - PIS/select_Select CompanyShaligram InfotechTrid_049256'), 
    AssignTo, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tridhya - PIS/select_Select Project ManagerDeep PatelKara_473e5d'), 
    ProjectManager, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tridhya - PIS/select_Select Team LeaderAadish ShahAkshay _dad43c'), 
    TeamLeader, true)

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/div__col-md-12 col-lg-8'))

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__project_name'), ProjectName)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/textarea_Description_description'), ProjectDesc)

//WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/input__project_start_date'))

//WebUI.click(findTestObject('Add Project/Page_Tridhya - PIS/th_'))

//WebUI.click(findTestObject('Add Project/Page_Tridhya - PIS/th_'))

//WebUI.click(findTestObject('Add Project/Page_Tridhya - PIS/th_'))

//WebUI.click(findTestObject('Add Project/Page_Tridhya - PIS/th_'))

//WebUI.click(findTestObject('Add Project/Page_Tridhya - PIS/td_1'))

//WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/input_EndDate_project_end_date'))

//WebUI.click(findTestObject('Add Project/Page_Tridhya - PIS/th_'))

//WebUI.click(findTestObject('Add Project/Page_Tridhya - PIS/th_'))

//WebUI.click(findTestObject('Add Project/Page_Tridhya - PIS/th_'))

//WebUI.click(findTestObject('Add Project/Page_Tridhya - PIS/th_'))

//WebUI.click(findTestObject('Add Project/Page_Tridhya - PIS/th_'))

//WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/td_31'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tridhya - PIS/select_Select Project TypeFixed CostHourlyMonthly'), 
    ProjectType, true)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__hourly_rate'), HourlyRate)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__estimated_hours'), EstimatedHours)

WebUI.setText(findTestObject('Add Project/Page_Tridhya - PIS/input__payment_term_day'), PayTerm)

WebUI.selectOptionByValue(findTestObject('Add Project/Page_Tridhya - PIS/select_Select Payment CycleWeeklyBy WeeklyMonthly'), 
    PaymentCycle, true)

WebUI.setText(findTestObject('Add Project/Page_Tridhya - PIS/input_InvoiceDate_project_invoice_date'), InvoiceDate)

//--WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_Select Currency'))
//--WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input_concat(id(, , select2-client_id-conta_8e4fc7'),   'in')
WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_Select Currency'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input__select2-search__field'), curr)

WebUI.sendKeys(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.uploadFile(findTestObject('Add Project/Page_Tridhya - PIS/input_( Upload multiple files with Ctrlclick )_project_attachment'), 
    SOWDoc)

WebUI.delay(5)

WebUI.click(findTestObject('Add Project/Page_Tridhya - PIS/input_InvoiceDate_btn btn-success'))
WebUI.delay(5)

