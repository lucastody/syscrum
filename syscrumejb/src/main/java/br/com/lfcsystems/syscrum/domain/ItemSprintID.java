package br.com.lfcsystems.syscrum.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ItemSprintID implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "ID_ITEM_BACKLOG")
	private Long idItemBacklog;
	
	@Column(name = "ID_SPRINT")
	private Long idSprint;

	public ItemSprintID() {
		super();
	}

	public Long getIdItemBacklog() {
		return idItemBacklog;
	}

	public void setIdItemBacklog(Long idItemBacklog) {
		this.idItemBacklog = idItemBacklog;
	}

	public Long getIdSprint() {
		return idSprint;
	}

	public void setIdSprint(Long idSprint) {
		this.idSprint = idSprint;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idItemBacklog == null) ? 0 : idItemBacklog.hashCode());
		result = prime * result + ((idSprint == null) ? 0 : idSprint.hashCode());
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
		ItemSprintID other = (ItemSprintID) obj;
		if (idItemBacklog == null) {
			if (other.idItemBacklog != null)
				return false;
		} else if (!idItemBacklog.equals(other.idItemBacklog))
			return false;
		if (idSprint == null) {
			if (other.idSprint != null)
				return false;
		} else if (!idSprint.equals(other.idSprint))
			return false;
		return true;
	}
}