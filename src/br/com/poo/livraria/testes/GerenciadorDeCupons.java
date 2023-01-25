package br.com.poo.livraria.testes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GerenciadorDeCupons {
	
	
	
	///public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Java.util.map
		 * 
		 * Agora temos que adicionar um desconto específico para
		 * cada cupom validado.
		 * 
		 * 
		 * Essa é uma necessidade muito comum : vincular uma chave específica
		 * a um Objeto para busca-lo de forma mais rápida.
		 * 
		 * Uma lista não seria a melhor opção para fazer buscas.
		 * 
		 * Para fazer isso é melhor usar uma estrutura de dados
		 * bastante conhecida, um Map(Java.util.map).Um map 
		 * anda junto com a API  Collections , mas ela não
		 * extende essa interface.
		 * 
		 * Um mapa é composto por um cojunto(Set) de chaves relacionadas
		 * a um Objeto valor.
		 * 
		 * 
		 * 
		 * */
	
		/*
		 * Estrutura
		 * */
	// 	Map<String , Double >  mapa = new HashMap<>();
		
	    
		/*
		 * Adicionar valores . Uma chave e um valor.
		 * 
		 * */
		//mapa.put("cab123", 5.99);
		
		
		/*
		 *Para recuperar seus valores usamos o método get
		 *passando uma chave como parâmetro.
		 * 
		 * */
		
	//	Double valor = mapa.get("cab123");
	///	System.out.println(valor);
		
		

		
		
		
//	}
	
	
	/*
	 *Usando Map 
	 * */
	
	
	private Map<String , Double> cupons;
	
	public GerenciadorDeCupons() {
		
		this.cupons = new HashMap<>();
		
		cupons.put("cab11", 10.0);
		cupons.put("cab22", 12.0);
		cupons.put("cab13", 13.0);
		cupons.put("cab14", 14.0);
	}
		
	
	
	/*
	 * Método para recuperar o valor do desconto caso o cupom exista
	 * */
	
	public Double validaCupom(String cupom) {
		
		return this.cupons.get(cupom);
	}
	
	

       /*
        * Usar List aqui resolve o problema , porém  ela não é ideal 
        * para esse Lista de cupons.Uma List permite elementos repetidos
        * e o ordem deles importa a imprimir a lista.
        * 
        * Mas nessa Lista de cupons não é permitido ter um cupom  de
        * desconto  repetido , pois eles são únicos, e a ordem de 
        * cupons não importa por que  não temos que ordenar ou ter uma regra 
        * de ordenção de cupons.Essa Lista só serve para consulta.
        * 
        * Em casos como esse , podemos usar outra estrutura de dados
        * 
        * java.util.Set
        * 
        * 
        * */
	
	    /*/
	     * Lista usando List
	     */
	    // 	private List<String> cupons;
		
		/*
		 *  Com os método asList podemos criar e retonar uma lista de forma
		 *  mais  prática.Poderiamos criar uma ArrayList e chamar o método
		 *  add para adicionar cada item , porém não seria tão prático 
		 *  
		 *  O método asList é uma fábrica(factory) de List.
		 *  
		 * */
	
	    /*/
	     * O Set( Conjunto) é  como se fosse um conjunto parecidado com os
	     * da mátematica.O Set é uma coleção assim como a List , mas ele não 
	     * permite elementos repetidos nas estrutura de seus dados.o Set é 
	     * apenas uma inteface e para utilizalo podemos fazer uma inplementação
	     * usando o HashSet.
	     * 
	     * 
	     * Continuamos programando voltado para interface.Ao usar o new HashSet
	     * mudamos o tipo dos cupons ainda continua sendo Set.Esse método é 
	     * importante para ter um baixo acoplamento entre as classe e é
	     * considerado uma boa Prática.
	     * 
	     */
	
	
	
	    /*
	     * Testando se é possível adicionar elementos repetido em um Set 
	     * 
	     * 
	     * Aqui colocamos 4 valores duplicados , porém ao printar 
	     * o  tamanho da lista há apenas um elemento.
	     *
	     *
	     *
	     *
	     *
	     *
	     * */
	   
	
	    private Set<String> duplicados;
	    
	    public void duplicacao() {
	    	
	    	 this.duplicados = new HashSet<String>();
	    	 duplicados.add("Não há duplicados");
	    	 duplicados.add("Não há duplicados");
	    	 duplicados.add("Não há duplicados");
	    	 duplicados.add("Não há duplicados");

         System.out.println("Ao tentar adicionar 4 valores duplicados a Lista Set só permitiu a inserção de "+
         		+  duplicados.size() +  "   elemento");
	    }
	
	   
	    
	    /*
	     *Usando Set
	     *
	     *
	     *
	     *
	     *	    private Set<String> cupons;
		
		public GerenciadorDeCupons() {
			
			this.cupons = new HashSet<String>();
			
			
			cupons.addAll(Arrays.asList("CUP72", "CUP23" , "CUP12" , 
					"CUP24" , "CUP82 ", "CUP21" , "CUP34" , "CUP90",
					"CUP13" , "CUP36","CPU43", "CUP45" ));
		}
		
		/*
		 *
		 *Método para verificar se há um cupom passado no parâmetro em
		 *nossa lista.
		 *
		 *método contains da interface Collections é responsável por verificar
		 *é retonar um valor booleano.
		 *
		 *
		 *public boolean validaCumpom(String cupom) {
			return this.cupons.contains(cupom);
		}
		 *
		 *
		 */
		
		

	    
	    
		
				
		
		
		
		
		

}
