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

public class FormProposalfour extends AndroidActions{

	AndroidDriver driver;
	private String dsegmento;
	
	public FormProposalfour(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

		
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Calcular deuda']")
	private WebElement deudab;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Producto']")
	private WebElement mdesp;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessSave")
	private WebElement saveprop;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessNext")
	private WebElement nextprop;
	
	
	public FormProposalfour debtBtn() throws InterruptedException {
		deudab.click();
		Thread.sleep(4000);
		return this;
		
	}
	
	public FormProposalfour producto() throws InterruptedException {
		mdesp.click();
		product();
		Thread.sleep(15000);
		return this;
		
	}
	
	public FormProposalfour savePropos() throws InterruptedException {
		saveprop.click();
		Thread.sleep(1000);
		return this;
		
	}
	
	public FormContractfour saveProposal() throws InterruptedException  {
		nextprop.click();
		Thread.sleep(1000);
		return new FormContractfour(driver);
		
	}
	
}
