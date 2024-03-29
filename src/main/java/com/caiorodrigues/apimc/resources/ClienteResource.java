package com.caiorodrigues.apimc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caiorodrigues.apimc.domain.Cliente;
import com.caiorodrigues.apimc.services.ClienteService;


@RestController
@RequestMapping("/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;

	@GetMapping("/{id}")
	public ResponseEntity<?> buscar(@PathVariable("id") Long id) {				
		Cliente Cliente = service.find(id);		
		return ResponseEntity.ok().body(Cliente);		
	}
}
