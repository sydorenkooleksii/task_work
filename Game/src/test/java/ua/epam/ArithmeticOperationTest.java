package ua.epam;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Oleksii_Sydorenko on 9/13/2016.
 */
public class ArithmeticOperationTest {
    @Test
    public void testAdd() throws Exception {
        ArithmeticOperation a = new ArithmeticOperation();
        double res =a.add(3,7);
        if (res!=10) Assert.fail();
    }
    @Test
    public void testMult() throws Exception {
        ArithmeticOperation a = new ArithmeticOperation();
        double res =a.mult(3,7);
        if (res!=21) Assert.fail();
    }
    @Test
    public void testDeduct() throws Exception {
        ArithmeticOperation a = new ArithmeticOperation();
        double res =a.deduct(7,3);
        if (res!=4) Assert.fail();
    }
    @Test
    public void testDiv() throws Exception {
        ArithmeticOperation a = new ArithmeticOperation();
        double res =a.div(9,3);
        if (res!=3) Assert.fail();
    }





}