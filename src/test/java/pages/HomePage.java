package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class HomePage {

	 Metodos metodos = new Metodos();
	 
	
	By barraPesquisa = By.xpath("//input[@type='text'][contains(@id,'keyword')]");
	By btnLupa = By.xpath("//div[@class='button-in-search']");
	
	
	public void pesquisarProduto() {
		metodos.escrever(barraPesquisa, "Shampoo");
		metodos.submit(barraPesquisa);
		
	}
	
	
	
}
