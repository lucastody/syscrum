package br.com.lfcsystems.syscrum.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class HistoricoItemSprintID implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "DT_ANDAMENTO")
	private Date dataAndamento;
	
	private ItemSprintID itemSprintID;
	
	public HistoricoItemSprintID() {
		super();
	}

	public Date getDataAndamento() {
		return dataAndamento;
	}

	public void setDataAndamento(Date dataAndamento) {
		this.dataAndamento = dataAndamento;
	}

	public ItemSprintID getItemSprintID() {
		return itemSprintID;
	}

	public void setItemSprintID(ItemSprintID itemSprintID) {
		this.itemSprintID = itemSprintID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataAndamento == null) ? 0 : dataAndamento.hashCode());
		result = prime * result + ((itemSprintID == null) ? 0 : itemSprintID.hashCode());
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
		if (itemSprintID == null) {
			if (other.itemSprintID != null)
				return false;
		} else if (!itemSprintID.equals(other.itemSprintID))
			return false;
		return true;
	}
}