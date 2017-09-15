package Pizzaria;
import java.util.HashMap;
import java.util.Map;

public class Pizza {
		
	private Map<String,Integer> pizza = new HashMap<String,Integer>();
	public static int totalIngredientes;
	private int countIngredientes;
	private Integer precoPizza;
	
	public void adcionarIngredientes(String ingrediente) {		
		setCountIngredientes(getCountIngredientes() + 1);
		pizza.put(ingrediente, contabilizarIngredientes());		
	}
	
	public static Integer contabilizarIngredientes() {	
		totalIngredientes++;
		return totalIngredientes;
	}
	
	public void getPreco(int countIngredientes) {
		
		if( countIngredientes >= 0 && countIngredientes <= 2) {
			setPrecoPizza(15);
		}
		
		if( countIngredientes >= 3 && countIngredientes <= 5 ) {
			setPrecoPizza(20);
		}
		
		if( countIngredientes > 5 ) {
			setPrecoPizza(23);
		}
		
	}

	public Integer getPrecoPizza() {
		return precoPizza;
	}

	private void setPrecoPizza(Integer precoPizza) {
		this.precoPizza = precoPizza;
	}

	public int getCountIngredientes() {
		return countIngredientes;
	}

	private void setCountIngredientes(int countIngredientes) {
		this.countIngredientes = countIngredientes;
	}

}
/*
 *  * Crie uma classe Pizza que possua o método adicionaIngrediente() que 
 * recebe uma String com o ingrediente a ser adicionado. Essa classe também 
 * 
 * o método getPreco() que calcula da seguinte forma: 2 ingredientes 
 * ou menos custam 15 reais, de 3 a 5 ingredientes custam 20 reais e mais de 5 ingredientes custa 23 reais.
 * 
 * É preciso contabilizar os ingredientes gastos por todas as pizzas! 
 * Utilize uma variável estática na classe Pizza para guardar esse tipo de informação 
 * 
 * (dica: utilize a classe HashMap para guardar o ingrediente como chave e um Integer como valor). Crie o método 
 * estático contabilizaIngrediente() para ser chamado dentro de adicionaIngrediente() e fazer esse registro.
 * 
 */