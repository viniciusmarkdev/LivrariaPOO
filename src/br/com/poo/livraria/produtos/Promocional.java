package br.com.poo.livraria.produtos;


/*
 * Todos métodos em uma interface são publicos
 * 
 */


/*
 * Essa interface serve para diminuir o aclopamento entre as classes. Antes tinhamos o problema 
 * com o método aplicaDescontoDe , pois era um método Abstrato na classe Livro , assim todas as 
 * classes que precisavam ter um tipo de desconto precisavam implementar esse método , porém
 * a classe mini-Livro , que extendia a classe Livro também tinha que usar esse método mesmo sem
 * ter nenhum desconto , o que tornava a classe com mais  acoplamento.Além disso , a classe 
 * Revista também precisa desse método  mas não deve extender a classe Livro.Esses problemas são
 * resolvidos usando essa interface .
 * 
 */


/*
 * Desde o  Java 8 uma interface pode ter métodos concretos,
 * para isso basta adicionar  a palavra default  é escrever
 * o método.
 * 
 * As interfaces que obdecem a regra de ter somente um método se chama
 * inteface funcional, pois se uma classe a implementa quer dizer que ela
 * serve somente pra um próposito , ou seja ,  a classe que a implemena realmente precisa 
 * desse  método.
 * 
 * a interface funcional é a  chave para recursos de lambda  e method references
 * 
 * para marcar uma interface como funcional temos que adiconar a anotação @funcionalInterfaxe
 */

@FunctionalInterface
public interface Promocional {
	

	
	boolean aplicaDescontoDe(double pocentagem);
	
	default boolean aplicaDescontoDe10Porcento() {
		return  aplicaDescontoDe(0.1);
	}

}
