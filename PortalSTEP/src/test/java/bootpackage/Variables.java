package bootpackage;

import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.xpath;

import java.util.Random;

import org.openqa.selenium.By;

public class Variables {

	public String DRIVER_PATH_FIREFOX;
	public String PROPERTY_PATH_FIREFOX;
	
	public String DRIVER_PATH_CHROME;
	public String PROPERTY_PATH_CHROME;
	
	public String DRIVER_PATH_EDGE;
	public String PROPERTY_PATH_EDGE;
	
	public String URL_PORTAL = "http://d396t6822uj2vd.cloudfront.net/";
			//"http://qa-envios.primeraplus.com/";
	
	public int GUIAS;
	
	//public WebDriver driver;
	
	/*/Rutas
	setDRIVER_PATH_CHROME("C:\\selenium\\drivers\\chromedriver.exe");
	setPROPERTY_PATH_CHROME("webdriver.chrome.driver");

	setDRIVER_PATH_FIREFOX("C:\\selenium\\drivers\\geckodriver.exe");
	setPROPERTY_PATH_FIREFOX("webdriver.gecko.driver");
	
	setDRIVER_PATH_EDGE("C:\\selenium\\drivers\\MicrosoftWebDriver.exe");
	setPROPERTY_PATH_EDGE("webdriver.edge.driver");
	*/
	

	// URL
	//public static final String URL_PORTAL = ("http://qa-envios.primeraplus.com/");
	//public static final String URL = ("http://output.jsbin.com/osebed/2");
	//public static final String URL =("http://toolsqa.com/automation-practice-form");
	// <-- Módulos -->
	// <-- Inicio -->
	public static final By Inicio = xpath("/html/body/app-principal/app-header/nav/div/div[2]/ul/li[1]/a");
	public static final By RastreodGuias = xpath("//*[@id=\"tituloConsultarIndice\"]/div/h4");
	public static final By Origen = id("cont-selRastreoGuias-seleccionOrigen");
	public static final By Destino = id("cont-selRastreoGuias-seleccionDestino");
	public static final By Prefijo = id("cont-selRastreoGuias-seleccionPrefijo");
	public static final By NumGuia = id("cont-capRastreoGuias-numeroGuia"); 
	public static final By BtnRasGuias = id("cont-btnRastreoGuias-agregarGuia");
	public static final By BtnToken = xpath("//*[@id=\"cont-btnRastreoGuias-consultarGuia\"]");
	public static final By BtnRastrear = className("btn btnRojo");
	public static final By MsjErrorGuia = xpath("//*[@id=\"cont-alertRastreoGuias-mensajeGuia\"]/div/strong");
	//
//	int index = (int)( Math.random() * opcion1.size());
	//selectList.selectByIndex(index);

	// <-- Nuestros Servicios -->
	public static final By NuestrosServicios = xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a");
	public static final By ServicioExpress = linkText("Servicio Express");
	public static final By ServExpress = xpath("//*[@id=\"prepagoTopDiv\"]/div/p");
	public static final By ServicioReenvioPaq = linkText("Servicio de Reenvío de paquetes");
	public static final By ServReenvioPaq = xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/ul/li[2]");
	public static final By ServicioGuiasPrepa = linkText("Servicio de Guías Prepagadas");
	public static final By ServGuiasPrepa = xpath("//*[@id=\"prepagoTopDiv\"]/div/p");
	public static final By Tarifas = linkText("Tarifas");
	public static final By Tarifa = xpath("//*[@id=\"tarifas-section\"]/div/div/div/div/div[1]/h3");
	public static final By TariVer = className("liga-roja");
	public static final By TarVentana = linkText("LA TARIFA ESTÁ EN FUNCIÓN DE LAS MEDIDAS Y PESO.");

	// <-- Promociones -->
	public static final By Promociones = xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a");

	// <-- Promociones -> ParticipayGana -->
	public static final By ParticipayGana = xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/ul/li/a");

	// <-- Sucursales -->
	// Sucursales
	public String SucursalString = "Sucursales";
	public static final By Sucursales = linkText("Sucursales");
	public static final By SucursalTitulo = xpath("//*[@id=\"paral6\"]/div");
	public static final By SucursalEstado = id("ddlEstado");
	public static final By SucursalMunicipio = id("ddlMunicipio");
	public static final By Sucursal = id ("ddlSucursal");
	public static final By CajaTextoCalle =xpath("//*[@id=\"sucursales-section\"]/div/div/div/div/form/div/div[2]/div[2]/div[2]/div/div/div/span");
												  //*[@id=\"sucursales-section\"]/div/div/div/div/form/div/div[2]/div[2]/div[2]/div/div/div

	public static final By CajaTextoNumero = xpath("//*[@id=\"sucursales-section\"]/div/div/div/div/form/div/div[2]/div[3]/div[2]/div/div/div/span");
												    //*[@id="sucursales-section"]/div/div/div/div/form/div/div[2]/div[3]/div[2]/div/div/div

	public static final By CajaTextoHorario = xpath("//*[@id=\"sucursales-section\"]/div/div/div/div/form/div/div[2]/div[4]/div[2]/div/div/div/span");
												     //*[@id="sucursales-section"]/div/div/div/div/form/div/div[2]/div[4]/div[2]/div/div/div
	
}
