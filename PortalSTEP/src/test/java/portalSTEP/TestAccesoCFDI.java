package portalSTEP;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import bootpackage.claseConexion;
import io.qameta.allure.Step;

public class TestAccesoCFDI  extends claseConexion {

	claseConexion conexion = new claseConexion();
	  private static final Logger log = LogManager.getLogger(TestAccesoCFDI.class);

	@Step //BeforeClass
	public void Conexion(String browser) throws InterruptedException, MalformedURLException {
		BasicConfigurator.configure();
		iniciarVariables();
		log.info(browser);
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
	public void AccediendoCFDI(String browser) throws InterruptedException, MalformedURLException {//id[Div2=bs-example-navbar-collapse-1]
		Conexion(browser);
		driver.findElement(By.xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[3]/a")).click();
		Thread.sleep(10000);
		log.info(driver.getTitle());
		for(String handles : driver.getWindowHandles()) {
			driver.switchTo().window(handles);
			log.info(driver.getCurrentUrl());
		}	
	}
	
	@AfterClass
	public void cerrarSesion() {
		driver.quit();
	}
}