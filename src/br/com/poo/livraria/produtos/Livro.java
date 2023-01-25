package br.com.poo.livraria.produtos;

import br.com.poo.livraria.Autor;
import br.com.poo.livraria.exception.AutorNuloException;

//**Uma classe � basicamente um forma para criar o objetos
/*Uma classe abstrata n�o pode ser instanciada , ela serve basicamente para servir 
  com polimorfismo e heran�a as subclasses , abstraindo tudo que um Livro tem
 ** 
*/
public abstract class Livro implements Produto {

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	// *composi��o
	private Autor autor;
	private boolean impresso;
	
	
	/*
	 * reescrevendo o m�todo compareTo
	 * 
	 * Aqui estamos reescrevendo o m�todo que est� na interface
	 * Comparable<Produto> 
	 * 
	 * Passamos um par�metro do tipo produto para comparar
	 * 
	 * se o valor do Objeto(this) for menor que o valor do Objeto comparado retornamos
	 * -1 (o valor deve vir antes na Ordena��o), se o valor do Objeto for maior retornamos 1
	 * (deve vir depois na ordena��o) , se o Objeto for igual retornamos 0.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	@Override
	
	
	public int compareTo(Produto outro) {
		
		
		if(this.getValor() < outro.getValor()) {
			return -1;
		}
		
		if(this.getValor()>outro.getValor()) {
			return 1;
		}
		return 0;
		
	}

	public Livro(Autor autor) {

		this();
		this.autor = autor;

		if (autor == null) {
			throw new AutorNuloException(

					"O autor do livro n�o pode ser nulo"

			);
		}
	}

	// Overloaded
	public Livro() {

		this.isbn = "000-00-00000-00-0";

	}

	

	/*
	 * fazendo as regras de neg�cio dessa forma , para cada tipo de livro ,seja
	 * e-book ,fisico ou outro temos que aplicar regra de neg�cio espec�fica para
	 * cada tipo e usar um if, mas isso � um problema, pois esse novo tipo pode ter
	 * caracteristicas pr�prias e se tivermos que colocar mais livros o uso do if
	 * ser� exagerado , o que torna a classe d�ficil de dar manuten��o
	 * 
	 * public boolean aplicaDescontoDe(double porcentagem) {
	 * 
	 * if(porcentagem>0.3) {
	 * 
	 * return false; }
	 * 
	 * double desconto = getValor()*porcentagem; setValor(getValor()- desconto);
	 * 
	 * System.out.println("aplicando desconto no Livro Fisico"); return true; }
	 *
	 *
	 *
	 *
	 */

	/*
	 * Aqui definimos que o m�todo aplicaDescontoDe sempre retornar� um false, dessa
	 * forma sempre que criarmos um livro n�o esqueceremos de aplicar as regras
	 * especif�cas deste tipo de Livro e caso o Livro n�o tenha desconto n�o
	 * precisaremos reescrever esse m�todo public abstract boolean
	 * aplicaDescontoDe(double porcentagem) {
	 * 
	 * 
	 * 
	 * return false; }
	 * 
	 * 
	 * 
	 */

	/*
	 * O C�digo acima permite que ao criar um tipo de Livro ele n�o ter� um desconto
	 * , assim teremos que reescrever esse c�digo nas classes de Livro que tem
	 * desconto e a classe minilivro n�o ter� , por�m ainda temos um problema , pois
	 * poderemos esquecer de reescrever o c�digo nos livros que precisam de
	 * desconto.
	 * 
	 * Para resolver o problema acima precisamos tornar o m�todo aplicaDescontoDe
	 * abstrato.Somente classes abstratas pode ter m�todos abstratos.A partir do
	 * momemnto que tornamos esse m�todo abstrato , as classe filhas ter�o que
	 * reescrever esse m�todo , caso ao contr�rio ela n�o compilar� , assim podemos
	 * escolher se um tipo de Livro ter� um deconto ou n�o sem prejudicar o
	 * polimorfismo.
	 * 
	 * com o uso da interface Promocional n�o � preciso usar esse public abstract
	 * boolean aplicaDescontoDe(double porcentagem);
	 * 
	 * 
	 */
public void  mostrarDetalhes() {
    
		
		System.out.println("Mostrando detalhes do Livro");
		System.out.println("Nome : "+nome);
		System.out.println("Descri��o"+descricao);
		System.out.println("Valor"+valor);
		System.out.println("IBSN"+isbn);
		
		
	
		
		if(this.temAutor()) {
	
			
			autor.mostrarDetalhes();
			
		}
		
		System.out.println("--");
		
	
	}
	
	

	boolean temAutor() {

		return this.autor != null;
	}
	
	
	


	// Encapsulamento dos m�todos que rotornam um valor e os que modificam
	// encapsulamento deixa nosso c�digo muito mais pass�vel de mudan�as.
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	// m�todo que retorna valores
	public String getNome() {

		return nome;
	}

	// m�todo que n�o retorna nenhum valor , espec�ficado pela palavra void
	public void setNome(String nome) {

		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	

}
