package br.com.poo.livraria.produtos;


/*
 * Todos m�todos em uma interface s�o publicos
 * 
 */


/*
 * Essa interface serve para diminuir o aclopamento entre as classes. Antes tinhamos o problema 
 * com o m�todo aplicaDescontoDe , pois era um m�todo Abstrato na classe Livro , assim todas as 
 * classes que precisavam ter um tipo de desconto precisavam implementar esse m�todo , por�m
 * a classe mini-Livro , que extendia a classe Livro tamb�m tinha que usar esse m�todo mesmo sem
 * ter nenhum desconto , o que tornava a classe com mais  acoplamento.Al�m disso , a classe 
 * Revista tamb�m precisa desse m�todo  mas n�o deve extender a classe Livro.Esses problemas s�o
 * resolvidos usando essa interface .
 * 
 */


/*
 * Desde o  Java 8 uma interface pode ter m�todos concretos,
 * para isso basta adicionar  a palavra default  � escrever
 * o m�todo.
 * 
 * As interfaces que obdecem a regra de ter somente um m�todo se chama
 * inteface funcional, pois se uma classe a implementa quer dizer que ela
 * serve somente pra um pr�posito , ou seja ,  a classe que a implemena realmente precisa 
 * desse  m�todo.
 * 
 * a interface funcional � a  chave para recursos de lambda  e method references
 * 
 * para marcar uma interface como funcional temos que adiconar a anota��o @funcionalInterfaxe
 */

@FunctionalInterface
public interface Promocional {
	

	
	boolean aplicaDescontoDe(double pocentagem);
	
	default boolean aplicaDescontoDe10Porcento() {
		return  aplicaDescontoDe(0.1);
	}

}
