import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import javax.swing.TimerQueue.DelayedTimer as DelayedTimer
import org.junit.After as After
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.sun.media.sound.SoftReverb.Delay as Delay
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.TouchAction as TouchAction
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode
import org.openqa.selenium.Keys as Keys
import io.appium.java_client.touch.offset.PointOption as PointOption
import com.detroitlabs.katalonmobileutil.touch.Swipe as Swipe
import com.detroitlabs.katalonmobileutil.touch.Swipe.SwipeDirection as SwipeDirection
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

Mobile.callTestCase(findTestCase('3. Choose 3 kanal or more'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.tapAndHold(findTestObject('STARTER MENU/android.widget.TextView - text Selanjutnya'), 3, 3)

Mobile.delay(2)

Mobile.verifyElementExist(findTestObject('SWIPING PART/android.view.ViewGroup - back button'), 3)

Mobile.verifyElementExist(findTestObject('SWIPING PART/android.widget.ImageView - logo kumparan'), 3)

Mobile.verifyElementExist(findTestObject('SWIPING PART/android.view.ViewGroup - lewati button'), 3)

Mobile.waitForElementPresent(findTestObject('SWIPING PART/android.view.ViewGroup - pic 1'), 3)

Mobile.delay(2)

Mobile.verifyElementExist(findTestObject('SWIPING PART/android.view.ViewGroup - tombol selanjutnya'), 3)

//int startX = 370
//int startY = 692
//int endX = 370
//int endY = 650
//Mobile.tapAndHold(findTestObject('SWIPING PART/android.view.ViewGroup - pic 1'), 3, 3)
//Mobile.delay(2)
//Mobile.swipe(startX, startY, endX, endY)
Swipe.swipe(SwipeDirection.RIGHT_TO_LEFT)

Mobile.waitForElementPresent(findTestObject('SWIPING PART/android.view.ViewGroup - pic 2'), 3)

Mobile.waitForElementPresent(findTestObject('SWIPING PART/android.view.ViewGroup - tombol selanjutnya'), 3)

Swipe.swipe(SwipeDirection.RIGHT_TO_LEFT)

Mobile.waitForElementPresent(findTestObject('SWIPING PART/android.widget.ImageView - pic 3'), 3)

Mobile.waitForElementPresent(findTestObject('SWIPING PART/android.view.ViewGroup - tombol selanjutnya'), 3)

Swipe.swipe(SwipeDirection.RIGHT_TO_LEFT)

Mobile.waitForElementPresent(findTestObject('SWIPING PART/android.widget.ImageView - pic 4'), 3)

Mobile.waitForElementPresent(findTestObject('SWIPING PART/android.view.ViewGroup - tombol buat akun'), 3)

Mobile.waitForElementPresent(findTestObject('SWIPING PART/android.view.ViewGroup - tombol sudah punya akun'), 3)

Mobile.tapAndHold(findTestObject('SWIPING PART/android.view.ViewGroup - tombol buat akun'), 3, 3)

Mobile.verifyElementExist(findTestObject('REGISTER/android.widget.TextView - Register'), 3)

Mobile.verifyElementExist(findTestObject('REGISTER/android.widget.TextView - tulisan sebelum email'), 
    3)

Mobile.tap(findTestObject('REGISTER/android.widget.EditText - Email'), 3)
Mobile.setText(findTestObject('REGISTER/android.widget.EditText - Email'), 'wecehyla@musiccode.me', 3)
Mobile.tap(findTestObject('REGISTER/android.view.ViewGroup - tombol register'), 0)
Mobile.delay(2)
Mobile.verifyElementExist(findTestObject('REGISTER/android.widget.TextView - alert format email invalid'), 3)

//get alert_text
alert_text = Mobile.getAttribute(findTestObject('REGISTER/android.widget.TextView - alert format email invalid'), 'text', 5)
Mobile.verifyEqual(alert_text,'Harus diisi dengan format email')

