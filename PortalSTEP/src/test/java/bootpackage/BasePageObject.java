package bootpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePageObject {

	private WebDriver driver;

	public BasePageObject(WebDriver driver) {
		this.driver = driver;
	}

	BasePageObject() {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	public WebElement busca(By locator) {
		return driver.findElement(locator);
	}

	public String textoCon(By locator) {
		return busca(locator).getText();
	}

	public void click(By locator) {
		busca(locator).click();
	}

	public void limpia(By locator) {
		busca(locator).clear();
	}

	public void escribe(By locator, String cadena) {
		busca(locator).sendKeys(cadena);
	}

	public void enviar(By locator) {
		busca(locator).submit();
	}

	//@SuppressWarnings("unlikely-arg-type")
	public void Compara(By locator, String cadena) {
		busca(locator).equals(cadena);
	}

	public boolean estaHabilitado(By locator) {
		return busca(locator).isEnabled();
	}

	public void navegaA(String URL) {
		driver.get(URL);
	}
}