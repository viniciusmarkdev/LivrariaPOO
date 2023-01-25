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
	 * Código na prática ordenando os livros por nome ,
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
		java8.setNome("Livro 8 prático");
		
		Livro ruby = new LivroFisico(autor);
		ruby.setNome("Livro de ruby");
		
		Livro JavaSpring  = new LivroFisico(autor);
		JavaSpring.setNome("Java SpringBoot");
		List<Livro> livros = Arrays.asList(javaoo , java8 , ruby , JavaSpring);
		
		
		/*
		 * Um problema dessa abordagem é que sempre que quisermos criar um
		 * novo critério de Ordenação teremos que  criar uma nova classe.
		 * 
		 * No Java 7 podemos resolver esse problema utilizando uma classe anonima
		 * 
		 * */
	
		 
		//Como era feito antes 
		//Collections.sort(livros , new ComparadorPorNome());
		
		//Classe anônima
		
		/*
		 * Em uma classe anônima é possível criar uma classe em um local
		 * específico  , que será usada somente ali. Ao utilizar o
		 * Sort e passarmos seus parâmetros , ao inves de passar a
		 * instânciação da nossa classe com o new podemos passar a 
		 * interface Comparator e implementar e sobreescrever seus 
		 * métodos ali mesmo sem dar uma nome para a classe.
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
		 * O que código acima é uma pouco difícil de ler para simplicar esse processo 
		 * o Java 8 introduziu o método sort na interface List .Assim , podemos fazer
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
		 * Para não quebrar a compatiblidade da interface List com as classes que a implementam 
		 * o método sort é um método concreto   com código dentro.Assim as classes que implementam
		 * List não precisarão sobreescrever esse método, pois ele é um default method,  e a compatibilidade não 
		 * será desfeita entre as outras classe.
		 * 
		 * default void sort(<Comparator ? super E > c){
		 * 
		 * Collections.sort(this , c);
		 * 
		 * }
		 * 
		 * O método default  delega a chamada para Collections.
		 * 
		 * */
		
		
		/*
		 * 
		 *
		 * Interface funcionais e lambda
		 * 
		 * Uma interface funcional é uma interface com somente um único metodo
		 * abstrato.
		 * 
		 * Isso nos possobilita transformar uma classe anônima em uma expressão lambda.
		 * 
		 * 
		 * */
		
		/*Com a expressão lamda passamos apenas os parâmetros do método compare , seguidos de ->
		 * e sua implementação 
		 * 
		 * O método sort já espera receber um Comparator , assim o compilador  infere que 
		 * esse é o tipo da expressão lamda.
		 * 
		 *  */
		
		
		livros.sort((Livro l1 , Livro l2) ->{
			
			return l1.getNome().compareTo(l2.getNome());
			});
		
		
		/*
		 *
		 *Simplificando esse método , podemos tirar as chaves ,  o ponto e vírgula,
		 *o tipo Livro dos parâmetros
		 *
		 *Esse é uma forma avançada de representar a expressão lamda.
		 *O código abaixo nos dá uma instacia de Comparator. 
		 *
		 *O próprio compilador infere o tipo dos parâmetros 
		 *, não há a necessidade de chaves , pois 
		 *temos uma única instrução depois do ->
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
		 * Podemos tornar nosso código um pouco mais legível e enxuto
		 * usando o método default comparing da interface Comparator,	
		 * o método comparing é uma fábrica(factory) de Comparator.
		 * 	 * */
		
		 
		/*
		 * 		livros.sort(comparing(l-> l.getNome()));

		 * */
		
		

		
		
		/*
		 * method reference 
		 * 
		 * 
		 * A expressão lamda 1 -> 1.getNome() diz ao método comparing 
		 * qual método deve ser usado para comparação .Ele está
		 * apenas referenciando um método
		 * 
		 * 
		 * Nesse caso, onde o há apenas um método para referênciar podemos utilizar
		 * essa sintaxe. 
		 * 
		 * Passamos nossa Classe seguida de :: e o método que queremos.
		 * 
		 * 
		 * livros.sort(comparing(Livro::getNome));
		 * 
		 * Esse recurso é chamado de méthod reference

		 * */
	
		/*
		 * 
		 * forEach do Java8
		 * 
		 * O forEach é um default method da Interface Iterable .
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
		 * default forEach recebe como parâmetro uma inteface funcional
		 * .Nessa caso ela recebe um consumer.
		 * 
		 * Assim , é possível utilizar uma Lambda , pois a inteface só possui um 
		 * 
		 * metodo.
		 * 
		 * O lambda abaixo diz , para cada livro chame o método  println e 
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
    	 * Até o java 7 para filtramos elementos em uma Lista tinhamos
    	 * que criar uma nova Lista para o resultado e adicionando os elementos
    	 * que queremos nessa lista.
    	 * 
    	 * 
    	 * Além de ser muito verboso , tivemos que adicionar uma Lista
    	 * intermediária para o resultado.
    	 * 
    	 * Operações para filtrar elementos está presente na API Stream.
    	 * Essa api trabalha de forma funcional de trabalhar com as
    	 * Coleções .
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
     * Para Criar um Stream utilizamos o método default chamado
     * stream definido na Interface Collection
     * 
     * A partir desse do nosso Stream<Livro>
     * 
     * podemos usar o método filter para iterar nossos livros
     * e filtra somente os com o nome "Java" 
     * 
     * A API do Stream é imutável , isso é , não altera sua coleção inicial
     * 
     * Por isso os outros Livro irão aparecer junto com o que filtramos.
     * Para que isso não aconteça também podemos usar o ForEach que também
     * estão presente na Iteface Stream e printar o Livro que filtramos 
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
