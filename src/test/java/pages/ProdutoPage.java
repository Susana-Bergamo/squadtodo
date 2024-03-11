package pages;

import org.openqa.selenium.By;

import drivers.Drivers;
import metodos.Metodos;

public class ProdutoPage extends Drivers {

	Metodos metodos = new Metodos();

	By textoCapturado = By.xpath("//h4[text()='Products meeting the search criteria']");
	By btnAdicionar = By.xpath("//div[@class='pricetag jumbotron']//a[@data-id='74']");
	By btnCarrinho = By.xpath("//div[@class='block_7']");
	
	

	public void resultados() {
		metodos.validarTexto(textoCapturado, "Products meeting the search criteria");
	}

	public void adicionarProduto() {
		metodos.scroll(500);
		metodos.clicar(btnAdicionar);

	}
	
	public void clicarCarrinho() {
		metodos.clicar(btnCarrinho);
	}

	
}
