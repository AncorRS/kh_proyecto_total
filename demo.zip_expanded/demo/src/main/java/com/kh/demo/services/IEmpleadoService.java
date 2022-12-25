package com.kh.demo.services;

import java.util.List;

import org.springframework.stereotype.*;

import com.kh.demo.models.Empleado;

public interface IEmpleadoService {
	 
	 public List<Empleado> findAll();
}
