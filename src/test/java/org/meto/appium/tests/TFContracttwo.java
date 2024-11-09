package org.meto.appium.tests;

import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormBusinesstwo;
import org.meto.appium.pages.FormContract;
import org.meto.appium.pages.FormContracttwo;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormCustomerthree;
import org.meto.appium.pages.FormCustomertwo;
import org.meto.appium.pages.FormLogin;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProposaltwo;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.meto.appium.pages.FormRsetwo;
//import org.meto.appium.pages.FormSignature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFContracttwo extends TestBase{
	FormLogin formLogin;
	FormProspect formProspect;
	FormCustomer formCustomer;
	FormBusiness formBusiness;
	FormRse formRse;
	FormProposal formProposal;
	FormContract formContract;
	FormCustomertwo formCustomertwo;
	//formBusinesstwo = new FormBusinesstwo(driver);
	FormRsetwo formRsetwo;
	FormProposaltwo formProposaltwo;
	FormContracttwo formContracttwo;
	FormCustomerthree formCustomerthree;
	
	@BeforeMethod
	public void beforeMethod(Method method) {

		formLogin = new FormLogin(driver);
		formProspect = new FormProspect(driver);
		formCustomer = new FormCustomer(driver);
		formBusiness = new FormBusiness(driver);
		formRse = new FormRse(driver);
		formProposal = new FormProposal(driver);
		formContract = new FormContract (driver);
		formCustomertwo = new FormCustomertwo(driver);
	//	formBusinesstwo = new FormBusinesstwo(driver); 
		formRsetwo = new FormRsetwo(driver);
		formProposaltwo = new FormProposaltwo(driver);
		formCustomerthree = new FormCustomerthree(driver);
		
	}
	
	@Test
	public void TestContracttwo() throws InterruptedException{
		//FormProspect formProspect = formPage.localButtom();
		FormContracttwo formContracttwo = new FormContracttwo(driver);
		formContracttwo.Contractup();
	//	formContracttwo.comment("Conforme");
	//	formContracttwo.formaPago();
		
		
		formContracttwo.formaPago();
		formContracttwo.financialEntity();
	//	formContract.accountNumber("1111000000333");
	//	formContract.cci("11100032233333300445");
	//	formContracttwo.nextOneContract();
		formContracttwo.comment("Conforme");
		formContracttwo.saveContract(); //Guardar
	//	formContracttwo.upcontact();
		formContracttwo.customerListn();//nuevo listando
		formContracttwo.customerPage2();
	//	formContract.saveContract();
	
		

		
		
		FormCustomerthree formCustomerthree = formContracttwo.bsaveContract();
		
		
	}
	
	
}
