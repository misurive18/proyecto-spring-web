/**
 * 
 */
package com.mijasoftcode.proyectospringweb.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.mijasoftcode.proyectospringweb.service.SpringService;

/**
 * @author mijasoftcode
 * Clase de prueba unitaria con Spring y JUnit 4.
 * Nota: No tiene soporte Spring Test para JUnit5.
 */

@RunWith(SpringRunner.class)   //permite ejecutar pruebas unitarias con spring
@ContextConfiguration(locations = {"classpath:applicationContext-test.xml"})
public class SpringJUnit4Test {

	@Autowired
	private SpringService springServiceImpl;
	
	@Test
	public void test() {
		assertNotNull(this.springServiceImpl);
		System.out.println(this.springServiceImpl.mostrarNombreEmpleado());
	}

}
