package portalSTEP;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import bootpackage.claseConexion;

public class TestFormularioConcurso extends claseConexion {

	claseConexion conexion = new claseConexion();

	//@BeforeClass
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


	@Parameters({ "browser" })
	@Test
	public void CargarArchivo(String browser) throws InterruptedException, MalformedURLException {
		Conexion(browser);
		
		WebElement navegar1 = driver
				.findElement(By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[4]"));

		navegar1.click();

		WebElement navegar2 = driver
				.findElement(By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[4]/ul/li/a"));

		navegar2.click();

		Thread.sleep(1000);

		WebElement nombre = driver.findElement(By.id("cont-capParticipa-nombreParticipante"));

		WebElement correo = driver.findElement(By.id("cont-capParticipa-correoParticipante"));

		WebElement uploadElement = driver.findElement(By.id("cont-uploadParticipa-imagenParticipante"));

		Thread.sleep(1000);

		nombre.sendKeys("Leo");
		correo.sendKeys("leo@hotmail.com");

		// 
		uploadElement.sendKeys("C:\\imagenes\\07_54_.png");

		// 
		driver.findElement(By.id("cont-alertParticipante-mensajeRegistro")).click();
		Thread.sleep(5000);
	}

	@AfterClass
	public void cerrarConexion() {
		driver.quit();
	}
}
