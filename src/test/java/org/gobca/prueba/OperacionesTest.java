package org.gobca.prueba;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class OperacionesTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
  
    
    @Test 
    public void pruebaDeRestaTest() {
    	assertEquals("La resta ha dejado de ser correcta",0,  Operaciones.resta(10, 10) );  
    } 
    
    
	@Test 
	public void pruebaDeMultiplicacionTest() {
		assertEquals("La multiplicacion ha dejado de ser correcta", 20, Operaciones.multiplicacion(2, 10)); } 
	
	@Test 
	public void pruebaDeMultiplicacion2Test() {
		assertEquals("La multiplicacion ha dejado de ser correcta", 50, Operaciones.multiplicacion(5, 10)); } 
	@Test 
	public void pruebaDeMultiplicacion3Test() {
		assertEquals("La multiplicacion ha dejado de ser correcta", 0, Operaciones.multiplicacion(0, 10000)); } 
	
	
	@Test public void pruebaDeDivision5Test()
	{ try { assertEquals("La division ha dejado de ser correcta", 0, Operaciones.division(100, 0)); } 
	catch (ArithmeticException a) { 
		assertTrue( true ); }
	}
	
	@Test public void pruebaDeDivision2Test(){
		 assertEquals("La division ha dejado de ser correcta",5, Operaciones.division(10, 2));  
	
	}
	
	@Test public void pruebaDeDivision3Test(){
		 assertEquals("La division ha dejado de ser correcta",1, Operaciones.division(10,10));  
	
	}
}



