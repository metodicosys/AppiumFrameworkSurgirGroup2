package org.meto.appium.pages;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.meto.appium.base.TestBase;
import org.meto.appium.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.DefaultElementByBuilder;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.offset.PointOption;

//public class FormCustomer extends AndroidActions{
public class FormCustomertwo extends AndroidActions{

	AndroidDriver driver;
	
	public FormCustomertwo(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

	}
	
	//Boton continuar despues de las validaciones de buro, lista negre
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button")
	private WebElement btnContinuarValid;
	
	//Boton Guardar de Contrato
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.Button[1]")
	private WebElement btnsaveContract;
	
	//@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btn_go_to_setting") //tuerkita
	//WebElement generatorGroup;
	
//	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/setting_customer_add_button")
//	WebElement newmember;
	
	@AndroidFindBy(id="id=\"pe.com.surgir.surgirapp:id/item_setting_label_edit")
	WebElement editmember;
	
	//MobileElement el1c = (MobileElement) driver.findElementByAccessibilityId("Cliente");
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Cliente\"]")
	private WebElement customer;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Perfil de Experian']")
	private WebElement fotoExperian;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Foto del documento (Frente)']")
	private WebElement fotoFrenteDNI;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Foto del documento (Verso)']")
	private WebElement fotoVersoDNI;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Foto del cliente']")
	private WebElement fotoCliente;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement secondSurname;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessNext")
	private WebElement nextcust;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Grado de instruccion']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Grado de instruccion']")
	private WebElement gradoInstruccionN;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Profesión u ocupación']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Profesión u ocupación']")
	private WebElement profesionyOcuo;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessSave")
	private WebElement savecustom;
	
	//Botón Listo de galeria
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/button_gallery_listo")
	private WebElement nListo;
	
	/*
	public void generatorGroup() {
		generatorGroup.click();
	}*/
	
	/*
	public void newMember() {
		newmember.click();
		
	}*/
	
	public void editMember() {
		editmember.click();
		editmember.click();
		
	}
	
	public void Customerup() {
		customer.click();
		scrollToPageup();//subiendo al inicio del page cliente

	}
	
	public FormBusinesstwo nextCustomertwo() throws InterruptedException  {
		nextcust.click();
		return new FormBusinesstwo(driver);
		
	}
			
	public void fotoExperian() {
		fotoExperian.click();
		fotoExperian.click();
		experiann();
		nListo.click();
		
	}
	
	public void fotofrenteDni() {
		fotoFrenteDNI.click();
		fotoFrenteDNI.click();
		fotofrenteDnin();
		nListo.click();
		
	}
	
	public void fotoreversoDni() {
		fotoVersoDNI.click();
		fotoVersoDNI.click();
		fotoreversoDnin();
		nListo.click();
		
	}
	
	public void fotoCliente() {
		fotoCliente.click();
		fotoCliente.click();
		fotoClienten();
		nListo.click();
		
	}
	
	public FormCustomertwo saveCustomer() {
		savecustom.click();
		return this;
		
	}
	
	/*
	public void secondSureNamen() {
		secondSurname.clear();
	}*/
	
	public void swipeScreenOneCustomer() {
		swipeScreen();
		
	}
	
	public void gradoInstruccion() {
		gradoInstruccionN.click();
		gradoInstruction();
	
		
	}
	
	public void profesionN() {
		profesionyOcuo.click();
		profesion();
		
	}
	
	public void nextone() {
		scrollToPageCustomer1();
		
	}
	
	//bcontinuarValid es boton de ventanitade datos
	public FormCustomertwo bcontinuarValid() {
		btnContinuarValid.click();
	//	btnContinuarValid.click();
		
		return new FormCustomertwo(driver);
		
	}
	
	//Boton de contrato Guardar
	public FormCustomertwo bsaveContract() {
		btnsaveContract.click();
	//	subiendocliente();
	
	//	btnContinuarValid.click();
		return new FormCustomertwo(driver);
		
	}
	
}
