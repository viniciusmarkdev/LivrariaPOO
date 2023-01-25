package br.com.poo.livraria.testes;

import br.com.poo.livraria.Autor;
import br.com.poo.livraria.produtos.Ebook;
import br.com.poo.livraria.produtos.Livro;
import br.com.poo.livraria.produtos.LivroFisico;
import br.com.poo.livraria.produtos.Produto;

public class CadastroDeLivros {
	
	
	public static void main(String[] args) {
		
		//Instânciação do objeto Livro
		//Quando usamos new  a JVM busca o contrutor na classe que queremos 
		// O construtor tem o mesmo nome da classe e é como um método : public Livro()
		//Quando não definimos um construdor na classe o compiliador  gera um 
		//automaticamente 
		//O construtor  executa todo código que estiver dentro dele quando o ojeto é criado

		
	
		
		
		
		
		
		
		
		
		
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
	     * O método equals é outro método da classe
	     * Object. Ele serve para compararmos Objetos 
	     *  * 
	     * */
	
	    
	    if(!livro.aplicaDescontoDe(0.3)) {
	    	
	    	System.out.println("Desconto no livro não pode ser maior que 30%");
	    }else {
	    	
	    	System.out.println("Valor do livro com desconto :"+livro.getValor());
	    }
	    
	    Ebook ebook = new Ebook(autor);
	    ebook.setValor(29.90);
		System.out.println(ebook);
		
	    
	    
	    if(!ebook.aplicaDescontoDe(0.15)) {
	    	
	    	System.out.println("Desconto no ebook não pode ser maior do que 15%");
	    }else {
	    
	    	System.out.println("Valor do ebook com desconto"+ebook.getValor());
	    }
	    
	
	    
	    
	    
	    
	    Autor autor1 = new Autor();
		 autor1.setNome("Carlos");
		 Autor autor2 = new Autor();
		 autor2.setNome("Julio");
			
			/*
			 * Se passarmos um Objeto para o método
			 * equal iremos receber um  exception 
			 * Java.lang.ClassCastExeception , pois Objeto que
			 * passamos não é do tipo moldado.
			 * */
		    if(autor1.equals(autor2)) {

           
		    		  System.out.println("Igual");
		    		
		    	  
		    }else {
		    	
		    	System.out.println("Diferente");
		    }
	   
	    }
	
   
	
	
	     
	  
	    
	    
		
 }


