package br.com.poo.livraria.testes;

import java.util.Hashtable;
import java.util.Random;

public class Conves�oTipos {
	
	public static void main(String[] args) {
		
		
		boolean parseBoolean = Boolean.parseBoolean("1");
		
		int parseInt = Integer.parseInt("10");
		
		
		String textoParaNumero = String.valueOf(10);
		
		
		/*
		 * O pacote java lang faz parte de todas as classes , 
		 * assim n�o precisamos importa-las para usar seus m�todos
		 * de String 
		 * */
		
		/*
		 * Java math
		 * 
		 * M�todo que auxiliam nas opera��es matem�ticas
		 * 
		 * */
		
		
		//Arredonda
		long round = Math.round(3.89);
		
		//Maximo
		
	    long max = Math.max(100, 1);
	    
	    //Minimo
	    int min = Math.min(100 , 10);
	    
	    //transforma em n�mero inteiro
	    int abs =  Math.abs(-5);
	    
	    //Raiz quadradada
	    double sqrt = Math.sqrt(4);
		
		
	    /*
	     * Java Random
	     * 
	     * N�mero alet�rios
	     * 
	     * */
	    
	    Random random = new Random();
	    System.out.println(random.nextInt(10));
		
	    
		
		/*
		 *Java.String.lang
		 *
		    A Strings muitas vezes s�o confundidas com 
		    tipos primitivos , mas servem para guardar 
		    refer�ncias a objetos 
		    
		    podemos inst�nicia uma String igual abaixo
		    
		    Assim como qualquer refer�ncia a objetos ,n�o devemos
		    comparar Strings com "==" , mas com equals.
	     *
		 * */
		
	    
	    	    
	    String java = "java";
	    String java2 = "java";
	    
	    
	    System.out.println(java.equals(java2));
	    
	     /*
	      * Utilizando "==" temos o mesmo valor de True.Qual 
	      * motivo disso?
	      * 
	      * Por otimiza��o o Java criar um pool de String 
	      * ante de adicionar a refer�ncia do Objeto na mem�ria.
	      * 
	      * Assim a JVM verifica se n�o h� String igual 
	      * possa ser utilizada.
	      * 
	      * Para que esse processo ocorra da melhor forma o Java
	      * impede que o Valor de uma String com um  mesmo valor
	      * que outra seja mudado.Para que uma n�o afete a outra.
	      * Por isso toda String � imutavel.
	      * 	
	      * 
	      * */
		System.out.println(java==java2);
		
		
		/*String imut�vel*/
		
		
		
		
		java.replace("v", "c");
		
		
		
		/*esperamos que o valor da nova String seja
		 * jaca , mas o valor continua "java".
		 * */
		
		System.out.println(java);
		
		
		/*
		 * Para obtermos um novo valor temos que
		 * criar uma nova String  e passar o retorno do 
		 * m�todo replace.
		  
		 * */
		
		/*
		 * Os  m�todos da Classe String sempre retornam uma
		 * refer�ncia nova para o valor tranformado.
		 * */
		
		String novaString = java.replace("v" , "c");
		System.out.println(novaString);
		
		/*
		 * M�todos da classe String
		 * */
		
		
		String replace = java.replace("v" , "c");
		String uppercase = java.toUpperCase();
		String lowercase = java.toLowerCase();
		char charAt = java.charAt(0);
		boolean endsWith = java.endsWith("a");
		boolean startWith = java.startsWith("s");
		boolean equals = java.equalsIgnoreCase("JAVA");
		
		
		
	}
	
	

}
