package com.kh.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kh.demo.models.Empleado;

public interface EmpleadoDAO extends JpaRepository<Empleado, Long>{

}
