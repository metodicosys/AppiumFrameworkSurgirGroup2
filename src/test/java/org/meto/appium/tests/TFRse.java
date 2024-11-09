package org.meto.appium.tests;

import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormLogin;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFRse extends TestBase{

	  FormLogin formLogin; 
	  FormProspect formProspect; 
	  FormCustomer formCustomer; 
	  FormBusiness formBusiness; 
	  FormRse formRse;
	  FormProposal formProposal;
	//  FormContract formContract;
	  
	  @BeforeMethod public void beforeMethod(Method method) {
		  
		  formLogin = new FormLogin(driver); 
		  formProspect = new FormProspect(driver);
		  formCustomer = new FormCustomer(driver); 
		  formBusiness = new FormBusiness(driver); 
		  formRse = new FormRse(driver);
		  formProposal = new FormProposal(driver);
		//  formContract = new FormContract (driver);
		  
	}
	  
	  @Test public void TestRse() throws InterruptedException{ 
		  FormRse formRse = new FormRse(driver);
		  
		  formRse.autoComplit(); 
		  formRse.giro("VE");
		  formRse.margenb();
		  formRse.ingmensual("10000");
		  formRse.swipeScreenOneRse();
		  formRse.gastoOp1("10");
		  formRse.gastoOp2("15"); 
		  formRse.gastoOp3("20"); 
		  formRse.gastoOp4("25");
		  formRse.gastoOp5("30"); 
		  formRse.gastoOp6("35"); 
		  formRse.gastoOp7("40");
		  formRse.swipeScreenOneRse();
		//  formRse.swipeScreenOneRse();
		  formRse.btnotroingreso();
		  formRse.swipeScreenOneRse();
		  formRse.otroIngreso("300");
		  formRse.fotoConstIngreso();
		  formRse.origenOtroIngreso();
		//  formRse.swipeScreenOneRse();
		  formRse.gastoFam8("45");
		  formRse.gastoFam9("50");
		  formRse.swipeScreenOneRse();
		  formRse.gastoFam10("55");
		  formRse.gastoFam11("60");
		  formRse.gastoFam12("65");
		  formRse.gastoFam13("70");
		  formRse.gastoFam14("75");
		  formRse.gastoFam15("80");
		//  formRse.swipeScreenOneRse();
		  formRse.gastoFam16("85");
		  formRse.saveRse();
		//  formRse.btnNextRse();

		  FormProposal formProposal = formRse.btnNextRse();
		  
	  }
	  
}
