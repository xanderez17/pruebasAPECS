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

import com.apecs.backend.modelo.Paralelo;
import com.apecs.backend.repositorios.ParaleloRepositorio;

@RestController
@RequestMapping("/api/paralelo")
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class ParaleloControlador {

	@Autowired
	private ParaleloRepositorio paraleloRepositorio;

	// Listar Paralelos
	@GetMapping("/listarParalelo")
	public List<Paralelo> listarParalelo() {
		return paraleloRepositorio.findAll();
	}

	// Crear Paralelos
	@PostMapping("/crearParalelo")
	public Paralelo crearParalelo(@RequestBody Paralelo paralelo) {
		return paraleloRepositorio.save(paralelo);
	}

	// Actualizar Paralelo
	@PutMapping("/actualizarParalelo/{id}")
	public Paralelo actualizarParalelo(@RequestBody Paralelo paralelo, @PathVariable Long id) {
		return paraleloRepositorio.save(paralelo);
	}

	// Eliminar Paralelo
	@DeleteMapping("/elminarParalelo/{id}")
	public String eliminarParalelo(@PathVariable Long id) {
		paraleloRepositorio.deleteById(id);
		return "El paralelo ha sido eliminado";
	}

}
