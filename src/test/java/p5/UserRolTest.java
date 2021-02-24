package p5;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import parcial1.filaA.p5.Login;
import parcial1.filaA.p5.Util2Static;
import parcial1.filaA.p5.UtilStatic;

import java.util.ArrayList;
import java.util.List;

public class UserRolTest {

    @Parameterized.Parameter(0)
    public String user;
    @Parameterized.Parameter(1)
    public String pwd;
    @Parameterized.Parameter(2)
    public String expectedResult;
    @Parameterized.Parameter(3)
    public String expectedMock;
    @Parameterized.Parameter(4)
    public boolean expectedMock2;


    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]> objects= new ArrayList<>();
        //CASES
        objects.add(new Object[]{"george","0103N&G","PERMISSION ROLE : CRUD" ,"CRUD", true});

        return objects;
    }

    @Test
    public void verify_calculate_amount(){
        //STEP 3
        PowerMockito.mockStatic(UtilStatic.class);
        PowerMockito.mockStatic(Util2Static.class);
        //STEP 4
        Mockito.when(UtilStatic.getPermision(this.user,this.pwd)).thenReturn(this.expectedMock);
        Mockito.when(Util2Static.isUserValid(this.user,this.pwd)).thenReturn(this.expectedMock2);

        Login login = new Login();
        String actualResult= login.roleUser(this.user,this.pwd);
        Assert.assertEquals("ERROR! ",this.expectedResult,actualResult);
    }

}
