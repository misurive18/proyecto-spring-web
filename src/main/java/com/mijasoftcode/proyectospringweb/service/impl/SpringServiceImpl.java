/**
 * 
 */
package com.mijasoftcode.proyectospringweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mijasoftcode.proyectospringweb.dao.EmpleadoDAO;
import com.mijasoftcode.proyectospringweb.service.SpringService;

/**
 * @author Mijasoftcode
 *
 */

@Service
public class SpringServiceImpl implements SpringService {

	@Autowired
	private EmpleadoDAO empleadoDAOImpl;
	
	@Override
	public String mostrarNombreEmpresa() {
		return "Anotaciones con Spring y JSF";
	}

	@Override
	public String mostrarNombreEmpleado() {
		return this.empleadoDAOImpl.consultarNombreEmpleado();
	}
	
}
