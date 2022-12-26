package com.kh.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kh.demo.DAO.EmpleadoDAO;
import com.kh.demo.DAO.VacacionesDAO;
import com.kh.demo.models.Empleado;
import com.kh.demo.models.Vacaciones;

@Service
public class VacacionesServiceImpl implements IVacacionesService{

	@Autowired
	private VacacionesDAO vacacionesDAO;
	
	@Override
	@Transactional(readOnly = true)
	public List<Vacaciones> findAll() {
		return (List<Vacaciones>) vacacionesDAO.findAll();
	}
}
