package com.fiap.agrosense.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tg_clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cliente;
	
	@Column
	private String nm_cliente;
	@Column
	private String tp_cliente;
	@Column
	private LocalDate dt_cadastro;
	@Column
	private String nm_email;
	@Column
	private String nm_senha;
	
	public Long getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNm_cliente() {
		return nm_cliente;
	}
	public void setNm_cliente(String nm_cliente) {
		this.nm_cliente = nm_cliente;
	}
	public String getTp_cliente() {
		return tp_cliente;
	}
	public void setTp_cliente(String tp_cliente) {
		this.tp_cliente = tp_cliente;
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
