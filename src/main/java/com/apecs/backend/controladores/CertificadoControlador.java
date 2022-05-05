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

import com.apecs.backend.modelo.Certificado;
import com.apecs.backend.repositorios.CertificadoRepositorio;

@RestController
@RequestMapping("/api/certificados")
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class CertificadoControlador {

	@Autowired
	private CertificadoRepositorio certificadoRepositorio;

	// Listar Certificado
	@GetMapping("/listarCertificados")
	public List<Certificado> listarCertificados() {
		return certificadoRepositorio.findAll();
	}

	// Crear Certificado
	@PostMapping("/crearCertificado")
	public Certificado crearCertificado(@RequestBody Certificado certificado) {
		return certificadoRepositorio.save(certificado);
	}

	// Actualizar Certificado
	@PutMapping("/actualizarCertificado/{id}")
	public Certificado actualizarCertificado(@RequestBody Certificado certificado, @PathVariable Long id) {
		return certificadoRepositorio.save(certificado);
	}

	// Eliminar Certificado
	@DeleteMapping("/elminarCertificado/{id}")
	public String eliminarHorario(@PathVariable Long id) {
		certificadoRepositorio.deleteById(id);
		return "La horario ha sido eliminado";
	}

}
