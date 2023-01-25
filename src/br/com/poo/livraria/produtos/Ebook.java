package br.com.poo.livraria.produtos;

import br.com.poo.livraria.Autor;

//A palavra extends diz que a classe Ebook(subclasse) está herdando os atributos, métodos
// e construtores da classe Livro(superclasse)

public class Ebook  extends	 Livro implements Promocional{
	
	
	
	
	
	//Diferença  do livro fisico
	private String waterMark;
	
	
	/*
	 * O método toString retorna um Objeto em forma de 
	 * String. Nesse exemplo reescrevemos o Método 
	 * toString da superclasse Object para que ele  não
	 * retorne um hashcode do Objeto Ebook , mas sim 
	 * a string "Eu sou um ebook"
	 * */
	@Override
     public String toString() {
    	 return "Eu sou um ebook";
     }
	
	
	
	public Ebook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ebook(Autor autor) {
		
		//A super classe tinha um construtor , assim a subclasse também tem que ter esse construtor.
		//a palavra super chama a superclasse que já tem esse comportamento bem definido
		super(autor);
		// TODO Auto-generated constructor stub
	}
	public String getWaterMark() {
		return waterMark;
	}
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

	
	
	@Override  //(reescrita) é uma anotação , como se fosse um post-it
	//Ao anotar com Override , o método só compilará caso caso esse método 
	//não exista a classe pai
	public boolean aplicaDescontoDe(double porcentagem) {
		
		if(porcentagem>0.15) {
			
			return false;
		}
		
	   //Garante o encapsulamento da classe , sem precisar 
	   
	   System.out.println("aplicando desconto no Ebook");
	   double desconto = this.getValor()*porcentagem;
	   this.setValor(this.getValor()-desconto);
	   return true;	
	}
	

}
