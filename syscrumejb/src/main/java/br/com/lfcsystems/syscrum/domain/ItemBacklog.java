package br.com.lfcsystems.syscrum.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ITEM_BACKLOG")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ItemBacklog {

	@Id
	@Column(name = "ID_ITEM_BACKLOG")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "NO_ITEM_BACKLOG")
	private String nome;

	@Column(name = "DS_ITEM_BACKLOG")
	private String descricao;

	@Column(name = "QT_POINTS")
	private Integer quantidadePontos;

	@Column(name = "NU_PRIORIDADE")
	private Integer numeroPrioridade;

	@ManyToOne
	@JoinColumn(name = "ID_BACKLOG")
	private Backlog backlog;

	@ManyToOne
	@JoinColumn(name = "ID_EPICO")
	private Epico epico;

	public ItemBacklog() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidadePontos() {
		return quantidadePontos;
	}

	public void setQuantidadePontos(Integer quantidadePontos) {
		this.quantidadePontos = quantidadePontos;
	}

	public Integer getNumeroPrioridade() {
		return numeroPrioridade;
	}

	public void setNumeroPrioridade(Integer numeroPrioridade) {
		this.numeroPrioridade = numeroPrioridade;
	}

	public Backlog getBacklog() {
		return backlog;
	}

	public void setBacklog(Backlog backlog) {
		this.backlog = backlog;
	}

	public Epico getEpico() {
		return epico;
	}

	public void setEpico(Epico epico) {
		this.epico = epico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemBacklog other = (ItemBacklog) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}