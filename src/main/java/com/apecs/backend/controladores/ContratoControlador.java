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

import com.apecs.backend.modelo.Contrato;
import com.apecs.backend.repositorios.ContratoRepositorio;

@RestController
@RequestMapping("/api/contratos")
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class ContratoControlador {

	@Autowired
	private ContratoRepositorio contratoRepositorio;

	// Listar Contratos
	@GetMapping("/listarHorarios")
	public List<Contrato> listarHorarios() {
		return contratoRepositorio.findAll();
	}

	// Crear Contrato
	@PostMapping("/crearHorario")
	public Contrato crearContrato(@RequestBody Contrato contrato) {
		return contratoRepositorio.save(contrato);
	}

	// Actualizar Contrato
	@PutMapping("/actualizarHorario/{id}")
	public Contrato actualizarContrato(@RequestBody Contrato contrato, @PathVariable Long id) {
		return contratoRepositorio.save(contrato);
	}

	// Eliminar Contrato
	@DeleteMapping("/elminarHorario/{id}")
	public String eliminarContrato(@PathVariable Long id) {
		contratoRepositorio.deleteById(id);
		return "El contrato ha sido eliminado";
	}

}
