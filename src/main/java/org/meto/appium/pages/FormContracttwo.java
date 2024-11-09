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

public class FormContracttwo extends AndroidActions{

	AndroidDriver driver;
	
	public FormContracttwo(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

	}
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Tipo de desembolso']")
	private WebElement fpago;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Entidad bancaria']")
	private WebElement entFinan;
	
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.AutoCompleteTextView")
	private WebElement listCustom;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.AutoCompleteTextView")
	private WebElement listCustom2;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/etInputGeneral")
	private WebElement coment;
	
	//@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.Button[1]")
	//private WebElement btnsaveContract;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessSave")
	private WebElement savecontr;
		
	public FormContracttwo formaPago() throws InterruptedException {
		fpago.click();
		Thread.sleep(1000);
		formadePago();
		return this;

	}
	
	public void Contractup() {
	//	scrollToPageupContact();//subiendo al inicio del page Contrato
	
		scrollToPageupContactSW();
		scrollToPageupContactSW();
		scrollToPageupContactSW2();
		scrollToPageupContactSW2();
		scrollToPageupContactSW2();
		scrollToPageupContactSW2();
		scrollToPageupContactSW();
	
	}
	
	public FormContracttwo financialEntity() {
		entFinan.click();
		entidadFinanciera();
		return this;
		
	}
	
	public FormContracttwo nextOneContract() {
		scrollToPageContract();
		return this;
		
	}
	
	public void upcontact() {
		scrollToPageupContact();
		
	}
	
	// selecciona tercer cliente de la lista
	public void customerListn() throws InterruptedException {
		Thread.sleep(4000);
		listCustom2.click(); //click en la lista
		listaCliente3(); //aki debe selccionar una de la lista segun la condición
		
	}
		
	
	// Pasa a tab cliente
	public FormContracttwo customerPage2() throws InterruptedException {
		Thread.sleep(3000);
		return this;
		
	}
		
	public FormContracttwo comment(String mesages) {
		coment.sendKeys(mesages);
		return this;
		
	}
	
	public FormContracttwo saveContract() {
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
	
	public FormCustomerthree bsaveContract() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Retornando de Contrato a Cliente 3");

		//subiendocliente();// ok 15122023
		
	//	metod2();
		return new FormCustomerthree(driver);
		
	}
	
	
}
