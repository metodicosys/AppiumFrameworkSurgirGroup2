package org.meto.appium.tests;

import org.testng.annotations.Test;
import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormContract;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormLogin;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.meto.appium.pages.FormSignature;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFSignature extends TestBase {
	
	FormLogin formLogin;
	FormProspect formProspect;
	FormCustomer formCustomer;
	FormBusiness formBusiness;
	FormRse formRse;
	FormProposal formProposal;
	FormContract formContract;
	FormSignature formSignature;
//	FormGuarantor formGuarantor;
//	FormCustomerGuarantor formCustomerGuarantor;
	
	@BeforeMethod
	public void beforeMethod(Method method) {

		formLogin = new FormLogin(driver);
		formProspect = new FormProspect(driver);
		formCustomer = new FormCustomer(driver);
		formBusiness = new FormBusiness(driver);
		formRse = new FormRse(driver);
		formProposal = new FormProposal(driver);
		formContract = new FormContract (driver);
		formSignature = new FormSignature (driver);
//		formGuarantor = new FormGuarantor(driver);
	//	formCustomerGuarantor = new FormCustomerGuarantor(driver);
		
	}
	
	@Test
	public void TestSignature() throws InterruptedException{
		//FormProspect formProspect = formPage.localButtom();
		FormSignature formSignature = new FormSignature(driver);
		//formSignature.saveSignature();
		formSignature.scrollToPageSignature();
		formSignature.chekFirma();
		formSignature.confirmaAsesor();
		formSignature.confirmaCliente();
		formSignature.nextConfirm();
		formSignature.chekFirma();
		formSignature.avance2();//avanza para luego realizar la firma
	//	formSignature.swipeScreen();
		formSignature.signatureCustomer();
		formSignature.aceptaFirma();
		formSignature.saveSignaturePreview();
		formSignature.saveSignature();
		formSignature.finishSignature();
		formSignature.checkDate();
		formSignature.nextDate();
		formSignature.politicdate();
		formSignature.finishSend();
	//	formSignature.politics();
		/*
		System.out.println(formProspect.segmentos());
		if(formProspect.segmentos().equals("D")) {
			String alerttitle = driver.findElement(By.id("pe.com.surgir.surgirapp:id/tv_pending_policy_title")).getText();
			System.out.println(alerttitle);
		}else {
			String alerttitlenext = driver.findElement(By.id("android:id/content")).getText();
		    System.out.println(alerttitlenext);
			}*/
		
		
	//	FormGuarantor formGuarantor = formSignature.addGuarantor();
	}

	

}
