package br.com.poo.livraria.produtos;

import br.com.poo.livraria.Autor;
import br.com.poo.livraria.exception.AutorNuloException;

//**Uma classe é basicamente um forma para criar o objetos
/*Uma classe abstrata não pode ser instanciada , ela serve basicamente para servir 
  com polimorfismo e herança as subclasses , abstraindo tudo que um Livro tem
 ** 
*/
public abstract class Livro implements Produto {

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	// *composição
	private Autor autor;
	private boolean impresso;
	
	
	/*
	 * reescrevendo o método compareTo
	 * 
	 * Aqui estamos reescrevendo o método que está na interface
	 * Comparable<Produto> 
	 * 
	 * Passamos um parâmetro do tipo produto para comparar
	 * 
	 * se o valor do Objeto(this) for menor que o valor do Objeto comparado retornamos
	 * -1 (o valor deve vir antes na Ordenação), se o valor do Objeto for maior retornamos 1
	 * (deve vir depois na ordenação) , se o Objeto for igual retornamos 0.
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

					"O autor do livro não pode ser nulo"

			);
		}
	}

	// Overloaded
	public Livro() {

		this.isbn = "000-00-00000-00-0";

	}

	

	/*
	 * fazendo as regras de negócio dessa forma , para cada tipo de livro ,seja
	 * e-book ,fisico ou outro temos que aplicar regra de negócio específica para
	 * cada tipo e usar um if, mas isso é um problema, pois esse novo tipo pode ter
	 * caracteristicas próprias e se tivermos que colocar mais livros o uso do if
	 * será exagerado , o que torna a classe díficil de dar manutenção
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
	 * Aqui definimos que o método aplicaDescontoDe sempre retornará um false, dessa
	 * forma sempre que criarmos um livro não esqueceremos de aplicar as regras
	 * especifícas deste tipo de Livro e caso o Livro não tenha desconto não
	 * precisaremos reescrever esse método public abstract boolean
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
	 * O Código acima permite que ao criar um tipo de Livro ele não terá um desconto
	 * , assim teremos que reescrever esse código nas classes de Livro que tem
	 * desconto e a classe minilivro não terá , porém ainda temos um problema , pois
	 * poderemos esquecer de reescrever o código nos livros que precisam de
	 * desconto.
	 * 
	 * Para resolver o problema acima precisamos tornar o método aplicaDescontoDe
	 * abstrato.Somente classes abstratas pode ter métodos abstratos.A partir do
	 * momemnto que tornamos esse método abstrato , as classe filhas terão que
	 * reescrever esse método , caso ao contrário ela não compilará , assim podemos
	 * escolher se um tipo de Livro terá um deconto ou não sem prejudicar o
	 * polimorfismo.
	 * 
	 * com o uso da interface Promocional não é preciso usar esse public abstract
	 * boolean aplicaDescontoDe(double porcentagem);
	 * 
	 * 
	 */
public void  mostrarDetalhes() {
    
		
		System.out.println("Mostrando detalhes do Livro");
		System.out.println("Nome : "+nome);
		System.out.println("Descrição"+descricao);
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
	
	
	


	// Encapsulamento dos métodos que rotornam um valor e os que modificam
	// encapsulamento deixa nosso código muito mais passível de mudanças.
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	// método que retorna valores
	public String getNome() {

		return nome;
	}

	// método que não retorna nenhum valor , específicado pela palavra void
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
