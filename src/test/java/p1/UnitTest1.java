package p1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import parcial1.filaA.p1.Ej1UtilsNumeros;

public class UnitTest1 {
    Ej1UtilsNumeros method;

    @Before
    public void before(){
        method = new Ej1UtilsNumeros();
    }

    @Test
    public void invertNumbers(){
        int actualResult = method.invertirNumero(123);
        int expectedResult = 321;
        Assert.assertEquals("ERROR! la suma es incorrecto",expectedResult,actualResult);
    }

    @After
    public void after(){
        System.out.println("        Inversion finalizada        ");
    }
}
