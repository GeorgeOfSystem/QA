package p3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;
import parcial1.filaA.p3.Ej3Utils;

import java.util.ArrayList;
import java.util.List;

public class CICorrect3 {
    private String ci;
    private String expectedResult;

    public CICorrect3(String ci, String expectedResult){
        this.ci = ci;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]> objects = new ArrayList<>();
        //cases
        objects.add( new Object[]{10,true} );
        return objects;
    }

    @Test(timeout = 2000)
    public void verifyGrade(){
        Ej3Utils method = new Ej3Utils();
        try {
            boolean actualResult= method.isCorrectCI(this.ci);
            Assert.assertEquals("ERROR! ",this.expectedResult,actualResult);
        }catch (Exception e){
            System.out.println("OOOH no salto un error");
        }

    }
}
