package org.gobca.prueba;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
  
	public static final Logger logger = Logger.getLogger("org.gobcan.cursoformacion.testprueba.App");

    public static int suma(int a, int b) {
    	 return a+b; }

    public Integer suma2 (Integer numero1, Integer numero2) {
    	numero2 = null; 
    	return numero1.intValue() + numero2.intValue(); }  
    
    
	public static void main( String[] args ) {
		logger.log(Level.INFO, "hello");
		logger.log(Level.INFO, "La suma del 10 con el 35 es {0}" , suma(10,35) ); 
	}

    

}
