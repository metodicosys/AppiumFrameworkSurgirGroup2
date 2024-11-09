package org.meto.appium.pages;

import static java.time.Duration.ofMillis;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;
import static org.testng.Assert.assertNotNull;

import java.awt.Dimension;
import java.time.Duration;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.meto.appium.base.TestBase;
import org.meto.appium.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
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
public class FormCustomer extends AndroidActions{

	AndroidDriver driver;
	
	public FormCustomer(AndroidDriver driver) {
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
	
	//Contingencia
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"App Surgir en contingencia\"]")
	private WebElement enconting;
	
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
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='SOLTERO']")
	private WebElement ecivil;
	
	//Iletrado
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/chkLink")
	private WebElement chkiletrado;
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Pre-pago']")
	private WebElement prepago;
		
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Documento del testigo']")
	private WebElement fototestig;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Operador telefónico']")
	private WebElement optelefono;
	
	//@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessNext")
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.Button[2]")
	//@AndroidFindBy(xpath="//android.widget.TextView[@text='Negocio']")
	private WebElement nextcustn;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Grado de instruccion']")).click();
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Grado de instruccion']")
	private WebElement gradoInstruccionN;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Profesión u ocupación']")).click();
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Profesión u ocupación']")
	private WebElement profesionyOcuo;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Tipo de comprobante de domicilio']")
	private WebElement comprobanted;
	
	//foto comprobante de domicilio
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Comprobante domicilio']")
	private WebElement fotocompdomicilio;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Departamento']")
	private WebElement departamen;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Provincia']")
	private WebElement provinc;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Distrito']")
	private WebElement distrits;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Barrio/Urbanización']")
	private WebElement urbaniza;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Nombre de la dirección']")
	private WebElement direcc;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Tipo de vía']")
	private WebElement tipovias;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='N° exterior de la dirección']")
	private WebElement nexterior;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='N° interior de la dirección']")
	private WebElement interior;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Permanencia en años']")
	private WebElement permanios;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Referencia de ubicación']")
	private WebElement referenu;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='N° personas en domicilio']")
	private WebElement numeropersona;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='¿La casa que habita es?']")
	private WebElement habita;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Otro tipo de domicilio']")
	private WebElement otrotipo;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Tipo de patrimonio']")
	private WebElement tpatrim;
		
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Constancia de patrimonio']")
	private WebElement fotoPatrimoni;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Valor Patrimonial']")
	private WebElement valorPatrimon;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Tipo de referencia']")
	private WebElement tiporef;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Nombres']")
	private WebElement nameref;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Apellidos']")
	private WebElement apellref;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Celular']")
	private WebElement cellref;
	
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
	
	public void Customer() {
		customer.click();

	}
	
	/*
	public void Contingen() {
		String toastMessage = enconting.getAttribute("name");
		System.out.println("Contingggencia: "+ toastMessage);
		
	}*/
	
	public FormBusiness nextCustomer1() throws InterruptedException  {
		nextcustn.click();
		return new FormBusiness(driver);
		
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
	/*	TouchAction touch6 = new TouchAction<>(driver);
		touch6.press(PointOption.point(638,252));
		touch6.release();
		touch6.perform();*/
		nListo.click();
		
	}
	
	public void fotoCliente() {
		fotoCliente.click();
		fotoCliente.click();
		fotoClienten();
	/*	List<WebElement> lists7 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery"));
		TouchAction touch7 = new TouchAction<>(driver);
		touch7.press(PointOption.point(341,255));
		touch7.release();
		touch7.perform();*/
		nListo.click();
		
	}
	
	//Estado civil
	public FormCustomer estadoCivil (String ec) {
		//	ecivil.click();
			if (ec==("CASADO")) {
				ecivil.click();
				saveCustomer();
				System.out.println("-----Casado");
				
			}
		
		else {
				System.out.println("-----No Casado");
			
			}
			
			return this;
			
		}
		
	//Iletrado
	public FormCustomer iletrado(boolean ilet) {
			//	chkiletrado.click();
			if (ilet==(true)) {
					chkiletrado.click();
					System.out.println(ilet);
					System.out.println("-----Tiene iletrado");
					fotoTestigo();
					
				}				
			else {
					System.out.println("-----No es iletrado");
					
				}			
				return this;
				
	}
	
	public FormCustomer fotoTestigo () {
		fototestig.click();
		fototestig.click();
		fotoIletrados();
		nListo.click();
		return this;
		
	}
	
	public FormCustomer prePago() {
		prepago.click();
		return this;
		
	}
	
	public FormCustomer operadorTelef() {
		optelefono.click();
		operadordeTelef();
		return this;
		
	}
	
	public FormCustomer tipodeComprobante() {
		comprobanted.click();
		tipoComprobante();
		return this;
		
	}
	
	public FormCustomer fotoComprobanteDomicilio() {
		fotocompdomicilio.click();
		fotocompdomicilio.click();
		fotoCdomicilio();
		nListo.click();
		return this;
		
	}
	
	public FormCustomer departamentos() {
		departamen.click();
		departament();
		return this;
		
	}
	
	public FormCustomer provincias() {
		provinc.click();
		provincia();
		return this;
		
	}
	
	public FormCustomer distritos() {
		distrits.click();
		distrito();
		return this;
		
	}
	
	public FormCustomer urbanizacion(String urban) {
		urbaniza.clear();
		urbaniza.sendKeys(urban);
		return this;
		
	}
	
	public FormCustomer nomDireccion(String namedireccion) {
		direcc.sendKeys(namedireccion);
		return this;
	}
	
	public FormCustomer tipoVia() {
		tipovias.click();
		tipoviac();
		return this;
		
	}
	
	public FormCustomer numExterior(String nexteriorx) {
		nexterior.sendKeys(nexteriorx);
		return this;
	}
	
	/*
	public FormCustomer bajarg() throws InterruptedException {
        try {

         //   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\""+Id+"\").instance("+index+"));")); 
    		WebElement dater3 = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().text(\"Profesión u ocupación\"))")); //Profesión u ocupación  //Cliente iletrado
    		assertNotNull(dater3.getLocation());
    		System.out.println(dater3.getText());
    	    Thread.sleep(1000);
        	
       } catch (Exception e) {
          e.printStackTrace();
       }*/
	
	public FormCustomer bajarg(String textElement) throws InterruptedException {
		
        try {
        	boolean elementFound = false;
        	while (!elementFound) {
         //   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\""+Id+"\").instance("+index+"));")); 
    		WebElement dater3 = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""+textElement+"\").instance(0))")); //Profesión u ocupación  //Cliente iletrado
    		assertNotNull(dater3.getLocation());
    		System.out.println(dater3.getText());
    	    Thread.sleep(1000);
    	    if (dater3.getText().contains(textElement)) {
                elementFound = true;
                System.out.println("Elemento encontrado: " + dater3.getText());
                // Puedes interactuar con el elemento aquí, por ejemplo hacer click
                // element.click();
            } else {
                // Si el elemento no está visible, se hace scroll hacia abajo
                org.openqa.selenium.Dimension size = driver.manage().window().getSize();
                int startX = size.width / 2;
                int startY = (int) (size.height * 0.8);
                int endY = (int) (size.height * 0.2);

                TouchAction touchAction = new TouchAction(driver);
                touchAction.press(PointOption.point(startX, startY))
                        .moveTo(PointOption.point(startX, endY))
                        .release().perform();
            }
        	}
       } catch (Exception e) {
          e.printStackTrace();
       }
        

		
/*		WebElement dater3 = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().text(\"Profesión u ocupación\"))")); //Profesión u ocupación  //Cliente iletrado
		assertNotNull(dater3.getLocation());
		System.out.println(dater3.getText());
	    Thread.sleep(1000);*/
		return this;
	}
	
	public FormCustomer nextdomiciliog() throws InterruptedException {
		WebElement dater4 = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(2)).scrollIntoView(new UiSelector().text(\"Domicilio\"))")); //Profesión u ocupación  //Cliente iletrado
		assertNotNull(dater4.getLocation());
		System.out.println(dater4.getText());
	    Thread.sleep(1000);
		return this;
	}
	
	public FormCustomer numInterior(String ninterior) {
		interior.sendKeys(ninterior);
		return this;
	}
	
	public FormCustomer permanenciaAnios() {
		permanios.click();
		permanenciaanios();
		return this;
		
	}
	
	public FormCustomer referenciaUbic(String referencia) {
		referenu.sendKeys(referencia);
		return this;
		
	}
	
	public FormCustomer personaenDomicilio() {
		numeropersona.click();
		numPersonas();
		return this;
		
	}
	
	public FormCustomer casaqueHabita() {
		habita.click();
		casaHabita();
		return this;
		
	}
	
	public FormCustomer tipoPatrimon() {
		tpatrim.click();
		tipoPatrimonio();
		return this;
		
	}
	
	public FormCustomer otrotipoDomicilio(String otrotipod) {
		otrotipo.sendKeys(otrotipod);;
		return this;
		
	}
	
	public FormCustomer fotoHeritage() {
		fotoPatrimoni.click();
		fotoPatrimoni.click();
		fotoConstPatrimonio();
		nListo.click();
		return this;
		
	}
	
	public FormCustomer valorPatrim(String valpatrim) {
		valorPatrimon.sendKeys(valpatrim);;
		return this;
		
	}
	
	public FormCustomer tipoReferencia() {
		tiporef.click();
		tiporeferencia();
		return this;
		
	}
	
	public FormCustomer nameReferenc(String nreferenc) {
		nameref.sendKeys(nreferenc);
		return this;
		
	}
	
	public FormCustomer lastNameRef(String lastnreferen) {
		apellref.sendKeys(lastnreferen);
		return this;
		
	}
	
	public FormCustomer cellReferenc(String cellderef) {
		cellref.sendKeys(cellderef);
		return this;
		
	}
	
	public FormCustomer saveCustomer() {
		savecustom.click();
		return this;
		
	}
	
	/*
	public void secondSureNamen() {
		secondSurname.clear();
	}*/
	
	public void swipeScreenOneCustomer() {
	//	swipeScreen();
	//	System.out.println("Existe xxxxxxxxx");
		try {
		if(enconting.isDisplayed()){
			 // expect(enconting.isDisplayed()).true;
			  System.out.println("Existe elemento");
			  System.out.println(enconting.isDisplayed());
			  System.out.println(enconting.getText());
			  System.out.println(enconting.getAttribute("name"));
			  System.out.println(enconting.getSize());
			  System.out.println(enconting.getLocation());
			  swipeScreen2();
			}else{//0, elemento no esta presente.
			  swipeScreen();
			  System.out.println("Elemento no existe");
			}
		}catch (Exception e) {
            e.printStackTrace();
        }
		
		
		/*
		System.out.println(enconting);
		if(enconting!=null || enconting.toString()=="") {
			String toastMessage = enconting.getAttribute("name");
			System.out.println("Continggencia: "+ toastMessage);
			if (toastMessage.contains("contingencia")) {
				swipeScreen2(); //concontingencia
			}else {
				swipeScreen();
			}
		}
		else
		{
			String toastMessage ="";
		}*/
			
		/*
		System.out.println("Continggencia: "+ toastMessage);
		if (toastMessage.contains("contingencia")) {
			swipeScreen2(); //concontingencia
		}else {
			swipeScreen();
		}*/
		
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
	
	public FormCustomer nextCustomerContact() {
		scrollToPageCustomerContact();
		return this;
		
	}
	
	//bcontinuarValid es boton de ventanitade datos
	public FormCustomer bcontinuarValid() {
		btnContinuarValid.click();
	//	btnContinuarValid.click();
		
		return new FormCustomer(driver);
		
	}
	
	//Boton de contrato Guardar
	public FormCustomer bsaveContract() {
		btnsaveContract.click();
	//	subiendocliente();
	
	//	btnContinuarValid.click();
		return new FormCustomer(driver);
		
	}
	
}
