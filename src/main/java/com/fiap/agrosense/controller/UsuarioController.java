package com.fiap.agrosense.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.fiap.agrosense.model.Usuario;
import com.fiap.agrosense.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Usuario buscarUsuarioPorId(@PathVariable Long id) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
        return usuarioOptional.orElse(null);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @PutMapping("/{id}")
    public Usuario atualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuarioAtualizado) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
        if (usuarioOptional.isPresent()) {
            Usuario usuarioExistente = usuarioOptional.get();
            usuarioExistente.setNm_usuario(usuarioAtualizado.getNm_usuario());
            usuarioExistente.setNr_cpf(usuarioAtualizado.getNr_cpf());
            usuarioExistente.setNm_rg(usuarioAtualizado.getNm_rg());
            usuarioExistente.setDt_nascimento(usuarioAtualizado.getDt_nascimento());
            usuarioExistente.setFl_genero(usuarioAtualizado.getFl_genero());
            usuarioExistente.setNm_email(usuarioAtualizado.getNm_email());
            usuarioExistente.setNm_senha(usuarioAtualizado.getNm_senha());
            return usuarioRepository.save(usuarioExistente);
        }
        return null;
    }


    @DeleteMapping("/{id}")
    public void excluirUsuario(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
    }
}
