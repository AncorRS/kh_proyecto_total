package com.kh.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.kh.demo.models.Empleado;
import com.kh.demo.models.EmpleadoDatosAdmin;
import com.kh.demo.models.EmpleadoDatosAdmin1;

public interface EmpleadoDatosAdminDAO extends JpaRepository<EmpleadoDatosAdmin1, Long>{
	
	

}

