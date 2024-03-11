package metodos;

import static org.junit.Assert.assertTrue;

import java.io.File;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import drivers.Drivers;

public class Metodos extends Drivers {

	
	public  void escrever(By elemento, String texto){
		driver.findElement(elemento).sendKeys(texto);
	
	}
	
	public  void clicar(By elemento){
		driver.findElement(elemento).click();
	
	}
	
	public  void submit(By elemento){
		driver.findElement(elemento).submit();
	
	}
	
	public void validarTexto(By elemento, String texto) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(texto));
	}
	
	public void scroll(int size) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			Thread.sleep(3000);
			jse.executeScript("window.scrollBy(0," + size + ")", "");
			Thread.sleep(3000);

		} catch (Exception e) {
			System.out.println("Erro no scroll " + e.getCause());
		}
		
	}
	
	public void prtscn(String historia, String nomeDoArquivo) {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./evidencias/" + historia + "/" + nomeDoArquivo +".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
