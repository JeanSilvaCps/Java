package Pizzaria;

public class Principal {

	public static void main(String[] args) {

		CarrinhoDeCompras c1 = new CarrinhoDeCompras();		
		
		Pizza italiana = new Pizza();
		
			italiana.adcionarIngredientes("Calabresa");
			italiana.adcionarIngredientes("Bacon");
			italiana.adcionarIngredientes("Milho");
			
		if( validacao(italiana) ){
			c1.addPizza(italiana);
		}
		else{
			System.out.println("Pizza Italiana não inserida no carrinho");
		}
		
		
		Pizza vegegran = new Pizza();
		
			vegegran.adcionarIngredientes("Peperone");
			vegegran.adcionarIngredientes("Catupiry");
			vegegran.adcionarIngredientes("Tomate");
			vegegran.adcionarIngredientes("Lombo");
			vegegran.adcionarIngredientes("Milho");
			
		if( validacao(vegegran) ){
			c1.addPizza(vegegran);
		}
		else{
			System.out.println("Pizza Vegegran não inserida no carrinho");
		}
	
		Pizza especial = new Pizza();
		
			especial.adcionarIngredientes("Frango");
			especial.adcionarIngredientes("Bacon");
			especial.adcionarIngredientes("Queijo");
			especial.adcionarIngredientes("Milho");
			especial.adcionarIngredientes("Ervilha");
			especial.adcionarIngredientes("Palmito");
			
		if( validacao(especial) ){
			c1.addPizza(especial);
		}
		else{
			System.out.println("Pizza Especial não inserida no carrinho");
		}
		
		int total = c1.TotalCarrinho();
		
		System.out.println("Total do carrinho: R$ " + total + ",00");
		System.out.println("");
		
		imprimirIngredientes();	
	
		}
		
		private static boolean validacao(Pizza p){
			return p.getTotalIngredientes() >= 1 ? true : false;
		}
		
		private static void imprimirIngredientes(){
			Pizza procurar = new Pizza();
			procurar.estaFuncionandoLista();
		}
}
