/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Diseño de pruebas:
 * 
 * Clases de equivalencia:
 *  
 *      CE1: SI la edad de la persona es mayor a 65 y pidio con mas de 20 dias su pasaje.
 *           Resultado esperado: TIene el 23% de descuento.
 *          
 *      CE2: Si la edad de la persona es menor a 18 años y pidio su pasaje con mas de 20 dias.
 *           Resultado esperado: Tiene el 20% de descuento.
 *      CE3: Si la edad esta mayor de 18 y menor de 65 años y mas de 20 dias de solicitar el tiquete.
 *          Resultado esperado:15% de descuento.
 *      CE4:SI la edad es mayor a 65 años.
 *          Resultado esperado:8% de descuento.
 *      CE5:SI la edad es menor a 18 años.
 *          Resultado esperado:5% de descuento
 *      CE6:SI los dias de comprado el tiquete son menor o iguales a 20 y la edad esta mayor a o igual a 18 y menor
 * o igual a 65.
 *          Resultado esperado:0% de descuento.
 *      CE7:SI la edad y los dias son iguales a 0.
 *          Resultado esperado:Error.
 * Condiciones de frontera:
 * 
 *      CF1: Se realiza la prueba en valores de frontera muy cercano a sus limites.
 *           Clases de equivalencia relacionadas:CE1, CE2
 *           Resultado esperado: Descuento aplicado y los valores no validos entran en la siguiente clase 
 *           de equivalencia.
 *      CF2:Se realiza la prueba en valores de frontera muy cercano a sus limites.
 *          Clases de equivalencia relacionadas:CE2,CE3 
 *           Resultado esperado: Descuento aplicado y los valores no validos entran en la siguiente clase 
 *           de equivalencia.
 *      CF3:Se realiza la prueba en valores de frontera muy cercano a sus limites.
 *          Clases de equivalencia relacionadas:CE3, CE4
 *           Resultado esperado: Descuento aplicado y los valores no validos entran en la siguiente clase 
 *           de equivalencia. 
 *          CF4:Se realiza la prueba en valores de frontera muy cercano a sus limites.
 *          Clases de equivalencia relacionadas:CE4,CE5
 *           Resultado esperado: Descuento aplicado y los valores no validos entran en la siguiente clase 
 *           de equivalencia.
 *          CF5:Se realiza la prueba en valores de frontera muy cercano a sus limites.
 *          Clases de equivalencia relacionadas:CE5,cE6
 *           Resultado esperado: Descuento aplicado y los valores no validos entran en la siguiente clase 
 *           de equivalencia.
 *          CF6:Se realiza la prueba en valores de frontera muy cercano a sus limites.
 *          Clases de equivalencia relacionadas:CE6
 *           Resultado esperado: Descuento aplicado y los valores no validos entran en la siguiente clase 
 *           de equivalencia.
 *          CF7:Se realiza la prueba sabiendo que el valor dado tendra que registrar un error.
 *          Clases de equivalencia relacionadas:CE7
 *           Resultado esperado: Error
 */
public class CalculadorTarifasTest {
    
    public CalculadorTarifasTest() {
    }
    
    @Before
    public void setUp() {
    }
    
}
