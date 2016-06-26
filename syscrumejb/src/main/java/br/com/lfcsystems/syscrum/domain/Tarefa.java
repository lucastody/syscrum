package br.com.lfcsystems.syscrum.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_TAREFA")
public class Tarefa {

	@Id
	@Column(name = "ID_TAREFA")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "ID_ITEM_BACKLOG", referencedColumnName = "ID_ITEM_BACKLOG"),
		@JoinColumn(name = "ID_SPRINT", referencedColumnName = "ID_SPRINT")
	})
	private ItemSprint itemSprint;

	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "ID_TIME", referencedColumnName = "ID_TIME"),
		@JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
	})
	private TimeUsuario timeUsuario;

	@ManyToOne
	@JoinColumn(name = "ID_SITUACAO")
	private SituacaoItemSprint situacao;

	public Tarefa() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ItemSprint getItemSprint() {
		return itemSprint;
	}

	public void setItemSprint(ItemSprint itemSprint) {
		this.itemSprint = itemSprint;
	}

	public TimeUsuario getTimeUsuario() {
		return timeUsuario;
	}

	public void setTimeUsuario(TimeUsuario timeUsuario) {
		this.timeUsuario = timeUsuario;
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
		Tarefa other = (Tarefa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}