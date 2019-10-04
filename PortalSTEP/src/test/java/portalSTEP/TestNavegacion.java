package portalSTEP;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
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
	public void navegarAInicio() {
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[1]/a")));
	}
	
	@Step
	public void navegarAServicioExpres() {
		navegarANuestrosServicios();
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/ul/li[1]/a")));
	}

	@Step
	public void navegarAReenvioPaquetes() {
		navegarANuestrosServicios();
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/ul/li[2]/a")));
	}

	@Step
	public void navegarAGuiasPrepagadas() {
		navegarANuestrosServicios();
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/ul/li[3]/a")));
	}

	@Step
	public void navegarATarifas() {
		navegarANuestrosServicios();
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/ul/li[4]/a")));
	}

	@Step
	public void navegarACobertura() {
		navegarANuestrosServicios();
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/ul/li[5]/a")));
	}

	@Step
	public void navegarASucursales() {
		navegarANuestrosServicios();
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/ul/li[6]/a")));
	}

	@Step
	public void navegarAParcipaGana() {
		navegarAPromociones();
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[4]/ul/li/a")));
	}

	@Step
	public void navegarAContratoAdhesion() {
		navegarALegal();
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[5]/ul/li[1]/a")));
	}

	@Step
	public void navegarAValorDeclarado() {
		navegarALegal();
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[5]/ul/li[2]/a")));
	}

	@Step
	public void navegarAQuienesSomos() {
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[6]/a")));
	}

	@Step
	public void navegarAContactanos() {
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[7]/a")));
	}

	@Step
	public void navegarADescargarCFDI() throws InterruptedException {
		PO.click((By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[3]/a")));
		Thread.sleep(5000);
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@DataProvider(name = "dp")
	public Object[][] dp() {
		return new Object[][] { new Object[] { "firefox" }, new Object[] { "chrome" }, new Object[] { "edge" }, };
	}

	@Test(dataProvider = "dp")
	public void ejecutarConfiguracion(String browser) throws InterruptedException {
		logger.info(browser);
		try {
			Conexion(browser);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		navegarAServicioExpres();
		
		navegarAReenvioPaquetes();
		
		navegarAGuiasPrepagadas();
		
		navegarATarifas();
		
		navegarACobertura();
		
		navegarASucursales();
		
		navegarAParcipaGana();
		
		navegarAContratoAdhesion();
		
		navegarAValorDeclarado();
		
		navegarAQuienesSomos();
		
		navegarAContactanos();
		
		navegarAInicio();
		
		navegarADescargarCFDI();
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