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
	
	public String URL_PORTAL = "http://qa-envios.primeraplus.com.mx/";
	public WebDriver driver;
	
///////////////////////////////////////////////Rutas///////////////////////////////////////////////////////////////

	public void iniciarVariables() {
		
		setDRIVER_PATH_CHROME("C:\\selenium\\drivers\\chromedriver.exe");
		setPROPERTY_PATH_CHROME("webdriver.chrome.driver");

		setDRIVER_PATH_FIREFOX("C:\\selenium\\drivers\\geckodriver.exe");
		setPROPERTY_PATH_FIREFOX("webdriver.gecko.driver");
		
		setDRIVER_PATH_EDGE("C:\\selenium\\drivers\\MicrosoftWebDriver.exe");
		setPROPERTY_PATH_EDGE("webdriver.edge.driver");
		
	}
	
/////////////////////////////////Ejecutar Driver Navegador Chrome////////////////////////////////////////////////
	
	public void ConexionChrome() {
		iniciarVariables();
		String exePath;
		String propertyPath;
		
		exePath = getDRIVER_PATH_CHROME();
		propertyPath = getPROPERTY_PATH_CHROME();
		
		System.setProperty(propertyPath, exePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getURL_PORTAL());
	}
	
/////////////////////////////////Ejecutar Driver Navegador Firefox/////////////////////////////////////////////////

	public void ConexionFirefox() {
		iniciarVariables();
		
		String exePath;
		String propertyPath;
		
		exePath = getDRIVER_PATH_FIREFOX();
		propertyPath = getPROPERTY_PATH_FIREFOX();
		
		System.setProperty(propertyPath, exePath);
		driver = new FirefoxDriver();
		driver.get(getURL_PORTAL());
	}
	
////////////////////////////////////Ejecutar Driver Navegador Edge///////////////////////////////////////////////

	public void ConexionEdge() {
		iniciarVariables();
		
		String exePath;
		String propertyPath;
		
		exePath = getDRIVER_PATH_EDGE();
		propertyPath = getPROPERTY_PATH_EDGE();
		
		System.setProperty(propertyPath, exePath);
		driver = new EdgeDriver();
		driver.get(getURL_PORTAL());
	}
	
////////////////////////////////////Ejecutar Driver Navegador Safari///////////////////////////////////////////////

	public void ConexionSafari() {
		iniciarVariables();
		
		driver = new SafariDriver();
		driver.get(getURL_PORTAL());
	}
	
////////////////////////////////////////Rutas Navegador FIREFOX//////////////////////////////////////////
	
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
	
////////////////////////////////////////Rutas Navegador CHROME/////////////////////////////////////////
	
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
	
/////////////////////////////////////////////Rutas Navegador EDGE/////////////////////////////////////

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
	
////////////////////////////////////////URL del Portal///////////////////////////////////////////

	public String getURL_PORTAL() {
		return URL_PORTAL;
	}

	public void setURL_PORTAL(String uRL_PORTAL) {
		URL_PORTAL = uRL_PORTAL;
	}
	
/////////////////////////////////////Variables/////////////////////////////////////////////
	
	private String guia = "73625272";
	
	private int iteracion = 10;
	
	// Rastreo todo estatus
	private int[] arrayOrigen = { 7, 7, 7, 7, 7, 11 };
	private int[] arrayDestino = { 17, 17, 12, 22, 17, 7 };
	private int[] arrayPrefijo = { 1, 1, 1, 1, 1, 2 };
	private String[] arrayGuia = { "1889024", "1889023", "1889025", "1889027", "1889028", "32" };
	String[] arrayEstatus = { "DOCUMENTADO", "EMBARCADA", "EN TR�FICO", "BODEGA DESTINO", "ENTREGADO",
			"No hay informaci�n", "NADA" };

	// Datos Mensaje Error
	private int[] arrayOrigenE = { 2, 4, 6, 8, 10, 12, 14, 16 };
	private int[] arrayDestinoE = { 3, 6, 9, 12, 15, 18, 21, 4 };
	private int[] arrayPrefijoE = { 1, 2 };
	//

	// Origen y destino identico
	private int[] arrayOrigenDestino = { 2, 4, 6, 8, 10, 12, 14, 16 };
	private int prefijo = 1;
	//
	
	public String getGuia() {
		return guia;
	}
	
	public void setGuia(String guia) {
		this.guia = guia;
	}
	
	public int getIteracion() {
		return iteracion;
	}
	
	public void setIteracion(int iteracion) {
		this.iteracion = iteracion;
	}
	
	public int[] getArrayOrigen() {
		return arrayOrigen;
	}
	
	public void setArrayOrigen(int[] arrayOrigen) {
		this.arrayOrigen = arrayOrigen;
	}
	
	public int[] getArrayDestino() {
		return arrayDestino;
	}
	
	public void setArrayDestino(int[] arrayDestino) {
		this.arrayDestino = arrayDestino;
	}
	
	public int[] getArrayPrefijo() {
		return arrayPrefijo;
	}
	
	public void setArrayPrefijo(int[] arrayPrefijo) {
		this.arrayPrefijo = arrayPrefijo;
	}
	
	public String[] getArrayGuia() {
		return arrayGuia;
	}
	
	public void setArrayGuia(String[] arrayGuia) {
		this.arrayGuia = arrayGuia;
	}
	
	public String[] getArrayEstatus() {
		return arrayEstatus;
	}
	
	public void setArrayEstatus(String[] arrayEstatus) {
		this.arrayEstatus = arrayEstatus;
	}
	
	public int[] getArrayOrigenE() {
		return arrayOrigenE;
	}
	
	public void setArrayOrigenE(int[] arrayOrigenE) {
		this.arrayOrigenE = arrayOrigenE;
	}
	
	public int[] getArrayDestinoE() {
		return arrayDestinoE;
	}
	
	public void setArrayDestinoE(int[] arrayDestinoE) {
		this.arrayDestinoE = arrayDestinoE;
	}
	
	public int[] getArrayPrefijoE() {
		return arrayPrefijoE;
	}
	
	public void setArrayPrefijoE(int[] arrayPrefijoE) {
		this.arrayPrefijoE = arrayPrefijoE;
	}
	
	public int[] getArrayOrigenDestino() {
		return arrayOrigenDestino;
	}
	
	public void setArrayOrigenDestino(int[] arrayOrigenDestino) {
		this.arrayOrigenDestino = arrayOrigenDestino;
	}
	
	public int getPrefijo() {
		return prefijo;
	}
	
	public void setPrefijo(int prefijo) {
		this.prefijo = prefijo;
	}
	
////////////////////////////Metodos	de Operación/////////////////////////////////////
	
	public int GeneraOrigenAleatorio() {

		int origen = (int) (Math.random() * 32) + 1;
		// System.out.println("Origen: " +origen);
		return origen;
	}

	public int GeneraDestinoAleatorio() {
		int destino = (int) (Math.random() * 32) + 1;
		// System.out.println("destino: " + destino);
		return destino;
	}

	public int GeneraPrefijo() {
		int pre = (int) (Math.random() * 2) + 1;
		return pre;
	}

	public int GeneraGuiasAleatorias() {
		int guia = (int) ((Math.random() * 1000000000) + 1);
		return guia;
		// System.out.println("Guía: " +guia);
	}

}
