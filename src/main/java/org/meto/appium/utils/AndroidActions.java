package org.meto.appium.utils;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static java.time.Duration.ofMillis;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;
import static org.testng.Assert.assertNotNull;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;



public class AndroidActions<W3cActions, AndroidElement, MobileElement> {
	
	AndroidDriver driver;
	static String casah;
	//static AppiumDriver driver;
	
	public AndroidActions(AndroidDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(),
				"duration",2000));
	}
	
	
	public void scrollToEndAction()
	{
		boolean canScrollMore;
		do
		{
		canScrollMore = (Boolean) ((JavascriptExecutor)driver).executeScript("mobile: scrollGesture", ImmutableMap.of(null, null,null,null,null,null,null,null,null,null)
				
			//	ImmutableMap.of("left", 100, "top", 100, "width", 200,"height",200,"direction", "down","percent", 3.0)
		);
		
		}while(canScrollMore);
	}
	
	public void scrollToTextS(String text) {
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"AAAAA\"));"));
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));	                                                                                           

		
	}
	
	public void scrollToPage(WebElement selectProspect, String text2) {
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"AAAAA\"));"));
//		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));	    
//		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/atomicNumberDefinition\")).scrollIntoView(new UiSelector().textMatches(\"Autorización de uso de datos personales\").instance(0))")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().resourceId(\""+selectProspect+"\")).scrollIntoView(new UiSelector().textMatches(\""+text2+"\").instance(0))"));

		
	}
	
	//primer scroll en cliente para bajar
	public void scrollToPageCustomer1() {
	//	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Apellido materno\").instance(0))"));
		System.out.println("Datos: " + driver.findElements(By.id("pe.com.surgir.surgirapp:id/etInputGeneral")).size());
		WebElement datacustom1 = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Activo fijo\").instance(0))"));
		assertNotNull(datacustom1.getLocation());
		
	}
	
	//scroll para subir al inicio de la pagina de cliente
	public void scrollToPageup() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Generales\").instance(0))"));
	
	}
	
	//scroll para subir al inicio de la pagina de Business
	public void scrollBusinessToPageup() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Datos comerciales\").instance(0))"));
		
	}
	
	//scroll para subir al inicio de la pagina de RSE
	public void scrollRseToPageup() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Resumen Socioeconómico\").instance(0))"));
		
	}
	
	//scroll para subir al inicio de la pagina de Propuesta
	public void scrollProposalToPageup() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Responsabilidad del cliente\").instance(0))"));
		
	}
	
	//scroll para subir al inicio de la pagina de Contratación
	public void scrollContractToPageup() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Contratación\").instance(0))"));
		
	}
	
	//scroll para subir al inicio de la pagina de xxxx
	public void scrollToPageupContact() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Desembolso\").instance(1))")); //Desembolso
	
	}
	
  public void scrollExact(String elementText) {
        try {
            boolean elementFound = false;
            while (!elementFound) {
                WebElement element = driver.findElement(AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true))"
                                + ".scrollIntoView(new UiSelector().textContains(\"" + elementText + "\"))"));
                
                if (element.getText().contains(elementText)) {
                    elementFound = true;
                    System.out.println("Elemento encontrado: " + element.getText());
                    // Puedes interactuar con el elemento aquí, por ejemplo hacer click
                    // element.click();
                } else {
                    // Si el elemento no está visible, se hace scroll hacia abajo
                    Dimension size = driver.manage().window().getSize();
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
    }
	
	public void scrollToPageupContactSW() {
		List<WebElement> listsup = driver.findElements(By.id("pe.com.surgir.surgirapp:id/view_pager2"));
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipe = new Sequence(FINGER, 1)
		.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 540, 960))//1352
	    .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
	    .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),540, 1430))
	    .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	    driver.perform(Arrays.asList(swipe));
	    
	}
	
	public void scrollToPageupContactSW2() {
		List<WebElement> listsup = driver.findElements(By.id("pe.com.surgir.surgirapp:id/view_pager2"));
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipe = new Sequence(FINGER, 1)
		.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 540, 935))//1352
	    .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
	    .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),540, 1640))
	    .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	    driver.perform(Arrays.asList(swipe));
	    
	}
	   
	
	public void scrolluseData() {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/atomicNumberDefinition\")).scrollIntoView(new UiSelector().textMatches(\"Autorización de uso de datos personales\").instance(0))")).click();
	//	driver.findElement(By.id("pe.com.surgir.surgirapp:id/positive_radio_button")).click();
		
	}
	
	//bajas hasta tienes whatsap
	public void scrollToPageCustomerContact() {
		//errro se regresa hasta arriba
	//	driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/rlFormCustomerGeneral\")).scrollIntoView(new UiSelector().textMatches(\"¿Tienes WhatsApp?\").instance(0))"));

		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().resourceIdMatches(\".*:id/rlFormCustomerContact\")).getChildByText(new UiSelector().resourceIdMatches(\".*:id/title\"), \"¿Tienes WhatsApp?\")"));
	}
	
	
	public void scrolluseDataadd() {
	//	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/list\")).scrollIntoView(new UiSelector().textMatches(\"SOLTERO\").instance(0))")).click();
	
		
		driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/dialog_email\"))"));
		//".scrollIntoView(new UiSelector().text(\"metodicosys@gmail.com\"))"));
		//hint.Correo electrónico personal
		
		//pe.com.surgir.surgirapp:id/dialog_email
		
		
		//content_description = 'Subway Surfers'
			//	app_element = driver.find_element_by_android_uiautomator('new UiSelector().descriptionContains('+content_description+')')
		
		//	driver.findElement(By.id("pe.com.surgir.surgirapp:id/positive_radio_button")).click();
		
	}
		
	public void touchAgencia(String text) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> ListAngency=(List<WebElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (WebElement webElementmobileElement : ListAngency) {
			System.out.println(webElementmobileElement); //
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("CANTO GRANDE GRUPAL")){ //CANTO GRANDE GRUPAL
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void touchRol(String text) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> ListAngency=(List<WebElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (WebElement webElementmobileElement : ListAngency) {
			System.out.println(webElementmobileElement); //
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("ASESOR GRUPAL")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	/*
	public void touchGenero(String text) {
		List<WebElement> lists1 = driver.findElements(By.xpath("//android.widget.EditText[@text='"+text+"']"));
		TouchAction touch = new TouchAction<>(driver);
		touch.press(PointOption.point(250, 549));
		touch.release();
		touch.perform();

	}*/
	
	public void gradoInstruction() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListGinst=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListGinst) {
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chapag = ((WebElement) webElementmobileElement).getText();
		        if(chapag.equals("SECUNDARIA")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	public void profesion() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListProf=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListProf) {
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chapag = ((WebElement) webElementmobileElement).getText();
		        if(chapag.equals("EMPRESARIO")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@SuppressWarnings("deprecation")
	public void metod () {
		//List<WebElement> listsIl = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	 
		TouchAction touchIl = new TouchAction((PerformsTouchActions) driver);
		touchIl.press(PointOption.point(566,1279));
		touchIl.release();
		touchIl.perform();
		
	}
	
	@SuppressWarnings("deprecation")
	public void metod2 () {
		//List<WebElement> listsIl = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	 
		@SuppressWarnings("rawtypes")
		TouchAction touchIl = new TouchAction((PerformsTouchActions) driver);
		touchIl.press(PointOption.point(221,838));
		touchIl.release();
		touchIl.perform();
		
	}
	
	public void timeExplicit() {
		WebElement nverifica = (WebElement) driver.findElement(By.xpath("//android.widget.Button[@text='Verificar']"));
		nverifica.click();

		//con tiempo explicito
		By byElement = By.id("pe.com.surgir.surgirapp:id/component_datetime_input");
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(nverifica));
	}

	
	/*
	public void swipeAction(WebElement ele,String direction) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(),
				"direction", direction,
				"percent", 0.75));
		
	}*/
	
	public void addActionProspect(String text) {
		//List<WebElement> lists1 = driver.findElements(By.xpath("//android.widget.EditText[@text='"+text+"']"));
		// 	(xpath="//android.widget.LinearLayout[@content-desc=\"MIEMBRO 1\"]/android.widget.TextView")
		List<WebElement> lists1 = driver.findElements(By.xpath("//android.widget.LinearLayout[@content-desc=\"MIEMBRO " +text+"\"]/android.widget.TextView"));
		System.out.println(lists1);
	
	}
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public void subiendocliente() {
	//    driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"SOLTERO\").instance(0))"));
		System.out.println("xxxJalando");
		TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
	    touchAction.longPress(PointOption.point(580, 829)) //610, 670)
	               .moveTo(PointOption.point(580, 1460)) //610, 1180
	               .release()
	               .perform();
	}
	
	//Cliente

	public void experiann() {
		List<WebElement> lists4 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 341, 255)); //INICIO
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
        
	}
		
	public void fotofrenteDnin() {
		List<WebElement> lists5 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 341, 548)); //INICIO
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
        
	}
	
	public void fotoreversoDnin() {
		List<WebElement> lists6 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 638, 252)); //INICIO
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
        
	}
	
	public void fotoClienten() {
		List<WebElement> lists7 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery"));
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 341, 255)); //INICIO
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
        
	}
	
	public void fotoIletrados () {
		List<WebElement> listsIl = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	 
		TouchAction touchIl = new TouchAction<>(driver);
		touchIl.press(PointOption.point(341,255));
		touchIl.release();
		touchIl.perform();
		
	}
	
	public void tipoComprobante() {		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			@SuppressWarnings("unchecked")
			List<MobileElement> ListCompPago=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			for (MobileElement webElementmobileElement : ListCompPago) {
				System.out.println(webElementmobileElement);
			        System.out.println(((WebElement) webElementmobileElement).getText());
			        String chac = ((WebElement) webElementmobileElement).getText();
			        if(chac.equals("Constancia de alojado")){
			        	((WebElement) webElementmobileElement).click();
			        	break;
			        }
			    }		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void fotoCdomicilio() {
		List<WebElement> listsfd = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery"));
	/*	TouchAction touchfd = new TouchAction<>(driver);
		touchfd.press(PointOption.point(341,255));
		touchfd.release();
		touchfd.perform();*/
		
	//	List<WebElement> lists5 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 341, 255)); //INICIO
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
		
	}
	
	public void departament() {
		
		List<WebElement> lists17 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
	/*	TouchAction action = new TouchAction(driver); 
		action.longPress(PointOption.point(145, 1140)) //(70, 1097)
         .moveTo(PointOption.point(145, 670));  //(70, 800)
		action.release();
		action.perform();*/
		
    	PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Sequence swipe = new Sequence(FINGER, 1)
    	.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 145, 1140))
        .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),145, 670))
        .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListDepa=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListDepa) {
			System.out.println(webElementmobileElement); //
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("LIMA")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void provincia() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListProv=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListProv) {
			System.out.println(webElementmobileElement); //
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("LIMA")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void distrito() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListDistri=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListDistri) {
			System.out.println(webElementmobileElement); //
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("LIMA")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void tipoviac() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListVia=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListVia) {
			System.out.println(webElementmobileElement); //
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("Calle")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void permanenciaanios() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListPermanen=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListPermanen) {
			System.out.println(webElementmobileElement); //
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("2")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void numPersonas() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListPerDom=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListPerDom) {
			System.out.println(webElementmobileElement); //
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("2")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void casaHabita() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allLisTch=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allLisTch) {
			System.out.println(webElementmobileElement); //
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("OTRO")){
		        	((WebElement) webElementmobileElement).click();
		        //		casah = ((WebElement) webElementmobileElement).getText();
		        	break;
		        }
		        casah = ((WebElement) webElementmobileElement).getText();
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void tipoPatrimonio() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allLisTpatrim=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allLisTpatrim) {
			System.out.println(webElementmobileElement); //
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("Empresas")){
		        	((WebElement) webElementmobileElement).click();
		        //		casah = ((WebElement) webElementmobileElement).getText();
		        	break;
		        }
		        casah = ((WebElement) webElementmobileElement).getText();
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void fotoConstPatrimonio() {
		List<WebElement> lists14p = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery"));
		TouchAction touch14p = new TouchAction<>(driver);
		touch14p.press(PointOption.point(341,255));
		touch14p.release();
		touch14p.perform();
		
	}
	
	public void tiporeferencia() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListTipRef=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListTipRef) {
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chaent = ((WebElement) webElementmobileElement).getText();
		        if(chaent.equals("AMIGO (A)")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	//Business
	public void fotoSelfie() {
		List<WebElement> lists23 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
	/*	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	 
		TouchAction touch23 = new TouchAction((PerformsTouchActions) driver);
		touch23.press(PointOption.point(341,255));
		touch23.release();
		touch23.perform();*/
		
	//	List<WebElement> listss = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery"));
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 341, 255));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
		
	}
	
	public void operadordeTelef() {
		List<WebElement> lists11 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
	/*	TouchAction touch11 = new TouchAction<>(driver);
		touch11.press(PointOption.point(100,1290));
		touch11.release();
		touch11.perform();*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListOpTel=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListOpTel) {
			//System.out.println(webElementmobileElement);
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chaent = ((WebElement) webElementmobileElement).getText();
		        if(chaent.equals("CLARO")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	//RSE
	public void autocompGiro() {
		List lists31 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/rl1"));
	/*	TouchAction touch31 = new TouchAction((PerformsTouchActions) driver);
		touch31.press(PointOption.point(175,553));
		touch31.release();
		touch31.perform(); */
		
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 175, 553));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
	}
	
	//Contract
	public void formadePago() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListFpago=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListFpago) {
			//System.out.println(webElementmobileElement);
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chapag = ((WebElement) webElementmobileElement).getText();
		        if(chapag.equals("Transferencia")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void formadePagoRet() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListFpago=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListFpago) {
			//System.out.println(webElementmobileElement);
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chapag = ((WebElement) webElementmobileElement).getText();
		        if(chapag.equals("Retiro en agencia BanBif")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	public void entidadFinanciera() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListEntidadB=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListEntidadB) {
			//System.out.println(webElementmobileElement);
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chaent = ((WebElement) webElementmobileElement).getText();
		        if(chaent.equals("BCP")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	//Sleccionando cada cliente de la lista de clientes
	public void listaCliente() {
		String chab=null;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListCustomer=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int ncustomer = allListCustomer.size();
		System.out.println("textar: "+ allListCustomer.size()); //imprime 6
        int ic=0;
				for (MobileElement webElementmobileElement : allListCustomer) {
			//	        System.out.println(((WebElement) webElementmobileElement).getText());
				        chab = ((WebElement) webElementmobileElement).getText();
						switch(ic) {		
						  case 0:
							System.out.println("Cliente: " +  chab); //uno
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
							break;
						  case 1:
							System.out.println("Cliente: " +  chab); //dos
							((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
							break;
							/*
						  case 2:
							System.out.println("Cliente: " +  chab); //tres
							((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;
						  case 3:
							System.out.println("Cliente: " +  chab); //cuatro
							((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;
						  case 4:
							System.out.println("Cliente: " +  chab); //cinco
							((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;
						  case 5:
							System.out.println("Cliente: " +  chab); //seis
							((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;*/
						  default:
							System.out.println("es mayor a seis.");
						}
				        ic++;

				    }		
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	//Sleccionando cada cliente de la lista de clientes
	public void listaCliente3() {
		String chab=null;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListCustomer=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int ncustomer = allListCustomer.size();
		System.out.println("textar: "+ allListCustomer.size()); //imprime 6
        int ic=0;
				for (MobileElement webElementmobileElement : allListCustomer) {
				        chab = ((WebElement) webElementmobileElement).getText();
						switch(ic) {		
						  case 0:
							System.out.println("Cliente: " +  chab); //uno
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
							break;
						  case 1:
							System.out.println("Cliente: " +  chab); //dos
						//	((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
							break;
						  case 2:
							System.out.println("Cliente: " +  chab); //tres
							((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;
						  case 3:
							System.out.println("Cliente: " +  chab); //cuatro
							((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;
						  case 4:
							System.out.println("Cliente: " +  chab); //cinco
							((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;
						  case 5:
							System.out.println("Cliente: " +  chab); //seis
							((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;
						  default:
							System.out.println("es mayor a seis.");
						}
				        ic++;

				    }		
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	//Sleccionando cada cliente de la lista de clientes
	public void listaCliente4() {
		String chab=null;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListCustomer=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int ncustomer = allListCustomer.size();
		System.out.println("textar: "+ allListCustomer.size()); //imprime 6
        int ic=0;
				for (MobileElement webElementmobileElement : allListCustomer) {
				        chab = ((WebElement) webElementmobileElement).getText();
						switch(ic) {		
						  case 0:
							System.out.println("Cliente: " +  chab); //uno
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
							break;
						  case 1:
							System.out.println("Cliente: " +  chab); //dos
						//	((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
							break;
						  case 2:
							System.out.println("Cliente: " +  chab); //tres
						//	((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;
						  case 3:
							System.out.println("Cliente: " +  chab); //cuatro
							((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;
						  case 4:
							System.out.println("Cliente: " +  chab); //cinco
							((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;
						  case 5:
							System.out.println("Cliente: " +  chab); //seis
							((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;
						  default:
							System.out.println("es mayor a seis.");
						}
				        ic++;

				    }		
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	//Sleccionando cada cliente de la lista de clientes
	public void listaCliente5() {
		String chab=null;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListCustomer=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int ncustomer = allListCustomer.size();
		System.out.println("textar: "+ allListCustomer.size()); //imprime 6
        int ic=0;
				for (MobileElement webElementmobileElement : allListCustomer) {
				        chab = ((WebElement) webElementmobileElement).getText();
						switch(ic) {		
						  case 0:
							System.out.println("Cliente: " +  chab); //uno
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
							break;
						  case 1:
							System.out.println("Cliente: " +  chab); //dos
						//	((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
							break;
						  case 2:
							System.out.println("Cliente: " +  chab); //tres
						//	((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;
						  case 3:
							System.out.println("Cliente: " +  chab); //cuatro
						//	((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;
						  case 4:
							System.out.println("Cliente: " +  chab); //cinco
							((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;
						  case 5:
							System.out.println("Cliente: " +  chab); //seis
							((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;
						  default:
							System.out.println("es mayor a seis.");
						}
				        ic++;

				    }		
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	//Sleccionando cada cliente de la lista de clientes
	public void listaCliente6() {
		String chab=null;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListCustomer=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int ncustomer = allListCustomer.size();
		System.out.println("textar: "+ allListCustomer.size()); //imprime 6
        int ic=0;
				for (MobileElement webElementmobileElement : allListCustomer) {
				        chab = ((WebElement) webElementmobileElement).getText();
						switch(ic) {		
						  case 0:
							System.out.println("Cliente: " +  chab); //uno
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
							break;
						  case 1:
							System.out.println("Cliente: " +  chab); //dos
						//	((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
							break;
						  case 2:
							System.out.println("Cliente: " +  chab); //tres
						//	((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;
						  case 3:
							System.out.println("Cliente: " +  chab); //cuatro
						//	((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;
						  case 4:
							System.out.println("Cliente: " +  chab); //cinco
						//	((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;
						  case 5:
							System.out.println("Cliente: " +  chab); //seis
							((WebElement) webElementmobileElement).click();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							break;
						  default:
							System.out.println("es mayor a seis.");
						}
				        ic++;

				    }		
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	//Lista de clientes
	public void listCustomer() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListCustompage=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		for(int i=1; i<=ListCustompage.size(); i++) {
			
		     switch (i) {            
		       case 1:
		   		for (MobileElement webElementmobileElement : ListCustompage) {
					System.out.println(webElementmobileElement);
				      //  System.out.println("MINOMBRE: "+((WebElement) webElementmobileElement).getText());
				        String chaent = ((WebElement) webElementmobileElement).getText();
				      //  if(chaent.equals("BCP")){
				        if(chaent.contains("Milla")){
				        	((WebElement) webElementmobileElement).click();
				        	CustomerReturn();	//click en tab cliente
				        	//subiendocliente();  //baja un poco en form cliente
				        	break;
				        }
				        
				    }	
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    	    break;
	           case 2: 
			   		for (MobileElement webElementmobileElement : ListCustompage) {
						System.out.println(webElementmobileElement);
					      //  System.out.println("MINOMBRE: "+((WebElement) webElementmobileElement).getText());
					        String chaent1 = ((WebElement) webElementmobileElement).getText();
					      //  if(chaent.equals("BCP")){
					        if(chaent1.contains("Montes")){
					        	((WebElement) webElementmobileElement).click();
					        	CustomerReturn();	//click en tab cliente
					        	//subiendocliente();  //baja un poco en form cliente
					        	break;
					        }
					        
					    }	
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						
			    	    break;
	           case 3: 
						
			    	    break;
	           case 4: 
						
			    	    break;
	           case 5: 
						
			    	    break;
		    	    
           default: System.out.println("Terminó de validar");
       }
	}
	}
		//Lista de clientes
		public void listCustomertwo() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			List<MobileElement> ListCustompage=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			for(int i=2; i<=ListCustompage.size(); i++) {
				
			     switch (i) {            
			       case 2:
			   		for (MobileElement webElementmobileElement : ListCustompage) {
						System.out.println(webElementmobileElement);
					      //  System.out.println("MINOMBRE: "+((WebElement) webElementmobileElement).getText());
					        String chaent = ((WebElement) webElementmobileElement).getText();
					      //  if(chaent.equals("BCP")){
					        if(chaent.contains("Montes")){
					        	((WebElement) webElementmobileElement).click();
					        	CustomerReturn();	//click en tab cliente
					        	break;
					        }
					        
					    }	
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				    	    break;
		           case 3: 
							
				    	    break;
		           case 4: 
							
				    	    break;
			    	    
	           default: System.out.println("Terminó de validar");
	       }
		}
			
		

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
		
	public void mbruto() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListMargbruto=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListMargbruto) {
			System.out.println(webElementmobileElement); //
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("45%")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
		
	public void timeFuncAnios() {
	/*	List<WebElement> lists12 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch12 = new TouchAction<>(driver);
		touch12.press(PointOption.point(84,1402));
		touch12.release();
		touch12.perform();*/
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListTimef=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListTimef) {
			System.out.println(webElementmobileElement); //
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("2")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void experAnios() {
	/*	List<WebElement> lists24 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch24 = new TouchAction<>(driver);
		touch24.press(PointOption.point(704,1402));
		touch24.release();
		touch24.perform(); */
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListExperani=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListExperani) {
			System.out.println(webElementmobileElement); //
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("2")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void tipoEstabelcim() {
	/*	List<WebElement> lists30 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch30 = new TouchAction<>(driver);
		touch30.press(PointOption.point(728,1581));
		touch30.release();
		touch30.perform(); */
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListTest=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListTest) {
			System.out.println(webElementmobileElement); //
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("AMBULANTE")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void scrollToPageContract() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Firma de contrato\").instance(0))"));
		
	}
	
	public void scrollToPageSignature() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Firma\").instance(0))"));

	}
	
	public void avance2() {
		long noOfSeconds = 5;
		Duration duration = Duration.ofSeconds(noOfSeconds);
		TouchAction action = new TouchAction(driver); 
        action.longPress(PointOption.point(556, 1400)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(7)))
                        .moveTo(PointOption.point(556, 700)).release().perform();
		
	}
	
	public void fotoCuentas() {
		List lists45 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 		
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 341, 255));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
		
	}
	
	//Signature
	public void signatureCustomer() {
	/*    TouchAction touchAction = new TouchAction(driver);
	    touchAction.longPress(PointOption.point(428, 1228))
	               .moveTo(PointOption.point(697, 1400))
	               .release()
	               .perform();*/
		  PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger"); 
		  Sequence longpress = new Sequence(finger, 1);
		  longpress.addAction(finger.createPointerMove(Duration.ofMillis(0),PointerInput.Origin.viewport(), 428, 1228));
		  longpress.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		  longpress.addAction(finger.createPointerMove(Duration.ofMillis(2000),PointerInput.Origin.viewport(), 697, 1400));
		  longpress.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		  driver.perform(Collections.singletonList(longpress));
		  
		//	WebElement dater3 = driver.findElement(By.id("pe.com.surgir.surgirapp:id/sign")); //Profesión u ocupación

		/*  banner_element = driver_provider.driver.find_element_by_accessibility_id("banner");
				  single-tap.press(banner-element, x=200, y=300)
				  .wait(1500)
				  .move.to(banner-element, x= 500, y=400)
				  .wait(500)
				  .release()*/

	    
	}
	
	
	//Retornando a Cliente
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Cliente\"]")
	private WebElement customerret;
	public void CustomerReturn() {
		customerret.click();

	}
	
	//Proposal
	
	public void product() {	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> allListText=(List<MobileElement>) driver.findElements(By.id("android:id/text1")); //cn este funcionaba
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : allListText) {
			System.out.println(webElementmobileElement); //
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chab = ((WebElement) webElementmobileElement).getText();
		        if(chab.equals("CRÉDITO MUJERES UNIDAS")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void fotoConsOtroIng() {
		List<WebElement> lists33 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
	/*	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	 
		TouchAction touch33 = new TouchAction<>(driver);
		touch33.press(PointOption.point(341,255));
		touch33.release();
		touch33.perform();*/
		
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 341, 255));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
	}
	
	public void origendeOtroIng() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<MobileElement> ListOtrIngr=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListOtrIngr) {
			//System.out.println(webElementmobileElement);
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chad = ((WebElement) webElementmobileElement).getText();
		        if(chad.equals("OTRO")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
	}
	
	public void destinopr() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<MobileElement> ListSegBasic=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListSegBasic) {
			//System.out.println(webElementmobileElement);
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chad = ((WebElement) webElementmobileElement).getText();
		        if(chad.equals("ACTIVO FIJO")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void freccuota() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListFrecCuot=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListFrecCuot) {
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chad = ((WebElement) webElementmobileElement).getText();
		        if(chad.equals("MES(ES)")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void canticuota() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<MobileElement> ListCantCuot=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListCantCuot) {
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chad = ((WebElement) webElementmobileElement).getText();
		        if(chad.equals("4")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void segurob() {	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			List<MobileElement> ListSegBasic=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			for (MobileElement webElementmobileElement : ListSegBasic) {
			        System.out.println(((WebElement) webElementmobileElement).getText());
			        String chad = ((WebElement) webElementmobileElement).getText();
			        if(chad.equals("DESGRAV PORCENTUAL")){
			        	((WebElement) webElementmobileElement).click();
			        	break;
			        }
			    }		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void seguropt() {	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			List<MobileElement> ListSegOpt=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			for (MobileElement webElementmobileElement : ListSegOpt) {
			        String chad = ((WebElement) webElementmobileElement).getText();
			        if(chad.equals("SUPER SEGURO PLAN 4")){
			        	((WebElement) webElementmobileElement).click();
			        	break;
			        }
			    }		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void tipodocumentoptative() {
	/*	List<WebElement> lists44 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch44 = new TouchAction<>(driver);
		touch44.press(PointOption.point(334,769));
		touch44.release();
		touch44.perform(); */
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<MobileElement> ListTipopt=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListTipopt) {
			//System.out.println(webElementmobileElement);
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chad = ((WebElement) webElementmobileElement).getText();
		        if(chad.equals("DNI")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void sueCivil() {
	/*	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> lists45 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch45 = new TouchAction<>(driver);
		touch45.press(PointOption.point(351,1015));
		touch45.release();
		touch45.perform(); */
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<MobileElement> ListEcivil=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListEcivil) {
			//System.out.println(webElementmobileElement);
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chad = ((WebElement) webElementmobileElement).getText();
		        if(chad.equals("CONVIVIENTE")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void suGenero() {
	//	List<WebElement> lists45x = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
	/*	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch45x = new TouchAction<>(driver);
		touch45x.press(PointOption.point(351,1106)); //FEMENINO
		touch45x.release();
		touch45x.perform(); */
		
		List<MobileElement> ListGener=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		for (MobileElement webElementmobileElement : ListGener) {
			//System.out.println(webElementmobileElement);
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chadg = ((WebElement) webElementmobileElement).getText();
		        if(chadg.equals("FEMENINO")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void scrollToTextRelation() {
		List<WebElement> lists46 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
	/*	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch46 = new TouchAction<>(driver);
		touch46.press(PointOption.point(362,1540)); // arriba 250, 557 --- abajo 264,896
		touch46.release();
		touch46.perform();*/
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<MobileElement> ListParent=(List<MobileElement>) driver.findElements(By.id("android:id/text1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for (MobileElement webElementmobileElement : ListParent) {
			//System.out.println(webElementmobileElement);
		        System.out.println(((WebElement) webElementmobileElement).getText());
		        String chad = ((WebElement) webElementmobileElement).getText();
		        if(chad.equals("CONOCIDO")){
		        	((WebElement) webElementmobileElement).click();
		        	break;
		        }
		    }		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void seguroAsocia() {
		List<WebElement> lists47 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/txt_view"));
	/*	TouchAction touch47 = new TouchAction<>(driver);
		touch47.press(PointOption.point(334,1460));
		touch47.release();
		touch47.perform(); */
		
		PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1);
        		swipe.addAction(FINGER.createPointerMove(ofMillis(5), viewport(), 334, 1460));
        		swipe.addAction(FINGER.createPointerDown(LEFT.asArg()));
                swipe.addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
        
	}
	
	public void avance1() {
	/*	long noOfSeconds = 5;
		Duration duration = Duration.ofSeconds(noOfSeconds);
		TouchAction action = new TouchAction(driver); 
        action.longPress(PointOption.point(560, 1460)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                        .moveTo(PointOption.point(560, 530)).release().perform();*/
        
    	PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Sequence swipe = new Sequence(FINGER, 1)
    	.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 560, 1460))
        .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),560, 530))
        .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
		
	}
	
	public void avancebeneseg() {
	/*	long noOfSeconds = 5;
		Duration duration = Duration.ofSeconds(noOfSeconds);
		TouchAction action = new TouchAction(driver); 
        action.longPress(PointOption.point(500, 1268)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                        .moveTo(PointOption.point(50, 968)).release().perform();*/
        
    	PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Sequence swipe = new Sequence(FINGER, 1)
    	.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 500, 1268))
        .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),50, 968))
        .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
		
	}
	
	@Test
	public void swipeScreen() {
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		
		int startx=width/2;
		int endx=width/2;
		int starty=(int) (height*.40);
		int endy= (int) (height*.10);
		
    	PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Sequence swipe = new Sequence(FINGER, 1)
    	.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startx, starty))
        .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),endx, endy))
        .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
		
	/*	TouchAction action = new TouchAction((PerformsTouchActions) driver);
		action.longPress(PointOption.point(startx, starty))
		.moveTo(PointOption.point(endx, endy))
		.release()
		.perform();*/
		
	}
	
	
	
	@Test
	public void swipeScreen2() {
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		
		int startx=width/2;
		int endx=width/2;
		int starty=(int) (height*.45);
		int endy= (int) (height*.10);
		
    	PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Sequence swipe = new Sequence(FINGER, 1)
    	.addAction(FINGER.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startx, starty))
        .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        .addAction(FINGER.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(),endx, endy))
        .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
        
		/*TouchAction action = new TouchAction((PerformsTouchActions) driver);
		action.longPress(PointOption.point(startx, starty))
		.moveTo(PointOption.point(endx, endy))
		.release()
		.perform();*/
		
	}
	
	/*
	//para grupo tuekita
	(id="pe.com.surgir.surgirapp:id/btn_go_to_setting")
	
	//nuevo miembro boton
	(id="pe.com.surgir.surgirapp:id/setting_customer_add_button")
	
	//editar miembro
	(id="pe.com.surgir.surgirapp:id/item_setting_label_edit")
	MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.HorizontalScrollView[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[5]");
	el5.click();
	
	//boton de lista grupo
	(id="pe.com.surgir.surgirapp:id/text_input_end_icon")
	MobileElement el6 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[1]");
	el6.click();
	
	//segundo de la lista
	X=492
	Y=353
	
	https://www.youtube.com/watch?v=TBNfLee2WXg
	https://www.youtube.com/watch?v=gTHKf_FfLFU&t=1927s // arquitectura
	*/
	
}
