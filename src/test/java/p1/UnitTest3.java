package p1;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import parcial1.filaA.p1.Ej1UtilsNumeros;

public class UnitTest3 {
    Ej1UtilsNumeros method;

    @AfterClass
    public static void beforeClass(){
        System.out.println(" *****AFTER CLASS, releasing the BeforeClass config  after all the tests in the class have run");
    }

    public UnitTest3(){
        method = new Ej1UtilsNumeros();
    }

    @Test
    public void invertNumbers(){
        int actualResult = method.invertirNumero(123);
        int expectedResult = 321;
        Assert.assertEquals("ERROR! la suma es incorrecto",expectedResult,actualResult);
    }
}
