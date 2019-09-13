
package portalSTEP;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import bootpackage.PageObjects;
import bootpackage.claseConexion;

public class TestFormularioConcurso extends claseConexion {

	claseConexion conexion = new claseConexion();
	private static final Logger logger = LogManager.getLogger(TestFormularioConcurso.class);
	PageObjects PO;

	// @BeforeClass
	public void Conexion(String browser) throws InterruptedException, MalformedURLException {
		iniciarVariables();
		logger.info(browser);
		if (browser.equalsIgnoreCase("firefox")) {
			ConexionFirefox();
		} else if (browser.equalsIgnoreCase("edge")) {
			ConexionEdge();
		} else if (browser.equalsIgnoreCase("chrome")) {
			ConexionChrome();
		}
		PO = new PageObjects(driver, getURL_PORTAL());
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}

	@Parameters({ "browser" })
	@Test
	public void CargarArchivo(String browser) throws InterruptedException, MalformedURLException {
		Conexion(browser);
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[4]")));
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[4]/ul/li/a")));
		Thread.sleep(1000);
		PO.escribe((By.id("cont-capParticipa-nombreParticipante")), "Leo");
		PO.escribe((By.id("cont-capParticipa-correoParticipante")), "leo@hotmail.com");
		PO.escribe((By.id("cont-uploadParticipa-imagenParticipante")), "C:\\imagenes\\07_54_.png");
		Thread.sleep(500);
		PO.click((By.id("cont-alertParticipante-mensajeRegistro")));
		Thread.sleep(5000);
	}

	@AfterClass
	public void cerrarConexion() {
		driver.quit();
	}
}
