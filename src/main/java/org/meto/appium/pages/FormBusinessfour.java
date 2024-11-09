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

public class FormBusinessfour extends AndroidActions{
	AndroidDriver driver;
	
	public FormBusinessfour(AndroidDriver driver) {
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
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessSave")
	private WebElement savenegocio;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessNext")
	private WebElement nextnegociof;
	
	//Botón Listo de galeria
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/button_gallery_listo")
	private WebElement nListo;
	
	public FormBusinessfour BussinesP() {
		businessp.click();
		return this;

	}
	
	public FormBusinessfour photoSelfie() {
	//	Thread.sleep(5000);
		fotonegocio.click();
		fotonegocio.click();
		fotoSelfie();
		nListo.click();
		return this;
		
	}
	
	public FormBusinessfour saveBusiness() {
		savenegocio.click();
		return this;
		
	}
	
	public FormRsefour nextBusinessfour() throws InterruptedException  {
		nextnegociof.click();
		return new FormRsefour(driver);
		
	}
}
