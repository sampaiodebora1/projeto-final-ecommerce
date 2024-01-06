package produto;

import produto.Produto;

public class Vestuario extends Produto{
	private String tamanho_vestuario;
	private String marca_vestuario;
	
	public Vestuario(int codigo_produto, String nome_produto, float preco_produto, int quantidade_produto) {
		super(codigo_produto, nome_produto, preco_produto, quantidade_produto);
		// TODO Auto-generated constructor stub
	}

	public String getTamanho_vestuario() {
		return tamanho_vestuario;
	}

	public void setTamanho_vestuario(String tamanho_vestuario) {
		this.tamanho_vestuario = tamanho_vestuario;
	}

	public String getMarca_vestuario() {
		return marca_vestuario;
	}

	public void setMarca_vestuario(String marca_vestuario) {
		this.marca_vestuario = marca_vestuario;
	}
	
	
	

}
