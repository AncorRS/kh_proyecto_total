package com.kh.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.*;

import com.kh.demo.models.Empleado;
import com.kh.demo.models.EmpleadoDatosAdmin;
import com.kh.demo.models.EmpleadoDatosAdmin1;

public interface IEmpleadoDatosAdminService {
	 
	 public List<EmpleadoDatosAdmin1> findAll();
	 
	 public Optional<EmpleadoDatosAdmin1> findByID(Long id);
}
