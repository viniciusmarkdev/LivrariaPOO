package br.com.poo.livraria.testes;

import java.util.ArrayList;

public class arrays {
	
   
   
	
	/*
	 * ArrayList vs Array
	 * 
	 * 
	 * Um ArrayList pode resolver todas as necessidades que tinhamos usando
	 * Array.A classe ArrayList nos fornece m�todos que facilitam a manipu
	 * la��o de dados em uma Lista.Com um d List n�o temos a necessidade 
	 * de definir uma quantidade de Produtos , podemos utilizar o m�todo remove
	 * apenas indicadando o valor que queremos remover , mas tamb�m o m�todo
	 * recebe uma sobrecarga em que remover o valor pelo indice que ele est�
	 * 
	 * A Arraylist trabalha de forma gen�rica , ou seja , n�o precisamos criar 
	 * uma Arraylist para cada tipo int , boolean , etc...Todos os m�todo trabalham
	 * com Object.
	 * 
	 *  mas ter�amos problemas ao  trabalhar com Object , pois sempre 
	 *  que quisermos pegar um objeto teremos que fazer um casting 
	 *  , uma ve que n�o sabemos o tipo que estamos pegando:
	 *
	 * 
	 * int pegar = (int) lista.get(0);
	 * 
	 * n�o sabemos qual � o tipo de valor que pegaremos no indice que 
	 * passamos e se o valor realmente � int.
	 * 
	 * para n�o ter esse problema Geralmente queremos trabalhar com um tipo s� e n�o com v�rios em uma
	 * list.
	 * 
	 * Um exemplo � nosso carrinhoDeCompras que ter� uma lista s� com o tipo
	 * Produtos.Podemos restringir o tipo de Objetos utilizando o recurso Generics.
	 * 
	 * ArrayList<Produto> produtos = new ArrayList<Produto>();
	 * 
	 * Utilizando generics n�ao precisaremos fazer um casting ao buscar 
	 * um dado na Lista.
	 * 
	 * E na� conseguimos colocar um dado de outro tipo na Lista.
	 * 
	 * 
	 * 
	 * Diamond Operator 
	 * 
	 * Ao �nves de passar um tipo duas vezes , podemos deixar o c�digo
	 * assim , usando o recurso Diamond Operator.
	 * 
	 * 
	 * ArrayLis<Produtos> produtos = new ArrayList<>();
	 * 
	 *E isso n�o restringe somente a linha que estamos instanciado nosso
	 *array.Com a evolu��o do Java a infer�ncia de tipos foi melhorada.
	 *
	 *Agora podemos fazer o c�digo assim , pois o compilador sabe 
	 *inferir o tipo this.produtos
	 *
	 *public class CarrinhoDeCompras{
	 *
	 *private ArrayList<Produto> produtos;
	 *
	 *  
	 *  
	 *public CarrinhoDeCompras(){
	 *
	 *this.produto = new ArrayList<>();
	 *
	 *}
	 *
	 *
	 *
	 *
	 *}
	 * 
	
	 * 
	 * 	 * 
	 * Um array n�o � um ArrayList
	 * 
	 *  ArrayList utiliza arrays internamente, 
	 * por�m de forma muito bem encapsulada e tem m�todo com eles muito bem 
	 * definidos, assim quando utilizamos um ArrayList n�o modificamos seus
	 * dados internamente , mas s� na classe que est� a utilizando.
	 * 
	 * 
	 * Existem outros tipos de Listas que n�o utilizam necessariamente
	 * arrays.
	 * 
	 * Um exemplo � a LinkedList(Lista ligada)
	 * 
	 * A arrayList � mais rapida para fazer pesquisas 
	 * e a LinkedList � mais rapida para remover e adicionar elementos
	 * 
	 * Todas as lista tem em comum a interface List do pacote
	 * java.util para n�o deixar nosso c�digo dependendo de uma lista
	 * espec�fica(acoplamento);
	 * 
	 * 
	 * 
	 *
	 * 
	 * */
	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		String aprender = "aprendendo collections";
		lista.add(aprender);
		
       System.out.println(lista.contains(aprender));
       lista.remove(aprender);
       System.out.println(lista.contains(aprender));
       
       
       lista.sort(null);
       
     
	}
	
	
	
	
	

}
