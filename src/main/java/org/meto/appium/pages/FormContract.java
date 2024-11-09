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

public class FormContract extends AndroidActions{

	AndroidDriver driver;
	
	public FormContract(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

	}
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Tipo de desembolso']")
	private WebElement fpago;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Entidad bancaria']")
	private WebElement entFinan;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.AutoCompleteTextView")                      
	private WebElement listCustom;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Comprobante de cuenta']")
	private WebElement fotoCuen;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Número de cuenta']")
	private WebElement numcuen;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Código de cuenta interbancario']")
	private WebElement cinterb;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/chkLink")
	private WebElement check1;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/etInputGeneral")
	private WebElement coment;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/button_gallery_listo")
	private WebElement nListo;
	
	//@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.Button[1]")
	//private WebElement btnsaveContract;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessSave")
	private WebElement savecontr;
		
	public FormContract formaPago() throws InterruptedException {
		fpago.click();
		Thread.sleep(1000);
		formadePago();
		return this;

	}
	
	public FormContract financialEntity() {
		entFinan.click();
		entidadFinanciera();
		return this;
		
	}
	
	public FormContract fotoCuenta() {
		fotoCuen.click();
		fotoCuen.click();
		fotoCuentas();
		nListo.click();
		return this;
		
	}
	
	public FormContract accountNumber(String ncuen) {
		numcuen.sendKeys(ncuen);
		return this;
		
	}
	
	public FormContract cci(String cinterbank) {
		cinterb.sendKeys(cinterbank);
		return this;
		
	}

	public FormContract linkagePolice() {
		check1.click();
		return this;
		
	}
	
	public FormContract comment(String mesages) {
		coment.sendKeys(mesages);
		return this;
		
	}
		
	public FormContract nextOneContract() {
		scrollToPageContract();
		return this;
		
	}
	
	// selecciona segundo cliente de la lista
	public FormContract customerPage() throws InterruptedException {
		listCustom.click(); // click en la lista
		listaCliente();// aki debe mostrar cuantos clientes tiene la lista
	//	listCustomer();// aki debe selccionar una de la lista segun la condición

		return this;
		
	}
	
	
	public FormContract saveContract() {
		savecontr.click();
		return this;
		
	}
	
	/*
	public FormContract SaveContract() throws InterruptedException {
		Thread.sleep(6000);
		btnsaveContract.click();;
		return this;
		
	}*/
	
	//Retornando a Cliente
	
	public FormCustomertwo bsaveContract() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Retornando de Contrato a Cliente");

	//	subiendocliente();// ok 15122023
		
	//	metod2();
		return new FormCustomertwo(driver);
		
	}
	
	/*
	public FormCustomer bcontinuarValid() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Pasando de contrato 2 a Cliente");
		subiendocliente();
		return new FormCustomer(driver);
		
	}*/
	
	
}
