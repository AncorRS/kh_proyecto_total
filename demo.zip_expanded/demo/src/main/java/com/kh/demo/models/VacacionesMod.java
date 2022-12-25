package com.kh.demo.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vacaciones_modificadas")
public class VacacionesMod {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer id_hist;
	private Integer id_empleado;
	private Date fecha_pre_ini;
	private Date fecha_pre_fin;
	private Date pre_ini;
	private Date pre_fin;
	private Integer motivo;
	
}
