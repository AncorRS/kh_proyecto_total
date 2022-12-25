package com.kh.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.demo.models.Empleado;
import com.kh.demo.services.IEmpleadoService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class GeneralController {
	
	@Autowired(required = false)
	private IEmpleadoService empleadoService;

	@GetMapping("/empleados")
	public List<Empleado> index() {
		return empleadoService.findAll();
	}
}
