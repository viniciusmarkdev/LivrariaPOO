package br.com.poo.livraria.testes;

public class OperadorTern�rio {
	
	
	public static void main(String[] args) {
	
		//*Normal
		
		double v1=2;
		
		double v2=1;
		double valor = 0;
		
		if(v1>v2) {
			valor = 100;
		}
		
		else {
			valor = 0;
		}
		
	}
	
	
	//Tern�rio
	double v1=2;
	
	double v2=1;
	double valor = v1>v2?100:0;//* ? a interroga��o siginifica verdade , se v1 >v2 100 = ? , 
	//*ou seja , verdade. Os dois pontos siginifica mentira , se v1 n�o for maior que v2  o valor � igual a 0

	
}


