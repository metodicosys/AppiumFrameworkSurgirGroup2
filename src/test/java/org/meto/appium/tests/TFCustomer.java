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


public class TFCustomer extends TestBase {
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
	public void TestCustomer() throws InterruptedException{
		FormCustomer formCustomer = new FormCustomer(driver);
		formCustomer.Customer();
	//	formCustomer.Contingen();//contingencia
		formCustomer.fotoExperian();
		formCustomer.fotofrenteDni();
		formCustomer.fotoreversoDni();
		formCustomer.fotoCliente();
		formCustomer.bajarg("Profesión u ocupación");
		formCustomer.gradoInstruccion();
		formCustomer.profesionN();
		formCustomer.estadoCivil("SOLTERO");
		formCustomer.iletrado(false);
	//	formCustomer.bajarg("¿Tienes WathsApp?");
		formCustomer.swipeScreenOneCustomer();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.prePago();
		formCustomer.operadorTelef();
	//	formCustomer.nextdomiciliog();
		formCustomer.swipeScreenOneCustomer();
	//	formCustomer.swipeScreenOneCustomer();
		formCustomer.tipodeComprobante();
		formCustomer.fotoComprobanteDomicilio();
		formCustomer.swipeScreenOneCustomer();
	//	formCustomer.saveCustomer();
		formCustomer.departamentos();
		formCustomer.provincias();
//		formCustomer.swipeScreenOneCustomer();
		formCustomer.urbanizacion("mi urbanizacion test");
		formCustomer.distritos();
		formCustomer.nomDireccion("mi direccionx");
		formCustomer.tipoVia();
		formCustomer.numExterior("432");
		formCustomer.numInterior("6");
		formCustomer.swipeScreenOneCustomer();
		formCustomer.permanenciaAnios();
		formCustomer.referenciaUbic("mi referencia ubic");
		formCustomer.personaenDomicilio();
		formCustomer.swipeScreenOneCustomer();	
		formCustomer.casaqueHabita();
	//	formCustomer.numeroDependient("1");
		formCustomer.otrotipoDomicilio("choza");
		formCustomer.swipeScreenOneCustomer();	
		//En grupal no debe tener tipo de patrimonio en tab cliente
		/*
		formCustomer.tipoPatrimon();
		formCustomer.fotoHeritage(); /// nuevo
		formCustomer.valorPatrim("50000");
		formCustomer.swipeScreenOneCustomer();
		*/
		formCustomer.tipoReferencia();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.nameReferenc("Test");
	//	formCustomeri.swipeScreenOneCustomer();
		formCustomer.lastNameRef("Test");
		formCustomer.cellReferenc("964636765");
		formCustomer.saveCustomer();
	//	formCustomer.nextCustomer();
		FormBusiness formBusiness = formCustomer.nextCustomer1();

		
	}


	
/*
@Test	public void Domicilio() throws InterruptedException{
		FormCustomer formCustomerg = new FormCustomer(driver);
		formCustomerg.tipodeComprobante();
		formCustomerg.fotoComprobanteDomicilio();
		formCustomerg.saveCustomer(); // nuevo
		formCustomerg.swipeScreenOneCustomer();
		formCustomerg.departamentos();
		formCustomerg.provincias();
		formCustomerg.urbanizacion("mi urbanizacion test");
		formCustomerg.distritos();
		formCustomerg.saveCustomer();
		formCustomerg.nomDireccion("mi direccionx");
		formCustomerg.tipoVia();
		formCustomerg.saveCustomer();
		formCustomerg.swipeScreenOneCustomer();
		//formCustomerg.nextfivCustomer();
		formCustomerg.numExterior("432");
		formCustomerg.numInterior("6");
		formCustomerg.permanenciaAnios();
		formCustomerg.referenciaUbic("mi referencia ubic");
		formCustomerg.personaenDomicilio();
		formCustomerg.swipeScreenOneCustomer();
	
	//	FormBusiness formBusiness = formCustomer.nextCustomer();
		
	}
	*/

}
