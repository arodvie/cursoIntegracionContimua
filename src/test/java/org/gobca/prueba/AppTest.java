package org.gobca.prueba;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
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
    public void pruebaDeSumaTest() {
    	assertEquals("La suma ha dejado de ser correcta", App.suma(10, 10) , 20);  
    } 
    
    
	@Test 
	public void pruebaDeSuma1Test() {
		assertEquals("La suma ha dejado de ser correcta", 20, App.suma(10, 10)); } 
	
	@Test public void pruebaDeSuma2Test() {
		assertEquals("La suma ha dejado de ser correcta", 1100, App.suma(100, 1000)); }
	
	@Test public void pruebaDeSuma3Test() { 
		assertEquals("La suma ha dejado de ser correcta", 4, App.suma(2, 2)); }
}



