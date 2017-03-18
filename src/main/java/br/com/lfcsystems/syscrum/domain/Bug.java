package br.com.lfcsystems.syscrum.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TB_BUG")
@PrimaryKeyJoinColumn(name = "ID_BUG")
public class Bug extends ItemBacklog {
	
	@Column(name = "NO_BUG")
	private String nome;

	public Bug() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}