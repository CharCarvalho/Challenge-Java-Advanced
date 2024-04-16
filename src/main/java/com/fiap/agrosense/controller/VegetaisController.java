package com.fiap.agrosense.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fiap.agrosense.model.Vegetais;
import com.fiap.agrosense.repository.VegetaisRepository;

@RestController
@RequestMapping("/vegetais")
public class VegetaisController {

    @Autowired
    private VegetaisRepository vegetaisRepository;

    @GetMapping
    public List<Vegetais> listarVegetais() {
        return vegetaisRepository.findAll();
    }

    @GetMapping("/{id}")
    public Vegetais buscarVegetalPorId(@PathVariable Long id) {
        Optional<Vegetais> vegetalOptional = vegetaisRepository.findById(id);
        return vegetalOptional.orElse(null);
    }

    @PostMapping
    public Vegetais criarVegetal(@RequestBody Vegetais vegetal) {
        return vegetaisRepository.save(vegetal);
    }

    @PutMapping("/{id}")
    public Vegetais atualizarVegetal(@PathVariable Long id, @RequestBody Vegetais vegetalAtualizado) {
        Optional<Vegetais> vegetalOptional = vegetaisRepository.findById(id);
        if (vegetalOptional.isPresent()) {
            Vegetais vegetalExistente = vegetalOptional.get();
            vegetalExistente.setNm_vegetais(vegetalAtualizado.getNm_vegetais());
            vegetalExistente.setSt_vegetais(vegetalAtualizado.getSt_vegetais());
            vegetalExistente.setId_usuario(vegetalAtualizado.getId_usuario());
            vegetalExistente.setLk_imagem(vegetalAtualizado.getLk_imagem());
            vegetalExistente.setDt_imagem(vegetalAtualizado.getDt_imagem());
            return vegetaisRepository.save(vegetalExistente);
        }
        return null; 
    }

    @DeleteMapping("/{id}")
    public void excluirVegetal(@PathVariable Long id) {
        vegetaisRepository.deleteById(id);
    }
}
