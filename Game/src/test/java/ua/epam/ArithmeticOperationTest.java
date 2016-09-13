package ua.epam;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
    @Test(expected=ArithmeticException.class)
    public void testDivExaption(){
        a.div(9.0,0.0);
    }
    @Test(timeout = 1000)
    public void testN(){
        a.div(9.0,9.0);

}



}