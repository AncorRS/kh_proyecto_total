package com.kh.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kh.demo.models.Vacaciones;

public interface VacacionesDAO extends JpaRepository<Vacaciones, Long>{

}
