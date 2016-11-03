package dataProvider;

import com.beust.jcommander.Parameter;
import org.testng.annotations.DataProvider;
import reader.ReaderXLS;

import java.lang.reflect.Method;

/**
 * Created by Oleksii_Sydorenko on 11/1/2016.
 */
public class DataProviderClass {


    @DataProvider(name = "dtLong")
    public static Object[][] getDataLong(Method method) {
        String nameSheet = method.getName().toString();
        ReaderXLS readerXLS = new ReaderXLS();

        return readerXLS.parse(nameSheet,true);
    }

    @DataProvider(name = "dtDouble")
    public static Object[][] getDataDouble(Method method) {
        String nameSheet = method.getName().toString();
        ReaderXLS readerXLS = new ReaderXLS();

        return readerXLS.parse(nameSheet,false);
    }
}
