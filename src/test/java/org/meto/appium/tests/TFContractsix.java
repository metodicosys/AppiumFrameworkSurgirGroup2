package org.meto.appium.tests;

import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormBusinesstwo;
import org.meto.appium.pages.FormContract;
import org.meto.appium.pages.FormContractfive;
import org.meto.appium.pages.FormContractfour;
import org.meto.appium.pages.FormContractsix;
import org.meto.appium.pages.FormContractthree;
import org.meto.appium.pages.FormContracttwo;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormCustomerfive;
import org.meto.appium.pages.FormCustomerfour;
import org.meto.appium.pages.FormCustomersix;
import org.meto.appium.pages.FormCustomerthree;
import org.meto.appium.pages.FormCustomertwo;
import org.meto.appium.pages.FormLogin;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProposalthree;
import org.meto.appium.pages.FormProposaltwo;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.meto.appium.pages.FormRsethree;
import org.meto.appium.pages.FormRsetwo;
import org.meto.appium.pages.FormSignature;
//import org.meto.appium.pages.FormSignature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFContractsix extends TestBase{
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
	FormRsethree formRsethree;
	FormProposalthree formProposalthree;
	FormContractthree formContractthree;
	FormCustomerfour formCustomerfour;
	FormContractfour formContractfour;
	FormCustomerfive formCustomerfive;
	FormContractfive formContractfive;
	FormCustomersix formCustomersix;
	FormContractsix formContractsix;
	
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
		formRsethree = new FormRsethree(driver);
		formProposalthree = new FormProposalthree(driver);
		formCustomerfour = new FormCustomerfour(driver);
		formContractfour = new FormContractfour (driver);
		formCustomerfive = new FormCustomerfive(driver);
		formContractfive = new FormContractfive (driver);
		formCustomersix = new FormCustomersix(driver);
		formContractsix = new FormContractsix (driver);
		
	}
	
	@Test
	public void TestContractsix() throws InterruptedException{
		//FormProspect formProspect = formPage.localButtom();
		FormContractsix formContractsix = new FormContractsix(driver);
		
		formContractsix.formaPago();
		formContractsix.financialEntity();
		formContractsix.fotoCuenta();
		formContractsix.accountNumber("1111000000333");
		formContractsix.cci("11100032233333300445");
		formContractsix.nextOneContract();
		formContractsix.linkagePolice();
		formContractsix.comment("Conforme");
		formContractsix.saveContract(); //Guardar
	//	formContracttwo.upcontact();
	//	formContractsix.customerListn();//nuevo listando
	//	formContractsix.customerPage2();
	//	formContract.saveContract();
	
		
		FormSignature formSignature = formContractsix.nextContract();
		
		
//		FormCustomersix formCustomersix = formContractsix.bsaveContract();
		
		
	}
	
	
}
