package p1;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import parcial1.filaA.p1.Ej1UtilsNumeros;

public class UnitTest2 {

    Ej1UtilsNumeros method;

    @BeforeClass
    public static void beforeClass(){
        System.out.println(" *****BEFORE CLASS, sharing computationally expensive setup (like logging into a database)");
    }

    public UnitTest2(){
        method = new Ej1UtilsNumeros();
    }

    @Test
    public void invertNumbers(){
        int actualResult = method.invertirNumero(123);
        int expectedResult = 321;
        Assert.assertEquals("ERROR! la suma es incorrecto",expectedResult,actualResult);
    }
}
