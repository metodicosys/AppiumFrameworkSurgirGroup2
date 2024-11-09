package org.meto.appium.tests;

import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormContract;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormCustomertwo;
import org.meto.appium.pages.FormLogin;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
//import org.meto.appium.pages.FormSignature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFContract extends TestBase{
	FormLogin formLogin;
	FormProspect formProspect;
	FormCustomer formCustomer;
	FormBusiness formBusiness;
	FormRse formRse;
	FormProposal formProposal;
	FormContract formContract;
	FormCustomertwo formCustomertwo;
	
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
		
	}
	
	@Test
	public void TestContract() throws InterruptedException{
		//FormProspect formProspect = formPage.localButtom();
		FormContract formContract = new FormContract(driver);
		
		formContract.formaPago();
		formContract.financialEntity();
	
		formContract.fotoCuenta();
		formContract.accountNumber("1111000000333");
		formContract.cci("11100032233333300445");
		formContract.nextOneContract();
		formContract.linkagePolice();
		formContract.comment("Conforme");
		formContract.saveContract();
	
		formContract.customerPage();
	//	formContract.saveContract();
	
		
		
		FormCustomertwo formCustomertwo = formContract.bsaveContract();
		
		
	}
	
	
}
