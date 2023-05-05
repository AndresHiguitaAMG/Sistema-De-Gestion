package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario")
    public Usuario getUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Andres");
        usuario.setApellido("Higuita");
        usuario.setEmail("andreshiguitaamg@gmail.com");
        usuario.setTelefono("3164256707") ;
        return usuario;
    }
}
