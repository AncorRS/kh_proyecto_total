package com.kh.demo.services;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Empleado getEmpleadoPorId_key_empleado(Integer id) {
		// TODO Auto-generated method stub
		return empleadoDAO.empleadoPorId_Key_empleado(id);
	}

	@Override
	public Empleado findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
