/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.test;

import edu.eci.arsw.basictdd.CalculadoraTarifas;
import edu.eci.arsw.basictdd.ExcepcionParametrosInvalidos;
import static jdk.nashorn.internal.objects.NativeRegExp.test;
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
    //Pruebas clase de equivalencia
    float tarifa;
    CalculadoraTarifas a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,x,y;
    @Test
    public void testClaseEquivalenciaCE1() throws ExcepcionParametrosInvalidos{
        a = new CalculadoraTarifas();
        tarifa = a.calculoTarifa(1f, 23, 68);
        assertEquals(0.23f, tarifa,0.0001);
        b=new CalculadoraTarifas();//Valido
        tarifa = b.calculoTarifa(1f, 20, 65);
        assertEquals(0.23f, tarifa,0.0001);        
        c=new CalculadoraTarifas();//No Valido
        tarifa = c.calculoTarifa(1f, 19, 64);
        assertEquals(0.23f, tarifa,0.0001);//No Valido
    }
    @Test
    public void testClaseEquivalenciaCE2() throws ExcepcionParametrosInvalidos{
        d = new CalculadoraTarifas();
        tarifa = d.calculoTarifa(1f, 21, 19);
        assertEquals(0.20f, tarifa,0.0001);
        e=new CalculadoraTarifas();//Valido
        tarifa = e.calculoTarifa(1f, 20, 18);
        assertEquals(0.20f, tarifa,0.0001);        
        f=new CalculadoraTarifas();//No Valido
        tarifa = f.calculoTarifa(1f, 19, 17);
        assertEquals(0.20f, tarifa,0.0001);//No Valido
    }
    
    @Test
    public void testClaseEquivalenciaCE3() throws ExcepcionParametrosInvalidos{
        g = new CalculadoraTarifas();
 
        tarifa = g.calculoTarifa(1f, 21, 19);
        assertEquals(0.15f, tarifa,0.0001);
        h=new CalculadoraTarifas();//Valido
        tarifa = h.calculoTarifa(1f, 20, 18);
        assertEquals(0.15f, tarifa,0.0001);        
        i=new CalculadoraTarifas();//No Valido
        tarifa = i.calculoTarifa(1f, 20, 65);
        assertEquals(0.15f, tarifa,0.0001);//No Valido
    }
    
    @Test
    public void testClaseEquivalenciaCE4() throws ExcepcionParametrosInvalidos{
        j = new CalculadoraTarifas();
        tarifa = j.calculoTarifa(1f, 2, 66);
        assertEquals(0.8f, tarifa,0.0001);
        k=new CalculadoraTarifas();//Valido
        tarifa = k.calculoTarifa(1f, 9, 65);
        assertEquals(0.8f, tarifa,0.0001);        
        l=new CalculadoraTarifas();//No Valido
        tarifa = l.calculoTarifa(1f, 1, 64);
        assertEquals(0.8f, tarifa,0.0001);//No Valido
    }
    
    @Test
    public void testClaseEquivalenciaCE5() throws ExcepcionParametrosInvalidos{
        m = new CalculadoraTarifas();
                //(float tarifaBase, int diasAntelacion, int edad)
        tarifa = m.calculoTarifa(1f, 2, 17);
        assertEquals(0.5f, tarifa,0.0001);
        n=new CalculadoraTarifas();//Valido
        tarifa = n.calculoTarifa(1f, 8, 18);
        assertEquals(0.5f, tarifa,0.0001);        
        o=new CalculadoraTarifas();//No Valido
        tarifa = o.calculoTarifa(1f, 1, 19);
        assertEquals(0.5f, tarifa,0.0001);//No Valido
    }
    
    @Test
    public void testClaseEquivalenciaCE6() throws ExcepcionParametrosInvalidos{
        p = new CalculadoraTarifas();
        tarifa = p.calculoTarifa(1f, 5, 35);
        assertEquals(0.0f, tarifa,0.0001);
        q=new CalculadoraTarifas();//Valido
        tarifa = q.calculoTarifa(1f, 20, 65);
        assertEquals(0.0f, tarifa,0.0001);        
        r=new CalculadoraTarifas();//No Valido
        tarifa = r.calculoTarifa(1f, 20, 18);
        assertEquals(0.0f, tarifa,0.0001);//No Valido
    }
    
    @Test
    public void testClaseEquivalenciaCE7() throws ExcepcionParametrosInvalidos{
        s = new CalculadoraTarifas();
        //tarifa = s.calculoTarifa(01f, 0, 0);
        //assertEquals(0.23f, tarifa,0.0001);//NO Valido

    }
}
