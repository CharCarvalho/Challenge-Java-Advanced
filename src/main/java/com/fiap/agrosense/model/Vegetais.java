package com.fiap.agrosense.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tg_vegetais")
public class Vegetais {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_vegetais;
	
	@Column
	private String nm_vegetais;
	@Column
	private Byte st_vegetais;
	@Column
	private int id_usuario;
	@Column
	private String lk_imagem;
	@Column
	private LocalDate dt_imagem;
	public Long getId_vegetais() {
		return id_vegetais;
	}
	public void setId_vegetais(Long id_vegetais) {
		this.id_vegetais = id_vegetais;
	}
	public String getNm_vegetais() {
		return nm_vegetais;
	}
	public void setNm_vegetais(String nm_vegetais) {
		this.nm_vegetais = nm_vegetais;
	}
	public Byte getSt_vegetais() {
		return st_vegetais;
	}
	public void setSt_vegetais(Byte st_vegetais) {
		this.st_vegetais = st_vegetais;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getLk_imagem() {
		return lk_imagem;
	}
	public void setLk_imagem(String lk_imagem) {
		this.lk_imagem = lk_imagem;
	}
	public LocalDate getDt_imagem() {
		return dt_imagem;
	}
	public void setDt_imagem(LocalDate dt_imagem) {
		this.dt_imagem = dt_imagem;
	}
	
	

}
