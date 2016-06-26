package br.com.lfcsystems.syscrum.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ITEM_SPRINT")
public class ItemSprint {

	@EmbeddedId
	private ItemSprintID id;

	@ManyToOne
	@JoinColumn(name = "ID_SITUACAO")
	private SituacaoItemSprint situacao;

	public ItemSprint() {
		super();
	}

	public ItemSprintID getId() {
		return id;
	}

	public void setId(ItemSprintID id) {
		this.id = id;
	}

	public SituacaoItemSprint getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoItemSprint situacao) {
		this.situacao = situacao;
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
		ItemSprint other = (ItemSprint) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}