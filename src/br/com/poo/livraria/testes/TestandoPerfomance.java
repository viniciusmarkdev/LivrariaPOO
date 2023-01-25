package br.com.poo.livraria.testes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestandoPerfomance {
	
	
	public static void main(String[] args) {
		
		/*
		 * Uma vantagem  muito importante do Set  e sua implementação 
		 * HashSet é uma perfomance  muito melhor do que uma List
		 * (em relação a tempo)
		 *  para fazer  consultas (
		 * o próprio método contains) e para adicionar valores.
		 * 
		 * Fazendo um teste o HashSet demora 40ms para rodar 
		 * já o ArrayList 56284 milisegundos.
		 * 
		 * 
		 *Isso acontece  , pois o HashSet Busca os elementos de
		 *forma espelhada e o ArrayList de forma ordenada.
		 *
		 *Por exemplo , usando uma alusão de sopa de Letrinhas .
		 *
		 *No primeiro exemplo , queremos pegar as letras A .
		 *
		 *Se abrirmos o pacote , pegar cada letra e verificar
		 *se ela  é a letra A demanda muito tempo(ArrayList)
		 *
		 *Já se espelharmos o conteúdo do pacote e observar
		 *cada letra A e pegarmos imediatamente demoraremos menos
		 *(HashSet).
		 *   
		 *   
		 * */
		
		
		
		
	    List<String> colecao = new ArrayList<String>();
		
		for(int i=0 ; i<100000 ; i++) {
			
			colecao.add("Item"+i);
			
		}
		
		long inicio = System.currentTimeMillis();
		
		
		
        for(int i=0 ; i<100000 ; i++) {
			
			colecao.contains("Item"+i);
			
		}
        
        long fim = System.currentTimeMillis();
        
        
        
        long tempo = fim - inicio;
        
        System.out.println("Demorou  " +tempo+"  MS para executar");
        
        
        
        
		
        
		
	}
	
	
	
	

}
