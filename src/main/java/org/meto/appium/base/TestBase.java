package org.meto.appium.base;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormLogin;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormSignature;
import org.meto.appium.utils.AppiumUtils;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class TestBase extends AppiumUtils{

	public static AndroidDriver driver;
	public static AppiumDriverLocalService service;
	public static FormLogin formLogin;
	public static FormProspect formProspect;
	public static FormCustomer formCustomer;
	public static FormBusiness formBusiness;
	public static FormBusiness formRse;
	public static FormSignature formSignature;
	
	@BeforeSuite
	//@BeforeClass
	public void setupg(ITestContext testContext)  throws IOException{
		Properties prop = new Properties();	
		service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//meto//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				                                                   
		.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		/*
		Properties prop = new Properties();	
		FileInputStream fim = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//org//meto//appium//resources//data.properties");
		prop.load(fim);
		String ipAdress = prop.getProperty("ipAddress");
		String port = prop.getProperty("port");
		
		service = startAppiumServer(ipAdress, Integer.parseInt(port));*/
		
		UiAutomator2Options optionsg = new UiAutomator2Options();
		optionsg.setPlatformName("Android");
		optionsg.setDeviceName("samsung SM-T575"); //Active 3
	//	optionsg.setDeviceName("samsung SM-T395"); //Active 2  samsung SM-T395
		optionsg.setUdid("RX2RB00S4HN"); //meto active 3 liberado xxxx
	//	optionsg.setUdid("RX2RC000F1E"); //meto 2  liberado
	//	optionsg.setUdid("RX2RB00RZDY");  // Carlos
	//	optionsg.setUdid("5200fa184e619579"); // active 2
		optionsg.setApp("com.android.contacts");
		optionsg.setAutomationName("UiAutomator2");
		optionsg.setCapability("ignoreHiddenApiPolicyError", true);
		optionsg.setCapability("enableMultiWindows", true);   // nuevo
	//	optionsg.setWaitForIdleTimeout(Duration.ofSeconds (30));
		optionsg.setCapability("setWaitForIdleTimeout",Duration.ofSeconds (30));
		optionsg.setCapability("noReset", false);
		optionsg.setCapability("autoGrantPermissions", "true");
		optionsg.setCapability("ignoreUnimporttantViews", true);
		optionsg.setCapability("allowInvisibleElements", true);
		
		optionsg.setChromedriverExecutable(System.getProperty("user.dir")+"//src//test//resources//driver//chromedriver");
		                                      
		optionsg.setApp(System.getProperty("user.dir")+"//src//test//resources//app//24-08-23_1102_Surgir_debug_6.4.1-generador-duc-firmas-QA-SSL-v2.apk");
	//	options.setApp(System.getProperty("user.dir")+"//src//test//resources//app//Surgir_debug_6.0.5_contract_duc_changes.apk"); //de 5 a 11

		optionsg.setAppWaitActivity("com.saucelabs.mydemoapp.rn.MainActivity"); //nuevo

		optionsg.setCapability("appWaitActivity", ".ui.login.LoginActivity,.ui.splash.SplashActivity");
		optionsg.setCapability("browserstack.networkLogs", "true");
		
	//	options.setCapability("browserstack.debug", "true");//activar los registros visuales de log

	//	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), options);
	//	driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), optionsg);
		driver = new AndroidDriver(service.getUrl(), optionsg);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		formLogin = new FormLogin(driver); 	
		formProspect = new FormProspect(driver); 
		//formCustomer = new FormCustomer(driver); 

	}
	

	@AfterSuite
	public void teardown() {
		 driver.quit();
		 service.stop();
		 service.close();
		 
	}

}
