/**
 * 
 */
package com.mijasoftcode.proyectospringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.mijasoftcode.proyectospringweb.dao.EmpleadoDAO;

/**
 * @author mijasoftcode
 *
 */

@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		return "Wilton Mijael Sullcaray Riveros";
	}

}
