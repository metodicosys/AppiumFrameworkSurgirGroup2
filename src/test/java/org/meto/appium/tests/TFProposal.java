package org.meto.appium.tests;

import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormContract;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormLogin;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFProposal extends TestBase{
	FormLogin formLogin;
	FormProspect formProspect;
	FormCustomer formCustomer;
	FormBusiness formBusiness;
	FormRse formRse;
	FormProposal formProposal;
	FormContract formContract;
	
	@BeforeMethod
	public void beforeMethod(Method method) {

		formLogin = new FormLogin(driver);
		formProspect = new FormProspect(driver);
		formCustomer = new FormCustomer(driver);
		formBusiness = new FormBusiness(driver);
		formRse = new FormRse(driver);
		formProposal = new FormProposal(driver);
		formContract = new FormContract(driver);
		
	}
	
	@Test
	public void TestProposal() throws InterruptedException{
		//FormProspect formProspect = formPage.localButtom();
		FormProposal formProposal = new FormProposal(driver);
		formProposal.amountguarantor("1500");
		formProposal.debtBtn();
		formProposal.swipeScreenOneProposal();
		formProposal.producto();
		formProposal.destinoPrest();
//		formProposal.fotoPresupuesto();
		formProposal.frecuenciaCuota();
		formProposal.cantidadCuota();
	//	formProposal.savePropos();
		formProposal.swipeScreenOneProposal();
		formProposal.savePropos();
		formProposal.calculaTasa();
		formProposal.calculaMonto();
		formProposal.btnCerrarRse();
		formProposal.swipeScreenOneProposal();
		formProposal.fecVencimiento("18/08/2024");
		formProposal.swipeScreenOneProposal();
	//	formProposal.savePropos();
		formProposal.seguroBasico();
		formProposal.seguroOptative();
		formProposal.swipeScreenOneProposal();
		//Beneficiario
		formProposal.addOptative();
		formProposal.tipoDocOptative();
		formProposal.numberDoc("31323334");
		formProposal.firstName("TESTA");
		formProposal.otherName("TESTB");
		formProposal.lastName("TESTC");
		formProposal.surName("TESTD");
		formProposal.avance1();
		formProposal.fecnaBeneficiaries("01/05/2000");
		formProposal.eCivil();
		formProposal.gender();
		formProposal.avance1();
		formProposal.telfBeneficiaries("990194545");
		formProposal.relationship();  // Parentesco
	////	formProposal.avance1();
		formProposal.seguroAsociado();
		formProposal.avancebeneseg();
		//formProposal.nexOneBeneficiaries(); // test
		formProposal.percentage("100");
		formProposal.saveBeneficiaries();
		formProposal.savePropos();
		
		FormContract formContract = formProposal.saveProposal();
		
	}
}
