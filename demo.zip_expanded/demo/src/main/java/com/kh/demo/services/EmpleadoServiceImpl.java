package com.kh.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kh.demo.DAO.EmpleadoDAO;
import com.kh.demo.models.Empleado;


@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	
	@Autowired
	private EmpleadoDAO empleadoDAO;
	
	@Override
	@Transactional(readOnly = true)
	public List<Empleado> findAll() {
		return (List<Empleado>) empleadoDAO.findAll();
	}

}
