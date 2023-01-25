package br.com.poo.livraria.testes;

import java.util.ArrayList;

public class arrays {
	
   
   
	
	/*
	 * ArrayList vs Array
	 * 
	 * 
	 * Um ArrayList pode resolver todas as necessidades que tinhamos usando
	 * Array.A classe ArrayList nos fornece métodos que facilitam a manipu
	 * lação de dados em uma Lista.Com um d List não temos a necessidade 
	 * de definir uma quantidade de Produtos , podemos utilizar o método remove
	 * apenas indicadando o valor que queremos remover , mas também o método
	 * recebe uma sobrecarga em que remover o valor pelo indice que ele está
	 * 
	 * A Arraylist trabalha de forma genérica , ou seja , não precisamos criar 
	 * uma Arraylist para cada tipo int , boolean , etc...Todos os método trabalham
	 * com Object.
	 * 
	 *  mas teríamos problemas ao  trabalhar com Object , pois sempre 
	 *  que quisermos pegar um objeto teremos que fazer um casting 
	 *  , uma ve que não sabemos o tipo que estamos pegando:
	 *
	 * 
	 * int pegar = (int) lista.get(0);
	 * 
	 * não sabemos qual é o tipo de valor que pegaremos no indice que 
	 * passamos e se o valor realmente é int.
	 * 
	 * para não ter esse problema Geralmente queremos trabalhar com um tipo só e não com vários em uma
	 * list.
	 * 
	 * Um exemplo é nosso carrinhoDeCompras que terá uma lista só com o tipo
	 * Produtos.Podemos restringir o tipo de Objetos utilizando o recurso Generics.
	 * 
	 * ArrayList<Produto> produtos = new ArrayList<Produto>();
	 * 
	 * Utilizando generics nçao precisaremos fazer um casting ao buscar 
	 * um dado na Lista.
	 * 
	 * E naõ conseguimos colocar um dado de outro tipo na Lista.
	 * 
	 * 
	 * 
	 * Diamond Operator 
	 * 
	 * Ao ínves de passar um tipo duas vezes , podemos deixar o código
	 * assim , usando o recurso Diamond Operator.
	 * 
	 * 
	 * ArrayLis<Produtos> produtos = new ArrayList<>();
	 * 
	 *E isso não restringe somente a linha que estamos instanciado nosso
	 *array.Com a evolução do Java a inferência de tipos foi melhorada.
	 *
	 *Agora podemos fazer o código assim , pois o compilador sabe 
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
	 * Um array não é um ArrayList
	 * 
	 *  ArrayList utiliza arrays internamente, 
	 * porém de forma muito bem encapsulada e tem método com eles muito bem 
	 * definidos, assim quando utilizamos um ArrayList não modificamos seus
	 * dados internamente , mas só na classe que está a utilizando.
	 * 
	 * 
	 * Existem outros tipos de Listas que não utilizam necessariamente
	 * arrays.
	 * 
	 * Um exemplo é a LinkedList(Lista ligada)
	 * 
	 * A arrayList é mais rapida para fazer pesquisas 
	 * e a LinkedList é mais rapida para remover e adicionar elementos
	 * 
	 * Todas as lista tem em comum a interface List do pacote
	 * java.util para não deixar nosso código dependendo de uma lista
	 * específica(acoplamento);
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
