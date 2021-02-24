package p4;

import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import parcial1.filaA.p4.CambioMoneda;
import parcial1.filaA.p4.Util;

import java.util.ArrayList;
import java.util.List;

public class CambioMonedaTest {
    private int amount;
    private String origin;
    private String destiny;
    private  int expectedMock;
    private String expectedResult;

    public CambioMonedaTest( int amount, String origin,int expectedMock, String expectedResult){
        this.amount = amount;
        this.origin = origin;
        this.destiny = expectedResult;
        this.expectedMock = expectedMock;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]> objects= new ArrayList<>();
        //CASES
        objects.add(new Object[]{100, "Dolares","Bolivianos"," La cantidad convertida fue : [700] Bolivianos"});

        return objects;
    }

    //PASO 2
    Util utilMocked= Mockito.mock(Util.class);

    @Test
    public void verify_calculate_credit(){
        // Paso 3
        Mockito.when(utilMocked.obtenerTipoDeCambio(this.origin,this.destiny)).thenReturn(this.expectedMock);
        // Paso 4
        CambioMoneda casher = new CambioMoneda(utilMocked);
        String actualResult= casher.saveInNewMoney(this.amount,this.origin,this.destiny);
        Assert.assertEquals("ERROR! ",this.expectedResult,actualResult);
    }
}
