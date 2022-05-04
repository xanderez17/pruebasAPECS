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

import com.apecs.backend.modelo.Representante;
import com.apecs.backend.repositorios.RepresentanteRepositorio;

@RestController
@RequestMapping("/api/representantes")
@CrossOrigin(value = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class RepresentanteControlador {
	
	@Autowired
	private RepresentanteRepositorio representanteRepositorio;
	
	//Listar Representantes
	@GetMapping("/listarRepresentantes")
	public List<Representante> listarRepresentante(){
		return representanteRepositorio.findAll();
	}
	
	//Crear Representantes
	@PostMapping("/crearRepresentante")
	public Representante crearRepresentante(@RequestBody Representante representante) {
		return representanteRepositorio.save(representante);
	}
	
	//Actualizar Representantes
	@PutMapping("/actualizarRepresentante/{id}")
	public Representante actualizarRepresentante(@RequestBody Representante representante, @PathVariable Long id) {
		return representanteRepositorio.save(representante);
	}
	
	//Eliminar Representantes
	@DeleteMapping("/elminarRepresentante/{id}")
	public String eliminarRepresentante(@PathVariable Long id) {
		representanteRepositorio.deleteById(id);
		return "El representante ha sido eliminado";
	}

}
