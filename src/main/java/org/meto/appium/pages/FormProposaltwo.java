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

public class FormProposaltwo extends AndroidActions{

	AndroidDriver driver;
	private String dsegmento;
	
	public FormProposaltwo(AndroidDriver driver) {
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
	
	//Contingencia
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"App Surgir en contingencia\"]")
	private WebElement enconting;
	
	public void Proposalup() {
		scrollProposalToPageup();//subiendo al inicio del page Propuesta

	}
	
	public FormProposaltwo debtBtn() throws InterruptedException {
		deudab.click();
		Thread.sleep(4000);
		return this;
		
	}
	
	public FormProposaltwo producto() throws InterruptedException {
		mdesp.click();
		product();
		Thread.sleep(15000);
		return this;
		
	}
	
	public FormProposaltwo savePropos() throws InterruptedException {
		saveprop.click();
		Thread.sleep(1000);
		return this;
		
	}
	
	public void swipeScreenOneProposaltwo() {
	//	swipeScreen();
		try {
			if(enconting.isDisplayed()){
				  System.out.println("Existe elemento");
				  swipeScreen2();
				}else{//0, elemento no esta presente.
				  swipeScreen();
				  System.out.println("Elemento no existe");
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
	}
	
	public FormContracttwo saveProposal() throws InterruptedException  {
		nextprop.click();
		Thread.sleep(1000);
		return new FormContracttwo(driver);
		
	}
	
}
