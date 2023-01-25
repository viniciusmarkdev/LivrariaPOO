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
			  
			  System.out.println("Valor agora � " + fisico.getValor());
		  }
		  
		
	  
	 
	 
	 
	 
	 
	 
	 
          

	    ArrayList<Produto> produtos = carrinho.getProdutos();
	    
	    
	    for(Produto produto : produtos) {
	    	System.out.println(produto);
	    }
	    
	    /*
	     *	 Ao rodar o c�digo com o <=10 queremos iterar em um ind�ce maior que o
	     * delimitado (10 no nosso caso) , assim o c�digo gera uma stacktrace
	     * 
	     * */
	    
	    
	    /*
	     * enhaced-for - funciona com qualque elemento do tipo iterable
	     * 
	     * � poss�vel iterar um array com uma sintaxe diferente
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
	     *N�o precisamos de um indice para iterar o array e isso
	     *evita o problema com <= ArrayIndexOutBoundsException
	     * 
	     * */
	    
	    
	    /*
	     * EXCE��ES
	     * 
	     * Uma exception serve para passar informa��es quando acontece um problema
	     * para que possamos resolve-lo
	     * 
	     * Um exemplo � a exception  java.lang.ArrayIndexOutOfBoundsException
	     * 
	     * na primeira linha � exibida no console o tipo do erro e na segunda o 
	     * 
	     * fully qualified name ou nome inteiro da classe e a linha onde occoreu 
	     * a exce��o
	     * 
	     * 
	     * 
	     * */
	 //   for(int i = 0 ; i <  produtos.length;i++) {
	    	
	   /*
	    * Tratanndo Exceptions com tr/catch
	    * 
	    * */
	    	
	    
	  /*Try tentando executar um bloco ondeh h� a possibiliade de
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
	    	 * espec�fico indicado dentro do catch
	    	 * 
	    	 * O catch impede que a mensagem de erro seja exibida na tela 
	    	 * e a execu��o do c�digo n�o � impedida 
	    	 * 
	    	 * Toda exception e filha da classe Exception
	    	 * 
	    	 * Se quisermos tratar todo tipo de exception basta declarar
	    	 * o catch como Exception , mas se quisermos tratar uma 
	    	 * exception espec�fica temos que colocar a exception que queremos 
	    	 * dentro do catch.
	    	 * 
	    	 * 
	    	 * H� v�rios tipos de exceptions que os programadores podem resolvir 
	    	 * facilmente .S�o chamadas de exceptions unchecked , na qual o compilador
	    	 * n�o checa se estamos as tratando ou n�o 
	    	 * */
	  //  } catch(ArrayIndexOutOfBoundsException e ) {
	    	
	 ///   	System.out.println("Deu exception no indice:"+ i);
	    	
	   // 	e.printStackTrace();
	    	
	    	
	    	/*Capturando mais de uma exception*/
	//    } catch(NullPointerException e ) {
	    	
	//    	System.out.println("A array n�o foi instanciado:"+ i);
	    	
	 //   }
	    
	    
	
	 //   }
	    
	 //   System.out.println("Fui executado!");
	    
	    
	      //Para isso funcionar seria preciso fazer um casting do Livro para um Ebook,
		  //Assim poder�amos utilizar os atribustos e m�todos de um e-book
		  
		  //M�todo de casting  //public void adiciona(Livro livro){
          //	Ebook = (Ebook)new Livro() 
		  
          //ebook.getWaterMark();	 
          //Por�m isso � ruim , pois o usuario pode passar um Livro fisico ,
          //assim teriamos que fazer if e o polimorfimo j� n�o seria t�o necessario	  }
          //carrinho.adiciona(ebook.getWaterMark());		
		  
		
		  
		  /* Checked exception  � uma exece��o que n�o pode ser
		   * iginorada pelo compilador, como por exemplo um c�digo que
		   * verifica se  h� um arquivo ou n�o
		   * 
		   * */
		
	    
		//  try {
			  
        //      abreArquivo();

			  
		//  }catch( FileNotFoundException e1) {
			  
		//	  System.out.println("N�o consegui abrir o arquivo");
			  
		//  }
		
		  
		  
		  	
		  
		 


		
		
		
		
	}
	
	/*
	 * Delegando o tratamento(catch) para que invocar o m�todo abreArquivo()
	 * 
	 * se chamarmos o m�todo abreArquivo() no bloco da main e delegarmos o tratamento
	 * com throw n�nguem tratar� a exception , mas sim  a JVM
	 * 
	 * */
	
	  
	 
	// public static void abreArquivo() throws FileNotFoundException{
			
	//		new java.io.FileInputStream("arquivo.txt");
	//	}
		
		
	



}











