package org.meto.appium.tests;

import org.testng.annotations.BeforeMethod;
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

public class TFProspectRet extends TestBase {
	FormLogin formLoging;
	FormProspect formProspect;
	FormCustomer formCustomer;
	FormBusiness formBusiness;
	FormRse formRse;
	FormProposal formProposal;
	FormContract formContract;
	
	
	@BeforeMethod
	public void beforeMethod(Method method) {
		formLoging = new FormLogin(driver);
		formProspect = new FormProspect(driver);
		formCustomer = new FormCustomer(driver);
		formBusiness = new FormBusiness(driver);
		formRse = new FormRse(driver);
		formProposal = new FormProposal(driver);
		formContract = new FormContract (driver);
		
	}
	
	@Test
	public static void ProspectReturn() throws InterruptedException{
		FormProspect formProspect = new FormProspect(driver);
		//formProspect.PropuestaButton();

		FormCustomer formCustomer = formProspect.bcontinuarValid();// continuar validacion de prospecto
	//	FormCustomer formCustomer = formProspect.editMember()
		
		
	}
	
}
