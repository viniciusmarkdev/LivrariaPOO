package br.com.poo.livraria.testes;

public class ConsultaDeDescontos {
	
	public static void main(String[] args) {
		
		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
		
		gerenciador.duplicacao();
		
		Double desconto = gerenciador.validaCupom("cab11");
		
		if(desconto != null)  {
				
			System.out.println("Cupom de desconto valido");
			System.out.println("Valor  " + desconto);
		}
		
		else {
			
			System.out.println("Esse cupom não existe");
		}
	}

}
