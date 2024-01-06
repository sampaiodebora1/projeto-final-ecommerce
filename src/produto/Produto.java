package produto;

public abstract class Produto {
	private int codigo_produto;
	private String nome_produto;
	private float preco_produto;
	private int quantidade_produto;
	
	public Produto(int codigo_produto, String nome_produto, float preco_produto, int quantidade_produto) {
		this.codigo_produto = codigo_produto;
		this.nome_produto = nome_produto;
		this.preco_produto = preco_produto;
		this.quantidade_produto = quantidade_produto;
	}

	public int getCodigo_produto() {
		return codigo_produto;
	}

	public void setCodigo_produto(int codigo_produto) {
		this.codigo_produto = codigo_produto;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public float getPreco_produto() {
		return preco_produto;
	}

	public void setPreco_produto(float preco_produto) {
		this.preco_produto = preco_produto;
	}

	public int getQuantidade_produto() {
		return quantidade_produto;
	}

	public void setQuantidade_produto(int quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}
	
	
	
	
	
	

}
