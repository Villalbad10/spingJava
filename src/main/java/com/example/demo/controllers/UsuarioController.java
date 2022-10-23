package com.example.demo.controllers;

import com.example.demo.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Diego");
        usuario.setApellido("villalba");
        usuario.setEmail("diego@gmail.com");
        usuario.setPass("113");

        return usuario;
    }

    @RequestMapping(value="usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Diego");
        usuario.setApellido("villalba");
        usuario.setEmail("diego@gmail.com");
        usuario.setPass("113");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNombre("Alex");
        usuario2.setApellido("pepe");
        usuario2.setEmail("pepe@gmail.com");
        usuario2.setPass("113");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3L);
        usuario3.setNombre("andres");
        usuario3.setApellido("arras");
        usuario3.setEmail("andres@gmail.com");
        usuario3.setPass("113");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }

    @RequestMapping(value="usuario/1")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Diego");
        usuario.setApellido("villalba");
        usuario.setEmail("diego@gmail.com");
        usuario.setPass("113");

        return usuario;
    }

    @RequestMapping(value="usuario/2")
    public Usuario agregar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Diego");
        usuario.setApellido("villalba");
        usuario.setEmail("diego@gmail.com");
        usuario.setPass("113");

        return usuario;
    }

    @RequestMapping(value="usuario/3")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Diego");
        usuario.setApellido("villalba");
        usuario.setEmail("diego@gmail.com");
        usuario.setPass("113");

        return usuario;
    }

    @RequestMapping(value="usuario/4")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Diego");
        usuario.setApellido("villalba");
        usuario.setEmail("diego@gmail.com");
        usuario.setPass("113");

        return usuario;
    }
}
