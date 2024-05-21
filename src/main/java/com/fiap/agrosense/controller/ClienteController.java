package com.fiap.agrosense.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.fiap.agrosense.model.Cliente;
import com.fiap.agrosense.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Cliente buscarClientePorId(@PathVariable Long id) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        return clienteOptional.orElse(null);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente criarCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @PutMapping("/{id}")
    public Cliente atualizarCliente(@PathVariable Long id, @RequestBody Cliente clienteAtualizado) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        if (clienteOptional.isPresent()) {
            Cliente clienteExistente = clienteOptional.get();
            clienteExistente.setNm_cliente(clienteAtualizado.getNm_cliente());
            clienteExistente.setTp_cliente(clienteAtualizado.getTp_cliente());
            clienteExistente.setDt_cadastro(clienteAtualizado.getDt_cadastro());
            clienteExistente.setNm_email(clienteAtualizado.getNm_email());
            clienteExistente.setNm_senha(clienteAtualizado.getNm_senha());
            return clienteRepository.save(clienteExistente);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void excluirCliente(@PathVariable Long id) {
        clienteRepository.deleteById(id);
    }
}
