package com.fiap.agrosense.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fiap.agrosense.model.Fornecedor;
import com.fiap.agrosense.repository.FornecedorRepository;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @GetMapping
    public List<Fornecedor> listarFornecedores() {
        return fornecedorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Fornecedor buscarFornecedorPorId(@PathVariable Long id) {
        Optional<Fornecedor> fornecedorOptional = fornecedorRepository.findById(id);
        return fornecedorOptional.orElse(null);
    }

    @PostMapping
    public Fornecedor criarFornecedor(@RequestBody Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    @PutMapping("/{id}")
    public Fornecedor atualizarFornecedor(@PathVariable Long id, @RequestBody Fornecedor fornecedorAtualizado) {
        Optional<Fornecedor> fornecedorOptional = fornecedorRepository.findById(id);
        if (fornecedorOptional.isPresent()) {
            Fornecedor fornecedorExistente = fornecedorOptional.get();
            fornecedorExistente.setNm_fornecedor(fornecedorAtualizado.getNm_fornecedor());
            fornecedorExistente.setNm_localizacao(fornecedorAtualizado.getNm_localizacao());
            fornecedorExistente.setNr_fornecedor(fornecedorAtualizado.getNr_fornecedor());
            fornecedorExistente.setId_usuario(fornecedorAtualizado.getId_usuario());
            return fornecedorRepository.save(fornecedorExistente);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void excluirFornecedor(@PathVariable Long id) {
        fornecedorRepository.deleteById(id);
    }
}
