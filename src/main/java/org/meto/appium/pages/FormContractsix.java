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

public class FormContractsix extends AndroidActions{

	AndroidDriver driver;
	
	public FormContractsix(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

	}
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Tipo de desembolso']")
	private WebElement fpago;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Comprobante de cuenta']")
	private WebElement fotoCuen;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Entidad bancaria']")
	private WebElement entFinan;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Número de cuenta']")
	private WebElement numcuen;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Código de cuenta interbancario']")
	private WebElement cinterb;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/chkLink")
	private WebElement check1;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/etInputGeneral")
	private WebElement coment;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessNext")
	private WebElement nextcontr;
	
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.AutoCompleteTextView")
	private WebElement listCustom;
	
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.AutoCompleteTextView")
	private WebElement listCustom2;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/button_gallery_listo")
	private WebElement nListo;
	
	//@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.Button[1]")
	//private WebElement btnsaveContract;
	
	//@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessSave")
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.Button[1]")	
	private WebElement savecontr;
		
	public FormContractsix formaPago() throws InterruptedException {
		fpago.click();
		Thread.sleep(1000);
		formadePagoRet();
		return this;

	}
	
	public FormContractsix financialEntity() {
		entFinan.click();
		entidadFinanciera();
		return this;
		
	}
	
	public FormContractsix nextOneContract() {
		scrollToPageContract();
		return this;
		
	}
	
	public void upcontact() {
		scrollToPageupContact();
		
	}
	
	public FormContractsix fotoCuenta() {
		fotoCuen.click();
		fotoCuen.click();
		fotoCuentas();
		nListo.click();
		return this;
		
	}
	
	public FormContractsix accountNumber(String ncuen) {
		numcuen.sendKeys(ncuen);
		return this;
		
	}
		
	public FormContractsix cci(String cinterbank) {
		cinterb.sendKeys(cinterbank);
		return this;
		
	}

	public FormContractsix linkagePolice() {
		check1.click();
		return this;
		
	}
	
	public FormContractsix comment(String mesages) {
		coment.sendKeys(mesages);
		return this;
		
	}
	
	// selecciona tercer cliente de la lista
	public void customerListn() throws InterruptedException {
		Thread.sleep(4000);
		listCustom2.click(); //click en la lista
		listaCliente6(); //aki debe selccionar una de la lista segun la condición
		
	}
		
	
	// Pasa a tab cliente
	public FormContractsix customerPage2() throws InterruptedException {
		Thread.sleep(3000);
		return this;
		
	}
		
	
	public FormContractsix saveContract() {
		savecontr.click();
		return this;
		
	}
	
	public FormSignature nextContract() {
		nextcontr.click();
		//Thread.sleep(1000);
		return new FormSignature(driver);
		
	}
	
	/*
	public FormContract SaveContract() throws InterruptedException {
		Thread.sleep(6000);
		btnsaveContract.click();;
		return this;
		
	}*/
	
	//Retornando a Cliente 4
	public FormCustomersix bsaveContract() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Retornando de Contrato a Cliente 4");
		return new FormCustomersix(driver);
		
	}
	
	
}
