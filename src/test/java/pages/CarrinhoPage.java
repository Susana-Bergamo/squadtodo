package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class CarrinhoPage {
	By textoCarrinho = By.xpath("//span[@class='maintext']");
	By removerProduto = By.xpath("//a[@class='btn btn-sm btn-default']");
	By carrinhoVazio = By.xpath("//div[contains(text(),'empty')]");
	
	Metodos metodos = new Metodos();

	public void validarPageCarrinho() {
		metodos.validarTexto(textoCarrinho, "SHOPPING CART");
	}
	
	public void removerProduto() {
		metodos.clicar(removerProduto);
		
	}
   public void validarCarrinhoVazio() {
	   metodos.validarTexto(carrinhoVazio, "Your shopping cart is empty!");
	   
   }
}
