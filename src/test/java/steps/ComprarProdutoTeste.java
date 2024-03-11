package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import pages.CarrinhoPage;
import pages.HomePage;
import pages.ProdutoPage;
import runner.Executa;



public class ComprarProdutoTeste extends Executa {
	CarrinhoPage carrinho = new CarrinhoPage();
	HomePage home = new HomePage();
	ProdutoPage produto = new ProdutoPage();
	Metodos metodos = new Metodos();
	
	@Given("que esteja em home")
	public void que_esteja_em_home() {
    Executa.abrirNavegador();
	 
	}

	@When("busco produto na barra de pesquisa")
	public void busco_produto_na_barra_de_pesquisa() {
	 home.pesquisarProduto();
		
	}

	@Then("pagina atualiza com resultados")
	public void pagina_atualiza_com_resultados() {
	    produto.resultados();
	    metodos.prtscn("pesquisa", "resultado");
	}



	@Given("que esteja na page de resultados")
	public void queEstejaNaPageDeResultados() {
	    produto.resultados();
	}


    @When("clicar no produto escolhido")
	public void clicar_no_produto_escolhido() {
	   produto.adicionarProduto();
	}

	@Then("produto adicionado ao carrinho")
	public void produto_adicionado_ao_carrinho() {
	    produto.clicarCarrinho();
	    metodos.prtscn("add", "carrinho");
	    
	}

	@Given("que esteja no carrinho com produto")
	public void que_esteja_no_carrinho_com_produto() {
	   carrinho.validarPageCarrinho();
	}

	@When("remover o produto escolhido")
	public void remover_o_produto_escolhido() {
		carrinho.removerProduto();
	  
	}

	@Then("produto excluído do carrinho")
	public void produto_excluído_do_carrinho() {
	    carrinho.validarCarrinhoVazio();
	    metodos.prtscn("excluir", "carrinho");
	}

}
