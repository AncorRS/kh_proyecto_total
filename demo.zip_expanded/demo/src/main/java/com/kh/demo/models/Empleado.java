package com.kh.demo.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

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
@Table(name = "empleado")
public class Empleado implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_empleado;
	private String nombre_empleado;
	private Integer id_key_empleado;
	private String apellido1;
	private String apellido2;
	private String dni;
	@Temporal(TemporalType.DATE)
	private Date fecha_nac;
	private String seg_soc;
	private String cuenta_c;
	private String email;
	private Integer telefono;
	private String calle;
	private Integer numero;
	private Integer piso;
	private String letra;
	private String cp;
	private String contacto;
	private String parentesco;
	private String telefono_contacto;
	private String departamento;
	private Integer puesto;
	private Integer categoria;
	private Integer grupo_vacaciones;
	@Temporal(TemporalType.DATE)
	private Date fecha_ini;
	@Temporal(TemporalType.DATE)
	private Date fecha_fin;
	private String foto;
	private String foto_min;

}
