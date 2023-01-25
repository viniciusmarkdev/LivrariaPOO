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
 *a classe Revistas e Livros  também seriam um Produto.
 *
 *A interface produto é um recurso comum entre essas duas classe
 *
 *Porém não necessariamente a classe Livro e Revista precisariam
 *implementar essa interface para ter o tipo em comum
 *
 *Sempre quando criamos uma classe ela herda métodos e terá uma 
 *superclase
 *
 *
 *Mas por que não vemos as classes herdando essa superclasse?
 *
 *Toda vez que criamos uma classe ela herda a classe Object , caso
 *não houver um extends o compilador  dira que a classe herdará de Object
 *
 *Para fazer um casting de um Objeto para outro tipo temos que 
 *criar um tipo , colocar esse tipo entre parentese e adicionar o Objeto
 *que queremos tranformar no tipo que indicamos antes
 *, por exemplo da conversão de um Object para produto	
 * : Produto casting = (Produto) object.
 * 
 * Um Object como paramêtro nem sempre é uma boa ideia , pois precisariamos
 * de muitos casting caso o tipo que passarmos tiver implementações de uma 
 * interface por exemplo e o tipo Object não tiver um método específico	
 */

/*
 * Programar voltado a inteface .Podemos mudar a Lista a qualquer momento.
 * Se quisermos usar uma LinkedList ou outro tipo de Lista é só mudar a
 * instânciação da lista , assim nosso código não fica acoplado . Mudamos o tipo
 * da list para LIST e instânciamos como arrayList.
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
	 * Um problema dessa abordagem é que se quisermos adicionar
	 * mais Produtos temos que criar um novo array e mover os 
	 * objetos antigos para ele, o que seria trabalhoso.
	 * 
	 * Também outra necessidade é a de remover um produto do Array
	 * 
	 *  com o método remove podemos fazer isso:
	 *  
	 *  public remove(int posição){
	 *  
	 *     this.produtos[posição] = null
	 *  }
	 *  
	 *  Porém uma posição fica como nula e temos considerar
	 *  essa posição quando passarmos um novo produto , pois antes
	 *  estavamos inserindo de forma ordenada com todos as posições vazias
	 *  
	 *  .Também é possível reordenar a lista e passar o valor que queremos.
	 *  Todas essas opções torna nosso código complexo e muito trabalhoso. 
	 *  Para tornarmos a manipulação de dados mais eficiente , podemos usar 
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
	
    
	
	//Polimorfismo - um mesmo método abrange dois tipo de objetos tanto livro físico ,
	//quanto ebook . 
	
	
	/* public void adiciona( Livro livro) {
		
		System.out.println("Adicionando :"+livro);
		
		livro.aplicaDescontoDe(0.16);
		
		total+=livro.getValor();
		
	}
	
	 * Método antes do uso da interface Produto
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
	 * o método adiciona e como a classe Livro e revista implementa essa interface 
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
	 * Aqui temos repetição de código que pode ser resolvido com  uma interface
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




