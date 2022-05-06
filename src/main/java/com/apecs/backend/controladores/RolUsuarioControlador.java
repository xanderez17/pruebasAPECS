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

import com.apecs.backend.modelo.Aula;
import com.apecs.backend.modelo.RolUsuario;
import com.apecs.backend.repositorios.AulaRepositorio;
import com.apecs.backend.repositorios.RolUsuarioRepositorio;

@RestController
@RequestMapping("/api/rolUsuario")
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class RolUsuarioControlador {

	@Autowired
	private RolUsuarioRepositorio rolUsuarioRepositorio;

	// Listar RolUsuario
	@GetMapping("/listarRolUsuario")
	public List<RolUsuario> listarRolesUsuario() {
		return rolUsuarioRepositorio.findAll();
	}

	// Crear RolUsuario
	@PostMapping("/crearRolUsuario")
	public RolUsuario crearRolesUsuario(@RequestBody RolUsuario rolUsuario) {
		return rolUsuarioRepositorio.save(rolUsuario);
	}

	// Actualizar RolUsuario
	@PutMapping("/actualizarRolUsuario/{id}")
	public RolUsuario actualizarRolUsuario(@RequestBody RolUsuario rolUsuario, @PathVariable Long id) {
		return rolUsuarioRepositorio.save(rolUsuario);
	}

	// Eliminar RolUsuario
	@DeleteMapping("/elminarRolUsuario/{id}")
	public String eliminarRolUsuario(@PathVariable Long id) {
		rolUsuarioRepositorio.deleteById(id);
		return "El rol de usuario ha sido eliminada";
	}
}
