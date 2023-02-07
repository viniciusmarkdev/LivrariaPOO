package br.com.poo.livraria.testes;

import br.com.poo.livraria.Autor;
import br.com.poo.livraria.produtos.Ebook;
import br.com.poo.livraria.produtos.Livro;
import br.com.poo.livraria.produtos.LivroFisico;
import br.com.poo.livraria.produtos.Produto;

public class CadastroDeLivros {
	
	
	public static void main(String[] args) {
		
		//Inst�ncia��o do objeto Livro
		//Quando usamos new  a JVM busca o contrutor na classe que queremos 
		// O construtor tem o mesmo nome da classe e � como um m�todo : public Livro()
		//Quando n�o definimos um construdor na classe o compiliador  gera um 
		//automaticamente 
		//O construtor  executa todo c�digo que estiver dentro dele quando o ojeto � criado

			
		
		/*
		 * 
		 * Quando usamos um new ao criar um Objeto , por exemplo , 
		 * um novo
		   autor , n�o estamos passando sua var�aveis e m�todos , mas
		   apenas criando uma refer�ncia de um objeto e passando para
		   v�riavel  n�o seus  valores, 
		   assim podemos acessar suas var�aveis e m�todos em mem�ria.
		   
		   Se , por exemplo , fizermos isso :
		   
		   
		   Autor autor = new Autor();
		   
		   autor.nome = "Julio cesar"
		  
		   Livro livro = new Livro() ;
		   
		   livro.autor = autor ;
		   
		   E depois modificarmos o autor dessa forma :
		   
		   livro.autor.nome = "Marcos Vinicius"
		   
		   
		   Qual ser� a sa�da  ao imprimir autor.nome
		   ? Podemos pensar no primeiro nome , 
		   mas ser� Marcos Vinicius . Quando passamos o autor
		   para um Livro a refer�ncia do autor fica salva e podemos
		   nos refer�nciar ao autor de duas formas pelo livro e pelo
		   pr�prio autor.Assim o livro.autor tem o mesmo endere�o de 
		   mem�ria que o autor.
		   
		   Fazer livro.autor.nome � a mesma coisa de fazer autor.nome
		   
		   
		   

		 * 
		 * */
		
		
		
		
		
		
		
		Autor outroAutor= new Autor();
		outroAutor.setNome("Paulo silveira");
		outroAutor.setEmail( "Paulo.silveira@caelum.com.br");
		outroAutor.setCpf( "123.456.789.10");
	
	    Autor autor = new Autor();
        autor.setNome( "Rodrigo Turini");
	    autor.setEmail("rodrigo.turini@caelum.com.br");
	    autor.setCpf( "123.456.789.10");
		
		LivroFisico livro = new LivroFisico(autor);
		livro.setNome("JavaPOO");
		livro.setDescricao("Retomando conceitos");
		livro.setValor(59.90);
		
		
		
		
		
		LivroFisico outroLivro = new LivroFisico(outroAutor);
	    outroLivro.setNome( "JavaPOO");
	    outroLivro.setDescricao( "Retomando conceitos e aprofundando");
	    outroLivro.aplicaDescontoDe(70);
	    
	    
	    
	    
	    
	  
	    
	    livro.setAutor(autor);
	    
	    autor.mostrarDetalhes();
	    
	    
	  
	    
	    livro.setAutor(outroAutor);
	    
	    
	    autor.mostrarDetalhes();
	    
	    
	    livro.mostrarDetalhes();
	    
	    
	    /*
	     * O m�todo equals � outro m�todo da classe
	     * Object. Ele serve para compararmos Objetos 
	     *  * 
	     * */
	
	    
	    if(!livro.aplicaDescontoDe(0.3)) {
	    	
	    	System.out.println("Desconto no livro n�o pode ser maior que 30%");
	    }else {
	    	
	    	System.out.println("Valor do livro com desconto :"+livro.getValor());
	    }
	    
	    Ebook ebook = new Ebook(autor);
	    ebook.setValor(29.90);
		System.out.println(ebook);
		
	    
	    
	    if(!ebook.aplicaDescontoDe(0.15)) {
	    	
	    	System.out.println("Desconto no ebook n�o pode ser maior do que 15%");
	    }else {
	    
	    	System.out.println("Valor do ebook com desconto"+ebook.getValor());
	    }
	    
	
	    
	    
	    
	    
	    Autor autor1 = new Autor();
		 autor1.setNome("Carlos");
		 Autor autor2 = new Autor();
		 autor2.setNome("Julio");
			
			/*
			 * Se passarmos um Objeto para o m�todo
			 * equal iremos receber um  exception 
			 * Java.lang.ClassCastExeception , pois Objeto que
			 * passamos n�o � do tipo moldado.
			 * */
		    if(autor1.equals(autor2)) {

           
		    		  System.out.println("Igual");
		    		
		    	  
		    }else {
		    	
		    	System.out.println("Diferente");
		    }
	   
	    }
	
   
	
	
	     
	  
	    
	    
		
 }


