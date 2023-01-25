package br.com.poo.livraria.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import br.com.poo.livraria.Autor;
import br.com.poo.livraria.produtos.Ebook;
import br.com.poo.livraria.produtos.LivroFisico;
import br.com.poo.livraria.produtos.Produto;
import br.com.poo.livraria.produtos.Revista;

public class OrdenandoComJava {
	
	
	
		
	
	public static void main(String[] args) {
		
		/*Ordenando Uma List 
		 * 
		 * Quando listamos a nossa lista a ordem que a  lista
		 * aparece na tela é dada pela ordem que colocamos  a
		 * adicionamos no array.
		 * 
		 * Certamente , ao trabalhar com array iremos precisar
		 * ordenar essa lista utilizando alguma critério 
		 * 
		 * Com o método sort da classe Collections podemos
		 * ordernar uma lista facilmente , veja abaixo.
		 * 
		 * Quando usamos Collections.sort(lista) ,
		 * mudamos a estrutura da Lista.
		 * 
		 * Não utilizamos nenhum critério para ordenar a Lista ,pois
		 * já sort Ordena Strings  por ordem alfabética.
		 * 
		 * O objeto String Implementa a interface Comparable.
		 * 
		 * E o método sort precisa receber uma lista de elemento 
		 * coparáveis .
		 * 
		 * Se quiser , por exemplo , ordenar Produtos 
		 * 
		 * List<Produto> produtos = new ArrayList<>();
		 * 
		 * Collection.sort(Produtos) 
		 * 
		 * O console vai imprimir uma mensagem de erro , pois
		 * não usamos nenhum críterio para ordenar produtos.
		 * 
		 * 
		 * Precisamos ensinar o  método sort qual elemento
		 * deve vir antes de qual , ou seja , ensina-lo a 
		 * ordenar Produtos.
		 * 
		 * Como dito antes , o método sort precisa receber
		 * uma lista de elementos comparáveis com um método
		 * específico ensinando-o como deve comparar tais elementos.
		 * 
		 * Para garantir que esse método esteja presente o Java utiliza
		 * o uso da Interface Comparable do pacote java.lang.Comparable.
		 * Todo elemento ordenavél deve implementar o método compareTo()
		 * dessa interface.
		 * 
		 * Na Interface Produto extendemos a Interface Comparable<>
		 * 
		 * Usamos o extends , pois  estamos herdando somente as
		 * obrigações da Interface comparable.Assim as classes
		 * que implementam a Inteface Produto terão que implementar 
		 * o método compareT.
		 * 
		 * 
		 * Comparable<Produto>
		 * 
		 * O Comparable utiliza generics , assim quando implementarmos 
		 * o método compareTo() não precisaremos fazer o casting de Object 
		 * para produto.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Carlos Marcelo");
		nomes.add("Antonio nunes");
		nomes.add("Julio cesar");
		
		System.out.println(nomes);
		
		Collections.sort(nomes);
		
		
		
		System.out.println(nomes);
		
		Collections.reverse(nomes);
		System.out.println(nomes);

		

		
		Autor autor = new Autor	();
		autor.setNome("Renata cabrini");
		LivroFisico fisico = new LivroFisico();
		
		
		fisico.setNome("Java 8 prático");
		fisico.setValor(10);
		Ebook ebook = new Ebook(autor);
		
		
		ebook.setNome("Java 8 prático");
		ebook.setValor(29.90);
		
		Revista revista = new Revista();
		revista.setValor(80);
		
		
		
		/*
		 * O método asList retorna um  listas de tamanho fixo.
		 * 	
		 * */
		
		List<Produto> produtos = Arrays.asList(fisico , ebook, revista);
	/*
	 * O método sort resposável por ordenar nosso array recebe
	 * uma ou mais lista de produtos ordenaveis , ou seja , que 
	 * já implementa o método compareTo() , da Interface Comparable<>
	 * com as regras de comparação específicas .
	 * 
	 * */
		
		Collections.sort(produtos);
		
		 /*
		  * For percorrendo a Lista de produto e imprimindo o valor 
		  * de cada produto.
		  */
		for(Produto produto : produtos) {
			
			System.out.println(produto.getValor());
		}
	}

}
