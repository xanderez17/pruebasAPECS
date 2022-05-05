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

import com.apecs.backend.modelo.FormaPago;
import com.apecs.backend.repositorios.FormaPagoRepositorio;

@RestController
@RequestMapping("/api/calificaciones")
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class FormaPagoControlador {

	@Autowired
	private FormaPagoRepositorio formaPagoRepositorio;

	// Listar FormaPago
	@GetMapping("/listarFormaPago")
	public List<FormaPago> listarFormaPago() {
		return formaPagoRepositorio.findAll();
	}

	// Crear FormaPago
	@PostMapping("/crearFormaPago")
	public FormaPago crearFormaPago(@RequestBody FormaPago formapago) {
		return formaPagoRepositorio.save(formapago);
	}

	// Actualizar FormaPago
	@PutMapping("/actualizarFormaPago/{id}")
	public FormaPago actualizarFormaPago(@RequestBody FormaPago formapago, @PathVariable Long id) {
		return formaPagoRepositorio.save(formapago);
	}

	// Eliminar FormaPago
	@DeleteMapping("/elminarFormaPago/{id}")
	public String eliminarHorario(@PathVariable Long id) {
		formaPagoRepositorio.deleteById(id);
		return "La forma de pago ha sido eliminada";
	}

}
