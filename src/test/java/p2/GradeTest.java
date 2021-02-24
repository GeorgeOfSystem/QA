package p2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parcial1.filaA.p2.Ej2Notas;

import java.util.ArrayList;
import java.util.List;

@RunWith(value= Parameterized.class)
public class GradeTest {
    private int grade;
    private boolean expectedResult;

    public GradeTest(int grade, boolean expectedResult){
        this.grade = grade;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]> objects = new ArrayList<>();
        //0 - 70
        objects.add( new Object[]{0,"REGULAR"} );
        objects.add( new Object[]{20,"REGULAR"} );
        objects.add( new Object[]{69,"REGULAR"} );
        //70-80
        objects.add( new Object[]{70,"BUENO"} );
        objects.add( new Object[]{75,"BUENO"} );
        objects.add( new Object[]{79,"BUENO"} );
        //80-90
        objects.add( new Object[]{80,"MUY BUENO"} );
        objects.add( new Object[]{85,"MUY BUENO"} );
        objects.add( new Object[]{89,"MUY BUENO"} );
        //90-100
        objects.add( new Object[]{90,"EXCELENTE"} );
        objects.add( new Object[]{95,"EXCELENTE"} );
        objects.add( new Object[]{100,"EXCELENTE"} );
        //out of range
        objects.add( new Object[]{-1,"VALOR INCORRECTO"} );
        objects.add( new Object[]{101,"VALOR INCORRECTO"} );

        return objects;
    }

    @Test
    public void verifyGrade(){

        Ej2Notas grade = new Ej2Notas();
        String actualResult= grade.notasCualitativas(this.grade);
        Assert.assertEquals("ERROR! ",this.expectedResult,actualResult);
    }
}
/*
si la nota esta entre 0 y 70 el mensaje es "REGULAR"
si la nota esta entre 70 y 80 el mensaje es "BUENO"
si la nota esta entre 80 y 90 el mensaje es "MUY BUENO"
si la nota esta entre 90 y 100 el mensaje es "EXCELENTE"
si esta fuera de rango : "VALOR INCORRECTO"
*/