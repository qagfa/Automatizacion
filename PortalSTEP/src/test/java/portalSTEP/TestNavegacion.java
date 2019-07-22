package portalSTEP;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import bootpackage.PageObjects;
import bootpackage.claseConexion;
import io.qameta.allure.Step;

public class TestNavegacion extends claseConexion {

	claseConexion conexion = new claseConexion();
	//PageObjects objects = new PageObjects();

	@Parameters({ "browser" })
	@BeforeClass
	public void Conexion(String browser) throws InterruptedException, MalformedURLException {
		iniciarVariables();
		System.out.println(browser);
		if (browser.equalsIgnoreCase("firefox")) {
			ConexionFirefox();
		} else if (browser.equalsIgnoreCase("edge")) {
			ConexionEdge();
		} else if (browser.equalsIgnoreCase("chrome")) {

			ConexionChrome();
		}
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}

	@Step
	public void navegarANuestrosServicios() {
		//driver.findElement(objects.navegarANuestrosServicios()).click();
				//By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/a")).click();
	}

	@Step
	public void navegarAPromociones() {
		driver.findElement(By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[4]")).click();
	}

	@Step
	public void navegarALegal() {
		driver.findElement(By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[5]/a")).click();
	}
	
	//////////////////////////////////////////////////////

	@Step
	@Test(priority = 11)
	public void navegarAInicio() {
		driver.findElement(By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[1]/a")).click();
	}
	
	@Step
	@Test(priority = 0)
	public void navegarAServicioExpres() {
		navegarANuestrosServicios();
		driver.findElement(By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
	}

	@Step
	@Test(priority = 1)
	public void navegarAReenvioPaquetes() {
		navegarANuestrosServicios();
		driver.findElement(By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
	}

	@Step
	@Test(priority = 2)
	public void navegarAGuiasPrepagadas() {
		navegarANuestrosServicios();
		driver.findElement(By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/ul/li[3]/a")).click();
	}

	@Step
	@Test(priority = 3)
	public void navegarATarifas() {
		navegarANuestrosServicios();
		driver.findElement(By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/ul/li[4]/a")).click();
	}

	@Step
	@Test(priority = 4)
	public void navegarACobertura() {
		navegarANuestrosServicios();
		driver.findElement(By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/ul/li[5]/a")).click();
	}

	@Step
	@Test(priority = 5)
	public void navegarASucursales() {
		navegarANuestrosServicios();
		driver.findElement(By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[2]/ul/li[6]/a")).click();
	}

	@Step
	@Test(priority = 6)
	public void navegarAParcipaGana() {
		navegarAPromociones();
		driver.findElement(By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[4]/ul/li/a")).click();
	}

	@Step
	@Test(priority = 7)
	public void navegarAContratoAdhesion() {
		navegarALegal();
		driver.findElement(By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[5]/ul/li[1]/a")).click();
	}

	@Step
	@Test(priority = 8)
	public void navegarAValorDeclarado() {
		navegarALegal();
		driver.findElement(By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[5]/ul/li[2]/a")).click();
	}

	@Step
	@Test(priority = 9)
	public void navegarAQuienesSomos() {
		driver.findElement(By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[6]/a")).click();
	}

	@Step
	@Test(priority = 10)
	public void navegarAContactanos() {
		driver.findElement(By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[7]/a")).click();
	}

	@Step
	@Test(priority = 12)
	public void navegarADescargarCFDI() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[3]/a")).click();
		Thread.sleep(5000);
	}

	//////////////////////////////////////////////////////////////////////////////////
	
	@AfterMethod
	public void espera() throws InterruptedException {
		Thread.sleep(1000);
	}
	
	@AfterClass
	public void cerrarConexion() {
		driver.quit();
	}
}
