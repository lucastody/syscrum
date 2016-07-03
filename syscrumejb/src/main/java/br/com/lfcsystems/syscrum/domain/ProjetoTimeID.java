package br.com.lfcsystems.syscrum.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProjetoTimeID implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "ID_PROJETO")
	private Long idProjeto;
	
	@Column(name = "ID_TIME")
	private Long idTime;
	
	public ProjetoTimeID() {
		super();
	}

	public Long getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(Long idProjeto) {
		this.idProjeto = idProjeto;
	}

	public Long getIdTime() {
		return idTime;
	}

	public void setIdTime(Long idTime) {
		this.idTime = idTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idProjeto == null) ? 0 : idProjeto.hashCode());
		result = prime * result + ((idTime == null) ? 0 : idTime.hashCode());
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
		ProjetoTimeID other = (ProjetoTimeID) obj;
		if (idProjeto == null) {
			if (other.idProjeto != null)
				return false;
		} else if (!idProjeto.equals(other.idProjeto))
			return false;
		if (idTime == null) {
			if (other.idTime != null)
				return false;
		} else if (!idTime.equals(other.idTime))
			return false;
		return true;
	}
}