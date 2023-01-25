package br.com.poo.livraria.testes;

import br.com.poo.livraria.Autor;
import br.com.poo.livraria.produtos.MiniLivro;

public class RegrasDeDesconto {
	
  	
 public static void main(String[] args) {
	 
	 Autor autor = new Autor();
	 autor.setNome("Claudio nunes");
	 
	 MiniLivro  livro = new MiniLivro(autor);
	 
	 //em um código bem encapsulado você só deveria
	 // conseguir responder a primeira pergunta , o que o código faz 
	 //Não como está fzd
	 livro.setValor(39.90);
	
	 System.out.println("Valor atual: "+livro.getValor());
    
	 
	 
	 
	 
}

}
