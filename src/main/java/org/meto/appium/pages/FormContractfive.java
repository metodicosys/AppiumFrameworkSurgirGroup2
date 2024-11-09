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

public class FormContractfive extends AndroidActions{

	AndroidDriver driver;
	
	public FormContractfive(AndroidDriver driver) {
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
	private WebElement listCustom5;
	
	//@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.Button[1]")
	//private WebElement btnsaveContract;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessSave")
	private WebElement savecontr;
		
	public FormContractfive formaPago() throws InterruptedException {
		fpago.click();
		Thread.sleep(1000);
		formadePago();
		return this;

	}
	
	public FormContractfive financialEntity() {
		entFinan.click();
		entidadFinanciera();
		return this;
		
	}
	
	public FormContractfive nextOneContract() {
		scrollToPageContract();
		return this;
		
	}
	
	public void upcontact() {
		scrollToPageupContact();
		
	}
	
	// selecciona tercer cliente de la lista
	public void customerListn() throws InterruptedException {
		Thread.sleep(4000);
		listCustom5.click(); //click en la lista
		listaCliente6(); //aki debe selccionar una de la lista segun la condición
		
	}
		
	
	// Pasa a tab cliente
	public FormContractfive customerPage2() throws InterruptedException {
		Thread.sleep(3000);
		return this;
		
	}
		
	
	public FormContractfive saveContract() {
		savecontr.click();
		return this;
		
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
