package br.com.lfcsystems.syscrum.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PROJETO_TIME")
public class ProjetoTime {

	@EmbeddedId
	private ProjetoTimeID id;
	
	@MapsId("idProjeto")
	@ManyToOne
	@JoinColumn(name = "ID_PROJETO")
	private Projeto projeto;
	
	@MapsId("idTime")
	@ManyToOne
	@JoinColumn(name = "ID_TIME")
	private Time time;

	public ProjetoTime() {
		super();
	}

	public ProjetoTimeID getId() {
		return id;
	}

	public void setId(ProjetoTimeID id) {
		this.id = id;
	}
	
	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
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
		ProjetoTime other = (ProjetoTime) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}