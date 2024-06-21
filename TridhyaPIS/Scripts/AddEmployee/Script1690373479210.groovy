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

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/i_View Vendors_mdi mdi-account-multiple'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_Add Employee'))

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__first_name'), FirstName)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__last_name'), LastName)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__email'), Companyemail)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input_Personal Email_personal_email'), Personalemail)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__password'), pass)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__confirm_password'), confirmpass)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input__phone'), contactno)

//WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input_Date Of Birth_dob'), DOB)
WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/input_Date Of Birth_dob'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/th_July 2023'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/th_2023'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/th_'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/th_'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/th_'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_1992'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_Aug'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/td_18'))

//WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/b'))
WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/b'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input__select2-search__field'), Designation)

WebUI.sendKeys(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input__select2-search__field'), Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_Select Department'))
WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_Select Department'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input__select2-search__field'), Department)

WebUI.sendKeys(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input__select2-search__field'), Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_Select Reporting Person_select2-select_bd8836'))
//WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input_concat(id(, , select2-reporting_to-re_51d6ac'), 'nil')
WebUI.click(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/span_Select Reporting Person'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input__select2-search__field'), Reportingto)

WebUI.sendKeys(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tridhya - PIS/select_Select Employee StatusConfirmedProbation'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input_Bank Name_bank_name'), BankName)

//WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/input_Bank Account Number_bank_account_no'))
WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input_Bank Account Number_bank_account_no'), BankAccno)

WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input_PAN Number_pan_no'), PanNo)

//WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/input_PAN Number_pan_no'))
//WebUI.setText(findTestObject('Object Repository/Page_Tridhya - PIS/input_Joining Date_joining_date'), JoiningDate)
WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/input_Joining Date_joining_date'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/th_July 2023'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_Jun'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/th_June 2023'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/th_2023'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/th_'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/th_'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_2006'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/span_Jun'))

WebUI.click(findTestObject('Object Repository/Page_Tridhya - PIS/td_1'))

WebUI.click(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/span_Select Role'))

WebUI.setText(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input__select2-search__field'), Role)

WebUI.sendKeys(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tridhya - PIS/select_Select GratuityYesNo'), '1', true)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Tridhya - PIS/Page_Tridhya - PIS/input__btn btn-success'))

