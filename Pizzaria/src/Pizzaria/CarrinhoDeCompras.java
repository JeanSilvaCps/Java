package Pizzaria;

public class CarrinhoDeCompras {
	
	/* Crie uma nova classe chamada CarrinhoDeCompras que pode receber 
	 * objetos da classe Pizza.
	 */	
	private static int precoPizza; 
	
	public void addPizza(Pizza obj){		
		precoPizza += obj.getPreco(obj.getCountIngredientes());		
	}
	
	public int TotalCarrinho() {		
		return precoPizza;
	}
}
/*
 *  
 * Ela deve ter um método que retorna o valor total de todas as pizzas adicionadas. 
 * 
 */
