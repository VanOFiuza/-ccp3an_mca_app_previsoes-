package br.usjt.PrevisaoTempo.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;







@Entity
public class Periodo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(unique=true, name="id_dia")
	private Dia dia;
	private String data_hora;
	private String latitude;
	private String longitude;
	private String dia_semana;
	private String  descricao;
	private String temp_min;
	
	
	public Periodo(Dia dia) {
		this.dia = dia;
		this.dia.setPeriodo(this);
	}

	
	public Periodo() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(String temp_min) {
		this.temp_min = temp_min;
	}
	public String getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(String temp_max) {
		this.temp_max = temp_max;
	}
	public String getHumidade_ar() {
		return humidade_ar;
	}
	public void setHumidade_ar(String humidade_ar) {
		this.humidade_ar = humidade_ar;
	}
	private String temp_max;
	private String humidade_ar;
	
	public String getDia_semana() {
		return dia_semana;
	}
	public void setDia_semana(String dia_semana) {
		this.dia_semana = dia_semana;
	}

	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getData_hora() {
		return data_hora;
	}
	public void setData_hora(String data_hora) {
		this.data_hora = data_hora;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
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
		Periodo other = (Periodo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

}
