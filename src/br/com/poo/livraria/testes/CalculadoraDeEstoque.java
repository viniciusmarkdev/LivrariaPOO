package br.com.poo.livraria.testes;

public class CalculadoraDeEstoque {
		
	public static void main(String[] args) {
		
		
		
		double soma = 0;
	
		
		//*Casting  int  livroJava8 = 59.90 um tipo int n�o consegue guardar um tipo flutuante
	    //* Mas o contr�rio � poss�vel
		
		
		for(double i =0; i <35 ; i++) {
			
			soma+=59.90;
		}
		
		System.out.println("O total em estoque � : " +  soma);
		
		if (soma <150 ) {
			
			System.out.println("Seu estoque est� muito baixo");
		}else if (soma>=2000) {
			System.out.println("Seu estoque est� muito alto");
		}
		else {
			
			System.out.println("Seu estoque est� bom ");
		}
	}

}
