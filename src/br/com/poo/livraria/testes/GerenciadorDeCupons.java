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
		 * Agora temos que adicionar um desconto espec�fico para
		 * cada cupom validado.
		 * 
		 * 
		 * Essa � uma necessidade muito comum : vincular uma chave espec�fica
		 * a um Objeto para busca-lo de forma mais r�pida.
		 * 
		 * Uma lista n�o seria a melhor op��o para fazer buscas.
		 * 
		 * Para fazer isso � melhor usar uma estrutura de dados
		 * bastante conhecida, um Map(Java.util.map).Um map 
		 * anda junto com a API  Collections , mas ela n�o
		 * extende essa interface.
		 * 
		 * Um mapa � composto por um cojunto(Set) de chaves relacionadas
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
		 *Para recuperar seus valores usamos o m�todo get
		 *passando uma chave como par�metro.
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
	 * M�todo para recuperar o valor do desconto caso o cupom exista
	 * */
	
	public Double validaCupom(String cupom) {
		
		return this.cupons.get(cupom);
	}
	
	

       /*
        * Usar List aqui resolve o problema , por�m  ela n�o � ideal 
        * para esse Lista de cupons.Uma List permite elementos repetidos
        * e o ordem deles importa a imprimir a lista.
        * 
        * Mas nessa Lista de cupons n�o � permitido ter um cupom  de
        * desconto  repetido , pois eles s�o �nicos, e a ordem de 
        * cupons n�o importa por que  n�o temos que ordenar ou ter uma regra 
        * de orden��o de cupons.Essa Lista s� serve para consulta.
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
		 *  Com os m�todo asList podemos criar e retonar uma lista de forma
		 *  mais  pr�tica.Poderiamos criar uma ArrayList e chamar o m�todo
		 *  add para adicionar cada item , por�m n�o seria t�o pr�tico 
		 *  
		 *  O m�todo asList � uma f�brica(factory) de List.
		 *  
		 * */
	
	    /*/
	     * O Set( Conjunto) �  como se fosse um conjunto parecidado com os
	     * da m�tematica.O Set � uma cole��o assim como a List , mas ele n�o 
	     * permite elementos repetidos nas estrutura de seus dados.o Set � 
	     * apenas uma inteface e para utilizalo podemos fazer uma inplementa��o
	     * usando o HashSet.
	     * 
	     * 
	     * Continuamos programando voltado para interface.Ao usar o new HashSet
	     * mudamos o tipo dos cupons ainda continua sendo Set.Esse m�todo � 
	     * importante para ter um baixo acoplamento entre as classe e �
	     * considerado uma boa Pr�tica.
	     * 
	     */
	
	
	
	    /*
	     * Testando se � poss�vel adicionar elementos repetido em um Set 
	     * 
	     * 
	     * Aqui colocamos 4 valores duplicados , por�m ao printar 
	     * o  tamanho da lista h� apenas um elemento.
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
	    	 duplicados.add("N�o h� duplicados");
	    	 duplicados.add("N�o h� duplicados");
	    	 duplicados.add("N�o h� duplicados");
	    	 duplicados.add("N�o h� duplicados");

         System.out.println("Ao tentar adicionar 4 valores duplicados a Lista Set s� permitiu a inser��o de "+
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
		 *M�todo para verificar se h� um cupom passado no par�metro em
		 *nossa lista.
		 *
		 *m�todo contains da interface Collections � respons�vel por verificar
		 *� retonar um valor booleano.
		 *
		 *
		 *public boolean validaCumpom(String cupom) {
			return this.cupons.contains(cupom);
		}
		 *
		 *
		 */
		
		

	    
	    
		
				
		
		
		
		
		

}
