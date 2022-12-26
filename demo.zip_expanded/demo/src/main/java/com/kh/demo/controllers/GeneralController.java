package com.kh.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.demo.models.Empleado;
import com.kh.demo.models.Vacaciones;
import com.kh.demo.services.IEmpleadoService;
import com.kh.demo.services.IVacacionesService;

@CrossOrigin(origins = { "http://localhost:8080" })
@RestController
@RequestMapping("/api")
public class GeneralController {
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	@Autowired
	private IVacacionesService vacacionesService;

	@GetMapping("/empleados")
	public List<Empleado> getEmpleado() {
		return empleadoService.findAll();
	}
	
	@GetMapping("/vacaciones")
	public List<Vacaciones> getVacaciones() {
		return vacacionesService.findAll();
	}
}
