import org.junit.Test;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import ua.epam.GetIndex;

import static org.junit.Assert.*;

/**
 * Created by Oleksii_Sydorenko on 9/14/2016.
 */
public class IndexTest {
    GetIndex a = new GetIndex();
    int [] myArray = {1,2,3,4,5,4,6};
    int [] myArrayFull = {4,4,4,4,4,4,4};
    int [] myArrayEmptyIn = {};
    int number;


    @Test
    public void emptyArray() throws Exception{
        int [] myArrayEmpty = {};
        int [] result = method(myArray,0);
        Assert.assertArrayEquals(result,myArrayEmpty);
    }
    @Test
    public void emptyArrayIn() throws Exception{
        int [] myArrayEmpty = {};
        int [] result = method(myArrayEmptyIn,number);
        Assert.assertArrayEquals(result,myArrayEmpty);
    }

    @Test
    public void oneNumberArray() throws Exception{
        int [] result = method(myArray,number);
        Assert.assertArrayEquals(myArray,result);
    }

    @Test
    public void fullNumberArray() throws Exception{
        int [] result = method(myArrayFull,number);
        Assert.assertArrayEquals(myArrayFull,result);
    }
 //   a.getArrayIndex
}
