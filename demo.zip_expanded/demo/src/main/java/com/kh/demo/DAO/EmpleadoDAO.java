package com.kh.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.kh.demo.models.Empleado;

public interface EmpleadoDAO extends JpaRepository<Empleado, Long>{
	
	//@Query("select p from Empleado p where p.id_key_empleado like %?1%")
	@Query(nativeQuery= true, value="select * from Empleado where id_key_empleado =?")
	public Empleado empleadoPorId_Key_empleado(Integer id);

}
