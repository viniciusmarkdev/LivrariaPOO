package br.com.poo.livraria.testes;

import java.util.Comparator;

import br.com.poo.livraria.produtos.Livro;


/*
 * O Java 8 introduziu novas formas de trabalhar com Collections
 * 
 * Ordenando com Java 8 
 * 
 * 
 * Se quisesemos Ordenador nossos Livros de acordo com outra regra, não
 * pelo valor , mas pelo nome ?
 * 
 * No Java 7 precisariamos  criar outra classeem implementar a interface Comparator
 * igual a baixo.
 * 
 * O método sort da interface Collections tem uma sobrecarga que recebe um coparator
 * como parâmetro 
 * 
 * Collections.sort(livros , new ComparadorPorNome());
 * 
 * 
 * 
 * */
public class ComparadorPorNome implements Comparator<Livro>{

	@Override
	public int compare(Livro l1, Livro l2) {
		// TODO Auto-generated method stub
		return l1.getNome().compareTo(l2.getNome());
	}

	
}
