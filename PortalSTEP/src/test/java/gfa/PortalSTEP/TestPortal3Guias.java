package gfa.PortalSTEP;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPortal3Guias {

	@BeforeTest
	public void iniciarConexion() {
		
	}
	
	@Test
	public void introduceGuia() {
		System.out.println("Hola");
	}
	
	@AfterTest
	public void cerrarConexion() {
		
	}
}
