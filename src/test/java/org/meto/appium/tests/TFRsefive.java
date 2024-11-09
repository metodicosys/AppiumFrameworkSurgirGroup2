package org.meto.appium.tests;

import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormBusinessfive;
import org.meto.appium.pages.FormBusinessfour;
import org.meto.appium.pages.FormBusinessthree;
import org.meto.appium.pages.FormBusinesstwo;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormCustomerfive;
import org.meto.appium.pages.FormCustomerfour;
import org.meto.appium.pages.FormCustomerthree;
import org.meto.appium.pages.FormCustomertwo;
import org.meto.appium.pages.FormLogin;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProposalfive;
import org.meto.appium.pages.FormProposalfour;
import org.meto.appium.pages.FormProposalthree;
import org.meto.appium.pages.FormProposaltwo;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.meto.appium.pages.FormRsefive;
import org.meto.appium.pages.FormRsefour;
import org.meto.appium.pages.FormRsethree;
import org.meto.appium.pages.FormRsetwo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFRsefive extends TestBase{

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
	  FormCustomerfour formCustomerfour; 
	  FormBusinessfour formBusinessfour;   
	  FormRsefour formRsefour;
	  FormProposalfour formProposalfour;
	  FormCustomerfive formCustomerfive; 
	  FormBusinessfive formBusinessfive;   
	  FormRsefive formRsefive;
	  FormProposalfive formProposalfive;
	  
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
		  formRsefour = new FormRsefour(driver);
		  formProposalfour = new FormProposalfour(driver);
		  formRsefive = new FormRsefive(driver);
		  formProposalfive = new FormProposalfive(driver);
	}
	  
	  @Test public void TestRsefive() throws InterruptedException{ 
		  FormRsefive formRsefive = new FormRsefive(driver);
		  
		  formRsefive.autoComplit(); 
		  formRsefive.giro("VE"); 
		 // formRse.activeC1("10");

		  formRsefive.saveRse();
		//  formRse.btnNextRse();

		  FormProposalfive formProposalfive = formRsefive.btnNextRsef();
		  
	  }
	  
}
