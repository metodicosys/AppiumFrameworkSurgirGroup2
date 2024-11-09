package org.meto.appium.tests;

import java.lang.reflect.Method;
import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormLogin;
import org.meto.appium.pages.FormProspect;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TFLogin extends TestBase {
	FormLogin formLogin;
	FormProspect formProspect;
	FormCustomer formCustomer;
//	FormBusiness formBusiness;
	
	@BeforeMethod
	public void beforeMethod(Method method) {
		
		formLogin = new FormLogin(driver);
		formProspect = new FormProspect(driver);
		formCustomer = new FormCustomer(driver);
//		formBusiness = new FormBusiness(driver);
		
		
	}

	@Test
	public void FormLogin() throws InterruptedException{
		//FormPage formPage = new FormPage(driver);
	//	ExtentTest test = extent.createTest("Initial Test");
		formLogin.setNameUser("asesorqa6"); //asesorqa6
		formLogin.setNamePass("Surgir02*");
		formLogin.setSubmitLogin();
		formLogin.setAgencySelection("Agencia");
		formLogin.setRolSelection("Rol");
		formLogin.setSubmitRol();
		formLogin.setClaveLocal1("Prueba1234");
		formLogin.setClaveConfLocal("Prueba1234");
		
		FormProspect formProspect = formLogin.localButton();
	
			
		
	}

/*
	@Test
	public void FillCustomer(){
		//FormCustomer formCustomer = formProspect.bcontinuarValid();
		//	formCustomer.bcontinuarValid();
		formCustomer.Customer();
		formCustomer.fotoExperian();
		formCustomer.fotofrenteDni();
		
	}*/
	
	
	@BeforeMethod(alwaysRun=true)
	public void preSetup()
		{
			//TFLogin.setActivity();
		
	}
	

	
	
	
}
