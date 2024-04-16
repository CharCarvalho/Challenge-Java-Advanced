package com.fiap.agrosense.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tg_usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;
	
	@Column
	private String nm_usuario;
	@Column
	private int nr_cpf;
	@Column
	private String nm_rg;
	@Column
	private LocalDate dt_nascimento;
	@Column
	private Byte fl_genero;
	@Column
	private LocalDate dt_cadastro;
	@Column
	private String nm_email;
	@Column
	private String nm_senha;
	public Long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNm_usuario() {
		return nm_usuario;
	}
	public void setNm_usuario(String nm_usuario) {
		this.nm_usuario = nm_usuario;
	}
	public int getNr_cpf() {
		return nr_cpf;
	}
	public void setNr_cpf(int nr_cpf) {
		this.nr_cpf = nr_cpf;
	}
	public String getNm_rg() {
		return nm_rg;
	}
	public void setNm_rg(String nm_rg) {
		this.nm_rg = nm_rg;
	}
	public LocalDate getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(LocalDate dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	public Byte getFl_genero() {
		return fl_genero;
	}
	public void setFl_genero(Byte fl_genero) {
		this.fl_genero = fl_genero;
	}
	public LocalDate getDt_cadastro() {
		return dt_cadastro;
	}
	public void setDt_cadastro(LocalDate dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}
	public String getNm_email() {
		return nm_email;
	}
	public void setNm_email(String nm_email) {
		this.nm_email = nm_email;
	}
	public String getNm_senha() {
		return nm_senha;
	}
	public void setNm_senha(String nm_senha) {
		this.nm_senha = nm_senha;
	}
	
	
}
