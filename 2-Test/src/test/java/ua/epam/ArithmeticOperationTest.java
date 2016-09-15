package ua.epam;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import static org.junit.Assert.*;

/**
 * Created by Oleksii_Sydorenko on 9/13/2016.
 */
public class ArithmeticOperationTest {
    private  ArithmeticOperation a;
    @Before
    public void runT(){
        a = new ArithmeticOperation();
    }
    @Rule
    public final ExpectedException exp = ExpectedException.none();
    @Rule
    public Timeout time = Timeout.millis(1000);

    @Test
    public void testAdd() throws Exception {

        double res =a.add(3,7);
        Assert.assertTrue(res==10);
    }
    @Test
    public void testMult() throws Exception {

        double res =a.mult(3,7);
        Assert.assertEquals(res,21.0,1e-15);
    }
    @Ignore
    @Test
    public void testDeduct() throws Exception {

        double res =a.deduct(7,3);
        Assert.assertEquals(res,4.0,1e-15);
    }
    @Test
    public void testDiv() throws Exception {

        double res =a.div(9,3);
        Assert.assertEquals(res,3.0,1e-15);


    }
    /*@Test(expected=ArithmeticException.class)*/

    @Test
    public void testDivExaption(){
        exp.expect(ArithmeticException.class);
        a.div(9.0,0.0);
    }
    @Test
    public void testN() {
        while (true) {

        }


    }
}