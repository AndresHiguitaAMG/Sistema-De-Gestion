package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Andres");
        usuario.setApellido("Higuita");
        usuario.setEmail("andreshiguitaamg@gmail.com");
        usuario.setTelefono("3164256707");
        return usuario;
    }
    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(22L);
        usuario.setNombre("Andres");
        usuario.setApellido("Higuita");
        usuario.setEmail("andreshiguitaamg@gmail.com");
        usuario.setTelefono("3164256707");

        Usuario usuario2 = new Usuario();
        usuario2.setId(26L);
        usuario2.setNombre("Camila");
        usuario2.setApellido("Higuita");
        usuario2.setEmail("camilahc26@gmail.com");
        usuario2.setTelefono("3164517845");

        Usuario usuario3 = new Usuario();
        usuario3.setId(1L);
        usuario3.setNombre("H");
        usuario3.setApellido("G");
        usuario3.setEmail("mhgr01@gmail.com");
        usuario3.setTelefono("3164257867");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }
    @RequestMapping(value = "usuario123")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Andres");
        usuario.setApellido("Higuita");
        usuario.setEmail("andreshiguitaamg@gmail.com");
        usuario.setTelefono("3164256707") ;
        return usuario;
    }
    @RequestMapping(value = "usuario456")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Andres");
        usuario.setApellido("Higuita");
        usuario.setEmail("andreshiguitaamg@gmail.com");
        usuario.setTelefono("3164256707") ;
        return usuario;
    }
    @RequestMapping(value = "usuario789")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Andres");
        usuario.setApellido("Higuita");
        usuario.setEmail("andreshiguitaamg@gmail.com");
        usuario.setTelefono("3164256707") ;
        return usuario;
    }
}
