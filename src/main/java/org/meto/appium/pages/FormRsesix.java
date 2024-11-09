package org.meto.appium.pages;

import java.time.Duration;

import org.meto.appium.utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.DefaultElementByBuilder;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;

public class FormRsesix extends AndroidActions{
	
	AndroidDriver driver;
	
	public FormRsesix(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

	}
	
	//@AndroidFindBy(id="pe.com.surgir.surgirapp:id/autoCompleteTextView")
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Giro de negocio']")
	private WebElement autoc;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/autoCompleteTextView")
	private WebElement autoctext;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activeone;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessSave")
	private WebElement btnrse;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessNext")
	private WebElement btnextrse;
	
	public FormRsesix autoComplit() {
		autoc.click();
		return this;
		
	}
	
	public FormRsesix giro(String girotext) {
		autoctext.sendKeys(girotext);
		autocompGiro();
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ESCAPE));
		return this;
		
	}
	
	public FormRsesix activeC1(String active1) {
		activeone.sendKeys(active1);
		return this;
		
	}
	
	public FormRsesix saveRse() {
		btnrse.click();
		return this;
		
	}
	
	public FormProposalsix btnNextRsef() throws InterruptedException  {
		btnextrse.click();
		return new FormProposalsix(driver);
		
	}

}
