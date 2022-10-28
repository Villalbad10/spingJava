package com.example.demo.controllers;

import com.example.demo.dao.UsuarioDao;
import com.example.demo.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuario")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Diego");
        usuario.setApellido("villalba");
        usuario.setEmail("diego@gmail.com");
        usuario.setPass("113");

        return usuario;
    }

    @RequestMapping(value = "api/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuario/1")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Diego");
        usuario.setApellido("villalba");
        usuario.setEmail("diego@gmail.com");
        usuario.setPass("113");

        return usuario;
    }

    @RequestMapping(value = "api/usuario/2")
    public Usuario agregar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Diego");
        usuario.setApellido("villalba");
        usuario.setEmail("diego@gmail.com");
        usuario.setPass("113");

        return usuario;
    }

    @RequestMapping(value = "api/usuario/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id) {
        usuarioDao.eliminar(id);
    }

    @RequestMapping(value = "api/usuario/4")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Diego");
        usuario.setApellido("villalba");
        usuario.setEmail("diego@gmail.com");
        usuario.setPass("113");

        return usuario;
    }
}
