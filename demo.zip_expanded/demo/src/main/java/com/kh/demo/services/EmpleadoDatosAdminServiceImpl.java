package com.kh.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kh.demo.DAO.EmpleadoDAO;
import com.kh.demo.DAO.EmpleadoDatosAdminDAO;
import com.kh.demo.models.Empleado;
import com.kh.demo.models.EmpleadoDatosAdmin;
import com.kh.demo.models.EmpleadoDatosAdmin1;


@Service
public class EmpleadoDatosAdminServiceImpl implements IEmpleadoDatosAdminService{
	
	@Autowired
	private EmpleadoDatosAdminDAO empleadoDatosAdminDAO;
	
	@Override
	@Transactional(readOnly = true)
	public List<EmpleadoDatosAdmin1> findAll() {
		return (List<EmpleadoDatosAdmin1>) empleadoDatosAdminDAO.findAll();
	}

	@Override
	public Optional<EmpleadoDatosAdmin1> findByID(Long id) {
		return empleadoDatosAdminDAO.findById(id);
	}

}
