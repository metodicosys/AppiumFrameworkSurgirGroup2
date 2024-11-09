package org.meto.appium.pages;

import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.meto.appium.utils.AndroidActions;
import org.meto.appium.utils.scroll_sequence;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.DefaultElementByBuilder;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class FormProspect extends AndroidActions{
	
	AndroidDriver driver;
	
	public FormProspect(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

		
	}

	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/rlPropuesta")
	private WebElement propuesta;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/icon_return_home")
	private WebElement returnH;
	
	//@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnPropuestaHome")
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnNuevaPropuesta")
	private WebElement propuestaHome;
	
	//Prospecto
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/leaflet_button_add")
	private WebElement addProp;
	
	//add miembros
	@AndroidFindBy(xpath="//android.widget.TextView[@text='MIEMBRO 2']")
	private WebElement membertwo;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='MIEMBRO 3']")
	private WebElement membertree;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='MIEMBRO 4']")
	private WebElement memberfour;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='MIEMBRO 5']")
	private WebElement memberfive;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='MIEMBRO 6']")
	private WebElement membersix;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Miembro 2']")
	private WebElement membertwox;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Miembro 3']")
	private WebElement membertreex;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Miembro 4']")
	private WebElement memberfourx;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Miembro 5']")
	private WebElement memberfivex;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Miembro 6']")
	private WebElement membersixx;
	
	//@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btn_go_to_setting") //tuerkita
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[2]")
	WebElement generatorgroup;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/setting_customer_add_button")
	//@AndroidFindBy(xpath="android.widget.Button[@resource-id='pe.com.surgir.surgirapp:id/setting_customer_add_button']")
	WebElement newmember;
	
	@AndroidFindBy(id="id=\"pe.com.surgir.surgirapp:id/item_setting_label_edit")
	WebElement editmember;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/item_setting_dni")
	WebElement listdni;

	@AndroidFindBy(xpath="//android.widget.EditText[@text='Número de documento']")
	private WebElement numDoc;
	
	//MobileElement nverifica = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='Verificar']"));
	@AndroidFindBy(xpath="//android.widget.Button[@text='Verificar']")
	private WebElement nVerifica;
	
	//MobileElement el1x = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/component_datetime_input");
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/component_datetime_input")
	private WebElement fecCaducidad;
	
	//MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
//	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout[4]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	@AndroidFindBy(xpath="//android.widget.Button[@hint='Primer nombre']")
	private WebElement firstName;
	
	//@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout[4]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	@AndroidFindBy(xpath="//android.widget.Button[@hint='Segundo nombre']")
	private WebElement firstName2;
	
	//@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout[4]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	@AndroidFindBy(xpath="//android.widget.Button[@hint='Apellido paterno']")
	private WebElement firstName3;
	//@AndroidFindBy(id="00000000-0000-0012-ffff-ffff00000233")
	//private WebElement firstName2;
	
	//MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement secondName;
	
	//MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement firstSurname;
	
  //@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement secondSurname;
	
	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement FecNa;
		
	//Teléfono
	//MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement nMobile;	
	
	//Correo
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement  nMail;
	
	//MobileElement el18 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/btn_submit_prospect");
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btn_submit_prospect")
	private WebElement btnContinuarProspect;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/positive_radio_button")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/positive_radio_button")
	private WebElement checkData;
		
	//@AndroidFindBy(xpath="//android.widget.Button[@text='Continuar']")
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
	private WebElement btnContinuarData;
	
	//@AndroidFindBy(id="pe.com.surgir.surgirapp:id/audp_button_continue']")
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
	private WebElement btnContinuarDatatwo;
	
	//@AndroidFindBy(id="pe.com.surgir.surgirapp:id/summary_button_continue")
	//private WebElement btnContinuarValid;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Continuar'][@enabled = 'true']")
	private WebElement btnContinuarValid;

	
	@Test
	public void PropuestaButton() {
		propuesta.click();

	}
	
	@Test
	public void ReturnButton() {
		returnH.click();
		
	}
	
	@Test
	public void PropuestaHome() {
		propuestaHome.click();
		
	}
	
	@Test
	public void addProspect() {
		addProp.click();
		
	}
	
	@Test
	public void addmemberTwo() {
		membertwo.click();
		
	}
	
	@Test
	public void addmemberTree() {
		membertree.click();
		
	}
	
	@Test
	public void addmemberFour() {
		memberfour.click();
		
	}
	
	public void addmemberFive() {
		memberfive.click();
		
	}
	
	public void addmemberSix() {
		membersix.click();
		
	}
	
	public void addmemberTwox() {
		membertwox.click();
		
	}
	
	public void addmemberTreex() {
		membertreex.click();
		
	}
	
	public void addmemberFourx() {
		memberfourx.click();
		
	}
	
	public void addmemberFivex() {
		memberfivex.click();
		
	}
	
	public void addmemberSixx() {
		membersixx.click();
	}
	
	/*
	public void editMember() {
		editmember.click();
		
	}*/
	
	public void setNumDoc(String numdoc) {
		numDoc.sendKeys(numdoc);
		
	}
		
	public void Verificando() {
		//WebElement nverifica = (WebElement) driver.findElement(By.xpath("//android.widget.Button[@text='Verificar']"));
		WebElement nverifica = (WebElement) driver.findElement(By.id("pe.com.surgir.surgirapp:id/button_loading_button"));
		nverifica.click();

		//con tiempo explicito
		By byElement = By.id("pe.com.surgir.surgirapp:id/component_datetime_input");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(nverifica));
		
	}
	
	
	public void setFecCaducidad(String feccaducidad) {
		fecCaducidad.sendKeys(feccaducidad);
		
	}
	
	public void setFirstName(String firstname) {
		firstName.clear();
		firstName.sendKeys(firstname);
		
	}
	
	public void setFirstName2(String firstname) {
		firstName2.clear();
		firstName2.sendKeys(firstname);
		
	}
	
	public void setFirstName3(String firstname) {
		firstName3.clear();
		firstName3.sendKeys(firstname);
		
	}
	
	public void setFirstNamex(String firstname) {
		//firstName.clear();
		firstName.sendKeys(firstname);
		if(firstname.equals("Testtwo Name")) {
			System.out.println("Primer nombre correcto");
		}else {
			System.out.println("Primer nombre incorrecto");
		}
		Assert.assertEquals(firstname, "Testtwo Name");
		
	}
	
	
	public void setSecondName(String secondname) {
		//secondName.clear();
		secondName.sendKeys(secondname);
	}
	
	public void setSurName(String firstsurname) {
		firstSurname.clear();
		firstSurname.sendKeys(firstsurname);

	}
	
	@SuppressWarnings("deprecation")
	public FormProspect pdown() {
	//    driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"SOLTERO\").instance(0))"));
	    TouchAction touchAction = new TouchAction(driver);
	    touchAction.longPress(PointOption.point(550, 1410))
	               .moveTo(PointOption.point(550, 575))
	               .release()
	               .perform();
		
		return this;
	}
	
	public FormProspect cdown2() {
	/*	TouchAction touchAction = new TouchAction(driver);
	    touchAction.longPress(PointOption.point(550, 1410))
	               .moveTo(PointOption.point(550, 450))
	               .release()
	               .perform();*/
	    
	    
    	PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Sequence swipe = new Sequence(FINGER, 1)
    	.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 550, 1410))
        .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),550, 450))
        .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
		return this;
		
	}
	
	public FormProspect cdown3() {
	/*	TouchAction touchAction = new TouchAction(driver);
	    touchAction.longPress(PointOption.point(550, 1410))
	               .moveTo(PointOption.point(550, 530)) //550, 565
	               .release()
	               .perform();*/
	    
    	PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Sequence swipe = new Sequence(FINGER, 1)
    	.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 550, 1410))
        .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),550, 530))
        .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
	    
		return this;
		
	}
	
	public FormProspect cdown4() {
	/*	TouchAction touchAction = new TouchAction(driver);
	    touchAction.longPress(PointOption.point(550, 1410))
	               .moveTo(PointOption.point(550, 550)) //550, 565
	               .release()
	               .perform();*/
	    
    	PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Sequence swipe = new Sequence(FINGER, 1)
    	.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 550, 1410))
        .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),550, 550))
        .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
	    
	    
		return this;
		
	}
	
	public FormProspect cdown5() {
	/*	TouchAction touchAction = new TouchAction(driver);
	    touchAction.longPress(PointOption.point(550, 1410))
	               .moveTo(PointOption.point(550, 450)) //550, 565
	               .release()
	               .perform();*/
    	PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Sequence swipe = new Sequence(FINGER, 1)
    	.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 550, 1410))
        .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),550, 450))
        .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
	    
		return this;
		
	}
	
	
	
	public FormProspect avance() {
	/*    TouchAction touchAction = new TouchAction(driver);
	    touchAction.longPress(PointOption.point(560, 1110))
	               .moveTo(PointOption.point(560, 790))
	               .release()
	               .perform();*/
	    
    	PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Sequence swipe = new Sequence(FINGER, 1)
    	.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 560, 1110))
        .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),560, 790))
        .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
	    
	    return this;
		
	}
	
	public void setSecondSureName(String secondsurname) {
		secondSurname.clear();
		secondSurname.sendKeys(secondsurname);
	//	System.out.println("BBBBBB"+secondSurname);
		
	}
	
	public void setFecNa(String fecna) {
		FecNa.clear();
		FecNa.sendKeys(fecna);
		
	}
	
	public void setnMobile(String nmobile) {
		nMobile.clear();
		nMobile.sendKeys(nmobile);
		
	}
	
	
	public void setnMail(String mail) {
		nMail.clear();
		nMail.sendKeys(mail);
		
	}

	public void continuarProspect() {
		btnContinuarProspect.click();
		
	}
	
	public void scrollData() {
		scrolluseData();
		//checkData.click();
		
	}
	
	public void scrollDataAdd() throws InterruptedException {
		Thread.sleep(2000);
		//scroll_sequence.scrollexact();
		scrolluseDataadd();
		
		//checkData.click();
		
	}
	
	public void checkAutorization() {
		checkData.click();
		checkData.click();
		
	}
	
	public void continuarData() {
		btnContinuarData.click();
		
	}
	
	public void continuarDataTwo() {
		btnContinuarDatatwo.click();
		btnContinuarDatatwo.click();
	}
	
	public void generatorGroup() {
		generatorgroup.click();
		generatorgroup.click();
		
	}

	@SuppressWarnings("deprecation")
	public FormProspect newMember() {
	//	newmember.click();
	//	newmember.click();
	//	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		System.out.println(newmember.getText());
		System.out.println(listdni.getText());
		TouchAction touchnews = new TouchAction<>(driver);
		touchnews.longPress(PointOption.point(957,300))
		.release()
		.perform();
    
	    return this;
		
	}
	
	public FormProspect continuaValid() throws InterruptedException {
		btnContinuarValid.click();
		return this;
		
	}
	
	public FormCustomer bcontinuarValid() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Pasando de prospect a Cliente");

		return new FormCustomer(driver);
		
	}
	

	
}
