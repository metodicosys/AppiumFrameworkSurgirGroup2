package org.meto.appium.tests;

import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormBusinesstwo;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormCustomertwo;
import org.meto.appium.pages.FormLogin;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProposaltwo;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.meto.appium.pages.FormRsetwo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFRsetwo extends TestBase{

	  FormLogin formLogin; 
	  FormProspect formProspect; 
	  FormCustomer formCustomer; 
	  FormBusiness formBusiness; 
	  FormRse formRse;
	  FormProposal formProposal;
	//  FormContract formContract;
	  FormCustomertwo formCustomertwo; 
	  FormBusinesstwo formBusinesstwo; 
	  FormRsetwo formRsetwo;
	  FormProposaltwo formProposaltwo;
	  
	  @BeforeMethod public void beforeMethod(Method method) {
		  
		  formLogin = new FormLogin(driver); 
		  formProspect = new FormProspect(driver);
		  formCustomer = new FormCustomer(driver); 
		  formBusiness = new FormBusiness(driver); 
		  formRse = new FormRse(driver);
		  formProposal = new FormProposal(driver);
		//  formContract = new FormContract (driver);
		  formCustomertwo = new FormCustomertwo(driver); 
		  formBusinesstwo = new FormBusinesstwo(driver); 
		  formRsetwo = new FormRsetwo(driver);
		  formProposaltwo = new FormProposaltwo(driver);
	}
	  
	  @Test public void TestRsetwo() throws InterruptedException{ 
		  FormRsetwo formRsetwo = new FormRsetwo(driver);
		  formRsetwo.Rseup();
		  
		  formRsetwo.autoComplit(); 
		  formRsetwo.giro("VE"); 
		 // formRse.activeC1("10");

		  formRsetwo.saveRse();
		//  formRse.btnNextRse();

		  FormProposaltwo formProposaltwo = formRsetwo.btnNextRse();
		  
	  }
	  
}
