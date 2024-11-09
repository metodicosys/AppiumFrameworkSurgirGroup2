package org.meto.appium.tests;

import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormBusinessfive;
import org.meto.appium.pages.FormBusinessfour;
import org.meto.appium.pages.FormBusinesssix;
import org.meto.appium.pages.FormBusinessthree;
import org.meto.appium.pages.FormBusinesstwo;
import org.meto.appium.pages.FormContracttwo;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormCustomerfive;
import org.meto.appium.pages.FormCustomerfour;
import org.meto.appium.pages.FormCustomerthree;
import org.meto.appium.pages.FormCustomertwo;
import org.meto.appium.pages.FormLogin;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProposaltwo;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.meto.appium.pages.FormRsefive;
import org.meto.appium.pages.FormRsefour;
import org.meto.appium.pages.FormRsesix;
import org.meto.appium.pages.FormRsethree;
import org.meto.appium.pages.FormRsetwo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFBusinesssix extends TestBase{
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
	FormCustomerfour formCustomerfour;
	FormBusinessfour formBusinessfour;
	FormRsefour formRsefour;
	FormCustomerfive formCustomerfive;
	FormBusinessfive formBusinessfive;
	FormRsefive formRsefive;
	FormBusinesssix formBusinesssix;
	FormRsesix formRsesix;
	
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
		formCustomerfour = new FormCustomerfour(driver);
		formBusinessfour = new FormBusinessfour(driver);
		formRsefour= new FormRsefour(driver);
		formCustomerfive = new FormCustomerfive(driver);
		formBusinessfive = new FormBusinessfive(driver);
		formRsefive= new FormRsefive(driver);
		formBusinesssix = new FormBusinesssix(driver);
		formRsesix= new FormRsesix(driver);
		
	}
	
	@Test
	public void TestBusinesssix() throws InterruptedException{
		FormBusinesssix formBusinesssix = new FormBusinesssix(driver);
		formBusinesssix.photoSelfie();
		formBusinesssix.saveBusiness();
		
		FormRsesix formRsesix = formBusinesssix.nextBusinesssix();

	}


	
}
