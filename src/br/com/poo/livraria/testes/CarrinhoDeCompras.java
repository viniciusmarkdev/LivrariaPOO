package br.com.poo.livraria.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.poo.livraria.produtos.Produto;

/*
 * Arrays e exception
 * 
 * */



/*
 *Class Object 
 *
 *Para que pudessemos utilizar o polimorfismo , utilizamos uma
 *interface produto e a implementamos na classe Livro , assim
 *a classe Revistas e Livros  tamb�m seriam um Produto.
 *
 *A interface produto � um recurso comum entre essas duas classe
 *
 *Por�m n�o necessariamente a classe Livro e Revista precisariam
 *implementar essa interface para ter o tipo em comum
 *
 *Sempre quando criamos uma classe ela herda m�todos e ter� uma 
 *superclase
 *
 *
 *Mas por que n�o vemos as classes herdando essa superclasse?
 *
 *Toda vez que criamos uma classe ela herda a classe Object , caso
 *n�o houver um extends o compilador  dira que a classe herdar� de Object
 *
 *Para fazer um casting de um Objeto para outro tipo temos que 
 *criar um tipo , colocar esse tipo entre parentese e adicionar o Objeto
 *que queremos tranformar no tipo que indicamos antes
 *, por exemplo da convers�o de um Object para produto	
 * : Produto casting = (Produto) object.
 * 
 * Um Object como param�tro nem sempre � uma boa ideia , pois precisariamos
 * de muitos casting caso o tipo que passarmos tiver implementa��es de uma 
 * interface por exemplo e o tipo Object n�o tiver um m�todo espec�fico	
 */

/*
 * Programar voltado a inteface .Podemos mudar a Lista a qualquer momento.
 * Se quisermos usar uma LinkedList ou outro tipo de Lista � s� mudar a
 * inst�ncia��o da lista , assim nosso c�digo n�o fica acoplado . Mudamos o tipo
 * da list para LIST e inst�nciamos como arrayList.
 * 
 * 
 * */
public class CarrinhoDeCompras {
	
	public double total;
	
	List<Produto> produtos;
	
    public CarrinhoDeCompras() {
    	
    	this.produtos = new ArrayList<>();
    }
/*
 * 
 * Carrinho usando ArraysList
 * 
 *  

 
 /*
  * 
  * public double total;
/*	private Produto[] produtos = new Produto[10];
	private int contador =0;
  * 
  * 
  * */	
	
	/*Antes limitamos nosso carrinho em 10 produtos,
	 *se quisermos definir a quantidade que quisermos basta
	 *escrever um construtor recebendo um array de produtos
	 *
	 * Assim ao criar  um carrinho de compras poderemos passar
	 * qualquer valor para o Array,
	 * 
	 * CarrinhoDeCompras = new CarrinhoDeCompras(New produto[10]);
	 * 
	 * Um problema dessa abordagem � que se quisermos adicionar
	 * mais Produtos temos que criar um novo array e mover os 
	 * objetos antigos para ele, o que seria trabalhoso.
	 * 
	 * Tamb�m outra necessidade � a de remover um produto do Array
	 * 
	 *  com o m�todo remove podemos fazer isso:
	 *  
	 *  public remove(int posi��o){
	 *  
	 *     this.produtos[posi��o] = null
	 *  }
	 *  
	 *  Por�m uma posi��o fica como nula e temos considerar
	 *  essa posi��o quando passarmos um novo produto , pois antes
	 *  estavamos inserindo de forma ordenada com todos as posi��es vazias
	 *  
	 *  .Tamb�m � poss�vel reordenar a lista e passar o valor que queremos.
	 *  Todas essas op��es torna nosso c�digo complexo e muito trabalhoso. 
	 *  Para tornarmos a manipula��o de dados mais eficiente , podemos usar 
	 *  a API collections Framework.
	 * 
	 * 
	 * */
    
    /*
     * 
     * public CarrinhoDeCompras(Produto[] produtos) {
		this.produtos = produtos;
		
	}
	
     * 
     * */
	
    
	
	//Polimorfismo - um mesmo m�todo abrange dois tipo de objetos tanto livro f�sico ,
	//quanto ebook . 
	
	
	/* public void adiciona( Livro livro) {
		
		System.out.println("Adicionando :"+livro);
		
		livro.aplicaDescontoDe(0.16);
		
		total+=livro.getValor();
		
	}
	
	 * M�todo antes do uso da interface Produto
	 */
  	
	public ArrayList<Produto> getProdutos() {
		
		
		
		return (ArrayList<Produto>) produtos;
	}

	
	public void remove (int posicao) {
		
		this.produtos.remove(posicao);
	}
	
    
	
	
	/*
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
	
	*/

	/* Com o uso da interface Podemos passar um produto como parametro para
	 * o m�todo adiciona e como a classe Livro e revista implementa essa interface 
	 * todas as classes filhas de Livro e a revista pode ser referenciada por produto.
	 * Logo abrangemos tudo sem perder o polimorfismo.
	 */
	
	
	/*
	 * 
	 * public void adiciona(Produto produto) {
  		
  		System.out.println("Adicionando " + produto);
  		this.produtos[contador] = produto; 
  		contador++;
  		this.total+=produto.getValor();
  	}
	 * 
	 * 
	 * 
	 */
	
	public void adiciona(Produto produto) {
		
		this.produtos.add(produto);
	}
  	

	/*
	 * 
	 * Aqui temos repeti��o de c�digo que pode ser resolvido com  uma interface
	 * 
	 * public void adiciona( Revista revista) {
		
		System.out.println("Adicionando :"+revista);
		
		revista.aplicaDescontoDe(0.1);
		
		total+=revista.getValor();
		
	}
	 * 
	 * */
	
  	
	public double getTotal() {
		return total;
	}

	
	
	
	
	

}




