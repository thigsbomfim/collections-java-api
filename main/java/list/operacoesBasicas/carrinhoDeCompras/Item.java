package main.java.list.operacoesBasicas.carrinhoDeCompras;

public class Item {
	private String nome;
	private double preco;
	private int quantidade;
	
	public Item(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "\nNome: " + this.nome + ", Preco: " + this.preco + ", Quantidade: " + quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
}
