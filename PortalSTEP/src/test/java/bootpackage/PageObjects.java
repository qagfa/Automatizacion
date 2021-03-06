package bootpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.qameta.allure.Attachment;

public class PageObjects extends BasePageObject {

	protected WebDriver driver;

	public PageObjects(WebDriver driver, String URL) {
		super(driver);
		navegaA(URL);
	}

	public void esperaVisible(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	

	public void SegundosEspera(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Attachment(value = "Page screenshot", type = "image/png")
	public byte[] saveScreenshot(WebDriver driver) {
		byte[] captura = null;
		captura = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		return captura;
	}
}