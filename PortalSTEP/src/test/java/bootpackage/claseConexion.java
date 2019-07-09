package bootpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class claseConexion {

	public String DRIVER_PATH_FIREFOX = "";
	public String PROPERTY_PATH_FIREFOX = "webdriver.gecko.driver";
	public String DRIVER_PATH_CHROME = "";
	public String PROPERTY_PATH_CHROME = "webdriver.chrome.driver";
	
	public String URL_PORTAL = "http://qa-envios.primeraplus.com/";
	public WebDriver driver;
	
	public void ConexionChrome() {
		
		String exePath;
		String propertyPath;
		
		exePath = getDRIVER_PATH_CHROME();
		propertyPath = "";
		
		
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new SafariDriver();
		driver.get(getURL_PORTAL());
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getDRIVER_PATH_FIREFOX() {
		return DRIVER_PATH_FIREFOX;
	}
	public void setDRIVER_PATH_FIREFOX(String driver_path_firefox) {
		DRIVER_PATH_FIREFOX = driver_path_firefox;
	}
	
	public String getDRIVER_PATH_CHROME() {
		return DRIVER_PATH_CHROME;
	}
	
	public void setDRIVER_PATH_CHROME(String driver_path_chrome) {
		DRIVER_PATH_CHROME = driver_path_chrome;
	}
	
	public String getURL_PORTAL() {
		return URL_PORTAL;
	}
	
	public void setURL_PORTAL(String url_portal) {
		URL_PORTAL = url_portal;
	}
}
