package portalSTEP;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import bootpackage.claseConexion;
import io.qameta.allure.Step;

public class TestEnlacesRotos extends claseConexion {

	claseConexion conexion = new claseConexion();
	private static final Logger logger = LogManager.getLogger(TestEnlacesRotos.class.getPackageName());

	@Step
	public static String linkBroken(URL url, int i) throws Exception {
		String response = "";
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		try {
			connection.connect();
			response = connection.getResponseMessage();
			connection.disconnect();
			i += i;
			return response;
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Step
	public void Conexion(String browser) throws InterruptedException, MalformedURLException {
		// BasicConfigurator.configure();
		iniciarVariables();
		logger.info(browser);
		if (browser.equalsIgnoreCase("firefox")) {
			ConexionFirefox();
		} else if (browser.equalsIgnoreCase("edge")) {
			ConexionEdge();
		} else if (browser.equalsIgnoreCase("chrome")) {
			ConexionChrome();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Parameters({ "browser" })
	@Test
	public void ProbandoEnlaces(String browser) throws MalformedURLException, InterruptedException {
		Conexion(browser);
		int i = 0;
		List<WebElement> images = findLink(driver);
		logger.info("Total= " + images.size());
		for (WebElement element : images) {
			try {
				if (linkBroken(new URL(element.getAttribute("href")), i).contentEquals("OK")) {
					logger.info("URL: " + element.getAttribute("href") + " responde: "
							+ linkBroken(new URL(element.getAttribute("href")), 1) + "  ");// ✓
				} else {
					logger.error("URL: " + element.getAttribute("href") + " ¡Fallo! excepcion: "
							+ linkBroken(new URL(element.getAttribute("href")), i) + " X ");
					i++;
				}
			} catch (Exception e) {
				//logger.error( "El enlace " + element.getAttribute("innerHTML") + " " + e.getMessage());
				//"El enlace " + element.getAttribute("innerHTML") + " No pertenece a una URL "
				//		+ e.getMessage() + " X ");
				i++;
			}
		}
		logger.error(i);
		i = 0;
		images.clear();
		logger.info("Prueba finalizada");
	}

	@Step
	public static List<WebElement> findLink(WebDriver driver) {
		List<WebElement> elemenstList = new ArrayList<WebElement>();
		elemenstList = driver.findElements(By.tagName("a"));
		elemenstList.addAll(driver.findElements(By.tagName("img")));
		List<WebElement> finalList = new ArrayList<WebElement>();
		try {
				for (WebElement element : elemenstList) {
				if (element.getAttribute("href") != null) {
					finalList.add(element);
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return finalList;
	}

	@AfterClass
	public void cerrarConexion() {
		driver.quit();
	}
}