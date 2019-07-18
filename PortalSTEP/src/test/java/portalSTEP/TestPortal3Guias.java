package portalSTEP;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import bootpackage.claseConexion;

public class TestPortal3Guias extends claseConexion {

	claseConexion conexion = new claseConexion();
	 WebDriver driverNodo;
    String baseURL, nodeURL;
	
	@Parameters({"browser"})
	@BeforeClass
	public void test3Conexion(String browser) throws InterruptedException, MalformedURLException {

		iniciarVariables();
		System.out.println(browser);
		if(browser.equalsIgnoreCase("firefox")) {

			ConexionFirefox();
		}		
		else if(browser.equalsIgnoreCase("edge")){

			ConexionEdge();
		}
		else if(browser.equalsIgnoreCase("chrome")){

			ConexionChrome();
		}
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		 baseURL = getURL_PORTAL();
         nodeURL = "http://192.168.32.33:4444/wd/hub";
         DesiredCapabilities capability = DesiredCapabilities.chrome();
         capability.setBrowserName("chrome");
         capability.setPlatform(Platform.WIN10);
         driverNodo = new RemoteWebDriver(new URL(nodeURL), capability);

         driverNodo.get(baseURL);
	}
	
	@Test
	public void saludo() {
		System.out.println("hola");
		
	}
	
	@AfterClass
	public void cerrarConexion() {

		driver.quit();
		driverNodo.quit();
	}
	
	/*
	 WebDriver driver;
     String baseURL, nodeURL;

     @BeforeTest
     public void setUp() throws MalformedURLException {
         baseURL = "http://demo.guru99.com/test/guru99home/";
         nodeURL = "http://192.168.43.223:4444/wd/hub";
         DesiredCapabilities capability = DesiredCapabilities.chrome();
         capability.setBrowserName("chrome");
         capability.setPlatform(Platform.WIN10);
         driverNodo = new RemoteWebDriver(new URL(nodeURL), capability);
     }

     @AfterTest
     public void afterTest() {
         driver.quit();
     }
     @Test
     public void sampleTest() {
         driverNodo.get(baseURL);
         driver.get(baseURL);

         if (driver.getPageSource().contains("MOBILE TESTING")) {
             Assert.assertTrue(true, "Mobile Testing Link Found");
         } else {
             Assert.assertTrue(false, "Failed: Link not found");
         }

     }
	 * */
}
