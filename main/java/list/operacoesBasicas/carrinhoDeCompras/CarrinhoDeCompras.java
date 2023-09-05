package main.java.list.operacoesBasicas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> carrinho;
	
	public CarrinhoDeCompras() {
		this.carrinho = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		this.carrinho.add(item);
	}
	
	public void exiberItens() {
		System.out.println(carrinho);
	}
	
	public void removeItem(String nome) {		
		List<Item> itemParaRemover = new ArrayList<>();
		for(Item i : carrinho) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				itemParaRemover.add(i);
			}
		}
		carrinho.removeAll(itemParaRemover);
	}
	
	public void calculaValorTotal() {
		double total = 0;
		for(Item i : carrinho) {
			total+=i.getPreco() * i.getQuantidade();
		}
		System.out.println("O valor total do seu carrinho é: " + total);
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adicionarItem("Bicicleta", 220.0, 5);
		carrinhoDeCompras.adicionarItem("Moto", 5000.0, 1);
		carrinhoDeCompras.adicionarItem("Carro", 28000.0, 1);
		carrinhoDeCompras.exiberItens();
		carrinhoDeCompras.removeItem("Carro");
		carrinhoDeCompras.exiberItens();
		carrinhoDeCompras.calculaValorTotal();
	}
}
