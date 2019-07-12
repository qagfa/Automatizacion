package bootpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class claseConexion {

	public String DRIVER_PATH_FIREFOX;
	public String PROPERTY_PATH_FIREFOX;
	
	public String DRIVER_PATH_CHROME;
	public String PROPERTY_PATH_CHROME;
	
	public String DRIVER_PATH_EDGE;
	public String PROPERTY_PATH_EDGE;
	
	public String URL_PORTAL = "http://qa-envios.primeraplus.com/";
	public WebDriver driver;
	
///////////////////////////////////////////////////////////////////////////////////

	public void iniciarVariables() {
		
		setDRIVER_PATH_CHROME("C:\\Users\\le.loza\\Downloads\\Drivers\\chromedriver.exe");
		setPROPERTY_PATH_CHROME("webdriver.chrome.driver");

		setDRIVER_PATH_FIREFOX("C:\\Users\\le.loza\\Downloads\\Drivers\\geckodriver.exe");
		setPROPERTY_PATH_FIREFOX("webdriver.gecko.driver");
		
		setDRIVER_PATH_EDGE("C:\\Users\\le.loza\\Downloads\\Drivers\\Otra\\MicrosoftWebDriver.exe");
		setPROPERTY_PATH_EDGE("webdriver.edge.driver");
		
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
	public void ConexionChrome() {
		
		String exePath;
		String propertyPath;
		
		exePath = getDRIVER_PATH_CHROME();
		propertyPath = getPROPERTY_PATH_CHROME();
		
		System.setProperty(propertyPath, exePath);
		driver = new ChromeDriver();
		driver.get(getURL_PORTAL());
	}
	
///////////////////////////////////////////////////////////////////////////////////

	public void ConexionFirefox() {
		
		String exePath;
		String propertyPath;
		
		exePath = getDRIVER_PATH_FIREFOX();
		propertyPath = getPROPERTY_PATH_FIREFOX();
		
		System.setProperty(propertyPath, exePath);
		driver = new FirefoxDriver();
		driver.get(getURL_PORTAL());
	}
	
///////////////////////////////////////////////////////////////////////////////////

	public void ConexionEdge() {
		
		String exePath;
		String propertyPath;
		
		exePath = getDRIVER_PATH_EDGE();
		propertyPath = getPROPERTY_PATH_EDGE();
		
		System.setProperty(propertyPath, exePath);
		driver = new EdgeDriver();
		driver.get(getURL_PORTAL());
	}

	public void ConexionSafari() {
		
		driver = new SafariDriver();
		driver.get(getURL_PORTAL());
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
	public String getDRIVER_PATH_FIREFOX() {
		return DRIVER_PATH_FIREFOX;
	}

	public void setDRIVER_PATH_FIREFOX(String DRIVER_PATH_FIREFOX) {
		this.DRIVER_PATH_FIREFOX = DRIVER_PATH_FIREFOX;
	}
	
	public String getPROPERTY_PATH_FIREFOX() {
		return PROPERTY_PATH_FIREFOX;
	}

	public void setPROPERTY_PATH_FIREFOX(String PROPERTY_PATH_FIREFOX) {
		this.PROPERTY_PATH_FIREFOX = PROPERTY_PATH_FIREFOX;
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
	public String getDRIVER_PATH_CHROME() {
		return DRIVER_PATH_CHROME;
	}

	public void setDRIVER_PATH_CHROME(String DRIVER_PATH_CHROME) {
		this.DRIVER_PATH_CHROME = DRIVER_PATH_CHROME;
	}

	public String getPROPERTY_PATH_CHROME() {
		return PROPERTY_PATH_CHROME;
	}

	public void setPROPERTY_PATH_CHROME(String PROPERTY_PATH_CHROME) {
		this.PROPERTY_PATH_CHROME = PROPERTY_PATH_CHROME;
	}
	
///////////////////////////////////////////////////////////////////////////////////

	public String getDRIVER_PATH_EDGE() {
		return DRIVER_PATH_EDGE;
	}

	public void setDRIVER_PATH_EDGE(String DRIVER_PATH_EDGE) {
		this.DRIVER_PATH_EDGE = DRIVER_PATH_EDGE;
	}

	public String getPROPERTY_PATH_EDGE() {
		return PROPERTY_PATH_EDGE;
	}

	public void setPROPERTY_PATH_EDGE(String PROPERTY_PATH_EDGE) {
		this.PROPERTY_PATH_EDGE = PROPERTY_PATH_EDGE;
	}
	
///////////////////////////////////////////////////////////////////////////////////

	public String getURL_PORTAL() {
		return URL_PORTAL;
	}

	public void setURL_PORTAL(String uRL_PORTAL) {
		URL_PORTAL = uRL_PORTAL;
	}
	
	
}
