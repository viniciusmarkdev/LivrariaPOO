package br.com.poo.livraria.produtos;

import br.com.poo.livraria.Autor;

//A palavra extends diz que a classe Ebook(subclasse) est� herdando os atributos, m�todos
// e construtores da classe Livro(superclasse)

public class Ebook  extends	 Livro implements Promocional{
	
	
	
	
	
	//Diferen�a  do livro fisico
	private String waterMark;
	
	
	/*
	 * O m�todo toString retorna um Objeto em forma de 
	 * String. Nesse exemplo reescrevemos o M�todo 
	 * toString da superclasse Object para que ele  n�o
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
		
		//A super classe tinha um construtor , assim a subclasse tamb�m tem que ter esse construtor.
		//a palavra super chama a superclasse que j� tem esse comportamento bem definido
		super(autor);
		// TODO Auto-generated constructor stub
	}
	public String getWaterMark() {
		return waterMark;
	}
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

	
	
	@Override  //(reescrita) � uma anota��o , como se fosse um post-it
	//Ao anotar com Override , o m�todo s� compilar� caso caso esse m�todo 
	//n�o exista a classe pai
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
