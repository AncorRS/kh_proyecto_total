package com.kh.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
@Table(name = "desempeno")
public class Desempeno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_desempeno;
	
	private String nombre_desempeno;
	private Integer id_empleado;
	private Integer id_puesto;
}
