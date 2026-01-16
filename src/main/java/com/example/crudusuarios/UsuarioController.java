package com.example.crudusuarios;

import com.example.crudusuarios.model.Usuario;
import com.example.crudusuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/{id}")
    public Usuario buscarPorid(@PathVariable int id){
        return usuarioRepository.findById(id).orElse(null);
    }
}
