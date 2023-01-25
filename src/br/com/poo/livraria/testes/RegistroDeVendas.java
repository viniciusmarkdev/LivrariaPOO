package br.com.poo.livraria.testes;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import br.com.poo.livraria.Autor;
import br.com.poo.livraria.produtos.Ebook;
import br.com.poo.livraria.produtos.LivroFisico;
import br.com.poo.livraria.produtos.Produto;


public class RegistroDeVendas {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
	   // abreArquivo();
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		
		LivroFisico fisico = new LivroFisico(autor);
		
	     
		
		fisico.setNome("Test-Driven Development");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-driven Development");
		ebook.setValor(29.90);
		
		
		 
		  CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		  
		  carrinho.adiciona(ebook);
		  carrinho.adiciona(fisico);
		  
		  
		  System.out.println("Total:"+carrinho.getTotal());
		  
		  
		  if(fisico.aplicaDescontoDe10Porcento()) {
			  
			  System.out.println("Valor agora é " + fisico.getValor());
		  }
		  
		
	  
	 
	 
	 
	 
	 
	 
	 
          

	    ArrayList<Produto> produtos = carrinho.getProdutos();
	    
	    
	    for(Produto produto : produtos) {
	    	System.out.println(produto);
	    }
	    
	    /*
	     *	 Ao rodar o código com o <=10 queremos iterar em um indíce maior que o
	     * delimitado (10 no nosso caso) , assim o código gera uma stacktrace
	     * 
	     * */
	    
	    
	    /*
	     * enhaced-for - funciona com qualque elemento do tipo iterable
	     * 
	     * É possível iterar um array com uma sintaxe diferente
	     * 
	     * Um objeto Produto chamado produto + ":" +  array 
	     * que queremos iterar chamado produtos 
	     * 
	     * for(Produto produto : produtos){
	     * 
	     * if(produto !=null){
	     * 
	     * System.out.println(produto.getValor());
	     * }
	     * 
	     * }
	     * 
	     *Não precisamos de um indice para iterar o array e isso
	     *evita o problema com <= ArrayIndexOutBoundsException
	     * 
	     * */
	    
	    
	    /*
	     * EXCEÇÕES
	     * 
	     * Uma exception serve para passar informações quando acontece um problema
	     * para que possamos resolve-lo
	     * 
	     * Um exemplo é a exception  java.lang.ArrayIndexOutOfBoundsException
	     * 
	     * na primeira linha é exibida no console o tipo do erro e na segunda o 
	     * 
	     * fully qualified name ou nome inteiro da classe e a linha onde occoreu 
	     * a exceção
	     * 
	     * 
	     * 
	     * */
	 //   for(int i = 0 ; i <  produtos.length;i++) {
	    	
	   /*
	    * Tratanndo Exceptions com tr/catch
	    * 
	    * */
	    	
	    
	  /*Try tentando executar um bloco ondeh há a possibiliade de
	   *  acontecer um erro
	   * */ 
	    	/*
	    	 * 
	    	 * 
	    	 * 
	    	 * */
	    	
	    //	try {	
	    //		Produto produto = produtos[i];
	    	
	    
	    //	if(produto != null) {
	    		
	    //		System.out.println(produto.getValor());
	   //}
	    	
	    	/*
	    	 * Capturar caso ocorra um exception nessa bloco , do tipo 
	    	 * específico indicado dentro do catch
	    	 * 
	    	 * O catch impede que a mensagem de erro seja exibida na tela 
	    	 * e a execução do código não é impedida 
	    	 * 
	    	 * Toda exception e filha da classe Exception
	    	 * 
	    	 * Se quisermos tratar todo tipo de exception basta declarar
	    	 * o catch como Exception , mas se quisermos tratar uma 
	    	 * exception específica temos que colocar a exception que queremos 
	    	 * dentro do catch.
	    	 * 
	    	 * 
	    	 * Há vários tipos de exceptions que os programadores podem resolvir 
	    	 * facilmente .São chamadas de exceptions unchecked , na qual o compilador
	    	 * não checa se estamos as tratando ou não 
	    	 * */
	  //  } catch(ArrayIndexOutOfBoundsException e ) {
	    	
	 ///   	System.out.println("Deu exception no indice:"+ i);
	    	
	   // 	e.printStackTrace();
	    	
	    	
	    	/*Capturando mais de uma exception*/
	//    } catch(NullPointerException e ) {
	    	
	//    	System.out.println("A array não foi instanciado:"+ i);
	    	
	 //   }
	    
	    
	
	 //   }
	    
	 //   System.out.println("Fui executado!");
	    
	    
	      //Para isso funcionar seria preciso fazer um casting do Livro para um Ebook,
		  //Assim poderíamos utilizar os atribustos e métodos de um e-book
		  
		  //Método de casting  //public void adiciona(Livro livro){
          //	Ebook = (Ebook)new Livro() 
		  
          //ebook.getWaterMark();	 
          //Porém isso é ruim , pois o usuario pode passar um Livro fisico ,
          //assim teriamos que fazer if e o polimorfimo já não seria tão necessario	  }
          //carrinho.adiciona(ebook.getWaterMark());		
		  
		
		  
		  /* Checked exception  é uma execeção que não pode ser
		   * iginorada pelo compilador, como por exemplo um código que
		   * verifica se  há um arquivo ou não
		   * 
		   * */
		
	    
		//  try {
			  
        //      abreArquivo();

			  
		//  }catch( FileNotFoundException e1) {
			  
		//	  System.out.println("Não consegui abrir o arquivo");
			  
		//  }
		
		  
		  
		  	
		  
		 


		
		
		
		
	}
	
	/*
	 * Delegando o tratamento(catch) para que invocar o método abreArquivo()
	 * 
	 * se chamarmos o método abreArquivo() no bloco da main e delegarmos o tratamento
	 * com throw nínguem tratará a exception , mas sim  a JVM
	 * 
	 * */
	
	  
	 
	// public static void abreArquivo() throws FileNotFoundException{
			
	//		new java.io.FileInputStream("arquivo.txt");
	//	}
		
		
	



}











