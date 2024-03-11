@regressivos
Feature: Comprar produto
	Como usuario do sistema 
	Quero selecionar um produto
	Para efetuar uma compra
  

  Scenario: Pesquisar produto
    Given que esteja em home
  	When busco produto na barra de pesquisa
    Then pagina atualiza com resultados
    
   

  Scenario: Adicionar produto no carrinho
    Given que esteja na page de resultados
  	When clicar no produto escolhido
    Then produto adicionado ao carrinho
    

 Scenario: Excluir Produto 
    Given que esteja no carrinho com produto
  	When remover o produto escolhido
    Then produto excluído do carrinho

   
