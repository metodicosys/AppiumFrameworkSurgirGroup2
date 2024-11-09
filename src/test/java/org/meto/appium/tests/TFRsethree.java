package org.meto.appium.tests;

import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormBusinessthree;
import org.meto.appium.pages.FormBusinesstwo;
import org.meto.appium.pages.FormCustomer;
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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFRsethree extends TestBase{

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
	  FormCustomerthree formCustomerthree; 
	  FormBusinessthree formBusinessthree; 
	  FormRsethree formRsethree;
	  FormProposalthree formProposalthree;
	  
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
		  formCustomerthree = new FormCustomerthree(driver); 
		  formBusinessthree = new FormBusinessthree(driver); 
		  formRsethree = new FormRsethree(driver);
		  formProposalthree = new FormProposalthree(driver);
	}
	  
	  @Test public void TestRsethree() throws InterruptedException{ 
		  FormRsethree formRsethree = new FormRsethree(driver);
		  
		  formRsethree.autoComplit(); 
		  formRsethree.giro("VE"); 
		 // formRse.activeC1("10");

		  formRsethree.saveRse();
		//  formRse.btnNextRse();

		  FormProposalthree formProposalthree = formRsethree.btnNextRse();
		  
	  }
	  
}
