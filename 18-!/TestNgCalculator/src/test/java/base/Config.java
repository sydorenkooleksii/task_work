package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import reader.ReaderXLS;
import org.testng.annotations.DataProvider;
import ua.ep.Calculator;

import java.lang.reflect.Method;

/**
 * Created by Oleksii_Sydorenko on 10/31/2016.
 */
public class Config {
    protected Calculator calculator;
    @BeforeClass(alwaysRun = true)
    public void beforeSuit(){
         calculator = new Calculator();
    }

    @AfterClass
    public void AfterClass() {

        System.out.println("End of tests");
    }


}
