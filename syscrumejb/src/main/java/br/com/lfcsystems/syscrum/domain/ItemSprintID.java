package br.com.lfcsystems.syscrum.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ItemSprintID implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "ID_ITEM_BACKLOG")
	private ItemBacklog itemBacklog;

	@ManyToOne
	@JoinColumn(name = "ID_SPRINT")
	private Sprint sprint;

	public ItemSprintID() {
		super();
	}

	public ItemBacklog getItemBacklog() {
		return itemBacklog;
	}

	public void setItemBacklog(ItemBacklog itemBacklog) {
		this.itemBacklog = itemBacklog;
	}

	public Sprint getSprint() {
		return sprint;
	}

	public void setSprint(Sprint sprint) {
		this.sprint = sprint;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemBacklog == null) ? 0 : itemBacklog.hashCode());
		result = prime * result + ((sprint == null) ? 0 : sprint.hashCode());
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
		if (itemBacklog == null) {
			if (other.itemBacklog != null)
				return false;
		} else if (!itemBacklog.equals(other.itemBacklog))
			return false;
		if (sprint == null) {
			if (other.sprint != null)
				return false;
		} else if (!sprint.equals(other.sprint))
			return false;
		return true;
	}
}