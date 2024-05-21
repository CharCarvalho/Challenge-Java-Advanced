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
    @Column(name = "id_vegetais")
    private Long idVegetais;
    
    @Column(name = "id_cliente", nullable = false)
    private Long idCliente;
    
    @Column(name = "nm_vegetais", nullable = false)
    private String nomeVegetais;
    
    @Column(name = "st_vegetal", nullable = false)
    private Character statusVegetal;
    
    @Column(name = "lk_imagem")
    private String linkImagem;
    
    @Column(name = "dt_imagem")
    private LocalDate dataImagem;

    // Getters e Setters
    public Long getIdVegetais() {
        return idVegetais;
    }

    public void setIdVegetais(Long idVegetais) {
        this.idVegetais = idVegetais;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeVegetais() {
        return nomeVegetais;
    }

    public void setNomeVegetais(String nomeVegetais) {
        this.nomeVegetais = nomeVegetais;
    }

    public Character getStatusVegetal() {
        return statusVegetal;
    }

    public void setStatusVegetal(Character statusVegetal) {
        this.statusVegetal = statusVegetal;
    }

    public String getLinkImagem() {
        return linkImagem;
    }

    public void setLinkImagem(String linkImagem) {
        this.linkImagem = linkImagem;
    }

    public LocalDate getDataImagem() {
        return dataImagem;
    }

    public void setDataImagem(LocalDate dataImagem) {
        this.dataImagem = dataImagem;
    }
}
