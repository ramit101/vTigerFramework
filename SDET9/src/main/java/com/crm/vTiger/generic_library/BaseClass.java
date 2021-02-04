package com.crm.vTiger.generic_library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public FileUtility flib=new FileUtility();
	public JavaUtility javaLib= new JavaUtility();
	public ExcelUtility excelLib= new ExcelUtility();
    public WebDriverUtils	webutl=new WebDriverUtils();
	public WebDriver driver;
	
	                                                                           /*applicable in jdbc connection*/
@BeforeSuite
public void startConnection(){
	
}
                                                                            /*applicable in crossbrowsertesting*/
@BeforeTest

public void startcbt(){
	
}

                                                                                     /*launching the browser*/
@BeforeClass
public void launchBrowser() throws Throwable {
	
String BROWSER = flib.getPropertyValue("browser");                //        run time polymorphism Ex.
if(BROWSER.equalsIgnoreCase("chrome")) {
	driver=new ChromeDriver();
 }
else if(BROWSER.equalsIgnoreCase("firefox")) {
	driver=new FirefoxDriver();
 }
else if(BROWSER.equalsIgnoreCase("ie")) {
	driver=new InternetExplorerDriver();
 }
driver.manage().window().maximize();
webutl.waitForHTMLDOM(driver);


}
                                                                                     /*login in to application*/
@BeforeMethod
public void logintoAppl() throws Throwable{
	driver.get(flib.getPropertyValue("url"));
}
                                   /*logout from application*/
@AfterMethod
public void logoutAppl(){
	System.out.println("app logged out ");
}
                                  /*close the browser*/
@AfterClass
public void closeBrowser(){
	driver.close();
}
                                 /*close database connection*/
@AfterSuite
public void closeConnection(){
	
}
}
