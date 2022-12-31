package com.kh.demo.services;

import java.util.List;

import org.springframework.stereotype.*;

import com.kh.demo.models.Empleado;

public interface IEmpleadoService {
	 
	 public List<Empleado> findAll();
	 
	 public Empleado findById(Long id);
	 
	 public Empleado getEmpleadoPorId_key_empleado(Integer id);
}
