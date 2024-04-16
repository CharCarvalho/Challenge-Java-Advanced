package com.fiap.agrosense.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tg_fornecedor")
public class Fornecedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_fornecedor;
	
	@Column
	private String nm_fornecedor;
	@Column
	private String nm_localizacao;
	@Column
	private int nr_fornecedor;
	@Column
	private int id_usuario;
	public Long getId_fornecedor() {
		return id_fornecedor;
	}
	public void setId_fornecedor(Long id_fornecedor) {
		this.id_fornecedor = id_fornecedor;
	}
	public String getNm_fornecedor() {
		return nm_fornecedor;
	}
	public void setNm_fornecedor(String nm_fornecedor) {
		this.nm_fornecedor = nm_fornecedor;
	}
	public String getNm_localizacao() {
		return nm_localizacao;
	}
	public void setNm_localizacao(String nm_localizacao) {
		this.nm_localizacao = nm_localizacao;
	}
	public int getNr_fornecedor() {
		return nr_fornecedor;
	}
	public void setNr_fornecedor(int nr_fornecedor) {
		this.nr_fornecedor = nr_fornecedor;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	
	
}
