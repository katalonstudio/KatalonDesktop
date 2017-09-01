import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://demoaut.katalon.com/')

WebUI.click(findTestObject('Page_CURA Healthcare Service/h3_We Care About Your Health'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.click(findTestObject('Page_CURA Healthcare Service (1)/button_Login'))

WebUI.click(findTestObject('Page_CURA Healthcare Service (2)/th_'))

WebUI.click(findTestObject('Page_CURA Healthcare Service (2)/th_'))

WebUI.click(findTestObject('Page_CURA Healthcare Service (2)/td_26'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service (2)/textarea_comment'), 'book appointment')

WebUI.click(findTestObject('Page_CURA Healthcare Service (2)/button_Book Appointment'))

WebUI.click(findTestObject('Page_CURA Healthcare Service (3)/h2_Appointment Confirmation'))

WebUI.rightClick(findTestObject('Page_CURA Healthcare Service (3)/h2_Appointment Confirmation'))

WebUI.click(findTestObject('Page_CURA Healthcare Service (3)/h2_Appointment Confirmation'))

WebUI.click(findTestObject('Page_CURA Healthcare Service (3)/a_Go to Homepage'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_menu-toggle'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Logout'))

WebUI.closeBrowser()

