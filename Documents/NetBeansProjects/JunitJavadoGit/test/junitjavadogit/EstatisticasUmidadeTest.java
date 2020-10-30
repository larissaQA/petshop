/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitjavadogit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author larissa.ferreira
 */
public class EstatisticasUmidadeTest {
    
    public EstatisticasUmidadeTest() {
    }

    /**
     * Test of setValor method, of class EstatisticasUmidade.
     */
    @Test
    public void testSetValor() {
        
    }

    /**
     * Test of media method, of class EstatisticasUmidade.
     */
    @Test
    public void testMedia() {
        EstatisticasUmidade e = new EstatisticasUmidade();
        e.setValor(5.2);
        e.setValor(7.0);
        e.setValor(1.3);
        e.setValor(6);
        e.setValor(0.87);
        double result= e.media(1);
        assertArrayEquals("ESPERA RESULTADO", 5.2 , result, 0.1);
    }

    /**
     * Test of desvioPadrao method, of class EstatisticasUmidade.
     */
    @Test
    public void testDesvioPadrao() {
        EstatisticasUmidade e = new EstatisticasUmidade();
        e.setValor(5.2);
        e.setValor(7.0);
        e.setValor(1.3);
        e.setValor(6);
        e.setValor(0.87);  
        
        double result= e.media(1);
        assertArrayEquals("ESPERA RESULTADO", 5.2 , result, 1.2);
    }

    private void assertArrayEquals(String espera_resultado, double d, double result, double d0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
