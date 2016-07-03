package br.com.lfcsystems.syscrum.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "TB_TIME_USUARIO")
public class TimeUsuario {
	
	@EmbeddedId
	private TimeUsuarioID id;

	@MapsId("idTime")
	@ManyToOne
	@JoinColumn(name = "ID_TIME")
	private Time time;
	
	@MapsId("idUsuario")
	@ManyToOne
	@JoinColumn(name = "ID_USUARIO")
	private Usuario usuario;
	
	@Column(name = "ST_ATIVO")
	private boolean ativo;
	
	public TimeUsuario() {
		super();
	}
	
	public TimeUsuarioID getId() {
		return id;
	}
	
	public void setId(TimeUsuarioID id) {
		this.id = id;
	}
	
	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
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
		TimeUsuario other = (TimeUsuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}