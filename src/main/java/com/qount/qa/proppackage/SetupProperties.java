package com.qount.qa.proppackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.ITestContext;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.paulhammant.ngwebdriver.NgWebDriver;
import com.qount.qa.utils.Utilities;

public class SetupProperties {	

		    protected WebDriver driver;// = new ChromeDriver();
		    protected JavascriptExecutor jsDriver;
		    protected FluentWait<WebDriver> wait;
		    protected NgWebDriver ngWebDriver;
		
			public static Properties dataProp;
			public static Properties prop;

			public static void SetupProper() throws IOException {
					prop = new Properties();
					File propFile = new File(System.getProperty("user.dir") + "\\src\\main\\java\\com\\qount\\qa\\config\\config.properties");
					FileInputStream fisa = new FileInputStream(propFile);
					prop.load(fisa);
					dataProp = new Properties();
					File dataPropFile = new File(System.getProperty("user.dir") + "\\src\\main\\java\\com\\qount\\qa\\testdata\\testdata.properties");
					FileInputStream fisb = new FileInputStream(dataPropFile);
					prop.load(fisb);			
/*					try {
						FileInputStream fisa = new FileInputStream(propFile);
						prop.load(fisa);
					} catch (Throwable e) {
						e.printStackTrace();
					}  
					try {
						FileInputStream Fisb = new FileInputStream(dataPropFile);
						dataProp.load(Fisb);
					} catch (Throwable e) {
						e.printStackTrace();
					}    */
	}
			}

