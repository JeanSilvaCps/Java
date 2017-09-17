package Pizzaria;
import java.util.HashMap;
import java.util.Map;

public class Pizza {		
	
	private static Map<String,Integer> ingredientes = new HashMap<String,Integer>();;
	public static int totalIngredientesUtilizados;
	
	
	public void adcionarIngredientes(String ingrediente) {
		
		if ( ingredientes.containsKey( ingrediente ) ) 
		{
			setTotalIngredientes(++totalIngredientesUtilizados);
			ingredientes.put(ingrediente, ingredientes.get(ingrediente) + 1);	
		}
		else
		{
			setTotalIngredientes(++totalIngredientesUtilizados);
			ingredientes.put(ingrediente, 1);
		}
	}	
	
	
	public Integer getPreco(int qtdIngredientes) {
		
		if( qtdIngredientes >= 1 && qtdIngredientes <= 2) 
		{
			return 15;
		}
		
		if( qtdIngredientes >= 3 && qtdIngredientes <= 5 ) 
		{
			return 20;
		}
		
		if( qtdIngredientes > 5 )
		{
			return 23;
		}
		else
		{
			return 0;
		}
		
	}

	public int getTotalIngredientes() 
	{
		return totalIngredientesUtilizados;
	}

	private static void setTotalIngredientes(int countIngredientes) {
		totalIngredientesUtilizados = countIngredientes;
	}	
	
	public void estaFuncionandoLista() {	
		ingredientes.forEach((k,v) -> System.out.println("Ingrediente: "+k+"	| Qtd. Usada:"+v));
	}

}













