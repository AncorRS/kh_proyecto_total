package com.kh.demo.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "historial_vacaciones")
public class Vacaciones {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date fecha_ini;
	private Date fecha_fin;
	private Integer numero_dias;
	private Integer motivo_cambio;
	private String estado_Adm;
	private String estado_Resp;
	private String estado;
	private Integer id_key_empleado;
}
