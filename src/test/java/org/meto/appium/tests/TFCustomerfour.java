package org.meto.appium.tests;

import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormBusinessfour;
import org.meto.appium.pages.FormBusinessthree;
import org.meto.appium.pages.FormBusinesstwo;
import org.meto.appium.pages.FormContract;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormCustomerfour;
import org.meto.appium.pages.FormCustomerthree;
import org.meto.appium.pages.FormCustomertwo;
import org.meto.appium.pages.FormLogin;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TFCustomerfour extends TestBase {
	FormLogin formLogin;
	FormProspect formProspect;
	FormCustomer formCustomer;
	FormBusiness formBusiness;
	FormRse formRse;
	FormProposal formProposal;
	FormContract formContract;
	FormCustomertwo formCustomertwo;
	FormBusinesstwo formBusinesstwo;
	FormCustomerthree formCustomerthree;
	FormBusinessthree formBusinessthree;
	FormCustomerfour formCustomerfour;
	FormBusinessfour formBusinessfour;

	@BeforeMethod
	public void beforeMethod(Method method) {

		formLogin = new FormLogin(driver);
		formProspect = new FormProspect(driver);
		formCustomer = new FormCustomer(driver);
		formBusiness = new FormBusiness(driver);
		formRse = new FormRse(driver);
		formProposal = new FormProposal(driver);
		formContract = new FormContract(driver);
		formCustomertwo = new FormCustomertwo(driver);
		formBusinesstwo = new FormBusinesstwo(driver);
		formCustomerthree = new FormCustomerthree(driver);
		formBusinessthree = new FormBusinessthree(driver);
		formCustomerfour = new FormCustomerfour(driver);
		formBusinessfour = new FormBusinessfour(driver);
		
	}
	
	@Test
	public void TestCustomerfour() throws InterruptedException{
		FormCustomerfour formCustomerfour = new FormCustomerfour(driver);
		formCustomerfour.Customerup();
		
		formCustomerfour.fotoExperian();
		formCustomerfour.fotofrenteDni();
		formCustomerfour.fotoreversoDni();
		formCustomerfour.fotoCliente();
		formCustomerfour.saveCustomer();
		formCustomerfour.swipeScreenOneCustomer();
		
		FormBusinessfour formBusinessfour = formCustomerfour.nextCustomerfour();
		
	}



	

}
