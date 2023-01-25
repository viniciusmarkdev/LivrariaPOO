package br.com.poo.livraria.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import br.com.poo.livraria.Autor;
import br.com.poo.livraria.produtos.Livro;
import br.com.poo.livraria.produtos.LivroFisico;

public class NovidadesDoJava8 {
	
	
	
	/*
	 * Ordenando com Java 8 
	 * 
	 * C�digo na pr�tica ordenando os livros por nome ,
	 * como foi ensinado na Classe ComparadorPorNome 
	 * que implementou a interface Comparator<Livro>
	 * 
	 * */
	public static void main(String[] args) {
		

		
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro javaoo = new LivroFisico(autor);
		javaoo.setNome("Java 0.0");
		
		Livro java8 = new LivroFisico(autor);
		java8.setNome("Livro 8 pr�tico");
		
		Livro ruby = new LivroFisico(autor);
		ruby.setNome("Livro de ruby");
		
		Livro JavaSpring  = new LivroFisico(autor);
		JavaSpring.setNome("Java SpringBoot");
		List<Livro> livros = Arrays.asList(javaoo , java8 , ruby , JavaSpring);
		
		
		/*
		 * Um problema dessa abordagem � que sempre que quisermos criar um
		 * novo crit�rio de Ordena��o teremos que  criar uma nova classe.
		 * 
		 * No Java 7 podemos resolver esse problema utilizando uma classe anonima
		 * 
		 * */
	
		 
		//Como era feito antes 
		//Collections.sort(livros , new ComparadorPorNome());
		
		//Classe an�nima
		
		/*
		 * Em uma classe an�nima � poss�vel criar uma classe em um local
		 * espec�fico  , que ser� usada somente ali. Ao utilizar o
		 * Sort e passarmos seus par�metros , ao inves de passar a
		 * inst�ncia��o da nossa classe com o new podemos passar a 
		 * interface Comparator e implementar e sobreescrever seus 
		 * m�todos ali mesmo sem dar uma nome para a classe.
		 * 
		 * 
		 * */
		
		
		/*
		 * 
		 * 
		 * 
		 * Collections.sort(livros , new Comparator<Livro>(){
			
			
            
			@Override
			public int compare(Livro l1, Livro l2) {
				// TODO Auto-generated method stub
				return l1.getNome().compareTo(l2.getNome());
			}
			
			
	         	});
		 * 
		 * 
		 * O que c�digo acima � uma pouco dif�cil de ler para simplicar esse processo 
		 * o Java 8 introduziu o m�todo sort na interface List .Assim , podemos fazer
		 * igual a baixo:
		 * 
		 * livros.sort(new Comparator<Livro>(){  @ Override public int compare(Livro l1 , Livro l2 ){ return
		 * l1.getNome().compareTo(l2.getNome());
		 * 
		 * }
		 * 
		 * });
		 * 
		 * */
		
			
		/*
		 * Para n�o quebrar a compatiblidade da interface List com as classes que a implementam 
		 * o m�todo sort � um m�todo concreto   com c�digo dentro.Assim as classes que implementam
		 * List n�o precisar�o sobreescrever esse m�todo, pois ele � um default method,  e a compatibilidade n�o 
		 * ser� desfeita entre as outras classe.
		 * 
		 * default void sort(<Comparator ? super E > c){
		 * 
		 * Collections.sort(this , c);
		 * 
		 * }
		 * 
		 * O m�todo default  delega a chamada para Collections.
		 * 
		 * */
		
		
		/*
		 * 
		 *
		 * Interface funcionais e lambda
		 * 
		 * Uma interface funcional � uma interface com somente um �nico metodo
		 * abstrato.
		 * 
		 * Isso nos possobilita transformar uma classe an�nima em uma express�o lambda.
		 * 
		 * 
		 * */
		
		/*Com a express�o lamda passamos apenas os par�metros do m�todo compare , seguidos de ->
		 * e sua implementa��o 
		 * 
		 * O m�todo sort j� espera receber um Comparator , assim o compilador  infere que 
		 * esse � o tipo da express�o lamda.
		 * 
		 *  */
		
		
		livros.sort((Livro l1 , Livro l2) ->{
			
			return l1.getNome().compareTo(l2.getNome());
			});
		
		
		/*
		 *
		 *Simplificando esse m�todo , podemos tirar as chaves ,  o ponto e v�rgula,
		 *o tipo Livro dos par�metros
		 *
		 *Esse � uma forma avan�ada de representar a express�o lamda.
		 *O c�digo abaixo nos d� uma instacia de Comparator. 
		 *
		 *O pr�prio compilador infere o tipo dos par�metros 
		 *, n�o h� a necessidade de chaves , pois 
		 *temos uma �nica instru��o depois do ->
		 *e nem da palavra return.
		 * 
		 * */
		
		/*
		 * 
		 * livros.sort((l1 , l2)->l1.getNome().compareTo(l2.getNome())
				
				);

		 *
		 */
			
		
		/*
		 * Podemos tornar nosso c�digo um pouco mais leg�vel e enxuto
		 * usando o m�todo default comparing da interface Comparator,	
		 * o m�todo comparing � uma f�brica(factory) de Comparator.
		 * 	 * */
		
		 
		/*
		 * 		livros.sort(comparing(l-> l.getNome()));

		 * */
		
		

		
		
		/*
		 * method reference 
		 * 
		 * 
		 * A express�o lamda 1 -> 1.getNome() diz ao m�todo comparing 
		 * qual m�todo deve ser usado para compara��o .Ele est�
		 * apenas referenciando um m�todo
		 * 
		 * 
		 * Nesse caso, onde o h� apenas um m�todo para refer�nciar podemos utilizar
		 * essa sintaxe. 
		 * 
		 * Passamos nossa Classe seguida de :: e o m�todo que queremos.
		 * 
		 * 
		 * livros.sort(comparing(Livro::getNome));
		 * 
		 * Esse recurso � chamado de m�thod reference

		 * */
	
		/*
		 * 
		 * forEach do Java8
		 * 
		 * O forEach � um default method da Interface Iterable .
		 * 
		 * A baixo estamos iterando uma lista por meio do enhanced-for
		 * 
		 * for(Livro livro: livros) {
			
			System.out.println(livro.getNome());
		}

		 * 
		 * */
    			
		/*
		 * 
		 * No java 8 podemos iterar de outro jeito
		 * 
		 * Assim como maior parte dos default methods , o metodo
		 * default forEach recebe como par�metro uma inteface funcional
		 * .Nessa caso ela recebe um consumer.
		 * 
		 * Assim , � poss�vel utilizar uma Lambda , pois a inteface s� possui um 
		 * 
		 * metodo.
		 * 
		 * O lambda abaixo diz , para cada livro chame o m�todo  println e 
		 * imprima o nome de cada Livro.
		 * 
		 * 
		 * 
		 * */
		
		//livros.forEach(l->System.out.println(l.getNome()));
    
    	
    	/*
    	 * Filtrando uma collection
    	 * 
    	 * 
    	 * Filtrando Livros pelo autor 
    	 * 
    	 * At� o java 7 para filtramos elementos em uma Lista tinhamos
    	 * que criar uma nova Lista para o resultado e adicionando os elementos
    	 * que queremos nessa lista.
    	 * 
    	 * 
    	 * Al�m de ser muito verboso , tivemos que adicionar uma Lista
    	 * intermedi�ria para o resultado.
    	 * 
    	 * Opera��es para filtrar elementos est� presente na API Stream.
    	 * Essa api trabalha de forma funcional de trabalhar com as
    	 * Cole��es .
    	 * 
    	 * 
    	 * */
    	
    	
    	/*
    	 * Como a filtragem era feita no Java 7
    	 * 
    	 * List<Livro> filtrados = new ArrayList<>();
    	
    	for(Livro livro : livros) {
    		
    		if(livro.getNome().contains("java")) {
    			filtrados.add(livro);
    		}
    	}

    	 * 
    	 * */
		
		/*
		 * for(Livro livro : filtrados){
		 * 
		 * System.out.println(livro.getNome);
		 * 
		 * }
		 * 
		 * */
    	    	
    	
    	
    
    	
    	
    /*
     * Stream e Filter
     * 
     * Para Criar um Stream utilizamos o m�todo default chamado
     * stream definido na Interface Collection
     * 
     * A partir desse do nosso Stream<Livro>
     * 
     * podemos usar o m�todo filter para iterar nossos livros
     * e filtra somente os com o nome "Java" 
     * 
     * A API do Stream � imut�vel , isso � , n�o altera sua cole��o inicial
     * 
     * Por isso os outros Livro ir�o aparecer junto com o que filtramos.
     * Para que isso n�o aconte�a tamb�m podemos usar o ForEach que tamb�m
     * est�o presente na Iteface Stream e printar o Livro que filtramos 
     * 
     * 
     * 
     * */
    	
     Stream<Livro> stream = livros.stream();
    	
     livros.stream().filter(l->l.getNome().contains("Java"))
     .forEach(l->System.out.println(l.getNome()));
     
   
     
     /*
      * 
      * 
      *   for(Livro livro : livros) {
		
		System.out.println(livro.getNome());
	}
      * 
      * */
   

   
     
     
 	   
    	
	}

}
