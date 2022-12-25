package com.kh.demo.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado_datos_admin")
public class EmpleadoDatosAdmin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_empleado;
	private String nombre_empleado;
	private String dni;
	private String clave;
	private Date fecha_ini;
	private Date fecha_fin;
	private String tipo_contrato;
	private String tipo_jornada;
	private String puesto;
	private String categoria;
	private String grupo;
	private String canal;
	private String empresa;
	private Integer grupo_vacaciones;
	private Integer salario;
	private String complementos;
	private String observaciones;
}
