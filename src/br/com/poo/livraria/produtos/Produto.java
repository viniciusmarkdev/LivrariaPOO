package br.com.poo.livraria.produtos;


/* Uma interface � contrato que estabelece um fator comum entre as classe , 
 * na qual as classes que implementam essa interface
 * ter�o que cumprir os termos ou cl�usura de assinatura(m�todos) e como se fosse
 * um m�todo abstrato , por�m n�o mais em uma classe.Com a interface podemos 
 * usufruir do polimorfismo sem ter que acoplar as classes.  * 
 * Toda classe que implementa uma interface  pode ser refer�nciado pelo tipo dela ,
 * assim podemos usar o polimorfismo com interfaces 
 */
public interface Produto extends Comparable<Produto> {
	
	
	
	
	double getValor();



}
