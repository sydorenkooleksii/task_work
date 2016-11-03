package test;

import base.Config;
import dataProvider.DataProviderClass;
import listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.text.NumberFormat;

/**
 * Created by Oleksii_Sydorenko on 10/31/2016.
 */
@Listeners(TestListener.class)
public class NegativeCalculatorTests extends Config {



    @Test(dataProvider = "dtLong",dataProviderClass = DataProviderClass.class,
            expectedExceptions = NumberFormatException.class,groups = {"negative","extended"},priority = 4)
    public void testDivLongNegative(long a, long b) throws InterruptedException {
        calculator.div(a, b);
        Thread.sleep(2000);
    }

    @Test(dataProvider = "dtDouble",dataProviderClass = DataProviderClass.class
            ,expectedExceptions =  NumberFormatException.class,groups = {"negative","extended"},priority = 4)
    public void testDivDoubleNegative(double a, double b) throws InterruptedException {
        calculator.div(a, b);
        Thread.sleep(2000);
    }

    @Test(dataProvider = "dtDouble",dataProviderClass = DataProviderClass.class,
            expectedExceptions = IllegalArgumentException.class,groups = {"negative","extended"},priority = 4)
    public void testPowDoubleNegative(double a, double b) throws InterruptedException {
        calculator.pow(a, b);
        Thread.sleep(2000);
    }

    @Test(dataProvider = "dtDouble",dataProviderClass = DataProviderClass.class,
            expectedExceptions = IllegalArgumentException.class,groups = {"negative","extended"},priority = 4)
    public void testSqrtDoubleNegative(double a) throws InterruptedException {
        calculator.sqrt(a);
        Thread.sleep(2000);
    }


    @Test(dataProvider = "dtDouble",dataProviderClass = DataProviderClass.class,
            expectedExceptions = IllegalArgumentException.class,groups = {"negative","extended"},priority = 4)
    public void testCtgDoubleNegative(double a) throws InterruptedException {
      calculator.ctg(a);
        Thread.sleep(2000);
    }

    @Test(dataProvider = "dtLong",dataProviderClass = DataProviderClass.class,
            groups = {"negative","criticalPath","first"},priority = 5)
    public void testIsPositiveNegativeLong(long a) throws InterruptedException {
        Assert.assertFalse(calculator.isPositive(a));
        Thread.sleep(2000);
    }

    @Test(dataProvider = "dtLong",dataProviderClass = DataProviderClass.class,
            groups = {"negative","criticalPath"},priority = 4,dependsOnGroups = "first")
    public void testIsNegativePositiveLong(long a) throws InterruptedException {
        Assert.assertFalse(calculator.isNegative(a));
        Thread.sleep(2000);
    }

}



