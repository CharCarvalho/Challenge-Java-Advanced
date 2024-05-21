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
            vegetalExistente.setNomeVegetais(vegetalAtualizado.getNomeVegetais());
            vegetalExistente.setStatusVegetal(vegetalAtualizado.getStatusVegetal());
            vegetalExistente.setIdCliente(vegetalAtualizado.getIdCliente());
            vegetalExistente.setLinkImagem(vegetalAtualizado.getLinkImagem());
            vegetalExistente.setDataImagem(vegetalAtualizado.getDataImagem());
            return vegetaisRepository.save(vegetalExistente);
        }
        return null; 
    }

    @DeleteMapping("/{id}")
    public void excluirVegetal(@PathVariable Long id) {
        vegetaisRepository.deleteById(id);
    }
}
