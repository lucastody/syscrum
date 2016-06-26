package br.com.lfcsystems.syscrum.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Embeddable
public class HistoricoItemSprintID implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "DT_ANDAMENTO")
	private Date dataAndamento;

	@ManyToOne
	@JoinColumns(value = {
		@JoinColumn(name = "ID_ITEM_BACKLOG", referencedColumnName = "ID_ITEM_BACKLOG"),
		@JoinColumn(name = "ID_SPRINT", referencedColumnName = "ID_SPRINT")
	})
	private ItemSprint itemSprint;

	public HistoricoItemSprintID() {
		super();
	}

	public Date getDataAndamento() {
		return dataAndamento;
	}

	public void setDataAndamento(Date dataAndamento) {
		this.dataAndamento = dataAndamento;
	}

	public ItemSprint getItemSprint() {
		return itemSprint;
	}

	public void setItemSprint(ItemSprint itemSprint) {
		this.itemSprint = itemSprint;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataAndamento == null) ? 0 : dataAndamento.hashCode());
		result = prime * result + ((itemSprint == null) ? 0 : itemSprint.hashCode());
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
		HistoricoItemSprintID other = (HistoricoItemSprintID) obj;
		if (dataAndamento == null) {
			if (other.dataAndamento != null)
				return false;
		} else if (!dataAndamento.equals(other.dataAndamento))
			return false;
		if (itemSprint == null) {
			if (other.itemSprint != null)
				return false;
		} else if (!itemSprint.equals(other.itemSprint))
			return false;
		return true;
	}
}