package br.com.poo.livraria.produtos;


/* Uma interface é contrato que estabelece um fator comum entre as classe , 
 * na qual as classes que implementam essa interface
 * terão que cumprir os termos ou cláusura de assinatura(métodos) e como se fosse
 * um método abstrato , porém não mais em uma classe.Com a interface podemos 
 * usufruir do polimorfismo sem ter que acoplar as classes.  * 
 * Toda classe que implementa uma interface  pode ser referênciado pelo tipo dela ,
 * assim podemos usar o polimorfismo com interfaces 
 */
public interface Produto extends Comparable<Produto> {
	
	
	
	
	double getValor();



}
