package br.com.poo.livraria.produtos;

import br.com.poo.livraria.Autor;

public class LivroFisico extends Livro  implements Promocional{

	public LivroFisico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LivroFisico(Autor autor) {
		super(autor);
		// TODO Auto-generated constructor stub
	}
	
    
	public double getTaxaImpressao() {
		
		return this.getValor()*0.05;
	}
	
	
	public boolean aplicaDescontoDe(double porcentagem) {
		
		if(porcentagem>0.3) {
			
			return false;
		}
		
		double desconto = getValor()*porcentagem;
	    setValor(getValor()- desconto);
		
		System.out.println("aplicando desconto no Livro Fisico");
		return true;
	}
	
		
	
	

}
