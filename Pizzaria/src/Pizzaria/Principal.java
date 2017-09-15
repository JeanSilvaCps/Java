package Pizzaria;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza1 = new Pizza();
		pizza1.adcionarIngredientes("Calabresa");
		pizza1.adcionarIngredientes("Bacon");
		pizza1.adcionarIngredientes("Queijo");
		
		Pizza pizza2 = new Pizza();
		pizza2.adcionarIngredientes("Peperone");
		pizza2.adcionarIngredientes("Catupiry");
		pizza2.adcionarIngredientes("Tomate");
		pizza2.adcionarIngredientes("Lombo");
		
		Pizza pizza3 = new Pizza();
		pizza3.adcionarIngredientes("Frango");
		pizza3.adcionarIngredientes("Bacon");
		pizza3.adcionarIngredientes("Queijo");
		pizza3.adcionarIngredientes("Milho");
		pizza3.adcionarIngredientes("Ervilha");
		pizza3.adcionarIngredientes("Palmito");
		
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.CarrinhoDeCompra(pizza1);
		c1.CarrinhoDeCompra(pizza2);
		c1.CarrinhoDeCompra(pizza3);
		
		

	}

}
/*
 *Crie uma classe Principal com o método main() que faz o seguinte:
 *
 *Cria 3 pizzas com ingredientes diferentes
 *Adiciona essas Pizzas em um CarrinhoDeCompra
 *Imprime o total do CarrinhoDeCompra
 *Imprime a quantidade utilizada de cada ingrediente
 */