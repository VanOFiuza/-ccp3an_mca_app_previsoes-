package br.usjt.PrevisaoTempo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Dia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_dia;
	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	@OneToOne(mappedBy = "dia", fetch = FetchType.LAZY)
	private Periodo periodo;

	public Long getId_dia() {
		return id_dia;
	}

	public void setId_dia(Long id_dia) {
		this.id_dia = id_dia;
	}

	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_dia== null) ? 0 : id_dia.hashCode());
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
		Dia other = (Dia) obj;
		if (id_dia == null) {
			if (other.id_dia != null)
				return false;
		} else if (!id_dia.equals(other.id_dia))
			return false;
		return true;
	}

}