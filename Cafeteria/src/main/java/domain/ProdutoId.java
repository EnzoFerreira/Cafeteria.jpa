package domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Lob;

@Embeddable
public class ProdutoId implements Serializable{
	private static final long serialVersionUID=1L;
	
	private String nome;

	private BigDecimal preco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	//constructors
	public ProdutoId() {}
	public ProdutoId(String nome, BigDecimal preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	//hash n equals
	@Override
	public int hashCode() {
		return Objects.hash(nome, preco);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoId other = (ProdutoId) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(preco, other.preco);
	}
	

	
	
}
