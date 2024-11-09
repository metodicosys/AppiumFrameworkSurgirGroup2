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

public class FormRse extends AndroidActions{
	
	AndroidDriver driver;
	
	public FormRse(AndroidDriver driver) {
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
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Margen bruto']")
	private WebElement margb;
	
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement ingresom;
	
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement gopeone;
	
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement gopetwo;
	
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")                   
	private WebElement gopethree;
		
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Sí']")
	private WebElement btnotring;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/etInputGeneral")
	private WebElement otring;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Origen de otros ingresos']")
	private WebElement origingreso;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Constancia de otros ingresos']")
	private WebElement fotoconsing;
	
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement gopefour;

	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement gopefive;
	
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[6]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement gopesix;
	
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[7]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement gopeseven;
	
//	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Alimentación']")
	private WebElement activeeight;
	
//	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Salud']")
	private WebElement activenine;
	
	//@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Alquiler vivienda']")
	private WebElement activethen;
	
	//@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Servicios públicos vivienda']")
	private WebElement activeeleven;
	
	//@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText")
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Educación']")
	private WebElement activetwelv;
	
//	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[6]/android.widget.FrameLayout/android.widget.EditText")
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Transporte']")
	private WebElement activethirteen;
	
	//@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[7]/android.widget.FrameLayout/android.widget.EditText")
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Deudas (Obligaciones financieras)']")
	private WebElement activefourteen;
	
	//@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[8]/android.widget.FrameLayout/android.widget.EditText")
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Entretenimiento']")
	private WebElement activefifteen;
	
	//@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout[7]/android.widget.FrameLayout/android.widget.EditText")
	@AndroidFindBy(xpath="//android.widget.EditText[@hint='Otros gastos']")
	private WebElement activesixteen;
	
	//Botón Listo de galeria
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/button_gallery_listo")
	private WebElement nListo;
	
	//Contingencia
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"App Surgir en contingencia\"]")
	private WebElement enconting;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessSave")
	private WebElement btnrse;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessNext")
	private WebElement btnextrse;
	
	public FormRse autoComplit() {
		autoc.click();
		return this;
		
	}
	
	public FormRse giro(String girotext) {
		autoctext.sendKeys(girotext);
		autocompGiro();
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ESCAPE));
		return this;
		
	}
	
	public FormRse ingmensual(String imensua) {
		ingresom.sendKeys(imensua);
		return this;
		
	}
	
	public FormRse gastoOp1(String active1) {
		gopeone.sendKeys(active1);
		return this;
		
	}
	
	public FormRse gastoOp2(String active2) {
		gopetwo.sendKeys(active2);
		return this;
		
	}
	
	public FormRse gastoOp3(String active3) {
		gopethree.sendKeys(active3);
		return this;
		
	}
	
	public FormRse gastoOp4(String active4) {
		gopefour.sendKeys(active4);
		return this;
		
	}
	
	public FormRse gastoOp5(String active5) {
		gopefive.sendKeys(active5);
		return this;
		
	}
	
	public FormRse gastoOp6(String active6) {
		gopesix.sendKeys(active6);
		return this;
		
	}
	
	public FormRse gastoOp7(String active7) {
		gopeseven.sendKeys(active7);
		return this;
		
	}
	
	//////////
	public FormRse gastoFam8(String active8) {
		activeeight.sendKeys(active8);
		return this;
		
	}
	
	public FormRse gastoFam9(String active9) {
		activenine.sendKeys(active9);
		return this;
		
	}
	
	public FormRse gastoFam10(String active10) {
		activethen.sendKeys(active10);
		return this;
	}
	
	public FormRse gastoFam11(String active11) {
		activeeleven.sendKeys(active11);
		return this;
		
	}
	
	public FormRse gastoFam12(String active12) {
		activetwelv.sendKeys(active12);
		return this;
		
	}
	
	public FormRse gastoFam13(String active13) {
		activethirteen.sendKeys(active13);
		return this;
		
	}
	
	public FormRse gastoFam14(String active14) {
		activefourteen.sendKeys(active14);
		return this;
		
	}
	
	public FormRse gastoFam15(String active15) {
		activefifteen.sendKeys(active15);
		return this;
		
	}
	
	public FormRse gastoFam16(String active16) {
		activesixteen.sendKeys(active16);
		return this;
		
	}
	
	public FormRse btnotroingreso() {
		btnotring.click();
		return this;
		
	}
	
	public FormRse otroIngreso(String otroi) {
		otring.sendKeys(otroi);
		return this;
		
	}
	
	public FormRse fotoConstIngreso() {
		fotoconsing.click();
		fotoconsing.click();
		fotoConsOtroIng();
		nListo.click();
		return this;
		
	}
	
	public FormRse origenOtroIngreso() {
		origingreso.click();
		origendeOtroIng();
		return this;
		
	}
	
	public FormRse swipeScreenOneRse() {
	//	swipeScreen();

		if(enconting.isDisplayed()){
			  System.out.println("Existe elemento");
			  swipeScreen2();
			}else{//0, elemento no esta presente.
				swipeScreen();
			   System.out.println("Elemento no existe");
			}
		
		/*
		if(enconting.isDisplayed()){
			  System.out.println("Existe elemento");
			  swipeScreen2();
			}else{//0, elemento no esta presente.
				swipeScreen();
			   System.out.println("Elemento no existe");
			}*/
		

			return this;
			
	}
	
	public FormRse margenb() {
		margb.click();
		mbruto();
		return this;
		
	}
	
	public FormRse saveRse() {
		btnrse.click();
		return this;
		
	}
	
	public FormProposal btnNextRse() throws InterruptedException  {
		btnextrse.click();
		return new FormProposal(driver);
		
	}

}
