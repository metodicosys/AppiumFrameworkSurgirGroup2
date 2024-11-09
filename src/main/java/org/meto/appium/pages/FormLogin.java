package org.meto.appium.pages;

import java.time.Duration;

import org.meto.appium.utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.DefaultElementByBuilder;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;

public class FormLogin extends AndroidActions{
	
	AndroidDriver driver;
	
	public FormLogin(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	//	PageFactory.initElements(new AppiumElementLocatorFactory(decoratedAppiumDriver, Duration.ofSeconds(1), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

	}
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Usuario']")
	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement nameUser;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Contraseña']")
	private WebElement namePass;
	
//	@AndroidFindBy(xpath="//android.widget.EditText[@text='gender']")
	//private WebElement maleOption;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnLogin")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnLogin")
	public WebElement loginButton;
	
	// Sesion Local
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Agencia']")).click();
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Agencia']")
	private WebElement agencySelection;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Rol']")
	private WebElement rolSelection;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnLoginRol")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnLoginRol")
	public WebElement rolButton;
	
	//Login local
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Nueva contraseña local']")).sendKeys("Prueba1234");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Nueva contraseña local']")
	public WebElement claveLocal1;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Confirmación de contraseña local']")).sendKeys("Prueba1234");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Confirmación de contraseña local']")
	public WebElement claveConfLocal;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnIngresar")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnIngresar")
	public WebElement localButton;
	
	//Home
//	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/rlPropuesta")
//	private WebElement propuestaButton;
	
//	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/icon_return_home")
//	private WebElement returnButton;
	
//	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnPropuestaHome")
//	private WebElement propuestaHome;
	
	
	public void setNameUser(String name) {
		nameUser.sendKeys(name);
		//driver.hideKeyboard();
		
	}

	public void setNamePass(String pass) {
		namePass.sendKeys(pass);
	}

	/*
	public void setGender(String gender) {
		if (gender.contains("female"))
			femaleOption.click;
		else
			maleOption.click;
	}*/
		
	public void setSubmitLogin() {
		loginButton.click();
	}
	
	/*
	public void setAgencySelection(String agencyName) {
		agencySelection.click();
		scrollToText(agencyName);
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+agencyName+"']")).click();
	}*/
	
	public void setAgencySelection(String agencyName) {
		agencySelection.click();
		touchAgencia(agencyName);
	
		
	}
	
	public void setRolSelection(String rolName) {
		rolSelection.click();
		touchRol(rolName);
		
	}
	
	public void setSubmitRol() {
		rolButton.click();
		
	}
	
	public void setClaveLocal1(String passloc1) {
		claveLocal1.sendKeys(passloc1);
		
	}
	
	public void setClaveConfLocal(String passConfirm) {
		claveConfLocal.sendKeys(passConfirm);;
		
	}
	
	
	public FormProspect localButton(){
		localButton.click();
		//Thread.sleep(20000);
		
		return new FormProspect(driver);
		
	}
	
	
	
}
