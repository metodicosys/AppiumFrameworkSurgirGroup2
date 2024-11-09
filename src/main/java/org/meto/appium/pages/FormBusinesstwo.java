package org.meto.appium.pages;

import java.time.Duration;
import org.meto.appium.utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.DefaultElementByBuilder;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;

public class FormBusinesstwo extends AndroidActions{
	AndroidDriver driver;
	
	public FormBusinesstwo(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

	}

	@AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Cliente\"]")
	private WebElement businessp;
	
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Selfie en el negocio']")).click();
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Selfie en el negocio']")
	private WebElement fotonegocio;
	
	//@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessSave")
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.Button[1]")
	private WebElement savenegociotwo;
	
	//@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessNext")
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.Button[2]")
	private WebElement nextnegociotwo;
	
	//Botón Listo de galeria
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/button_gallery_listo")
	private WebElement nListo;
	
	public FormBusinesstwo BussinesP() {
		businessp.click();
		return this;

	}
	
	public FormBusinesstwo photoSelfie() {
	//	Thread.sleep(5000);
		fotonegocio.click();
		fotonegocio.click();
		fotoSelfie();
		nListo.click();
		return this;
		
	}
	
	public void Businessup() {
		scrollBusinessToPageup();//subiendo al inicio del page negocio

	}
	
	public FormBusinesstwo saveBusiness() {
		savenegociotwo.click();
		return this;
		
	}
	
	public FormRsetwo nextBusiness() throws InterruptedException  {
		nextnegociotwo.click();
		return new FormRsetwo(driver);
		
	}
}
