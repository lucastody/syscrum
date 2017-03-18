package br.com.lfcsystems.syscrum.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TimeUsuarioID implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "ID_TIME")
	private Long idTime;
	
	@Column(name = "ID_USUARIO")
	private Long idUsuario;
	
	public TimeUsuarioID() {
		super();
	}

	public Long getIdTime() {
		return idTime;
	}

	public void setIdTime(Long idTime) {
		this.idTime = idTime;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTime == null) ? 0 : idTime.hashCode());
		result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
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
		TimeUsuarioID other = (TimeUsuarioID) obj;
		if (idTime == null) {
			if (other.idTime != null)
				return false;
		} else if (!idTime.equals(other.idTime))
			return false;
		if (idUsuario == null) {
			if (other.idUsuario != null)
				return false;
		} else if (!idUsuario.equals(other.idUsuario))
			return false;
		return true;
	}
}