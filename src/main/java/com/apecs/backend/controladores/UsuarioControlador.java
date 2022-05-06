package com.apecs.backend.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apecs.backend.modelo.Usuario;
import com.apecs.backend.repositorios.UsuarioRepositorio;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class UsuarioControlador {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	// Listar Usuarios
	@GetMapping("/listarUsuarios")
	public List<Usuario> listarUsuarios() {
		return usuarioRepositorio.findAll();
	}

	// Crear Usuario
	@PostMapping("/crearUsuario")
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return usuarioRepositorio.save(usuario);
	}

	// Actualizar Usuario
	@PutMapping("/actualizarUsuario/{id}")
	public Usuario actualizarUsuario(@RequestBody Usuario usuario, @PathVariable Long id) {
		return usuarioRepositorio.save(usuario);
	}

	// Eliminar Usuario
	@DeleteMapping("/elminarUsuario/{id}")
	public String eliminarUsuario(@PathVariable Long id) {
		usuarioRepositorio.deleteById(id);
		return "El usuario ha sido eliminado";
	}

}
