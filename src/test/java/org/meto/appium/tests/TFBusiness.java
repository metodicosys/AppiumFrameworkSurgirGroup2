package org.meto.appium.tests;

import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormLogin;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFBusiness extends TestBase{
	FormLogin formLogin;
	FormProspect formProspect;
	FormCustomer formCustomer;
	FormBusiness formBusiness;
	FormRse formRse;
	FormProposal formProposal;
	
	@BeforeMethod
	public void beforeMethod(Method method) {

		formLogin = new FormLogin(driver);
		formProspect = new FormProspect(driver);
		formCustomer = new FormCustomer(driver);
		formBusiness = new FormBusiness(driver);
		formRse = new FormRse(driver);
		
	}
	
	@Test
	public void TestBusiness() throws InterruptedException{
		FormBusiness formBusiness = new FormBusiness(driver);
		formBusiness.photoSelfie();
		formBusiness.saveBusiness();
		formBusiness.swipeScreenOneBusiness();
		formBusiness.timeAnios();
		formBusiness.experienciaAnios();
		formBusiness.inicioActividad("01/04/2020");
		formBusiness.tipoEstabelcimiento();
		formBusiness.numEmpleados("1");
		formBusiness.saveBusiness();
		
		FormRse formRse = formBusiness.nextBusiness();

	}


	
}
