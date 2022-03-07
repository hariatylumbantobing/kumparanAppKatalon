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

Mobile.startApplication('/home/delameta14/Downloads/kumparan Aplikasi Berita Indonesia_v5.433.0_apkpure.com.apk', true)

Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Object Repository/STARTER MENU/android.view.ViewGroup - logo kumparan'), 3)

Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.TextView - Pilih Kanal'), 3)

Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.TextView - Bantu kami mengenal preferensi anda lebih jauh'), 
    3)


Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.TextView - News'), 3)

Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.Switch - NEWS OFF'), 3)


Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.TextView - Entertainment'), 3)

Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.Switch - ENTERTAINMENT OFF'), 3)


Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.TextView - Mom'), 3)

Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.Switch - MOM OFF'), 3)


Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.TextView - Food  Travel'), 3)

Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.Switch - Food Travel OFF'), 3)


Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.TextView - Tekno  Sains'), 3)

Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.Switch - TEKNO SAINS OFF'), 3)


Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.TextView - Otomotif'), 3)

Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.Switch - OTOMOTIF OFF'), 3)


Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.TextView - Woman'), 3)

Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.Switch - WOMAN OFF'), 3)


Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.TextView - Bola  Sports'), 3)

Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.Switch - BOLA SPORTS OFF'), 3)


Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.TextView - Bisnis'), 3)

Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.Switch - BISNIS OFF'), 3)


Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.TextView - Buzz'), 3)

Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.Switch - BUZZ OFF'), 3)

Mobile.scrollToText('Anda dapat mengatur ulang pilihan di halaman pengaturan notifikasi')

Mobile.verifyElementExist(findTestObject('STARTER MENU/android.widget.TextView - Anda dapat mengatur ulang pilihan di halaman pengaturan notifikasi'), 
    3)

//karena di mobile tidak ada verifikasi untuk melihat apakah sebuah elemen itu tidak clickable,
//kita ubah caranya dengan getattribute terlebih dulu, lalu verifikasi value dari elemen tersebut.
//di contoh kali ini kita get attribute nya, yaitu attribute "checked", dan kita harus verifikasi,
//bahwa atribut tsb memiliki nilai "false"

Mobile.verifyElementExist(findTestObject('STARTER MENU/android.view.ViewGroup-pilih min 3 kanal button'), 10)

Mobile.closeApplication()

