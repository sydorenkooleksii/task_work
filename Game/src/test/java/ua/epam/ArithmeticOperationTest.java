package ua.epam;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Oleksii_Sydorenko on 9/13/2016.
 */
public class ArithmeticOperationTest {
    @Test
    public void add() throws Exception {
        ArithmeticOperation a = new ArithmeticOperation();
        double res =a.add(3,7);
        if (res!=10) Assert.fail();
    }

}