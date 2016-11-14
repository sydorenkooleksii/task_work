package test;

import base.Config;
import dataProvider.DataProviderClass;
import listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by Oleksii_Sydorenko on 10/31/2016.
 */
@Listeners(TestListener.class)
public class PositiveCalculatorTests extends Config {


    @Test(dataProvider = "dtLong",dataProviderClass = DataProviderClass.class,groups = {"positive","smoke","extended"},priority = 1)
    public void testSumLong(long a, long b, long expected) {
        Assert.assertEquals(calculator.sum(a, b), expected);
    }

    @Test(dataProvider = "dtDouble",dataProviderClass = DataProviderClass.class,groups = {"positive","smoke","extended"},priority = 1)
    public void testSumDouble(double a, double b, double expected, double delta) {
        Assert.assertEquals(calculator.sum(a, b), expected,delta);
    }

    @Test(dataProvider = "dtLong",dataProviderClass = DataProviderClass.class,groups = {"positive","smoke","extended"},priority = 1)
    public void testSubLong(long a, long b, long expected) {
        Assert.assertEquals(calculator.sub(a, b), expected);
    }

    @Test(dataProvider = "dtDouble",dataProviderClass = DataProviderClass.class,groups = {"positive","smoke","extended"},priority = 1)
    public void testSubDouble(double a, double b, double expected) {
        Assert.assertEquals(calculator.sub(a, b), expected);
    }


    @Test(dataProvider = "dtLong",dataProviderClass = DataProviderClass.class,groups = {"positive","extended"},priority = 2)
    public void testMultLong(long a, long b, long expected) {
        Assert.assertEquals(calculator.mult(a, b), expected);
    }

    @Test(dataProvider = "dtDouble",dataProviderClass = DataProviderClass.class,groups = {"positive","extended"},priority = 2)
    public void testMultDouble(double a, double b, double expected) {
        Assert.assertEquals(calculator.mult(a, b), expected);
    }

    @Test(dataProvider = "dtLong",dataProviderClass = DataProviderClass.class,groups = {"positive","extended"},priority = 2)
    public void testDivLong(long a, long b, long expected) {
        Assert.assertEquals(calculator.div(a, b), expected);
    }

    @Test(dataProvider = "dtDouble",dataProviderClass = DataProviderClass.class,groups = {"positive","extended"},priority = 2)
    public void testDivDouble(double a, double b, double expected) {
        Assert.assertEquals(calculator.div(a, b), expected);
    }

    @Test(dataProvider = "dtDouble",dataProviderClass = DataProviderClass.class,groups = {"positive","extended"},priority = 3)
    public void testPowDouble(double a, double b, double expected) {
        Assert.assertEquals(calculator.pow(a, b), expected);

    }

    @Test(dataProvider = "dtDouble",dataProviderClass = DataProviderClass.class,groups = {"positive","extended"},priority = 3)
    public void testSqrtDouble(double a, double expected) {
        Assert.assertEquals(calculator.sqrt(a), expected);
    }

    @Test(dataProvider = "dtDouble",dataProviderClass = DataProviderClass.class,groups = {"positive","extended"},priority = 4)
    public void testTgDouble(double a, double expected) {
        Assert.assertEquals(calculator.tg(a), expected);
    }

    @Test(dataProvider = "dtDouble",dataProviderClass = DataProviderClass.class,groups = {"positive","extended"},priority = 4)
    public void testCtgDouble(double a, double expected) {
        Assert.assertEquals(calculator.ctg(a), expected);
    }
    @Test(dataProvider = "dtDouble",dataProviderClass = DataProviderClass.class,groups = {"positive","extended"},priority = 4)
    public void testCosDouble(double a, double expected) {
        Assert.assertEquals(calculator.cos(a), expected);
    }

    @Test(dataProvider = "dtDouble",dataProviderClass = DataProviderClass.class,groups = {"positive","extended"},priority = 4)
    public void testSinDouble(double a, double expected) {
        Assert.assertEquals(calculator.sin(a), expected);
    }


    @Test(dataProvider = "dtLong",dataProviderClass = DataProviderClass.class,groups = {"positive","criticalPath"},priority = 4)
    public void testIsPositiveLong(long a) {
        Assert.assertTrue(calculator.isPositive(a));
    }


    @Test(dataProvider = "dtLong",dataProviderClass = DataProviderClass.class,groups = {"positive","criticalPath"},priority = 4)
    public void testIsNegativeLong(long a) {
        Assert.assertTrue(calculator.isNegative(a));
    }


}