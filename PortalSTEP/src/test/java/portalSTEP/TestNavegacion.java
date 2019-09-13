package portalSTEP;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import bootpackage.PageObjects;
import bootpackage.claseConexion;
import io.qameta.allure.Step;

public class TestNavegacion extends claseConexion {

	public TestNavegacion(WebDriver driver) {
		this.driver = driver;
	}
	
	PageObjects PO;
	claseConexion conexion = new claseConexion();
	private static final Logger logger = LogManager.getLogger(TestNavegacion.class);

	//@BeforeClass
	public void Conexion(String browser) throws InterruptedException, MalformedURLException {
		iniciarVariables();
		if (browser.equalsIgnoreCase("firefox")) {
			ConexionFirefox();
		} else if (browser.equalsIgnoreCase("edge")) {
			ConexionEdge();
		} else if (browser.equalsIgnoreCase("chrome")) {
			ConexionChrome();
		}
		PO = new PageObjects(driver, getURL_PORTAL());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Step
	public void navegarANuestrosServicios() {
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/a")));
	}

	@Step
	public void navegarAPromociones() {
		PO.click((By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a")));
	}

	@Step
	public void navegarALegal() {
		PO.click((By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a")));
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Step
	@Test(priority = 12)
	public void navegarAInicio() {
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[1]/a")));
	}
	
	@Step
	@Test(priority = 1)
	public void navegarAServicioExpres() {
		navegarANuestrosServicios();
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/ul/li[1]/a")));
	}

	@Step
	@Test(priority = 2)
	public void navegarAReenvioPaquetes() {
		navegarANuestrosServicios();
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/ul/li[2]/a")));
	}

	@Step
	@Test(priority = 3)
	public void navegarAGuiasPrepagadas() {
		navegarANuestrosServicios();
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/ul/li[3]/a")));
	}

	@Step
	@Test(priority = 4)
	public void navegarATarifas() {
		navegarANuestrosServicios();
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/ul/li[4]/a")));
	}

	@Step
	@Test(priority = 5)
	public void navegarACobertura() {
		navegarANuestrosServicios();
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/ul/li[5]/a")));
	}

	@Step
	@Test(priority = 6)
	public void navegarASucursales() {
		navegarANuestrosServicios();
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/ul/li[6]/a")));
	}

	@Step
	@Test(priority = 7)
	public void navegarAParcipaGana() {
		navegarAPromociones();
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[4]/ul/li/a")));
	}

	@Step
	@Test(priority = 8)
	public void navegarAContratoAdhesion() {
		navegarALegal();
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[5]/ul/li[1]/a")));
	}

	@Step
	@Test(priority = 9)
	public void navegarAValorDeclarado() {
		navegarALegal();
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[5]/ul/li[2]/a")));
	}

	@Step
	@Test(priority = 10)
	public void navegarAQuienesSomos() {
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[6]/a")));
	}

	@Step
	@Test(priority = 11)
	public void navegarAContactanos() {
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[7]/a")));
	}

	@Step
	@Test(priority = 13)
	public void navegarADescargarCFDI() throws InterruptedException {
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[3]/a")));
		Thread.sleep(5000);
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Parameters({ "browser" })
	@Test(priority = 0)
	public void ejecutarConfiguracion(String browser) {
		logger.info(browser);
		try {
			Conexion(browser);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void espera() throws InterruptedException {
		Thread.sleep(1000);
	}
	
	@AfterClass
	public void cerrarConexion() {
		driver.quit();
	}
}