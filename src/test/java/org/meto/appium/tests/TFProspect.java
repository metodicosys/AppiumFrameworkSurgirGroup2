package org.meto.appium.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.lang.reflect.Method;
import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormContract;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormLogin;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;

public class TFProspect extends TestBase {
	FormLogin formLoging;
	FormProspect formProspect;
	FormCustomer formCustomer;
	FormBusiness formBusiness;
	FormRse formRse;
	FormProposal formProposal;
	FormContract formContract;
	
	
	@BeforeMethod
	public void beforeMethod(Method method) {
		formLoging = new FormLogin(driver);
		formProspect = new FormProspect(driver);
		formCustomer = new FormCustomer(driver);
		formBusiness = new FormBusiness(driver);
		formRse = new FormRse(driver);
		formProposal = new FormProposal(driver);
		formContract = new FormContract (driver);
		
	}
	
	@Test
	public static void Prospect() throws InterruptedException{
		FormProspect formProspect = new FormProspect(driver);
		formProspect.PropuestaButton();
	//	formProspect.ReturnButton();
		formProspect.PropuestaHome();
		formProspect.setNumDoc("99999327"); //41351769
		formProspect.Verificando();
		formProspect.setFecCaducidad("01/01/2030");
		formProspect.setFirstName("Testonexx Name");
		formProspect.setSecondName("Carla");
		formProspect.setSurName("Testlastname");
		formProspect.scrollDataAdd(); //baja hasta genero
	//	formProspect.pdown();
		formProspect.setSecondSureName("Torres");
		formProspect.setFecNa("01/03/1991");
	//	formProspect.avance();
	//	formProspect.scrollDataAdd();
		formProspect.setnMobile("990492438");
		formProspect.setnMail("metodicosys@gmail.com");
		
		//int n=1;
		for(int i=1; i<6; i++) {
			
		     switch (i) {            
		     case 1:
					formProspect.addProspect(); //adicionando prospecto
					//driver.findElement(By.xpath("//android.widget.TextView[@text='MIEMBRO 2']")).click();
					formProspect.addmemberTwo();
					formProspect.setNumDoc("99996318");//40653958
					formProspect.Verificando();
					formProspect.setFecCaducidad("01/01/2030");
					formProspect.setFirstName2("Testtwo Name");
					formProspect.setSecondName("TestSecondName");
					formProspect.setSurName("Testlastname");
				//	formProspect.scrollData();
					formProspect.cdown2(); // prospecto 2
					formProspect.avance();
					formProspect.setSecondSureName("Milla");
					formProspect.setFecNa("01/03/1991");
					//formProspect.avance();
					formProspect.setnMobile("990442838");
					formProspect.setnMail("pilargomez@gmail.com");
		    	    break;
             case 2: 
					formProspect.addProspect(); //adicionando prospecto
				//	driver.findElement(By.xpath("//android.widget.TextView[@text='MIEMBRO 3']")).click();
					formProspect.addmemberTree();
					formProspect.setNumDoc("99996345");//09786972
					formProspect.Verificando();
					formProspect.setFecCaducidad("01/01/2030");
					formProspect.setFirstName("TestTree");
					formProspect.setSecondName("Tania");
					formProspect.setSurName("Testlastname");
					formProspect.cdown2(); //prospecto 3
					formProspect.avance();
					formProspect.setSecondSureName("Montes");
					formProspect.setFecNa("01/03/1991");
				//	formProspect.avance();
					formProspect.setnMobile("990243838");
					formProspect.setnMail("anaromero@gmail.com");
		    	    break;
             case 3: 
					formProspect.addProspect(); //adicionando prospecto 4
					//driver.findElement(By.xpath("//android.widget.TextView[@text='MIEMBRO 4']")).click();
					formProspect.addmemberFour();
					formProspect.setNumDoc("99988656");//00108848
					formProspect.Verificando();
					formProspect.setFecCaducidad("01/01/2030");
					formProspect.setFirstName("TestFour");
					formProspect.setSecondName("TestSecondName");
					formProspect.setSurName("Testlastname");
					formProspect.cdown5(); //prospecto 4
					formProspect.avance();
					formProspect.setSecondSureName("Lopez");
					formProspect.setFecNa("01/03/1991");
				//	formProspect.avance();
					formProspect.setnMobile("990495738");
					formProspect.setnMail("voropeza@gmail.com");
		    	    break;
             case 4: 
					formProspect.addProspect(); //adicionando prospecto
					//driver.findElement(By.xpath("//android.widget.TextView[@text='MIEMBRO 4']")).click();
					formProspect.addmemberFive();
					formProspect.setNumDoc("99977537");//76827110
					formProspect.Verificando();
					formProspect.setFecCaducidad("01/01/2030");
					formProspect.setFirstName("TestFive");
					formProspect.setSecondName("Lina");
					formProspect.setSurName("Testlastname");
					formProspect.cdown3(); // prospecto 5
					formProspect.avance();
					formProspect.setSecondSureName("Lopez");
					formProspect.setFecNa("01/03/1991");
				//	formProspect.avance();
					formProspect.setnMobile("990493838");
					formProspect.setnMail("marcotorres@gmail.com");
		    	    break;
             case 5: 
					formProspect.addProspect(); //adicionando prospecto
					//driver.findElement(By.xpath("//android.widget.TextView[@text='MIEMBRO 5']")).click();
					formProspect.addmemberSix();
					formProspect.setNumDoc("99965412");//23229649
					formProspect.Verificando();
					formProspect.setFecCaducidad("01/01/2030");
					formProspect.setFirstName("TestSix");
					formProspect.setSecondName("Timo");
					formProspect.setSurName("Testlastname");
					formProspect.cdown4(); //prospecto 6
					formProspect.avance();
					formProspect.setSecondSureName("Garcia");
					formProspect.setFecNa("01/03/1991");
				//	formProspect.avance();
					formProspect.setnMobile("991193838");
					formProspect.setnMail("celesterosales@gmail.com");
		    	    break;
		    	    
             default: System.out.println("Agregue por otro lado");
         }
		}
		
		formProspect.continuarProspect();
		formProspect.scrollData();
	//	formProspect.checkAutorization();
		
		//Confirmar autorizacion del grupo
		for(int i=2; i<7; i++) {
			
		     switch (i) {            
		     case 2:
					formProspect.addmemberTwox();
					formProspect.checkAutorization();
		    	    break;
            case 3: 
					formProspect.addmemberTreex();
					formProspect.checkAutorization();
		    	    break;
            case 4: 
					formProspect.addmemberFourx();
					formProspect.checkAutorization();
		    	    break;
            case 5: 
					formProspect.addmemberFivex();
					formProspect.checkAutorization();
		    	    break;
            case 6: 
					formProspect.addmemberSixx();
					formProspect.checkAutorization();
		    	    break;
		    	    
            default: System.out.println("Terminó de validar");
        }
		}
		
		formProspect.continuarData();
		formProspect.continuaValid(); //primera continar
		FormCustomer formCustomer = formProspect.bcontinuarValid();// continuar validacion de prospecto
	//	FormCustomer formCustomer = formProspect.editMember();

			
		
		
	}
	
}
