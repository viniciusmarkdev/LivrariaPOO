package br.com.poo.livraria;

public class Autor {
	
	
	String nome;
	String email;
	String cpf;
	
	/*
	 * Aqui estamos fazendo a reescrita do método equals.
	 * 
	 * Ele recebe um Object  e logo em seguida faz o casting do 
	 * Object para o tipo Autor , ou seja , todo Objeto passado será
	 * moldado para o tipo autor.Porém pode acontecer a  exception
	 * Java.lang.ClassCastExeception , caso o parametro não seja realmente
	 * um autor, por exemplo ser passar um String como paramentro , pois
	 * ela não pode ser transformada para o tipo autor , devemos tratar 
	 * esse método ou mudar a sintaxe do método como feito a baixo.
	 * 
	 * 
	 * 
	 * */
	@Override 
	public boolean equals(Object obj) {
	     
		/*
		 * Se o Objeto usado como pâmetro não for
		 * uma instância(instanceof)do tipo Object retornamos uma false
		 * 
		 * 
		 * */
		if(!(obj instanceof Autor)) return false;
		Autor outro = (Autor)obj;
		
		return  this.nome.equals(outro.nome);
		
		
	}
	
	
	
	public void mostrarDetalhes() {
		
		
		
		System.out.println("Mostrando detalhes do autor");
		System.out.println("Nome:"+	nome);
        System.out.println("Email:"+email);
		System.out.println("CPF:"+cpf);
		System.out.println("--");
		
		
		
		
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getCpf() {
		return cpf;
	}





	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
   


	
}
