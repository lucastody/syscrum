package br.com.lfcsystems.syscrum.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ESTORIA")
@PrimaryKeyJoinColumn(name = "ID_ESTORIA")
public class Estoria extends ItemBacklog {
	
	@Column(name = "NO_ESTORIA")
	private String nome;

	public Estoria() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}