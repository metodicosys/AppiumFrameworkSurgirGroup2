package org.meto.appium.tests;

import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormBusinessthree;
import org.meto.appium.pages.FormBusinesstwo;
import org.meto.appium.pages.FormContracttwo;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormCustomerthree;
import org.meto.appium.pages.FormCustomertwo;
import org.meto.appium.pages.FormLogin;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProposaltwo;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.meto.appium.pages.FormRsethree;
import org.meto.appium.pages.FormRsetwo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFBusinessthree extends TestBase{
	FormLogin formLogin;
	FormProspect formProspect;
	FormCustomer formCustomer;
	FormBusiness formBusiness;
	FormRse formRse;
	FormProposal formProposal;
	FormCustomertwo formCustomertwo;
	FormBusinesstwo formBusinesstwo;
	FormRsetwo formRsetwo;
	FormProposaltwo formProposaltwo;
	FormContracttwo formContracttwo;
	FormCustomerthree formCustomerthree;
	FormBusinessthree formBusinessthree;
	FormRsethree formRsethree;
	
	
	@BeforeMethod
	public void beforeMethod(Method method) {

		formLogin = new FormLogin(driver);
		formProspect = new FormProspect(driver);
		formCustomer = new FormCustomer(driver);
		formBusiness = new FormBusiness(driver);
		formRse = new FormRse(driver);
		formCustomertwo = new FormCustomertwo(driver);
		formBusinesstwo = new FormBusinesstwo(driver);
		formRsetwo = new FormRsetwo(driver);
		formProposaltwo = new FormProposaltwo(driver);
		formContracttwo = new FormContracttwo(driver);
		formCustomerthree = new FormCustomerthree(driver);
		formBusinessthree = new FormBusinessthree(driver);
		formRsethree = new FormRsethree(driver);
	}
	
	@Test
	public void TestBusinessthree() throws InterruptedException{
		FormBusinessthree formBusinessthree = new FormBusinessthree(driver);
		formBusinessthree.photoSelfie();
		formBusinessthree.saveBusiness();
		
		FormRsethree formRsethree = formBusinessthree.nextBusiness();

	}


	
}
