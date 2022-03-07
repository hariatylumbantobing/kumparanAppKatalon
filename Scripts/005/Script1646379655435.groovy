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
import io.appium.java_client.touch.offset.PointOption
import com.detroitlabs.katalonmobileutil.touch.Swipe
import com.detroitlabs.katalonmobileutil.touch.Swipe.SwipeDirection


Mobile.callTestCase(findTestCase('004'), [:], FailureHandling.STOP_ON_FAILURE)
Mobile.delay(2)

Mobile.verifyElementExist(findTestObject('SWIPING PART/android.widget.ImageView-pic4'), 3)
Mobile.verifyElementExist(findTestObject('SWIPING PART/android.widget.TextView - text pic4'), 3)
Mobile.verifyElementExist(findTestObject('SWIPING PART/android.view.ViewGroup - button Buat Akun'), 3)
Mobile.verifyElementExist(findTestObject('SWIPING PART/android.view.ViewGroup - button Sudah Punya Akun'), 3)
Swipe.swipe(SwipeDirection.LEFT_TO_RIGHT)
Mobile.waitForElementPresent(findTestObject('SWIPING PART/android.widget.ImageView-pic3'), 3)
Mobile.verifyElementExist(findTestObject('SWIPING PART/android.widget.TextView - text pic3'), 3)
Mobile.verifyElementExist(findTestObject('SWIPING PART/android.widget.TextView - text2 pic3'), 3)
Mobile.waitForElementPresent(findTestObject('SWIPING PART/android.view.ViewGroup - tombol selanjutnya'), 3)
Swipe.swipe(SwipeDirection.LEFT_TO_RIGHT)
Mobile.waitForElementPresent(findTestObject('SWIPING PART/android.widget.ImageView-pic2'), 3)
Mobile.verifyElementExist(findTestObject('SWIPING PART/android.widget.TextView - text pic2'), 3)
Mobile.verifyElementExist(findTestObject('SWIPING PART/android.widget.TextView - text2 pic2'), 3)
Mobile.waitForElementPresent(findTestObject('SWIPING PART/android.view.ViewGroup - tombol selanjutnya'), 3)
Swipe.swipe(SwipeDirection.LEFT_TO_RIGHT)
Mobile.verifyElementExist(findTestObject('SWIPING PART/android.widget.ImageView-pic1'), 3)
Mobile.verifyElementExist(findTestObject('SWIPING PART/android.widget.TextView - text pic1'), 3)
Mobile.verifyElementExist(findTestObject('SWIPING PART/android.widget.TextView - text2 pic1'), 3)
Mobile.verifyElementExist(findTestObject('SWIPING PART/android.view.ViewGroup - tombol selanjutnya'), 3)
Mobile.closeApplication()
