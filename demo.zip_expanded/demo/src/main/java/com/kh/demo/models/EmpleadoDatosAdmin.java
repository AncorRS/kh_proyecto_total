package com.kh.demo.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
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
