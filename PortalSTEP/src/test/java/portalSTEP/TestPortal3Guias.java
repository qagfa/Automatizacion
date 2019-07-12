package portalSTEP;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import bootpackage.claseConexion;

public class TestPortal3Guias extends claseConexion {

	claseConexion conexion = new claseConexion();

	@Parameters({"browser"})
	@BeforeClass
	public void test3Conexion(String browser) throws InterruptedException {

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
		
		driver.quit();
	}
	
	@Test
	public void saludo() {
		System.out.println("hola");
	}
}
