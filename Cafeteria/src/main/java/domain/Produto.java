package domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="menu")
public class Produto {
	
	@EmbeddedId
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ProdutoId id;
	
	@Column(name = "Descricao", length = 200)
	private String descricao;
	
	@Column(name = "Registro_Sistema", length = 200)
	private int registro;
	
	@Column(name = "Especialidade", length = 200)
	@Enumerated(EnumType.STRING)
	private Especialidade especialidade;
	
	public ProdutoId getId() {
		return id;
	}
	public void setId(ProdutoId id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	public void setIngredientes(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	//constructor
	public Produto() {;
	}
	public Produto(ProdutoId id, String descricao, int registro, Especialidade especialidade) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.registro = registro;
		this.especialidade = especialidade;
	}
	//hash n equals
	@Override
	public int hashCode() {
		return Objects.hash(descricao, especialidade, id, registro);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(descricao, other.descricao) && especialidade == other.especialidade
				&& Objects.equals(id, other.id) && registro == other.registro;
	}
	
	



	
	
}
