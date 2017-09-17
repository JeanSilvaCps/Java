package Pizzaria;

public class CarrinhoDeCompras {
	
	private static int precoPizza; 
	
	public void addPizza(Pizza obj){		
		precoPizza += obj.getPreco(obj.getTotalIngredientes());		
	}
	
	public int TotalCarrinho() {		
		return precoPizza;
	}
}
