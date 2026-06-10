package loja;

public class Produto {
	String nome;
	double preco;
	int quantidadeEstoque;
	
	public void setNome(String nome) {
		if (nome.isEmpty()) {
			
			System.out.println("nome invalido");
		}else {
			this.nome = nome;
		}
	}
	
	public String getNome() {
		return nome;
	}
		
	public void setPreco(double preco) {
		if(preco > 0) {
			this.preco = preco;
		}else {
			System.out.println("preco invalido");
		}
	}
	
	public double getPreco() {
		return preco;
	}
			
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		if(quantidadeEstoque < 0) {
			System.out.println("Quantidade Estoque inválido");
		}else {
			this.quantidadeEstoque = quantidadeEstoque;
		}
	}
	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	
}
